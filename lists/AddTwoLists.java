package lists;

public class AddTwoLists {

    class node {
        int val;
        node next;
        public node(int v){
            val = v;
        }
    }

    void printList(node head){
        while(head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    node head1, head2, result;
    int carry;

    void push(int val, int list){
        node newNode = new node(val);

        if(list == 1) {
            newNode.next = head1;
            head1 = newNode;
        }else if(list == 2) {
            newNode.next = head2;
            head2 = newNode;
        }else {
            newNode.next = result;
            result = newNode;
        }
    }

    void addSameSize(node n, node m){
        if(n == null) {
            return;
        }

        addSameSize(n.next, m.next);

        int sum = n.val + m.val + carry;

        carry = sum/10;
        sum = sum%10;
        push(sum,3);
    }

    node cur;

    void propagateCarry(node head1){
        if(head1 != cur) {
            propagateCarry(head1.next);
            int sum = carry+head1.val;
            carry = sum/10;
            sum %= 10;

            push(sum, 3);
        }
    }

    int getSize(node head){
        int count = 0;
        while(head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    void addList(){
        if(head1 == null) {
            result = head2;
            return;
        }

        if(head2 == null) {
            result = head1;
            return;
        }

        int size1 = getSize(head1);
        int size2 = getSize(head2);

        if(size1 == size2) {
            addSameSize(head1, head2);
        }

        if(size1 < size2) {
            node temp = head1;
            head1 = head2;
            head2 = temp.next;
        }

        int diff = Math.abs(size1 - size2);

        //move diff number of nodes in first list
        node temp = head1;
        while(diff-- >= 0) {
            cur = temp;
            temp = temp.next;
        }

        addSameSize(cur, head2);

        propagateCarry(head1);

        if(carry > 0) {
            push(carry, 3);
        }
    }

    public static void main(String[] args) {
        AddTwoLists list = new AddTwoLists();
        list.head1 = null;
        list.head2 = null;
        list.result = null;

        list.carry = 0;
        int arr1[] = { 9, 9, 9 };
        int arr2[] = { 1, 8 };

        for (int i = arr1.length - 1; i >= 0; --i)
            list.push(arr1[i], 1);

        // Create second list as 1->8
        for (int i = arr2.length - 1; i >= 0; --i)
            list.push(arr2[i], 2);

        list.addList();

        list.printList(list.result);
    }


}

package lists;

public class DeleteWithoutHeadNode {
    Node head;
    class Node {
        int data;
        Node next;
        Node (int d){
            data = d;
            next = null;
        }
    }

    public void push(int new_data){
        Node new_node = new Node(new_data);

        new_node.next = head;

        head = new_node;
    }

    public void printList(){
        Node tNode = head;
        while(tNode != null) {
            System.out.print(tNode.data + " ");
            tNode = tNode.next;
        }
    }

    public void deleteNode(Node Node_ptr){
        Node temp = Node_ptr.next;
    }
    public static void main(String[] args) {

    }
}

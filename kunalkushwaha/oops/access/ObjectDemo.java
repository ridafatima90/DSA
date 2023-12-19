package kunalkushwaha.oops.access;

public class ObjectDemo {
    private int num;
    float gpa;
    public ObjectDemo(int num, float gpa) {
        super();
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        return this.num == ((ObjectDemo)obj).num;

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(34, 42.5f);
        ObjectDemo obj2 =new ObjectDemo(34, 32.5f);

//        if(obj1 == obj2){
//            System.out.println("obj1 equal to obj2");
//        }
//        if (obj1.equals(obj2)) {
//
//            System.out.println("obj1 equal to obj2");
//        }
        System.out.println(obj1 instanceof Object);

    }
}

package kunalkushwaha.oops.interfacedefault;

public interface A {

    static public void greeting(){
        System.out.println("Allah is the only God we pray- Ghuncha and Mannawar says!");
    }
    default void funA(){
        System.out.println("I am in A");
    }
}

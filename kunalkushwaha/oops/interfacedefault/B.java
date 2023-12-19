package kunalkushwaha.oops.interfacedefault;

public interface B{
    default void funB(){
        System.out.println("B");
    }
    void test();
}

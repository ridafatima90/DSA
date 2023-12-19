package kunalkushwaha.oops.interfaces;

public class Car implements Engine, Brake, Media{
    int a = 30;
    @Override
    public void brake() {
        System.out.println("Brake like normal car");
    }

    @Override
    public void start() {
        System.out.println("Start Engine like normal car");
    }

    @Override
    public void stop() {
        System.out.println("Stop Engine like normal car");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate like normal car");
    }
}

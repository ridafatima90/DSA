package kunalkushwaha.oops.interfaces;

public class DolbyMedia implements Media{
    @Override
    public void start() {
        System.out.println("dolby media started");
    }

    @Override
    public void stop() {
        System.out.println("dolby media stopped");
    }
}

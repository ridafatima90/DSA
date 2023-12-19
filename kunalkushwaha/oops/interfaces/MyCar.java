package kunalkushwaha.oops.interfaces;

public class MyCar {
    private Engine engine;
    private Media media = new DolbyMedia();

    public MyCar() {
        this.engine = new ElectricEngine();
    }

    public MyCar(Engine engine) {
        this.engine = engine;
    }

    public void carStart(){
        engine.start();
    }

    public void carStop(){
        engine.stop();
    }

    public void mediaStart(){
        media.start();
    }

    public void mediaStop(){
        media.stop();
    }

    public void upGradeEngine(){
        this.engine= new Engine() {
            @Override
            public void start() {
                System.out.println("Power Engine started");
            }

            @Override
            public void stop() {
                System.out.println("Power engine stopped");
            }

            @Override
            public void accelerate() {

            }
        };
    }
}

package kunalkushwaha.oops.interfaces;

public class Main{
    public static void main(String[] args) {
//        Engine car = new Car();
//
//        car.start();
//        car.accelerate();

        MyCar car = new MyCar();
        car.carStart();
        car.mediaStart();
        car.upGradeEngine();
        car.carStart();

    }
}

package kunalkushwaha.oops;

public class Box {
    private double l;
    double w;
    double h;
    double weight;

    static void greetings(){
        System.out.println("I am inside static method");
    }

    public void getL(){
        this.l = 20;
    }

    Box(){
        super();
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    Box(double side){
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(double l, double w, double h){
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    public void information(){
        System.out.println("Running the box");
    }
}

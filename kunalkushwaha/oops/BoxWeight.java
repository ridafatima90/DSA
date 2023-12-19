package kunalkushwaha.oops;

public class BoxWeight extends Box{
    double weight;
    public BoxWeight(){
        this.weight = -1;
    }

    static void greetings(){
        System.out.println("I am inside static method of BoxWeight class");
    }

    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }
    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }
    BoxWeight(double l, double h, double w, double weight){
        super(l, h, w);
        this.weight = super.weight;
    }
}

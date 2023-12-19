package kunalkushwaha.collections;

public class EnumClass {

    enum Months implements A{
            Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec;
            Months(){
                System.out.println("Constructor called for " + this);
            }

        @Override
        public void greet() {
            System.out.println("Salam: Allah is the greatest of all");
        }
    }
    public static void main(String[] args) {
        Months month;
        month = Months.Apr;

//        for(Months day: Months.values()){
//            System.out.println(day);
//        }
        month.greet();

    }
}

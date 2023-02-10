package JavaBasic;

public class OverloadingInJava {

    static int myCalculation( int x, int y){
        return x*y;
    }
    static double myCalculation( double x, double y){
        return x*y;
    }
    static double myCalculation( double x, int y){
        return x*y;
    }

    public static void main(String[] args) {
        int myMethod1 = myCalculation(2,3);
        double myM2 = myCalculation(5.6,10);
        double m3 = myCalculation(1.2, 100);
        System.out.println(myMethod1 +"and" + myM2 +"and"+ m3);
    }
}

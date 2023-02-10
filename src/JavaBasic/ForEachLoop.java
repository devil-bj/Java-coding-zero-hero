package JavaBasic;

public class ForEachLoop {
    public static void main(String[] args) {
        //syntax
        //for(type variableName: arrayName){ code to be executed}
        String cars []= {"volvo","GMC", "Honda", "BMW","Chevy"};
        for (String carsName: cars) {
            System.out.println(carsName);
        }
    }
}

package JavaBasic;

public class MethodsInJava {
    static void myName(String fName, String city, int zip ){
        System.out.println("My Name is: " + fName + "\n&" + " I am from: " + city + "\nMy zip code:" + zip);
    }
    static String myWork(String wName, String wCity, int wZip ){



       return wName +wCity + wZip;
    }

    public static void main(String[] args) {
        // here method is called;
        myName("bijay", "Irving", 75062);
        String result = myWork("yajib", "Dallas", 75042);
        System.out.println(result);

    }
}

package CopyingInJava;

public class Cloning {
    // this is a example is cloning in Java.
    // Cloning is the combination of both deep and shallow copying.
    public static void main(String[] args) throws CloneNotSupportedException {
        Copying obj = new Copying();
        obj.a =10;
        obj.b  =12;

        Copying obj1;
        obj1 = (Copying) obj.clone();
        obj1.b=9;
        System.out.println(obj1);
        System.out.println(obj);
    }
}

package CopyingInJava;

// This is the example of the deep copying in Java
// In this copying the new object is created unlike the shallow copy.
// and all values are manually copied.
public class DeepCopying {
    public static void main(String[] args) {

        // creating the object for the class
        Copying obj = new Copying();
        obj.a =4;
        obj.b = 6;

        // now creating deep copying object;
        Copying obj1 = new Copying();
        obj1.a = obj.a;
        obj1.b = obj.b;

        // lets check what happens when value changes
        obj1.a = 90;
        // unlike the shallow copy it's value only change where changes is done.
        System.out.println(obj1);
        System.out.println(obj);
    }
}

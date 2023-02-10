package CopyingInJava;




/*Generally there are three copying in java:
* Shallow Copying => In this copying new instances is created and all the values are copied in it.
* Both the new and old value points toward the heap.
* Deep Copying => In deep copying new object is created and manually copying each value on the object created.
* Cloning => It is the combination of both deep and shallow copying.
* */
public class ShallowCopy {
    public static void main(String[] args) {
        Copying obj = new Copying();
        obj.a=5;
        obj.b=6;


        // this line is used for shallow copying
        Copying obj1 = obj;
        obj1.a = 10;
        // so when the value of copied values changes the value of previous object instances changes; which is disadvantage.
        System.out.println(obj1);
        System.out.println(obj);

}
}

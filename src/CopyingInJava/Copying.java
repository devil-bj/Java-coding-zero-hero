package CopyingInJava;

class Copying implements Cloneable {
    public static Object obj1;
    int a;
    int b;

    @Override
    public String toString() {
        return "Copying{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
    // created a @override cloning object method called clone
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
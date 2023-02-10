package JavaBasic;

public class ArrayInJava {
    public static void main(String[] args) {
        // creating array here:
        String []  fruits = {"apple","banana", "orange", "mango", "berries"};
        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(fruits);
        System.out.println(numbers);
        System.out.println(fruits.length);
        System.out.println(numbers.length);
        fruits[2] = "Pomegranate";
        System.out.println(fruits [2]);
        numbers [3]  = 14;
        System.out.println(numbers);
    }
}

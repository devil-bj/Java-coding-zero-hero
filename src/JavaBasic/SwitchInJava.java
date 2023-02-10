package JavaBasic;

public class SwitchInJava {
    public static void main(String[] args) {
        /*
        * This is JAVA switch case statement code.
        * A simple example will be done here.
        * */
        char choices = 'C';
        System.out.println("Choose your desired choice from the machine:");
        switch(choices){
            case 'A': if (choices== 'A'){
                System.out.println("Your choice is A from all the choices");
            }
            break;

            case 'B':if (choices== 'B'){
                System.out.println("Your choice is B from all the choices");
            }

            break;

            case 'C': if (choices== 'C'){
                System.out.println("Your choice is C from all the choices");
            }
            break;

            case 'D': if (choices== 'D'){
                System.out.println("Your choice is D from all the choices");
            }
            break;
            case 'E': if (choices== 'E'){
                System.out.println("Your choice is C from all the choices");
            }
            break;

            default:
                System.out.println("You've selected the incorrect choice");

        }
    }
}

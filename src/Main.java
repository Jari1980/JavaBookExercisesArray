import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        int exercise;
        while(true) {
            System.out.println("Which exercise do you want to run 1-xx:");
            try{
                exercise = scan.nextInt();
                switch (exercise){
                    case 1:
                        Exercise1();
                    default:
                        System.out.println();
                }
            }
            catch (Exception e){
                System.out.println("User typed a non integer, program closing.");
                System.exit(0);
            }
        }
    }
    public static void Exercise1(){
        System.out.println("Helo World");
    }
}
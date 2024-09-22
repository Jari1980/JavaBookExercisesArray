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
        var arr1 = new double[4];
        var arr2 = new int[]{
                5,
                10,
                20,
                50,
                100,
                200,
                500
        };
        System.out.println("Printing out each element in both arrays with a for loop");
        System.out.println("Array 1:");
        for(int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }
        System.out.println("Array 2:");
        for(int j = 0; j < arr2.length; j++){
            System.out.println(arr2[j]);
        }
        System.out.println("Using foreach loop");
        System.out.println("Array 1:");
        for(double element1 : arr1){
            System.out.println(element1);
        }
        System.out.println("Array 2:");
        for(int element2 : arr2){
            System.out.println(element2);
        }
    }
}
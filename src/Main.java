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
                    case 2:
                        Exercise2();
                    case 3:
                        Exercise3();
                    case 4:
                        Exercise4();
                    case 5:
                        Exercise5();
                    case 6:
                        Exercise6();
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
    public static void Exercise6(){
        System.out.println("Creating a array with 20 double elements with values according to index");
        var arr1 = new double[20];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = i;
        }
        System.out.println("arr1:");
        for(double ele : arr1){
            System.out.println(ele);
        }
        System.out.println("Creating a method Fill which takes arguments (double[] arr, int ind1, int ind2, double value)" +
                " in order to changes values within the two given indexes, starting with ind1 to ind2, to desired value.");
        System.out.println("Calling method Fill with argument (arr1, 5, 9, 2.1)");
        Fill(arr1, 5, 9, 2.1);
        System.out.println("arr1 after running method:");
        int counter = 0;
        for(double ele : arr1){
            System.out.println("Index " + counter + ": " + " value: " + ele);
            counter++;
        }
    }
    public static void Fill(double[] arr, int ind1, int ind2, double value){
        for(int i = ind1; i < ind2; i++){
            arr[i] = value;
        }
    }

    public static void Exercise5(){
        System.out.println("Creating 2 arrays, first one with 100 elements initialising this so the index reflects tha value," +
                            "second with 20 elements non initialised");
        var array1 = new int[100];
        var array2 = new int[20];
        for(int i = 0; i < array1.length; i++){
            array1[i] = i;
        }
        //for(int elm : array1){
          //  System.out.println(elm);
        //}
        System.out.println("Copying element 50-54 from first array to the place 10-14 in second array.");
        int counter = 10;
        for(int j = 50; j <= 54; j++){
            array2[counter] = array1[j];
            counter++;
        }
        System.out.println("Array2:");
        int counter2 = 0;
        for(int ele : array2){
            System.out.println("index: " + counter2 + " value: " + ele);
            counter2++;
        }
        System.out.println("Using arraycopy to copy elements 95-99 from first to element 5-9 in second.");
        System.arraycopy(array1, 95, array2, 5, 5);
        System.out.println("Array2:");
        int counter3 = 0;
        for(int ele : array2){
            System.out.println("index: " + counter3 + " value: " + ele);
            counter3++;
        }
    }

    public static void Exercise4(){
        System.out.println("Write any number of items with price, the program will keep the most expensive item in memory, break loop by typing non digit in price.");
        double priceMax = 0;
        String nameMax = "";
        var scan = new Scanner(System.in);
        while (true){
            System.out.println("Enter name for a item:");
            if (!scan.hasNextLine()){
                break;
            }
            String nameTemp = scan.next();
            System.out.println("Price for " + nameTemp + "?");
            if (!scan.hasNextDouble()){
                break;
            }
            double priceTemp = scan.nextDouble();
            if(priceMax < priceTemp){
                nameMax = nameTemp;
                priceMax = priceTemp;
            }
        }
        System.out.println("Item " + nameMax + " is most expensive with a price of " + priceMax + ".");
    }

    public static void Exercise3(){
        System.out.println("Creating array with 10 double elements.");
        var arr = new double[10];
        double counter = 1.0;
        System.out.println("Setting value for the last element as 1/1, second last 1/2 and so on, last exercise in opposite order.");
        for(int i = arr.length - 1; i >= 0; i--){
            arr[i] = 1.0 / counter;
            counter++;
        }
        System.out.println("Values in array:");
        for(double element : arr){
            System.out.println(element);
        }
    }

    public static void Exercise2(){
        System.out.println("Creating a array with 10 double elements.");
        var arr = new double[10];
        System.out.println("Setting values with a for loop as 1/1, 1/2, 1/3..");
        for(int i = 0; i < arr.length; i++){
            arr[i] = 1.0/(i + 1.0);
        }
        System.out.println("Printing values in array:");
        for(double element : arr){
            System.out.println(element);
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
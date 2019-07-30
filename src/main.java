import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println("input delete element");
        int del = scanner.nextInt();
        int delPosition = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == del){
                System.out.println( "array have "+del+" element at "+ i+ " position!");
                delPosition = i;
            }
        }
        for (int i=delPosition; i< arr.length-1; i++){
                arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;
    for (int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

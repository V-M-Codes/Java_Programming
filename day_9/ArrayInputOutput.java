import java.util.Scanner;
public class ArrayInputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for(int i =0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
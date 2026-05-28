//Difference of first and last element of array
import java.util.Scanner;

public class ArrayDifference {
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int Differnece = arr[0] - arr[n-1];
        System.out.println("Different is "+Differnece);

        sc.close();
    }
}

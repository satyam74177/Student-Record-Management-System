import java.util.*;
public class code4 {
    public static void main(String[] args) {
        // To find average of student's Marks from an array.
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements or marks in the array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        // To find average
        int sum=0;
        for (int element:arr){
            sum+=element;

        }
        System.out.println("The average is: " + sum/size);
        sc.close();
    }
}

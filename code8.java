public class code8 {
    // to find min value in array
    public static void main(String[] args) {
        int[] arr = {51,53,35,8,9};
       
        int min = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}

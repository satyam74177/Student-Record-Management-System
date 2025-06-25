public class code6 {
    public static void main(String[] args) {
        // reverese an array
        int [] arr = {2,4,6,8,};
        int a = Math.floorDiv(arr.length,2);
        int temp;
        for (int i=0;i<a;i++){
            temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
            
        }
        for(int element:arr){
            System.out.print(element+" ");
        }
    }
}

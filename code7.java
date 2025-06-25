public class code7 {
// to find maximum element in a array
  public static void main(String[] args) {
    int [] arr = {2,4,5,7,3,};
    int max=0;
    for (int i = 0; i < arr.length;i++){
        if (arr[i]>max){
            max=arr[i];
        }
    }
    System.out.println(max);;
  }
}

public class code3 {
    public static void main(String[] args) {
        // To find a number is present in the aray or not
        
        float[] flat = {2.2f,3.5f,4.5f};
        float N = 3.5f;
        for (Float element : flat){
        if(N==element){
            System.out.println("the number is present in the array");
            return;
        }
        }
        System.out.println("the number is not present in the array");
    }
}

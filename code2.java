public class code2 {
    public static void main(String[] args) {
        float [] flat={3.4f,2.4f,4.5f,8.9f};
        float sum=0;
        for(float element : flat){
            sum+=element;
        }
        System.out.println("the sum is: " + sum);
    }
}

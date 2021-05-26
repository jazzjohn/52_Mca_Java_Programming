public class sumAndAvg {
    public static void main(String[] args){
        int sum=0;
        int[] nums={10,24,7,11,30};
        for(int i: nums){
            sum+=i;
        }
        System.out.println("Sum of all numbers : "+ sum);
        System.out.println("Average of all numbers : "+ (sum/5));

    }
}

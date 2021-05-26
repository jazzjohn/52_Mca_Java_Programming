class GreatestOfThreeNums{
    public static void main(String[] args)
    {
        int first=5, second=6, third=2;
        if(first > second && first > third)
            System.out.println(first+ " is greater number");
        else if(second > third && second > first)
            System.out.println(second+ " is greater number");
        else 
            System.out.println(third+ " is greater number");
    }
}
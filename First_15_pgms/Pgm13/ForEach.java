class ForEach {
    public static void main(String[] args) {
        String[] arr={"jazz","popz","christy"};
        int i=1;
        for(String name : arr){
            System.out.println("Element "+ i++ +" : "+name);
        }
    }
}

class CheckSize{
    public static void main(String[] args)
    {
        int size = 18;
        switch(size){
            case 29: System.out.println("\nSmall");
                    break;
            case 42: System.out.println("\nMedium");
                    break;
            case 44: System.out.println("\nLarge");
                    break;
            case 48: System.out.println("\nExtra Large");
                    break;
            default:System.out.println("\nUnknown Size");
        }
    }
}

public class Circle {
    public static void main(String[] args) {
        Double radius=7.5d;
        Double pi =22.0/7.0 ;
        System.out.println("\nTest Data:");
        System.out.println("Radius = "+radius);
        System.out.println("Expected Output");
        System.out.println("Perimeter is = " + (2*pi*radius));
        System.out.println("Area is = " + (pi*radius*radius));
    }
}

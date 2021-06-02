class AddComplexNumbers {
    double real;
    double image;

    void setValues(double r, double i) {
        real = r;
        image = i;
    }

    void addition(AddComplexNumbers c1) {
        System.out.println("Resulting Complex number : " + (real + c1.real) + "+" + (image + c1.image) + "i");
    }
}

public class ComplexMain {
    public static void main(String[] str) {

        AddComplexNumbers c1 = new AddComplexNumbers();
        AddComplexNumbers c2 = new AddComplexNumbers();

        c1.setValues(4, 1);
        c2.setValues(5, 1);

        c2.addition(c1);

    }
}

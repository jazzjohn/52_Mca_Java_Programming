class Product {
    String pcode;
    String pname;
    double price;

    void SetValues(String pc, String n, double p) {
        pcode = pc;
        pname = n;
        price = p;
    }

    String FindLowestPrice(Product p1, Product p2) {
        if (p1.price < p2.price && p1.price < price)
            return p1.pname;
        if (p2.price < p1.price && p2.price < price)
            return p2.pname;
        else
            return pname;
    }
}

public class ProductMain {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        String lname;

        p1.SetValues("P1", "SOAP", 45);

        p2.SetValues("P2", "PEN", 10);

        p3.SetValues("P3", "BOOK", 25);

        lname = p3.FindLowestPrice(p1, p2);

        System.out.println("\nProduct having lowest price is : " + lname + "\n");

    }
}

class Box4 {
    double height;
    double weight;
    double width;

    double volume()
    {
        return height * weight * width;
    }
}

public class BoxDemo4 {
    public static void main(String[] args){
        Box4 mybox1 = new Box4();
        Box4 mybox2 = new Box4();

        double vol;

        mybox1.height = 10;
        mybox1.weight = 12;
        mybox1.width = 5;

        vol = mybox1.volume();
        System.out.println("Volume is : "+ vol);

        mybox2.height = 8;
        mybox2.weight = 15;
        mybox2.width = 6;

        vol = mybox2.volume();

        System.out.println("Volume is : "+ vol);
    }
}

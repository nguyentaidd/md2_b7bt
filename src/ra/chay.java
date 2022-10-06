package ra;

public class chay {
    public static void main(String[] args) {
        Shape[] Sum = new Shape[3];
        Sum[0] = new Circle(10, "red", true);
        Sum[1] = new Square(2, "yellow", false);
        Sum[2] = new Rectangle(10,20,"black",true);

        for (int i = 0; i < Sum.length; i++) {
            System.out.println("-----------------------------------");
            System.out.println("Ban dau : ");
            System.out.println(Sum[i] + "\n");
            System.out.println("Sau khi tang kich thuoc :");
            Sum[i].resize(Math.random() * 100);
            System.out.println(Sum[i] + "\n");
        }

    }
}

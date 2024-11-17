public class Main {
    public static void main(String[] args) {
        Color color1 = new Color(123, 13, 56, 0.5);
        Color color2 = new Color(123, 13, 56);

        // wykorzystanie metody toString
        System.out.println("color1:" + color1);
        System.out.println("color2:" + color2);

        // wykorzystanie metody print z klasy Color
        color1.print();
        color2.print();
    }
}

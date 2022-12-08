public class Main{
    public static void main(String[] args){
        Circle c = new Circle(2f, 2f, 5f, 5f);

        System.out.println(c.toString());
        System.out.println(c.calculaArea());
        System.out.println(c.calculaPerimetro());
    }
}
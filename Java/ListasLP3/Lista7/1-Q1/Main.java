public class Main{
    public static void main(String[] args){
        Ponto2D p = new Ponto2D(2, 2);
        Ponto2D p2 = new Ponto2D(3, 3);

        System.out.println(p.distance(p2));
        System.out.println(p.toString());
    }
}
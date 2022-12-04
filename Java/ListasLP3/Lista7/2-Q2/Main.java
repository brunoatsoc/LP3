public class Main{
    public static void main(String[] args){
        Ponto3DH p1 = new Ponto3DH(2, 3, 4);
        Ponto3DH p2 = new Ponto3DH(1, 2, 3);

        System.out.println(p1.toString());
        System.out.println(p1.distance(p2));
    }
}
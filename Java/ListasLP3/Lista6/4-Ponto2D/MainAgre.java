public class MainAgre{
    public static void main(String[] args){
        Ponto2D p1 = new Ponto2D(1.0f, 2.0f);
        Ponto2D p2 = new Ponto2D(2.0f, 2.0f);
        SegmentoReta s = new SegmentoReta(p1, p2);

        System.out.println(s.imprimeSegmentoReta());
    }
}
public class Main{
    public static void main(String[] args){
        Ponto2D p1 = new Ponto2D(1, 2);
        Ponto2D p2 = new Ponto2D(3, 4);
        Ponto2D p3 = new Ponto2D(3, 1);
        Triangulo t = new Triangulo(p1, p2, p3);

        System.out.println(t.imprimeTriangulo());
        System.out.println(t.isTrianguloEquilatero());
        System.out.println(t.isTrianguloIssoceles());
        System.out.println(t.isTrianguloRetangulo());
    }
}
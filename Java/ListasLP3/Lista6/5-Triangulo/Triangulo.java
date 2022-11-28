public class Triangulo{
    private Ponto2D a;
    private Ponto2D b;
    private Ponto2D c;

    public Triangulo(Ponto2D a, Ponto2D b, Ponto2D c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private static float distance(Ponto2D a, Ponto2D b){
        double result = Math.sqrt((a.getX() - b.getX()) * (a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY()));

        return (float)result;
    }

    public String imprimeTriangulo(){
        return "AB = " + distance(a, b) + "\nBC = " + distance(b, c) + "\nCA = " + distance(c, a) + "\n";
    }

    public boolean isTrianguloRetangulo(){
        float x = distance(a, b);
        float y = distance(b, c);
        float z = distance(c, a);

        if(x == (y * y) + (z * z)){
            return true;
        }else if(y == (x * x) + (z * z)){
            return true;
        }else if(z == (x * x) + (y * y)){
            return true;
        }else{
            return false;
        }
    }

    public boolean isTrianguloIssoceles(){
        float x = distance(a, b);
        float y = distance(b, c);
        float z = distance(c, a);

        if((x == y && x != z) || (x == z && x != y) || (z == y && z != x)){
            return true;
        }
        return false;
    }

    public boolean isTrianguloEquilatero(){
        float x = distance(a, b);
        float y = distance(b, c);
        float z = distance(c, a);

        if(a == b && a == c){
            return true;
        }
        return false;
    }
}
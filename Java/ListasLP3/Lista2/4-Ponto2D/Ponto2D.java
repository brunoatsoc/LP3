public class Ponto2D{
    //Atributos
    private float x, y;

    //Metodos set
    public void setX(float x){
        this.x = x;
    }

    public void setY(float y){
        this.y = y;
    }

    //Metodos get
    public float getX(){
        return this.x;
    }

    public float getY(){
        return this.y;
    }

    //Retorna true se o ponto está no eixo x
    public boolean isEixoX(){
        float x = getX(), y = getY();

        if(((x > 0) || (x < 0)) && (y == 0)){
            return true;
        }
        return false;
    }

    //Retorna true se o ponto está no eixo y
    public boolean isEixoY(){
        float x = getX(), y = getY();

        if(((y > 0) || (y < 0)) && (x == 0)){
            return true;
        }
        return false;
    }

    //Retorna true se o ponto está na origem
    public boolean isEixos(){
        if((getX() == 0) && (getY() == 0)){
            return true;
        }
        return false;
    }

    //Retorna o quadrante em que o ponto está
    public int quadrante(){
        float x = getX(), y = getY();

        if(x == 0 && y == 0){
            return 0;
        }else if((x >= 0) && (y >= 0)){
            return 1;
        }else if((x <= 0) && (y >= 0)){
            return 2;
        }else if((x <= 0) && (y <= 0)){
            return 3;
        }else if((x >= 0) && (y <= 0)){
            return 4;
        }
        return -1;
    }

    //Distancia euclidiana do ponto até (0, 0)
    public double distancia(Ponto2D p){
        double x = (double)p.getX(), y = (double)p.getY();

        return Math.sqrt(((x - 0) * (x- 0)) + ((y - 0) * (y - 0)));
    }
}
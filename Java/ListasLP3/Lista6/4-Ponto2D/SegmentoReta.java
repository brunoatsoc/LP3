//Agregação

public class SegmentoReta{
    private Ponto2D p1, p2;
    private float dimencao;

    public SegmentoReta(Ponto2D p1, Ponto2D p2){
        this.p1 = p1;
        this.p2 = p2;
        this.dimencao = calculaDimecao();
    }

    public String imprimeSegmentoReta(){
        return "Inicia em" + "(" + p1.getX() + "," + p1.getY() + ")" + "e finaliza em " + "(" + p2.getX() + ","+ p2.getY() + ") com dimenção " + dimencao;
    }

    private float calculaDimecao(){
        return this.p1.distance(this.p2);
    }
}
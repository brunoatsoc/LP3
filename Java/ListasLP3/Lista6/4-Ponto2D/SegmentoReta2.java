public class SegmentoReta2{
    private Ponto2D p1, p2;
    private float dimencao;

    public SegmentoReta2(float x1, float y1, float x2, float y2){
        p1 = new Ponto2D(x1, y1);;
        p2 = new Ponto2D(x2, y2);
        this.dimencao = calculaDimecao();
    }

    public String imprimeSegmentoReta(){
        return "Inicia em" + "(" + p1.getX() + "," + p1.getY() + ")" + "e finaliza em " + "(" + p2.getX() + ","+ p2.getY() + ") com dimenção " + dimencao;
    }

    private float calculaDimecao(){
        return this.p1.distance(this.p2);
    }
}
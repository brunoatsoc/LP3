public class LivroLivraria extends Livro{
    private float preco;
    private int estoque;

    public LivroLivraria(String t, String a, int nP, int aP, float p, int est){
        super(t, a, nP, aP);
        preco = p;
        estoque = est;
    }

    public boolean isAvaliable(){
        if(estoque == 0){
            return false;
        }
        return true;
    }

    @Override
    public String toString(){
        return super.toString() + "Preço: " + preco + "\n";
    }

    public void sell(){
        if(isAvaliable()){
            System.out.println(toString());
        }
        System.out.println("Não foi possivel efetuar a venda!!");
    }
}
public class Main{
    public static void main(String[] args){
        LivroLivraria livro = new LivroLivraria();

        livro.defineName("Bruno");
        livro.defineValue(50);
        livro.defineCover(0);
        livro.defineStock(100);
        livro.defineCep("45604775");
        livro.sellUnits(1);
        System.out.printf("%f\n", livro.calculateShipping());
        livro.printInformation(5);
    }
}
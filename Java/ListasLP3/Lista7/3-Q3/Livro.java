public class Livro{
    private String titulo;
    private String autor;
    private int nPaginas;
    private int anoPublicacao;

    public Livro(String t, String a, int nP, int aP){
        titulo = t;
        autor = a;
        nPaginas = nP;
        anoPublicacao = aP;
    }

    public String toString(){
        return "Livro\n\nTitulo: " + titulo + "\nAutor: " + autor + "\nPaginas" + nPaginas + "\nAno da Publicação" + anoPublicacao + "\n";
    }

    public boolean isOlder(){
        if(anoPublicacao < 1970){
            return true;
        }
        return false;
    }
}
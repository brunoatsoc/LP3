public class LivroLivraria{
    //Variaveis da classe
    private boolean commomCover;
    private int cep;
    private int stockNumber;
    private int quantityBuy;
    private float bookValue;
    private String buyerName = new String();

    //Funções para definir valores para as variaveis da classe
    public void defineCover(int isCommom){
        if(isCommom == 0){
            bookValue = bookValue + 10;
        }
    }

    public void defineValue(float value){
        bookValue = value;
    }

    public void defineName(String name){
        buyerName = name;
    }

    public void defineCep(String dCep){
        dCep = dCep.replace("-", "");
        cep = Integer.parseInt(dCep);
    }

    public void defineStock(int quantity){
        stockNumber = quantity;
    }

    //Calcula o frete com base no Cep digitado
    public float calculateShipping(){
        if((cep >= 1000000) && (cep <= 39999999)){
            return bookValue + 25;
        }else if((cep >= 40000000) && (cep <= 65999999)){
            return bookValue + 10;
        }else if((cep >= 66000000) && (cep <= 79999999)){
            return bookValue + 40;
        }else if((cep >= 80000000) && (cep <= 99999999)){
            return bookValue + 50;
        }else{
            System.out.printf("Entrada Invalida!!\n");
            System.exit(-1);
            return -1;
        }
    }//Fim

    //Vende unidades do livro e tira o que foi vendido do estoque
    public int sellUnits(int quantity){
        if(stockNumber - quantity <= 0){
            System.out.printf("Não é possivel vender essa quatidade\nTemos %d no estoque!", stockNumber);
            return stockNumber;
        }
        quantityBuy = quantity;
        stockNumber = stockNumber - quantity;
        return stockNumber;
    }//Fim

    //Imprime as informações da compra
    public void printInformation(int numberInstallments){
        if(numberInstallments <= 0){
            numberInstallments = 1;
        }

        float value = calculateShipping();

        System.out.printf("RELATÓRIO DA VENDA\n\n");
        System.out.printf("Cliente: %s\n", buyerName);
        System.out.printf("Capa comum: %s\n", commomCover ? "Sim": "Não");
        System.out.printf("Valor da Compra: %f\n", value * quantityBuy);
        System.out.printf("Parcelas: %d X %f\n", numberInstallments, value * quantityBuy / numberInstallments);
        System.out.printf("Entrgar no CEP: %d\n", cep);
        System.out.printf("Quantidade: %d\n", quantityBuy);
    }//Fim
}//Fim da classe
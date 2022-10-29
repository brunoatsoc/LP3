public class ContaBancaria{
    private String nomeCorrentista = new String();
    private float saldo;
    private boolean contaEspecial;

    public void abreconta(String nome, float deposito, boolean especial){
        nomeCorrentista = nome;
        if(deposito < 0){
            deposito = 0;
        }
        saldo = deposito;
        contaEspecial = especial;
    }
}
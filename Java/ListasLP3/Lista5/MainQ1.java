import base.Contato;

public class MainQ1{
    public static void main(String[] args){
        Contato c1 = new Contato("Bruno Santos Costa", "brunosantos20003237@gmailcom", "73988673196", 10, 3, 2000);
        Contato c2 = new Contato("Bruno", "bruno@gmailcom", "73988673196", 10, 3, 2000);

        System.out.println(c1.getCounter());
    }
}
public class Main{
    public static void main(String[] args){
        Contato c = new Contato();

        c.setDate(10, 3, 2000);
        c.setEmail("brunosantos20003237@gmail.com");
        c.setPhone("(73)9 8867-3196");
        c.setName("Bruno Santos Costa");
        c.printContact();
        System.out.println("Age = " + c.calculateAge());
    }
}
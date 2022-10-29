public class Main{
    public static void main(String[] args){
        Contato c = new Contato("Bruno", "brunosantos20003237@gmail.com", "(73)98867-3196", 29, 10, 2022);

        //c.setDate(29, 10, 2022);
        //c.setEmail("brunosantos20003237@gmail.com");
        //c.setPhone("(73)9 8867-3196");
        //c.setName("Bruno Santos Costa");
        c.printContact();
        //System.out.println("Age = " + c.calculateAge());
    }
}
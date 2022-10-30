public class Main{
    public static void main(String[] args){
        Date data = new Date();

        data.setDate(29, 2, 1900);
        data.initializeDate();
        data.printDate();
        data.printDateExtensive();
    }
}
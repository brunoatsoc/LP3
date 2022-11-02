public class Main{
    public static void main(String[] args){
        Data d1 = new Data(2, 11, 2022);
        Data d2 = new Data(2, 11, 2022);

        System.out.println(d2.howManyDays(d1));
        System.out.println(d2.dayOfWeek(d1));
    }
}
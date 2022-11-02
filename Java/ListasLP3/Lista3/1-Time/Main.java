public class Main{
    public static void main(String[] args) {
        System.out.println("Hora convencional");
        Time time1 = new Time();
        time1.prnTime();
        time1.setTime(20, 53, 35);
        time1.prnTime();

        System.out.println("Hora como enteiro:");
        TimeAsInt time2 = new TimeAsInt();
        time2.prnTime();
        time2.setTime(20, 53, 35);
        time2.prnTime();
    }
}
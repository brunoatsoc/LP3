//Tem que concertar

public class Main{
    public static void main(String[] args){
        Data data1 = new Data(26, 11, 2022);
        Hora hora1 = new Hora(12, 5, 25);
        DataHora d1 = new DataHora(data1, hora1);
        Data data2 = new Data(10, 3, 2000);
        Hora hora2 = new Hora(13, 45, 20);
        DataHora d2 = new DataHora(data2, hora2);

        System.out.println(d1.toString());
        System.out.println(d1.equals(d2));
        System.out.println(d1.isGreather(d2));
        System.out.println(d1.isLower(d2));
    }
}
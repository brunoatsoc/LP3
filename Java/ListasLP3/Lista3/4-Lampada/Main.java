public class Main{
    public static void main(String[] args){
        //Lampada l = new Lampada(12.4, "Blue", "Corporation", 5.4, 50, 100, 5);
        Lampada l = new Lampada();

        l.setColor("Blue");
        l.setManufacturer("Light Corporation");
        l.setPotencyWatts(12.4);
        l.setQuantityInStock(100);
        l.setValue(25);
        l.setVoltage(5.4);
        l.makeSale(5);
        l.printPurchase();
    }
}
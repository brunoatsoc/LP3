public class Main{
    public static void main(String[] args){
        LampadaTresEstados l = new LampadaTresEstados();

        l.lightOn();
        l.printStatus();
        l.lightOff();
        l.printStatus();
        l.halfLight();
        l.printStatus();
    }
}
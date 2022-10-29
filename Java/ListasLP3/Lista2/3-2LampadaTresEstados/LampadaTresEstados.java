public class LampadaTresEstados{
    private int lampStatus;

    public void lightOn(){
        this.lampStatus = 1;
    }

    public void lightOff(){
        this.lampStatus = 0;
    }

    public void halfLight(){
        this.lampStatus = 2;
    }

    public void printStatus(){
        if(lampStatus == 1){
            System.out.printf("Lamp is on!!\n");
        }else if(lampStatus == 0){
            System.out.printf("Lamp is off!!\n");
        }else{
            System.out.printf("Lamp is in half light!!\n");
        }
    }
}
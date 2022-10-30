public class Lampada{
    private int lampStatus;

    public void lightOn(){
        this.lampStatus = 1;
    }

    public void lightOff(){
        this.lampStatus = 0;
    }

    public boolean isOn(){
        if(this.lampStatus == 1){
            return true;
        }
        return false;
    }

    public void printStatus(){
        if(lampStatus == 1){
            System.out.printf("Lamp is on!!\n");
        }else{
            System.out.printf("Lamp is off!!\n");
        }
    }
}
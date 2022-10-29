public class LampadaPorcentagem{
    private int lampStatus;

    public void setLightPercentage(int lampStatus){
        if((lampStatus < 0) || (lampStatus > 100)){
            System.out.printf("Error in setLightOnPercentage, invalid percentage!!\n");
            System.exit(-1);
        }
        this.lampStatus = lampStatus;
    }

    public int getLightPercentage(){
        return this.lampStatus;
    }

    public void printLampStatus(){
        if(this.lampStatus == 0){
            System.out.printf("Light %d%% off!!\n", getLightPercentage());
        }else if(this.lampStatus == 50){
            System.out.printf("%d%% light is in half light!!\n", getLightPercentage());
        }else{
            System.out.printf("Light %d%% on!!\n", getLightPercentage());
        }
    }
}
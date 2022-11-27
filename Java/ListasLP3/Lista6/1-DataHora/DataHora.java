public class DataHora{
    private Data data;
    private Hora hora;

    public DataHora(int day, int month, int year, int hour, int minute, int second){
        data = new Data(day, month, year);
        hora = new Hora(hour, minute, second);
    }

    public int getDay(){
        return data.getDay();
    }

    public int getMonth(){
        return data.getMonth();
    }

    public int getYear(){
        return data.getYear();
    }

    public int getHour(){
        return hora.getHour();
    }

    public int getMinute(){
        return hora.getMinute();
    }

    public int getSecond(){
        return hora.getSecond();
    }

    public String toString(){
        return data.toStringLong() + ", " + hora.toString();
    }

    public boolean isEqual(DataHora outroObjeto){
        if((outroObjeto.getDay() == getDay()) && (outroObjeto.getMonth() == getMonth()) && (outroObjeto.getYear() == getYear())){
            if((outroObjeto.getHour() == getHour())  && (outroObjeto.getMinute() == getMinute()) && (outroObjeto.getSecond() == getSecond())){
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean isGreather(DataHora outroObjeto){
        if(!data.isPrevious(outroObjeto.getDay(), outroObjeto.getMonth(), outroObjeto.getYear())){
            if(outroObjeto.getHour() > hora.getHour()){
                return true;
            }else if(outroObjeto.getHour() < hora.getHour()){
                return false;
            }else{
                if(outroObjeto.getMinute() > hora.getMinute()){
                    return true;
                }else if(outroObjeto.getMinute() < hora.getMinute()){
                    return false;
                }else{
                    if(outroObjeto.getSecond() > hora.getSecond()){
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }

    public boolean isLower(DataHora outroObjeto){
        if(isGreather(outroObjeto)){
            return false;
        }
        return true;
    }
}
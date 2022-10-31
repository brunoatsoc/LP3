public class Date{
    //Atributos
    private int day, month, year;

    //Atualiza a data
    public void setDate(int day, int month, int year){
        if(dateVerification(day, month, year)){
            this.day = day;
            this.month = month;
            this.year = year;
        }else{
            System.out.printf("Invalid Date!\n");
            System.exit(-1);
        }
    }

    //Retorna o dia
    public int getDay(){
        return this.day;
    }

    //Retorna o mês
    public int getMonth(){
        return this.month;
    }

    //Retorna o ano
    public int getYear(){
        return this.year;
    }

    //Verifica se a data está correta
    private boolean dateVerification(int day, int month, int year){
        if((month >= 1) && (month  <= 12)){
            if(month == 2){
                if((day >= 1) && (day <= 29) && (isLeapYear(year))){
                    return true;
                }else if((day >= 1) && (day <= 28)){
                    return true;
                }
                return false;
            }else if((day >= 1) && (day <= 30) && ((month % 2 == 0) && (month != 8))){
                return true;
            }else if((day >= 1) && (day <= 31)){
                return true;
            }
        }
        return false;
    }

    //Verifica se o ano é bissexto
    private boolean isLeapYear(int year){
        if((year % 4 == 0) && ((year % 100 == 0) && (year % 400 == 0))){
            return true;
        }
        return false;
    }

    //Inicializa o dia, mês e ano com valores padrão
    public void initializeDate(){
        this.day = getDay();
        this.month = getMonth();
        this.year = getYear();
    }

    //Imprime data
    public void printDate(){
        System.out.printf("%d/%d/%d\n", day, month, year);
    }

    //Imprime data por extenso
    public void printDateExtensive(){
        String m[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        System.out.printf("%d de %s de %d\n", this.day, m[getMonth() - 1], this.year);
    }
}
public class Agendamento{
    private Hora hora;
    private Data data;
    private Contato contato;

    public Agendamento(int day, int month, int year, int hour, int min, int sec, String name, String email, String phone, int nDia, int nMes, int nAno){
        this.data = new Data(day, month, year);
        this.hora = new Hora(hour, min, sec);
        this.contato = new Contato(name, email, phone, nDia, nMes, nAno);
    }

    public boolean isEqualHora(Hora outraHora){
        if((outraHora.getHour() == hora.getHour()) && (outraHora.getMinute() == hora.getMinute()) && (outraHora.getSecond() == hora.getSecond())){
            return true;
        }
        return false;
    }

    public String toString(){
        return "Agendamento\n\n" + "Data: " + data.toString() + "Hora: " + hora.toString() + "Contato: " + contato.toString();
    }
}
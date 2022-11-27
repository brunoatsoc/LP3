public class Main{
    public static void main(String[] args){
        Agendamento[] consultaMedica = new Agendamento[2];
        consultaMedica[0] = new Agendamento(27, 11, 2022, 10, 15, 45, "Bruno Santos Costa", "brunosantos20003237@gmail.com", "73988673196", 10, 3, 2000);
        consultaMedica[1] = new Agendamento(29, 1, 2023, 13, 0, 0, "Ubiratã Silva", "ubirata@gmail.com", "7381071790", 2, 9, 1970);

        System.out.println(consultaMedica[0].toString());
        System.out.println(consultaMedica[1].toString());
    }
}
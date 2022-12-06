import java.io.Serializable;

//Classe pessoa que implementa a interface Comparable para comparar objetos e a interface Serializable para manipular arquivos
public class Person implements Comparable<Person>, Serializable, PersonInterface{
    //Atributos da classe
    private int age; //Idade da pessoa
    private String name; //Node da pessoa
    private String cpf; //CPF da pessoa
    private Data date; //Objeto para a data de nascimento da pessoa

    //Construtor
    public Person(int age, String name, String cpf, Data date){
        this.age = age;
        this.name = name;
        this.cpf = cpf;
        this.date = date;
    }//Fim

    //Metodo getAge para obter a idade da pessoa
    public int getAge(){
        return this.age;
    }//Fim getAge

    //Metodo getName para obter o nome da pessoa
    public String getName(){
        return this.name;
    }//Fim getName

    //Metodo getCpf para obter o cpf da pessoa
    public String getCpf(){
        return this.cpf;
    }//Fim getCpf

    //Metodo getDayBirthDay para obter o dia do nascimento da pessoa
    public int getDayBirthDay(){
        return this.date.getDay();
    }//Fim getDayBirthDay

    //Metodo getMonthBirthDay para obter o mês do nascimento da pessoa
    public int getMonthBirthDay(){
        return this.date.getMonth();
    }//Fim getMonthBirthDay

    //Metodo getYearBirthDay para obter o ano do nascimento da pessoa
    public int getYearBirthDay(){
        return this.date.getYear();
    }//Fim getYearBirthDay

    //Metodo getBirthDay para obter o objeto com a data do nascimento da pessoa
    public Data getBirthDay(){
        return this.date;
    }//Fim getBirthDay

    //Metodo setInfo para atializar uma informação
    public void setInfo(int age, String name){
        this.age = age;
        this.name = name;
    }//Fim setInfo

    //Valida informações
    @Override
    public boolean validateInfo(int age, String nome, String cpf, Data d){
        if(age < 0){
            return false;
        }else if(nome == null){
            return false;
        }else if(cpf == null){
            return false;
        }else{
            return true;
        }
    }//Fim validateInfo

    //Metodo que sobrescreve o metodo compareTo da classe Comparable
    @Override
    public int compareTo(Person p){
        if((p.getAge() == this.age) && p.getName().equals(this.name)){
            return 0;
        }else if(p.getAge() > this.age){
            return -1;
        }else{
            return 1;
        }
    }//Fim compareTo

    //Metodo toString para imprimir os atributos do metodo
    @Override
    public String toString(){
        return "Person data\nAge: " + age + "\nName: " + name + "\nCPF: " + cpf + "\nData de nascimento: " + date.toStringLong() + "\n";
    }//Fim compareTo
}//Fim classe Person
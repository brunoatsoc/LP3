package Person;

import java.io.Serializable;

//Classe pessoa que implementa a interface Serializable para manipular arquivos e a classe PersonInterface
public class Person implements Serializable ,PersonInterface{
    //Atributos da classe
    private int age; //Idade da pessoa
    private String name; //Node da pessoa
    private String cpf; //CPF da pessoa
    private Data date; //Objeto para a data de nascimento da pessoa

    //Construtor
    public Person(int age, String name, String cpf, Data date){
        if(validateInfo(age, name, cpf, date)){
            this.age = age;
            this.name = name;
            this.cpf = cpf;
            this.date = date;
        }else{
            System.out.println("Error detting information!!");
            System.exit(-1);
        }
    }//Fim

    //Construtor sem idade
    public Person(String name, String cpf, Data date){
        this(date.calculateAge(), name, cpf, date);
    }//Fim

    //Construtor sem parametro
    public Person(){
        this(0, "Sem nome", "***********", null);
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
    public void setInfo(int age, String name, String cpf, Data date){
        if(validateInfo(age, name, cpf, date)){
            this.age = age;
            this.name = name;
            this.cpf = cpf;
            this.date = date;
        }else{
            System.out.println("Error detting information!!");
            System.exit(-1);
        }
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
    public int compare(Person p){
        if((p.getAge() == this.age) && p.getName().equals(this.name)){
            return 0;
        }else if(p.getAge() > this.age){
            return -1;
        }else{
            return 1;
        }
    }//Fim compare

    //Metodo toString para imprimir os atributos do metodo
    @Override
    public String toString(){
        return "\nName: " + name + "\nCPF: " + cpf + "\nData de nascimento: " + this.date.toString();
    }//Fim compareTo
}//Fim classe Person
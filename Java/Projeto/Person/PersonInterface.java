package Person;

//Interface da classe Person
public interface PersonInterface{
    String toString();
    boolean validateInfo(int age, String nome, String cpf, Data d);
    int compare(Person p);
}//Fim interface
//Interface da classe Person
public interface PersonInterface{
    int compareTo(Person p);
    String toString();
    boolean validateInfo(int age, String nome, String cpf, Data d);
}//Fim interface
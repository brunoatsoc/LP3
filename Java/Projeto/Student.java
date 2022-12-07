//Calees para o Estudante que implementa a classe Comparable para comparar dois objetos
public class Student extends Person implements Comparable<Student>{
    //Atributos da classe
    private int registrationNumber; //Numero de matricula
    private float grade; //Nota do aluno no Enem

    //Construtor
    public Student(int age, String name, String cpf, Data date, int registrationNumber, float grade){
        super(age, name, cpf, date);
        if(verification(registrationNumber, grade)){
            this.registrationNumber = registrationNumber;
            this.grade = grade;
        }else{
            System.out.println("Error detting information!!");
            System.exit(-1);
        }
    }//Fim

    //Obtem o número de matricula do estudante
    public int getRegistrationNumber(){
        return this.registrationNumber;
    }//Fim getRegistrationNumber

    //Obtem a nota do Enem do aluno
    public float getGrade(){
        return this.grade;
    }//Fim getGrade

    private boolean verification(int registrationNumber, float grade){
        if(registrationNumber < 999){
            return false;
        }else if(grade < 0){
            return false;
        }else{
            return true;
        }
    }

    //Compara se dois estudantes são iguais, menor ou maior
    //Retorna 0 caso sejam iguais
    //Retorna -1 caso uma nota do parametro seja menor que a do objeto
    //Retorna 1 caso uma nota do parametro seja maior que a do objeto
    @Override
    public int compareTo(Student st){
        if((super.compare(st) == 0) && ((st.getRegistrationNumber() == this.registrationNumber) && (st.getGrade() == this.grade))){
            return 0;
        }else if(st.getGrade() < this.grade){
            return -1;
        }else{
            return 1;
        }
    }//Fim compareTo

    //Retorna uma string para ser impressa com todas as imformações da classe
    @Override
    public String toString(){
        return super.toString() + "Numero de matricula: " + this.registrationNumber + "\nNota Enem: " + this.grade + "\n";
    }//Fim toString
}//Fim classe Student
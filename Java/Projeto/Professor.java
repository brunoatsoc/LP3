//Classe para o Professor
public class Professor extends Person implements Comparable<Professor>{
    //Atributos da classe
    private int registrationNumber; //Numero de registro do professor
    private String matter; //Materias que o professor quer lecionar
    private String course; //Cursos que o professor que lecionar

    //Construtor
    public Professor(int age, String name, String cpf, Data date, int registrationNumber, String matter, String course){
        super(age, name, cpf, date);
        if(validateInfo(registrationNumber, matter, course)){
            this.registrationNumber = registrationNumber;
            this.matter = matter;
            this.course = course;
        }else{
            System.out.println("Error detting information!!");
            System.exit(-1);
        }
    }//Fim

    //Obtem o número de registro do professor
    public int getRegistrationNumer(){
        return this.registrationNumber;
    }
    //Fim getRegistrationNumer

    //Obtem o nome da matéria que o professor leciona
    public String getMatter(){
        return this.matter;
    }
    //Fim getMatter

    //Obtem o nome do curso que o professor leciona
    public String getCourse(){
        return this.course;
    }
    //Fim getCourse

    //Define as informações do professor
    public void setInfo(int registrationNumber, String matter, String course){
        if(validateInfo(registrationNumber, matter, course)){
            this.registrationNumber = registrationNumber;
            this.matter = matter;
            this.course = course;
        }else{
            System.out.println("Error detting information!!");
            System.exit(-1);
        }
    }
    //Fim setInfo

    //Verifica informações
    public boolean validateInfo(int registrationNumber, String matter, String course){
        if(registrationNumber < 999){
            return false;
        }else if(matter == null){
            return false;
        }else if(course == null){
            return false;
        }else{
            return true;
        }
    }//Fim validateInfo

    //Compara dois professores
    //Retorna 0 se são iguais
    //Retorna -1 se são diferentes
    public int compareTo(Professor p){
        if((super.compare(p) == 0) && (p.getMatter().equals(matter) && p.getCourse().equals(course))){
            return 0;
        }else{
            return -1;
        }
    }//Fim compareTo
}//Fim da classe Professor
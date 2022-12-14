import java.io.Serializable;

//Classe para o Professor que implementa a interface Comparable para comparar dois objetos
//E também a interface Serializable para ler e escrever arquivos
public class Professor extends Person implements Serializable, Comparable<Professor>{
    //Atributos da classe
    private long registrationNumber; //Numero de registro do professor
    private String matter; //Materias que o professor quer lecionar
    private String course; //Cursos que o professor que lecionar

    //Construtor
    public Professor(String name, String cpf, Data date, long registrationNumber, String matter, String course){
        super(name, cpf, date);
        if(validateInfo2(registrationNumber, matter, course)){
            this.registrationNumber = registrationNumber;
            this.matter = matter;
            this.course = course;
        }else{
            System.out.println("Error detting information!!");
            System.exit(-1);
        }
    }//Fim

    //Construtor sem parametro
    public Professor(){
        this("Sem nome", "***********", null, 999l, "Sem materia", "Sem curso");
    }//Fim

    //Obtem o número de registro do professor
    public long getRegistrationNumer(){
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
        if(validateInfo2(registrationNumber, matter, course)){
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
    public boolean validateInfo2(long registrationNumber, String matter, String course){
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
        }else if(alphabetical(p.getName()) == -1){
            return -1;
        }else{
            return 1;
        }
    }//Fim compareTo

    //Metodo para saber se um nome vem antes do outro
    private int alphabetical(String n){
        //Pega os tres primeiros carateres da String que é passada por parametro
        int a = n.charAt(0);
        int b = n.charAt(1);
        int c = n.charAt(2);

        //Pega a String com o nome da pessoa e guarda os tres primeiros caracteres
        int x = getName().charAt(0);
        int y = getName().charAt(1);
        int z = getName().charAt(2);

        //Faz as comparações
        if(x < a){
            return -1;
        }else if(x == a){
            if(y < b){
                return -1;
            }else if(y == b){
                if(z < c){
                    return -1;
                }else if(z == c){
                    return 1;
                }else{
                    return 2;
                }
            }else{
                return 2;
            }
        }else{
            return 2;
        }//Fim comparações
    }//Fim aphabetical

    //Metodo toString para retornar os dados do professor para serem impressos
    @Override
    public String toString(){
        return "Dados do(a) professor(a)\n" + super.toString() + "Número de registro: " + registrationNumber + "\nMateria que o(a) professor(a) leciona: " + matter + "\nCurso que leciona: " + course + "\n";
    }//Fim toString
}//Fim da classe Professor
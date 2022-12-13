import DataStructures.*;
import java.io.*;
import java.io.IOException;

//Classe para os cursos da universidade
public class Course{
    //Atributos da classe
    private static final int vacancy = 20; //Número de vagas
    private static final int waitingList = 30; //Tamnho da lista de espera dos alunos
    private Student[] students = new Student[vacancy]; //Vetor para os estudantes da classe
    private Student[] waitingStudents = new Student[waitingList]; //Vetor para a lista de espera
    private int contWL = 0; //Contador da lista de espera

    private Queue<Student> queue = new Queue<Student>(); //Fila para os alunos

    private String nameCourse; //Nome do curso

    //Contrutor qu aceita o nome do curso como parametro(o nome do curso é para salvar os dados em um arquivo com o nome do curso)
    public Course(String nameCourse){
        this.nameCourse = nameCourse;
    }//Fim

    //Imprime todos os estudantes do curso
    public void printStudents(){
        for(int i = 0; i < vacancy; i++){
            System.out.println(students[i]);
        }
    }//Fim printStudents

    //Coloca um estudante no vetotor
    public void setStudent(Student s, int i){
        if(i > vacancy){
            System.out.printf("Total de vagas do curso preenchido\nO aluno será colocado na lista de espera\n\n");
            waitingStudents[contWL] = s;
            sort(students, 0, i);
            ++contWL;
            return;
        }
        students[i] = s;
        sort(students, 0, i);
    }//Fim setStudent

    //Metodos para ordenar um vetor, QuickSort
    //Metodo partition
    int partition(Student students[], int first, int last){
        Student pivor = students[last];
        int i = first - 1;

        for(int j = first; j < last; j++){
            if(students[j].getGrade() <= pivor.getGrade()){
                i++;
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }
        Student temp = students[i + 1];
        students[i + 1] = students[last];
        students[last] = temp;

        return i + 1;
    }//Fim partition

    //Metodo sort
    public void sort(Student students[], int first, int last){
        if(first < last){
            int pi = partition(students, first, last);
            sort(students, first, pi - 1);
            sort(students, pi + 1, last);
        }
    }//Fim sort

    //Remove um estudante e usa uma flila para organizar o vetor
    public int removeStudent(Student std, int last){
        for(int i = 0; students[i] != null; i++){
            if(students[i].compareTo(std) == 0){
                students[i] = null;
            }else if(students[i].compareTo(std) != 0){
                queue.enqueue(students[i]);
            }else if((students[i] == null) || (i == last)){
                System.out.printf("Estudante não encontrado!!\n\n");
                return last;
            }
        }

        for(int i = 0; i <= last - 1; i++){
            students[i] = queue.dequeue();
        }
        return last - 1;
    }//removeStudent

    public void saveFilesCourse(){
        File file = new File(this.nameCourse + ".txt");

        try{
            ObjectOutputStream oos  = new ObjectOutputStream(new FileOutputStream("Files/" + file));

            for(int i = 0; i < vacancy; i++){
                oos.writeObject(students[i]);
            }

            File file1 = new File(this.nameCourse + "waitingList.txt");
            ObjectOutputStream oos1  = new ObjectOutputStream(new FileOutputStream("Files/" + file1));

            for(int i = 0; i < waitingList; i++){
                oos1.writeObject(waitingStudents[i]);
            }

            oos1.close();
            oos.close();
        }catch(IOException error){
            System.out.printf("Erro, %s\n", error.getMessage());
        }
    }

    public int readStudentsFiles(){
        int j = 0;
        File file = new File(this.nameCourse + ".txt");
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Files/" + file));

            for(int i = 0; i < vacancy; i++){
                students[i] = (Student)ois.readObject();
                if(students[i] == null){
                    j = i;
                    break;
                }
            }
            ois.close();

            File file1 = new File(this.nameCourse + "waitingList.txt");
            ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("Files/" + file1));

            for(int i = 0; i < vacancy; i++){
                waitingStudents[i] = (Student)ois1.readObject();
                if(students[i] == null){
                    contWL = i;
                    break;
                }
            }
            ois1.close();
        }catch(IOException error1){
            System.out.printf("Erro: %s", error1.getMessage());
        }catch(ClassNotFoundException error2){
            System.out.printf("Erro, %s\n", error2.getMessage());
        }
        return j;
    }
}//Fim classe Course
import DataStructures.*;

//Classe para os cursos da universidade
public class Course{
    private static final int vacancy = 20; //Número de vagas constante
    private static final int waitingList = 30;
    private Student[] students = new Student[vacancy]; //Vetor para os estudantes da classe
    private Student[] waitingStudents = new Student[waitingList];

    private Queue<Student> queue = new Queue<Student>();

//=========================================================================================

    //Imprime todos os estudantes do curso
    public void printStudents(){
        for(int i = 0; i < vacancy; i++){
            System.out.println(students[i]);
        }
    }//Fim printStudents

//=========================================================================================

    //Coloca um estudante nesse curso
    public void setStudent(Student s, int i){
        if(i > vacancy){
            System.out.printf("Total de vagas do curso preenchido\nO aluno será colocado na lista de espera\n\n");
            waitingStudents[i] = s;
            sort(students, 0, i);
            return;
        }
        students[i] = s;
        sort(students, 0, i);
    }//Fim setStudent

//=========================================================================================

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
    }

//=========================================================================================

    public void sort(Student students[], int first, int last){
        if(first < last){
            int pi = partition(students, first, last);
            sort(students, first, pi - 1);
            sort(students, pi + 1, last);
        }
    }

//=========================================================================================

    public int removeStudent(Student std, int last){
        for(int i = 0; i <= last; i++){
            if(students[i].compareTo(std) == 0){
                students[i] = null;
            }

            if(students[i].compareTo(std) != 0){
                queue.enqueue(students[i]);
            }

            if((students[i].compareTo(std) != 0) && (i == last)){
                System.out.printf("Estudante não encontrado!!\n\n");
                return last;
            }
        }

        for(int i = 0; i <= last - 1; i++){
            students[i] = queue.dequeue();
        }
        return last - 1;
    }
}//Fim classe Course
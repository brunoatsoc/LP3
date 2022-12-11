import DataStructures.*;
import java.util.Scanner;
import java.io.IOException;

public class University{
    private static int counter1 = 0;
    private static int counter2 = 0;
    private static int counter3 = 0;
    private static int counter4 = 0;
    private static int counter5 = 0;
    private static int counter6 = 0;
    private static int counter7 = 0;
    private static int counter8 = 0;
    private static int counterP = 0;

    private static final int qProfessorVacacy = 50;
    private Professor[] professor = new Professor[qProfessorVacacy];

    private Queue<Professor> queueProfessor = new Queue<Professor>();

    private Course agronomia = new Course();
    private Course bioMedcina = new Course();
    private Course biologia = new Course();
    private Course cienciaComputacao = new Course();
    private Course direito = new Course();
    private Course engenharia = new Course();
    private Course medicina = new Course();
    private Course medVet = new Course();

//=========================================================================================================

    public void menu() throws IOException, InterruptedException{
        System.out.printf("BEM VINDO(A) AO UESC!!\n\n");
        System.out.printf("[1] PARA VER OS CURSOS DA UNIVERSIDADE\n");
        System.out.printf("[2] PARA VER OS PROFESSORES DA UNIVERSIADE\n");
        System.out.printf("[3] PARA VER OS ALUNOS DE ALGUM CURSO\n");
        System.out.printf("[4] PARA FAZER A INSCRIÇÃO DE UM ALUNO\n");
        System.out.printf("[5] PARA FAZER A INSCRIÇÃO DE UM PROFESSOR\n");
        System.out.printf("[6] PARA REMOVER UM ALUNO DE UM CURSO\n");
        System.out.printf("[7] PARA REMOVER UM PROFESSOR\n");
        System.out.printf("[8] PARA SAIR DO PROGRAMA\n");
        System.out.printf("DIGITE SUA OPÇÃO\n");

        Scanner input = new Scanner(System.in);
        int escolha = input.nextInt();

        switch(escolha){
            case 1:
                printCourses();
                break;
            case 2:
                printProfessors();
                break;
            case 3:
                //AGRONOMIA\nBIOMEDICINA\nBIOLOGIA\nCIÊNCIA DA COMPUTAÇÃO\nDIREITO\nENGENHARIA\nMEDICINA\nMEDICINA VETERINÁRIA
                System.out.printf("ESCOLHA O CURSO PARA VER OS ALUNOS\n\n");
                System.out.printf("[1] PARA AGRONOMIA\n[2] PARA BIOMEDICINA\n[3] BIOLOGIA\n[4] PARA CIÊNCIA DA COMPUTAÇÃO\n[5] DIREITO\n[6] ENGENHARIA\n[7] MEDICINA\n[8] PARA MEDICINA VETRINÁRIA\n\n");
                System.out.printf("");
                Scanner s = new Scanner(System.in);
                int scl = s.nextInt();
                printStudentsCourses(scl);
                break;
            case 4:
                enrollStudent();
                break;
            case 5:
                enrollProfessor();
                break;
            case 6:
                removeAluno();
                break;
            case 7:
                Scanner prf = new Scanner(System.in);

                System.out.printf("Digite as informações do(a) professor(a)\n\n");
                System.out.printf("Digite a idade do(a) professor(a): ");
                int age = prf.nextInt();
                System.out.printf("Digite o nome do(a) professor(a): ");
                prf.nextLine();
                String name = prf.nextLine();
                System.out.printf("Digite o CPF do(a) professor(a): ");
                String cpf = prf.nextLine();
                System.out.printf("Digite o dia do(a) nascimento do professor(a) (apenas o dia): ");
                int day = prf.nextInt();
                System.out.printf("Digite o mês do nascimento do(a) professor(a): ");
                int month = prf.nextInt();
                System.out.printf("Digite o ano do nascimento do(a) professor(a): ");
                int year = prf.nextInt();
                Data date = new Data(day, month, year);
                System.out.printf("Digite o número de registro do(a) professor(a): ");
                long registrationNumber = prf.nextLong();
                System.out.printf("Digite a matria que o(a) professor(a) leciona: ");
                prf.nextLine();
                String matter = prf.nextLine();
                System.out.printf("Digite o curso que o(a) professor(a) leciona: ");
                String course = prf.nextLine();
        
                Professor p = new Professor(age, name, cpf, date, registrationNumber, matter, course);
                removeProfessor(p);
                break;
            case 8:
                System.exit(0);
                break;
            default:
                System.out.printf("Erro, entrada invalida!!\n\n");
        }
    }

//============================================================================================

    public void printCourses(){
        System.out.printf("CURSOS DA UNIVERSIDADE!!\n\nAGRONOMIA\nBIOMEDICINA\nBIOLOGIA\nCIÊNCIA DA COMPUTAÇÃO\nDIREITO\nENGENHARIA\nMEDICINA\nMEDICINA VETERINÁRIA\n\n");
    }

//============================================================================================

    public void removeAluno(){
        Scanner std = new Scanner(System.in);
        String[] courses = {"Agronomia", "Biomedicina", "Biologia", "Ciência da Computação", "Direito", "Engenharia", "Medicina", "Medicina Veterinária"};

        System.out.printf("Digite as informações do(a) aluno(a)\n\n");

        System.out.printf("Digite a idade do(a) aluno(a): ");
        int age = std.nextInt();
        System.out.printf("Digite o nome do(a) aluno(a): ");
        std.nextLine();
        String name = std.nextLine();
        System.out.printf("Digite o CPF do() aluno(a): ");
        std.nextLine();
        String cpf = std.nextLine();
        System.out.printf("Digite o dia do nascimento do(a) aluno(a): ");
        int day = std.nextInt();
        System.out.printf("Digite o mês do nascimento do(a) aluno(a): ");
        int month = std.nextInt();
        System.out.printf("Digite o ano do nascimento do(a) aluno(a): ");
        int year = std.nextInt();
        Data date = new Data(day, month, year);
        System.out.printf("Digite o número de matricula do(a) aluno(a): ");
        long registrationNumber = std.nextLong();
        System.out.printf("Digite a nota do ENEM do(a) aluno(a): ");
        float grade = std.nextFloat();
        System.out.printf("Digite o curso do(a) aluno(a): ");
        std.nextLine();
        String course = std.nextLine();

        Student s = new Student(age, name, cpf, date, registrationNumber, grade, course);

        if(courses[0].equals(course)){
            counter1 =  agronomia.removeStudent(s, counter1);
        }else if(courses[1].equals(course)){
            counter2 =  bioMedcina.removeStudent(s, counter2);
        }else if(courses[2].equals(course)){
            counter3 =  biologia.removeStudent(s, counter3);
        }else if(courses[3].equals(course)){
            counter4 =  cienciaComputacao.removeStudent(s, counter4);
        }else if(courses[4].equals(course)){
            counter5 =  direito.removeStudent(s, counter5);
        }else if(courses[5].equals(course)){
            counter6 =  engenharia.removeStudent(s, counter6);
        }else if(courses[6].equals(course)){
            counter7 =  medicina.removeStudent(s, counter7);
        }else if(courses[7].equals(course)){
            counter8 =  medVet.removeStudent(s, counter8);
        }else{
            System.out.printf("Curso não encontrado!!\n\n");
        }
    }

//============================================================================================

    public void enrollStudent(){
        Scanner std = new Scanner(System.in);

        System.out.printf("Digite as informações do(a) aluno(a)\n\n");

        System.out.printf("Digite a idade do(a) aluno(a): ");
        int age = std.nextInt();
        System.out.printf("Digite o nome do(a) aluno(a): ");
        std.nextLine();
        String name = std.nextLine();
        System.out.printf("Digite o CPF do() aluno(a): ");
        String cpf = std.nextLine();
        System.out.printf("Digite o dia do nascimento do(a) aluno(a): ");
        int day = std.nextInt();
        System.out.printf("Digite o mês do nascimento do(a) aluno(a): ");
        int month = std.nextInt();
        System.out.printf("Digite o ano do nascimento do(a) aluno(a): ");
        int year = std.nextInt();
        Data date = new Data(day, month, year);
        System.out.printf("Digite o número de matricula do(a) aluno(a): ");
        long registrationNumber = std.nextLong();
        System.out.printf("Digite a nota do ENEM do(a) aluno(a): ");
        float grade = std.nextFloat();
        System.out.printf("Digite o curso de escolha do(a) aluno(a): ");
        std.nextLine();
        String course = std.nextLine();

        Student s = new Student(age, name, cpf, date, registrationNumber, grade, course);
        String[] courses = {"Agronomia", "Biomedicina", "Biologia", "Ciência da Computação", "Direito", "Engenharia", "Medicina", "Medicina Veterinária"};

        if(courses[0].equals(course)){
            agronomia.setStudent(s, counter1);
            ++counter1;
        }else if(courses[1].equals(course)){
            bioMedcina.setStudent(s, counter2);
            ++counter2;
        }else if(courses[2].equals(course)){
            biologia.setStudent(s, counter3);
            ++counter3;
        }else if(courses[3].equals(course)){
            cienciaComputacao.setStudent(s, counter4);
            ++counter4;
        }else if(courses[4].equals(course)){
            direito.setStudent(s, counter5);
            ++counter5;
        }else if(courses[5].equals(course)){
            engenharia.setStudent(s, counter6);
            ++counter6;
        }else if(courses[6].equals(course)){
            medicina.setStudent(s, counter7);
            ++counter7;
        }else if(courses[7].equals(course)){
            medVet.setStudent(s, counter8);
            ++counter8;
        }else{
            System.out.printf("Não encontramos o curso!!\n\n");
        }
    }

//============================================================================================

    public void enrollProfessor(){
        Scanner prf = new Scanner(System.in);

        System.out.printf("Digite as informações do(a) professor(a)\n\n");
        System.out.printf("Digite a idade do(a) professor(a): ");
        int age = prf.nextInt();
        System.out.printf("Digite o nome do(a) professor(a): ");
        prf.nextLine();
        String name = prf.nextLine();
        System.out.printf("Digite o CPF do(a) professor(a): ");
        String cpf = prf.nextLine();
        System.out.printf("Digite o dia do(a) nascimento do professor(a) (apenas o dia): ");
        int day = prf.nextInt();
        System.out.printf("Digite o mês do nascimento do(a) professor(a): ");
        int month = prf.nextInt();
        System.out.printf("Digite o ano do nascimento do(a) professor(a): ");
        int year = prf.nextInt();
        Data date = new Data(day, month, year);
        System.out.printf("Digite o número de registro do(a) professor(a): ");
        long registrationNumber = prf.nextLong();
        System.out.printf("Digite a matria que o(a) professor(a) leciona: ");
        prf.nextLine();
        String matter = prf.nextLine();
        System.out.printf("Digite o curso que o(a) professor(a) leciona: ");
        String course = prf.nextLine();

        Professor p = new Professor(age, name, cpf, date, registrationNumber, matter, course);

        setProfessor(p);
    }

//=====================================================================================================

    public void setProfessor(Professor p){
        if(counterP > qProfessorVacacy){
            System.out.printf("Aquantidade de vagas para professor já foi preenchida\n\n");
            return;
        }
        professor[counterP] = p;
        ++counterP;
    }

//=====================================================================================================

    public int removeProfessor(Professor std){
        for(int i = 0; i <= counterP; i++){
            if(professor[i].compareTo(std) == 0){
                professor[i] = null;
            }

            if(professor[i].compareTo(std) != 0){
                queueProfessor.enqueue(professor[i]);
            }

            if((professor[i].compareTo(std) != 0) && (i == counterP)){
                System.out.printf("Professor não encontrado!!\n\n");
                return counterP;
            }
        }

        for(int i = 0; i <= counterP - 1; i++){
            professor[i] = queueProfessor.dequeue();
        }
        return counterP - 1;
    }

    public void printProfessors(){
        Tree<Professor> prf = new Tree<Professor>();

        for(int i = 0; i < counterP; i++){
            prf.insertTree(professor[i]);
        }
        prf.printTreeAll();
    }

    public void printStudentsCourses(int course){
        switch(course){
            case 1:
                agronomia.printStudents();
                break;
            case 2:
                bioMedcina.printStudents();
                break;
            case 3:
                biologia.printStudents();
                break;
            case 4:
                cienciaComputacao.printStudents();
                break;
            case 5:
                direito.printStudents();
                break;
            case 6:
                engenharia.printStudents();
                break;
            case 7:
                medicina.printStudents();
                break;
            case 8:
                medVet.printStudents();
                break;
            default:
                System.out.printf("Erro, opçãode curso invalida!!\n\n");
        }
    }
}
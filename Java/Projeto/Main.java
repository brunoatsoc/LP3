import java.io.*;

/*
 * Projeto de Linguagem de Programação 3 e Estrutura de Dados
 * Professores: Dany e Helder
 * Alunos: Leonam Rabelo e Bruno Santos Costa
 */

//Claasse principal(que tem o metodo main)
public class Main{
    //Metodo principal
    //Esse metodo chama inicia lendo os arquivos que tem as informações dos lunos e professores
    public static void main(String[] args) throws Exception{
        University u = new University();
        int op = 1;

        //ratamento de excessões
        try{
            u.readFilesProfessors();
            u.readFileStudents();

            while(op != -1){
                op = u.menu();
            }
        }catch(FileNotFoundException ex){
            while(op != -1){
                op = u.menu();
            }
        }
    }//Fim main
}//Fim classe Main
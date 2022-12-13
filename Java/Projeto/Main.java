import DataStructures.List;
import DataStructures.Stack;
import DataStructures.Queue;
import DataStructures.Tree;
import java.io.*;
import java.sql.Struct;

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
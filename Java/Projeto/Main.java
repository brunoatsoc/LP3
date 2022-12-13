import DataStructures.List;
import DataStructures.Stack;
import DataStructures.Queue;
import DataStructures.Tree;
import java.io.*;
import java.sql.Struct;

//Teste das estruturas de dados
public class Main{
    public static void main(String[] args) throws Exception{
        University u = new University();
        int op = 1;

        try{
            u.readFilesProfessors();
            u.readFileStudents();

            while(op != -1){
                op = u.menu();
            }
        }catch(FileNotFoundException ex){
            System.out.printf("aaaaaa");
            while(op != -1){
                op = u.menu();
            }
        }
    }
}
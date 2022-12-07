import DataStructures.List;
import DataStructures.Stack;
import DataStructures.Queue;
import DataStructures.Tree;
import java.io.*;
import java.sql.Struct;

//Teste das estruturas de dados
public class Main{
    public static void main(String[] args){
        /*//Teste da pilha
        Person p = new Person(22, "Bruno");
        Stack<Person> s = new Stack<Person>(p);
        System.out.println(s.stackTop());
        Person p1 = new Person(19, "Flavia");
        s.push(p1);
        System.out.println(s.stackTop());
        s.pop();
        System.out.println(s.stackTop());
        s.pop();
        System.out.println(s.stackTop());*/

        /*//Teste da Lista Encadeada
        Person p1 = new Person(22, "Bruno");
        Person p2 = new Person(19, "Ticiana");
        Person p3 = new Person(19, "Flávia");
        List<Person> l = new List<Person>();

        l.setFrontList(p1);
        l.setRearList(p2);
        l.setRearList(p3);
        //l.printList();

        Person a = new Person(19, "Flávia");
        l.removeItem(a);
        l.printList();*/

        /*//Teste da Fila
        Data dt = new Data(10, 3, 2000);
        Data dt1 = new Data(13, 12, 2002);
        Data dt2 = new Data(8, 12, 2002);
        Person p1 = new Person(22, "Bruno", "123456789-12", dt);
        Person p2 = new Person(19, "Ticiana", "122133144-32", dt1);
        Person p3 = new Person(19, "Flávia", "999999999-99", dt2);
        Queue<Person> q = new Queue<Person>(p1);

        q.enqueue(p2);
        q.enqueue(p3);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());*/

        /*//Teste arvore binaria e imprimir arvore em ordem
        Tree<Student> t = new Tree<Student>();
        Data dt = new Data(10, 3, 2000);
        Data dt1 = new Data(13, 12, 2002);
        Data dt2 = new Data(8, 12, 2002);
        Data dt3 = new Data(21, 10, 2007);
        Student p1 = new Student(22, "Bruno", "123456789-12", dt, 202121126, "Ciência da Computação", 650f);
        Student p2 = new Student(19, "Ticiana", "122133144-32", dt1, 121445125, "Direito", 700f);
        Student p3 = new Student(19, "Flávia", "999999999-99", dt2, 202121134, "Ciência da Computação", 700f);
        Student p4 = new Student(15, "Clara", "123456789-10", dt3, 123456733, "Medicina", 800);

        t.insertTree(p1);
        t.insertTree(p2);
        t.insertTree(p3);
        t.insertTree(p4);
        t.printTreeAll();*/
    }

    /*//Teste de manipulação de aquivos
    public static void main(String[] args) throws Exception{
        String[] names = {"Bruno", "Ticiana", "Flavia", "Coutinho", "Valter"};
        int[] ages = {22, 19, 19, 18, 27};
        Person p = new Person(ages[0], names[0]);
        Stack<Person> l = new Stack<Person>(p);

        for(int i = 1; i < 5; i++){
            Person p1 = new Person(ages[i], names[i]);
            l.push(p1);
        }

        File file = new File("pessoa.txt");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));

        for(int i = 0; i < 5; i++){
            oos.writeObject(l.pop());
        }
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        for(int i = 0; i < 5; i++){
            Person p2 = (Person)ois.readObject();
            System.out.println(p2);
        }
        ois.close();
    }*/
}
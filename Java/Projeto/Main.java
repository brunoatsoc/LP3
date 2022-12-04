import DataStructures.*;

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

        //Teste da Fila
        Person p1 = new Person(22, "Bruno");
        Person p2 = new Person(19, "Ticiana");
        Person p3 = new Person(19, "Flávia");
        Queue<Person> q = new Queue<Person>(p1);

        q.enqueue(p2);
        q.enqueue(p3);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
package DataStructures;

//Classe para a arvore binária
public class Tree<T extends Comparable<T>>{
    //Atributos da classe
    private NodeTree<T> root;
    private int size;

    //Construtor
    public Tree(){
        root = null;
    }//Fim

    //construtor com parametro
    public Tree(T data){
        insertTree(data);
    }//Fim

    //Pega o tamanho da arvore
    public int getSizeTree(){
        return this.size;
    }//Fim getSizeTree

    //Cria nó da arvore
    private NodeTree<T> createNode(NodeTree<T> node, T i){
        node.data = i;
        node.father = null;
        node.left = null;
        node.right = null;
        ++size;
        return node;
    }//Fim createNode

    //Insere um objeto na arvore
    public void insertTree(T i){
        if(root == null){
            NodeTree<T> newNode = new NodeTree<T>();
            newNode = createNode(newNode, i);
            root = newNode;
        }else{
            if(i.compareTo(root.data) == -1){
                insertLeft(root, i);
            }else if(i.compareTo(root.data) == 1){
                insertRight(root, i);
            }
        }
    }//Fim insrtTree

    //Insere a esquerda
    private void insertLeft(NodeTree<T> node, T i){
        if(node.left == null){
            NodeTree<T> newNode = new NodeTree<T>();
            newNode = createNode(newNode, i);
            newNode.data = i;
            node.left = newNode;
            newNode.father = node;
            return;
        }else{
            if(i.compareTo(node.left.data) == -1){
                insertLeft(node.left, i);
            }else if(i.compareTo(node.left.data) == 1){
                insertRight(node.left, i);
            }
        }
    }//Fim insertLeft

    //Insere a direita da arvore
    private void insertRight(NodeTree<T> node, T i){
        if(node.right == null){
            NodeTree<T> newNode = new NodeTree<T>();
            newNode = createNode(newNode, i);
            newNode.data = i;
            node.right = newNode;
            newNode.father = node;
            return;
        }else{
            if(i.compareTo(node.right.data) == 1){
                insertRight(node.right, i);
            }else if(i.compareTo(node.right.data) == -1){
                insertLeft(node.right, i);
            }
        }
    }//Fim insertRight

    //Imprime a arvore
    public void printTreeAll(){
        printTree(root);
    }//Fim printTreeAll

    //Imprime os nós da arvore em ordem
    private void printTree(NodeTree<T> root){
        if(root != null){
            printTree(root.left);
            System.out.println(root.data.toString());
            printTree(root.right);
        }
    }//Fim printTree
}//Fim classe Tree
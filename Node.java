ackage ru.ac.uniyar.mf.summer;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Node {
    private String id;
    private String name;
    private List<Node> childs;

    // КОНСТРУКТОРЫ

    public Node(){
        this.id = "";
        this.name = "";
        this.childs = new ArrayList<>();
    }

    public Node(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.childs = new ArrayList<>();
    }

    // ГЕТТЕРЫ

    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public List<Node> getChilds(){
        return childs;
    }

    // МЕТОДЫ

    public void add(Node kinder){
        childs.add(new Node(name));
    }

    public void printNode(){
        System.out.println("Идентификатор: " + id + " Имя узла: " + name);
    }

    @Override
    public String toString(){
        return "Node: " + "ID: " + id  + "Childs: " + childs;
    }

}

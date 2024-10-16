package connect.java.center;

public class Human {
    // Atributos:
    String name;
    int age;
    float height;

    // Construtor:
    public Human(String name, int age, float height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    // Métodos:
    public void speak(){
        System.out.println("The life is a gift!");
    }

    // Gatters e Setters:
    // Name:
    public String setName(){
        return name;
    }

    public void getName(){
        this.name = name;
    }

    // Age:
    public int setAge(){
        return age;
    }

    public void getAge(){
        this.age = age;
    }

    // Height:
    public float getHeight(){
        return height;
    }

    public void setHeight(){
        this.height = height;
    }
}

class Parent {
    String name;

    // default constructor
    Parent(){
    }

    Parent(String name){
        this();
        this.name = name;
    }

    Parent(int id){
        
    }
    

}

public class ConstructorTest2 {
    public static void main(String[] args) {
        Parent p1 = new Parent("sai");

    }
}

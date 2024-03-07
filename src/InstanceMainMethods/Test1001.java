package InstanceMainMethods;

public class Test1001 {
    void main() {
        System.out.println("main method without static and Arguments");
    }

    //Priority of this main method will be higher
    public static void main(String[] args){
        System.out.println("Unnamed main method");
    }
}

public class MadLib {

    // type "psvm" to get something similar to go method. this is what Java uses to see what is running.
    public static void main(String[] args) {
        new MadLib();



    }
    //special methods called "constructors" do not need a void like most methods.
    //A constructor will have the exact same name as the class
    //a contructor constructs an object, when you put your method into the main,
    // you can not just type as if it were a normal method, you need to put "new" infront to make a new object
    public MadLib(){
        System.out.println("hello world");

    }
}

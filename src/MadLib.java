public class MadLib {

    // type "psvm" to get something similar to go method. this is what Java uses to see what is running.
    public static void main(String[] args) {
        new MadLib();



    }

    String classmate = "pati";
    String city = "Boston";
    String noun = "book";
    String adjective = "gigantic";
    String pluralNoun = "cars";
    String pluralAnimal = "panthers";
    boolean trueOrFalse = true;
    double decimalBiggerThan1 = 2.5;
    int number1 = 555;
    int number2 = 21;
    int wholeNumberBetween1And4 = 3;
    String miltonTeacher = "Dr. Nurenburg";
    String miltonDean = "Mr. Furst";
    char letterGrade = 'A';
    String season = "Spring";
    int number3 = 100;
    String pluralFoodName = "pizzas";
    char LetterGrade2 = 'F';




    //special methods called "constructors" do not need a void like most methods.
    //A constructor will have the exact same name as the class
    //a contructor constructs an object, when you put your method into the main,
    // you can not just type as if it were a normal method, you need to put "new" infront to make a new object
    public MadLib(){
        System.out.println("hello world");
        //define a string called story for mad lib
        String story = "This weekend I am going camping with "
                +classmate+ ". We are going to a campsite in "
                +city+ ". I packed my "+noun+ " and "
                +pluralNoun + ".  The forecast is calling for a high of "
                +decimalBiggerThan1+ " degrees fahrenheit. So it should be a "
                +adjective+" day! This year, the park rangers have seen "
                +number1+ " " +pluralAnimal + " which seems kind of dangerous. "
                +miltonTeacher+" said it's " + trueOrFalse + " that "+pluralAnimal+ " eat class "
                +wholeNumberBetween1And4+ " students in the " +season+ ". But, "
                +miltonDean+ " said it actually has only happened "
                + number2+" times. Wish us luck! If we survive, we will earn a "
                +letterGrade+ "- in P.E. class and the whole school will get " +number3+ " "
                +pluralFoodName+". However, if we fail, we will get an "
                +LetterGrade2+ " and also get eaten.";

//now print story to the dos window
        System.out.println(story);


    }
}

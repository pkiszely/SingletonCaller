public class Main {
    public static void main(String[] args) {


        ClassSingleton classSingleton = ClassSingleton.getInstance();     // this is where you create an instance of ClassSingleton
        System.out.println(classSingleton.getMessage());

        ClassSingleton classSingleton2 = ClassSingleton.getInstance();   // here you got back the already existing instance
        classSingleton2.addMessage(" test add");

        ClassSingleton classSingleton3 = ClassSingleton.getInstance();   // there is the same instance behind the variables
        System.out.println(classSingleton3.getMessage());

        System.out.println("You can even call this like this " + ClassSingleton.getInstance().getMessage());

    }
}
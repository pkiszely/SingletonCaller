public final class ClassSingleton {

    private static ClassSingleton INSTANCE;
    private String info = "Initial info";

    private ClassSingleton() {
    }

    public static ClassSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ClassSingleton();
        }

        return INSTANCE;
    }

    public String getMessage(){
        return info;
    }

    public void addMessage(String msg){
        info += msg;
    }
}

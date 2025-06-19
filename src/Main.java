public class Main {
    public static void main(String[] args) {
      
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        
        logger1.log("System startup successful.");
        logger2.log("User has logged in.");

       
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same (Singleton works!).");
        } else {
            System.out.println("Different logger instances (Singleton FAILED).");
        }
    }
}


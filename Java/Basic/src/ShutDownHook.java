public class ShutDownHook {

    public static void main(String ...args){

        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                System.out.println("JVM Shutdown");
            }});

        System.out.println("Main Program");
    }
}

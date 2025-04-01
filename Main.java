public class Main {
    public static void main(String[] args) {
        EsemioThread t1 = new EsemioThread("Stocazzo");
        EsemioThread t2 = new EsemioThread("Festy");
        t1.start();
        t2.start();
    }
}
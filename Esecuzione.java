public class Esecuzione {
    public void Esegui(){
        ThreadTempo t = new ThreadTempo();
        t.setMS(120);
        t.start();
        while (true) {
            System.out.println(ThreadTempo.getSecondi());
        }
    }
}
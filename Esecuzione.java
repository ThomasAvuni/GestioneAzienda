public class Esecuzione {
    public void Esegui(){
        ThreadTempo t = new ThreadTempo();
        t.start();

        Appuntamento a1 = new Appuntamento(new Data(12, 12, 2025), "asd" , "asdads");
        Appuntamento a2 = new Appuntamento(new Data(20, 11, 2025), "asd" , "asdads");
        if(a2.isBefore(a1))
            System.out.println("PRIMA");
        else
            System.out.println("DOPO");

    }

}
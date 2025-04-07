import java.util.Scanner;

public class Azienda {
    public void Esegui(){
        ThreadTempo t = new ThreadTempo();
        t.start();

        GestionePrenotazioni g = new GestionePrenotazioni();
        g.aggiungiPrenotazione(new Prenotazione(new Data(5, 2, 2025), "Qualcuna", "1"));
        g.aggiungiPrenotazione(new Prenotazione(new Data(31, 3, 2025), "Qualcuna", "2"));
        g.aggiungiPrenotazione(new Prenotazione(new Data(25, 12, 2025), "Fabio", "5"));
        g.aggiungiPrenotazione(new Prenotazione(new Data(3, 5, 2025), "Qualcuna", "3"));
        g.aggiungiPrenotazione(new Prenotazione(new Data(30, 6, 2025), "Qualcuna", "4"));
        g.visitaLista();

        Prenotazione p1 = new Prenotazione(new Data(5, 2, 2025), "Qualcuna", "1");
        Prenotazione p2 = new Prenotazione(new Data(5, 2, 2025), "Qualcuna", "1");

        if(p1.isEqual(p2)){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }

        Scanner x = new Scanner(System.in); 
        while(true){

        }
    }

}
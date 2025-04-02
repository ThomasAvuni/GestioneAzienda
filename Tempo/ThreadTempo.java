public class ThreadTempo extends Thread{
    //Attrubuti della classe
    private int ms;
    private static int secondi;
    private static int Minuti;
    private static int Ora;
    public ThreadTempo(){
        super();
    }

    //Getter
    public static int getSecondi(){
        return secondi;
    }
    
    public static int getMinuti(){
        return Minuti;
    }

    public static int getOra(){
        return Ora;
    }

    public static String getTempo() {
        return "[" + getOra() + ":" + getMinuti() + ":" + getSecondi() + "]";
    }

    //Funzione che calcola minuti, secondi e ore
    @Override
    public void run() {
        //Richiamare il metodo run della superclasse
        super.run();
        while(true){
            //Incremento i millisecondi
            ms++;
            //Quando i millisecondi sono maggiori di 10 si incrementano i secondi
            if(ms >= 10){
                secondi++;
                ms = 0;
            }
            //Se i secondi sono maggiori di 30 si incrementano i minuti
            if(secondi >= 30){
                Minuti++;
                secondi = 0;
            }

            //Se i minuti sono maggiori di 30 si incrementano le ore
            if(Minuti >= 30){
                Ora++;
                Minuti = 0;
            }

            //Fermare il thread ogni 120 millisecondi
            try {
                Thread.sleep(120);
            } catch (InterruptedException e) {

            }
        }
    }
}

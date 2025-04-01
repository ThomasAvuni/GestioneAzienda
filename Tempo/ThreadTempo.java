public class ThreadTempo extends Thread{
    private int m_ms;
    private static int m_secondi;
    private static int m_Minuti;
    private static int m_Ora;
    private int m_msThread;
    public ThreadTempo(){
        super();
    }

    public void setMS(int ms){
        m_msThread = ms;
    }

    public static int getSecondi(){
        return m_secondi;
    }
    
    public static int getMinuti(){
        return m_Minuti;
    }

    public static int getOra(){
        return m_Ora;
    }


    public static String getTempo() {
        return "[" + getOra() + ":" + getMinuti() + ":" + getSecondi() + "]";
    }

    @Override
    public void run() {
        super.run();
        while(true){
            m_ms++;
            if(m_ms >= 10){
                m_secondi++;
                m_ms = 0;
            }
            
            if(m_secondi >= 30){
                m_Minuti++;
                m_secondi = 0;
            }

            if(m_Minuti >= 30){
                m_Ora++;
                m_Minuti = 0;
            }

            try {
                Thread.sleep(m_msThread);
            } catch (InterruptedException e) {

            }
        }
    }
}

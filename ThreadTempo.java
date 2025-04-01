public class ThreadTempo extends Thread{
    private int m_ms;
    private static int m_secondi;
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

    @Override
    public void run() {
        super.run();
        while(true){
            m_ms++;
            if(m_ms >= 10){
                m_secondi++;
                m_ms = 0;
            }
            try {
                Thread.sleep(m_msThread);
            } catch (InterruptedException e) {

            }
        }
    }
}

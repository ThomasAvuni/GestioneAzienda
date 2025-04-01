public class EsemioThread extends Thread{
    private String m_Name;
    public EsemioThread(String name) {
        super(name);
        m_Name = name;
    }

    @Override
    public void run() {
        super.run();
        while(true){
            System.out.println("Thread " + m_Name + " run()");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
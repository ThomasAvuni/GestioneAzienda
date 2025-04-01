public class Node {
    private Appuntamento m_Dati;
    private Node m_Link;

    public Node(Appuntamento dati){
        m_Dati = dati;
        m_Link = null;
    }
    public Appuntamento getDati (){
        return m_Dati;
    }
    public void setLink (Node link){
        m_Link = link;
    }
    public Node getLink (){
        return m_Link;
    }

}

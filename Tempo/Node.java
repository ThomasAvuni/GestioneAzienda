public class Node {
    private Appuntamento Dati;
    private Node Link;

    public Node(Appuntamento dati){
        Dati = dati;
        Link = null;
    }
    public Appuntamento getDati (){
        return Dati;
    }
    public void setLink (Node link){
        Link = link;
    }
    public Node getLink (){
        return Link;
    }

}

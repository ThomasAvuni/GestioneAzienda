public class Tavolo {
    private int numero;
    private int posti;
    private boolean occupato;

    public Tavolo(int numero, int posti){
        this.numero = numero;
        this.posti = posti;
        occupato = false;
    }

    public int getNumero(){
        return this.numero;
    } 

}

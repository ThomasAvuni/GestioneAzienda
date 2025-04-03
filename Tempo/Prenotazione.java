public class Prenotazione {
    //Attributi
    private Data dataAppuntamento;
    private String nome, cognome;

    //Costruttore
    public Prenotazione(Data data, String nome, String cognome){
        dataAppuntamento = data;
        this.nome = nome;
        this.cognome = cognome;
    }

    //Getter
    public Data getDataAppuntamento() {
        return dataAppuntamento;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public boolean isEqual(Prenotazione p){
        
    }

    //Funzione che controlla se un appuntamento 'a' viene prima di un altro
    public boolean isBefore(Prenotazione a) {
        Data data = this.getDataAppuntamento();
        Data altraData = a.getDataAppuntamento();
    
        if (data.getAnno() < altraData.getAnno() || 
            (data.getAnno() == altraData.getAnno() && data.getMese() < altraData.getMese()) || 
            (data.getAnno() == altraData.getAnno() && data.getMese() == altraData.getMese() && data.getGiorno() < altraData.getGiorno())) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "(" + getNome() + " " + getCognome() + ", " + getDataAppuntamento().toString() + ")";
    }

}

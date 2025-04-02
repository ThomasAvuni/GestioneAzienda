public class Appuntamento {
    //Attributi
    private Data dataAppuntamento;
    private String nome, cognome;

    //Costruttore
    public Appuntamento(Data data, String nome, String cognome){
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

    //Funzione che controlla se un appuntamento 'a' viene prima di un altro
    public boolean isBefore(Appuntamento a){
        if(getDataAppuntamento().getGiorno() < a.getDataAppuntamento().getGiorno() || getDataAppuntamento().getMese() < a.getDataAppuntamento().getMese())
            return true;
        return false;
    }

}

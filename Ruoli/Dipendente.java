public class Dipendente {
    private String nome, cognome;
    private String ruolo;
    private Data dataNascita;
    private int stipendio;

    public Dipendente(String nome, String cognome, String ruolo, Data dataNascita, int stipendio) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.stipendio = stipendio;
        this.ruolo = ruolo;
    }

    public String getNome() {
        return nome;
    }
    
    public String getCognome() {
        return cognome;
    }

    public Data getDataNascita() {
        return dataNascita;
    }

    public int getStipendio() {
        return stipendio;
    }

    public String getRuolo(){
        return ruolo;
    }

    public void calcolaStipendio(){
        //Da implementare per sottoclasse
        // stipendio = 9*durata/h
    }

    public void mostraDettagli(){
        System.out.println("Nome: " + nome);
        System.out.println("Cognome: " + cognome);
        System.out.println("Data di Nascita: " + dataNascita);
        System.out.println("Stipendio: " + stipendio);
    }
}

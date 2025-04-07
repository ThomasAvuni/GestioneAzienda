public class Cibo {
    private String nome;
    private boolean tagliato;
    private int quantita;


    public void setNome (String nome){
            this.nome = nome;
    }    
    public void setTagliato (boolean tagliato){
        this.tagliato = tagliato;
    }    
    public void setQuantita (int quantita){
        this.quantita= quantita;
    }

    public String getNome() {
        return nome;
    }

    public boolean getTagliato() {
        return tagliato;
    }

    public int getQuantita() {
        return quantita;
    }

    public void taglia (){
        if(!tagliato)
            tagliato = true;
    }

}

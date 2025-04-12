public class Data {
    //Attributi
    private int giorno, mese, anno, ore, minuti;

    //Costruttore di copia
    public Data(Data d){
        giorno = d.getGiorno();
        mese = d.getMese();
        anno = d.getAnno();
        ore = d.getOre();
        minuti = d.getMinuti();
    }

    //Costruttore con tutti gli attributi
    public Data(int g, int m, int a, int o, int min){
        giorno = g;
        mese = m;
        anno = a;
        ore = o;
        minuti = min;
    }

    //Costruttore senza ore e minuti
    public Data(int g, int m, int a){
        giorno = g;
        mese = m;
        anno = a;
    }

    //Funzione che controlla se due date sono uguali;
    public boolean dateUguali(Data d1, Data d2){
        if(d1.getGiorno() == d2.getGiorno() && d1.getMese() == d2.getMese() && d1.getAnno() == d2.getAnno())
               { return true; }

        return false;
    }

    //Getter
    public int getGiorno() {
        return giorno;
    }

    public int getMese() {
        return mese;
    }

    public int getAnno() {
        return anno;
    }

    public int getOre() {
        return ore;
    }

    public int getMinuti() {
        return minuti;
    }

    public String toString(){
        return "[" + getGiorno() + "/" + getMese() + "/" + getAnno() + ":" + getOre() + ":" + getMinuti() + "]";
    }
    
}

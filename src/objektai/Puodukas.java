package objektai;

public class Puodukas {
    private char spalva;
    private int turis;
    private int kiekis;
    
    // metodas - konstruktorius
    public Puodukas(char spalva, int turis) {
        this.spalva = spalva;
        this.turis = turis;
        this.kiekis = 0;
    }
    public char getSpalva() {
        return this.spalva;
    }
    public void setSpalva(char spalva) {
        this.spalva = spalva;
    }
    public int getTuris() {
        return this.turis;
    }
    public int getKiekis() {
        return this.kiekis;
    }
    // boolean gali vadintis is/get
    public boolean isPilnas() {
        return this.kiekis == this.turis;
    }
    public void ipilk(int kiek) {
        // jeigu tilps - pilu, netilps - nepilsiu is vis
//        if(kiekis + kiek <= turis) {
//            kiekis += kiek;
//        }
        this.kiekis += kiek;
        if(this.kiekis > this.turis) {
            this.kiekis = this.turis;
        }
    }
    
    public void isgerk(int kiek) {
        this.kiekis -= kiek;
        if(this.kiekis < 0) {
            this.kiekis = 0;
        }
    }
}

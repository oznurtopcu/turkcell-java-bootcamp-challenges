package icecek;

public class Barista {
    public Barista() {
    }

    public void icecekDemle(Demlenebilir demlenebilir) {
        demlenebilir.demle();
    }
    public void sicakIcecekHazirla(SicakIcilir sicakIcilir){
        sicakIcilir.sicak();
    }
    public void sogukIcecekHazirla(SogukIcilir sogukIcilir){
        sogukIcilir.soguk();
    }

}

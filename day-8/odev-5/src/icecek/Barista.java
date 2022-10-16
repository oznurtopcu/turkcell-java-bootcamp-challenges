package icecek;

public class Barista {
    public Barista() {
    }

    public void icecekDemle(Demlenebilir demlenebilir) {
        demlenebilir.demle();
    }
    public void sicakIcecekHazirla(SicakIcilir sicakIcilir){
        sicakIcilir.sicak();
        System.out.println(" hazirlandi");
    }
    public void sogukIcecekHazirla(SogukIcilir sogukIcilir){
        sogukIcilir.soguk();
        System.out.println(" hazirlandi");
    }

}

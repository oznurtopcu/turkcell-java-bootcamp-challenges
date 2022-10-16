package icecek;

public class Cay extends Icecek implements Demlenebilir,Icilebilir,SicakIcilir{

    public Cay(String uretildigiYer, String adi) {
        super(uretildigiYer, adi);
    }

    @Override
    public void demle() {
        System.out.println(this.getAdi() + " demlendi");
    }

    @Override
    public void ic() {
        System.out.println(this.getAdi() + " icildi");
    }

    @Override
    public void sicak() {
        System.out.println(this.getAdi() + " sıcak icilebilir");
    }
}

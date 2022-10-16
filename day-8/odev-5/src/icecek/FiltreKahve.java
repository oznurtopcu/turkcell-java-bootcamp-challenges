package icecek;

public class FiltreKahve extends Kahve implements Demlenebilir,SicakIcilir,SogukIcilir{

    public FiltreKahve(String uretildigiYer, String adi) {
        super(uretildigiYer, adi);
    }

    @Override
    public void demle() {
        System.out.println(this.getAdi() + " demlendi");
    }

    @Override
    public void sicak() {
        System.out.println(this.getAdi() + " sicak icilebilir");
    }

    @Override
    public void soguk() {
        System.out.println(this.getAdi() + " soguk icilebilir");
    }
}

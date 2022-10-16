package icecek;

public class GranulKahve extends Kahve implements Cozunebilir,SicakIcilir{

    public GranulKahve(String uretildigiYer, String adi) {
        super(uretildigiYer, adi);
    }

    @Override
    public void cozun() {
        System.out.println(this.getAdi() + " cozunuyor");
    }

    @Override
    public void sicak() {
        System.out.println(this.getAdi() + " sicak icilebilir");
    }
}

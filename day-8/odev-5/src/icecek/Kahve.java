package icecek;

public class Kahve extends Icecek implements Icilebilir{

    public Kahve(String uretildigiYer, String adi) {
        super(uretildigiYer, adi);
    }

    @Override
    public void ic() {
        System.out.println(this.getAdi() + " icildi");
    }
}

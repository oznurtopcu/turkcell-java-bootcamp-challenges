package icecek;

public class Icecek {
    private String uretildigiYer;
    private String adi;

    public Icecek(String uretildigiYer, String adi) {
        this.uretildigiYer = uretildigiYer;
        this.adi = adi;
    }

    public String getUretildigiYer() {
        return uretildigiYer;
    }

    public void setUretildigiYer(String uretildigiYer) {
        this.uretildigiYer = uretildigiYer;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }
}

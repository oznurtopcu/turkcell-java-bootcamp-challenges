import java.util.List;

public class Tutor extends User {

    private String unvan;
    private List<String> verilenDersler;
    private List<String> makaleler;

    public Tutor(String kimlik, String okul, String email, String bolum, String unvan, List<String> verilenDersler, List<String> makaleler) {
        super(kimlik, okul, email, bolum);
        this.unvan = unvan;
        this.verilenDersler = verilenDersler;
        this.makaleler = makaleler;
    }

    public Tutor() {

    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public List<String> getVerilenDersler() {
        return verilenDersler;
    }

    public void setVerilenDersler(List<String> verilenDersler) {
        this.verilenDersler = verilenDersler;
    }

    public List<String> getMakaleler() {
        return makaleler;
    }

    public void setMakaleler(List<String> makaleler) {
        this.makaleler = makaleler;
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Unvan :" + this.getUnvan());
        System.out.println("Verilen Ders :" + this.getVerilenDersler());
        System.out.println("Makaleler :" + this.getMakaleler());
    }
}

import java.util.List;

public class Student extends User{

    private String ogrenciNo;
    private String sınıf;
    private double ortalama;
    private List<String> alinanDersler;

    public Student(String kimlik, String okul, String email, String bolum, String ogrenciNo, String sınıf, double ortalama, List<String> alinanDersler) {
        super(kimlik, okul, email, bolum);
        this.ogrenciNo = ogrenciNo;
        this.sınıf = sınıf;
        this.ortalama = ortalama;
        this.alinanDersler = alinanDersler;
    }

    public Student() {
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public String getSınıf() {
        return sınıf;
    }

    public void setSınıf(String sınıf) {
        this.sınıf = sınıf;
    }

    public double getOrtalama() {
        return ortalama;
    }

    public void setOrtalama(double ortalama) {
        this.ortalama = ortalama;
    }

    public List<String> getAlinanDersler() {
        return alinanDersler;
    }

    public void setAlinanDersler(List<String> alinanDersler) {
        this.alinanDersler = alinanDersler;
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Ogrenci No :" + this.getOgrenciNo());
        System.out.println("Sınıf :" + this.getSınıf());
        System.out.println("Ortalama :" + this.getOrtalama());
        System.out.println("Alınan dersler :" + this.getAlinanDersler());
    }
}

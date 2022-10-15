public class User {

    private String kimlik;
    private String okul;
    private String email;

    private String bolum;

    public User(String kimlik, String okul, String email, String bolum) {
        this.kimlik = kimlik;
        this.okul = okul;
        this.email = email;
        this.bolum = bolum;
    }

    public User() {
    }

    public String getKimlik() {
        return kimlik;
    }

    public void setKimlik(String kimlik) {
        this.kimlik = kimlik;
    }

    public String getOkul() {
        return okul;
    }

    public void setOkul(String okul) {
        this.okul = okul;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public void getInfo(){
        System.out.println("Kimlik :" + this.getKimlik());
        System.out.println("Okul :" + this.getOkul());
        System.out.println("Email :" + this.getEmail());
        System.out.println("Bolum :" + this.getBolum());
    }
}

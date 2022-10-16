import icecek.*;

public class MainClass {
    public static void main(String[] args){
        Kahve kahve = new Kahve("turkiye","turk kahvesi");
        Cay cay = new Cay("turkiye", "siyah cay");
        Barista barista = new Barista();
        FiltreKahve filtreKahve = new FiltreKahve("afrika", "guatemala");
        GranulKahve granulKahve = new GranulKahve("isvicre","nescafe");

        barista.icecekDemle(cay);
        barista.icecekDemle(filtreKahve);

        barista.sogukIcecekHazirla(filtreKahve);
        barista.sicakIcecekHazirla(granulKahve);

    }
}

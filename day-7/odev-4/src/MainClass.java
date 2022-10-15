import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args){


        Student student = new Student();
        student.setEmail("oznur@gmail.com");
        student.setOgrenciNo("12345");
        student.setOrtalama(2.5);
        student.setSınıf("4");
        student.setBolum("elektrik-elektronik");
        student.setOkul("Gazi");
        ArrayList<String> alinanDers = new ArrayList<String>();
        alinanDers.add("Probability");
        alinanDers.add("Communication");
        student.setAlinanDersler(alinanDers);

        Tutor tutor = new Tutor();
        tutor.setEmail("ybb@gmail.com");
        tutor.setBolum("elektrik-elektronik");
        tutor.setUnvan("prof");
        tutor.setOkul("Gazi");
        tutor.setKimlik("kimlik");
        ArrayList<String> makaleler = new ArrayList<String>();
        makaleler.add("makale1");
        ArrayList<String> verilenDers = new ArrayList<String>();
        verilenDers.add("Probability");
        verilenDers.add("Communication");
        tutor.setMakaleler(makaleler);
        tutor.setVerilenDersler(verilenDers);

        getUserInfo(student);
        getUserInfo(tutor);


    }

    public static void getUserInfo(User user)
    {
        user.getInfo();
    }
}

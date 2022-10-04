import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class MainClass {

    public static void main(String[] args){

        System.out.println("Please enter a name");
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();

        char[] name_array = name.toCharArray();
        for(int i = 0; i < name_array.length; i++){
            //System.out.println(name_array[i]);

            if(name_array[i] == 'a' || name_array[i] == 'A')
                name_array[i] = '1';
            if(name_array[i] == 'e' || name_array[i] == 'E')
                name_array[i] = '2';
            if(name_array[i] == 'ı' || name_array[i] == 'I')
                name_array[i] = '3';
            if(name_array[i] == 'i' || name_array[i] == 'İ')
                name_array[i] = '4';
            if(name_array[i] == 'o' || name_array[i] == 'O')
                name_array[i] = '5';
            if(name_array[i] == 'ö' || name_array[i] == 'Ö')
                name_array[i] = '6';
            if(name_array[i] == 'u' || name_array[i] == 'U')
                name_array[i] = '7';
            if(name_array[i] == 'ü' || name_array[i] == 'Ü')
                name_array[i] = '8';

        }

        StringBuilder str = new StringBuilder();
        str.append(name_array);

        System.out.println(str);
        //StringBuilder'dan sonra toString'e ihtiyacımız yok

    }

}

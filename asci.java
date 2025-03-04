import java.util.Scanner;

public class asci{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.println("karakter gir: ");
        char karakter=inp.next().charAt(0);
        int ascidegeri=(int) karakter;

        System.out.println("girilen karakter: "+karakter);
        System.out.println("ascii karsiligi: "+ascidegeri);

        inp.close();
    }
}
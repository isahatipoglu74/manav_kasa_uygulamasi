import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);

        double armut,elma,domates,muz,patlican;

        System.out.print("Armut kaç kilo :");
        armut= inp.nextInt();
        System.out.print("Elma kaç kilo :");
        elma= inp.nextInt();
        System.out.print("Domates kaç kilo :");
        domates= inp.nextInt();
        System.out.print("Muz kaç kilo :");
        muz= inp.nextInt();
        System.out.print("Patlıcan kaç kilo :");
        patlican= inp.nextInt();

        double toplam=(armut*2.14)+(elma*3.67)+(domates*1.11)+
                (muz*0.95)+(patlican*5.00);
        System.out.print("Toplam Tutar: "+toplam);
    }
}
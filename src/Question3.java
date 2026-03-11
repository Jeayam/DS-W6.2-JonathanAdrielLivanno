import java.util.Arrays;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan total antrian (6 - 19 antrian) : ");
        Integer antrian = input.nextInt();
        input.nextLine();
        if (antrian<6) {System.out.println("Antrian tidak dapat dibawah 6");return;}
        if (antrian>19) {System.out.println("Antrian tidak dapat diatas 19");return;}
 
 
        System.out.println("Masukkan Nama : ");
        String nama = input.nextLine();
        String[] arrNama = nama.split(" ");

        if(arrNama.length != antrian){
            System.out.println("Jumlah nama tidak sesuai dengan total antrian..");
            return;}

        System.out.println("Masukkan Kesempatan (urutan sesuai nama, 1-10 kesempatan) : ");
        
        int[] arrKesempatan = new int[antrian];
        for (int i = 0; i < antrian; i++) {
            arrKesempatan[i] = input.nextInt();
            }

        if(arrKesempatan.length < antrian){
            System.out.println("Jumlah Kesempatan tidak sesuai dengan total Nama...");
            return;}

        for (int i = 0; i < arrKesempatan.length; i++) {
            if(arrKesempatan[i]<1){
            System.out.println("Inputan Kesempatan tidak dapat dibawah 1..");
            return;}

            if(arrKesempatan[i]>10){
            System.out.println("Inputan Kesempatan tidak dapat diatas 10..");
            return;}
        }
        System.out.println(antrian);
        System.out.println(Arrays.toString(arrNama));
        System.out.println(Arrays.toString(arrKesempatan));
    }
}

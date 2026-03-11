import java.util.*;

public class Question4 {//cgpt line 3-13

    static class Visitor {
        String nama;
        int uang;

        Visitor(String nama, int uang) {
            this.nama = nama;
            this.uang = uang;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan total visitor (2-999) : ");
        int visitor = input.nextInt();
        input.nextLine();

        if (visitor < 2) {
            System.out.println("Visitor tidak dapat dibawah 2");
            return;
        }

        if (visitor > 999) {
            System.out.println("Visitor tidak dapat diatas 999");
            return;
        }

        System.out.println("Masukkan Nama (contoh: Jea, Bryan, Chris, dst) : ");
        String nama = input.nextLine();
        String[] arrNama = nama.split(",\\s*");

        if(arrNama.length != visitor){
            System.out.println("Jumlah nama tidak sesuai dengan total visitor..");
            return;
        }

        System.out.println("Masukkan jumlah uang (contoh: 3, 7, 1, 4) : ");
        String uang = input.nextLine();
        String[] arrUangStr = uang.split(",\\s*");

        if(arrUangStr.length != visitor){
            System.out.println("Jumlah uang tidak sesuai dengan total visitor..");
            return;
        }
        //cgpt line 50-akhir
        List<Visitor> list = new ArrayList<>();

        for(int i = 0; i < visitor; i++){

            int uangInt = Integer.parseInt(arrUangStr[i]);

            if(uangInt <= 1 || uangInt >= 100){
                System.out.println("Jumlah uang harus 1 < n < 100");
                return;
            }

            if(arrNama[i].equalsIgnoreCase("Jeff")){
                continue;
            }

            list.add(new Visitor(arrNama[i], uangInt));
        }
        list.sort((a,b) -> b.uang - a.uang);

        Queue<String> queue = new LinkedList<>();

        for(Visitor v : list){
            queue.add(v.nama);
        }

        System.out.print("[");

        while(!queue.isEmpty()){

            System.out.print(queue.poll());

            if(!queue.isEmpty()){
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}
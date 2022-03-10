public class whileLoop {
    public static void main(String[] args) {
        // while adalah jika kondisinya true maka dia akan tetap mengulang
        // while(kondisi){
        // aksi
        // }
        // di mana akondisinya berupa operator logika seperti(<,>,>=,<=,or,and,dan
        // lain-lain)contoh,dan akan bernilai true,false
        // menambahkan inkremen dapat menambahkan angka
        int a = 1; // dia akan memulai dari 1
        boolean kondisi = true;
        while (kondisi) { // nama variabel dari boolean
            System.out.println("program ke-" + a);
            // kita juga bisa mengubah kondisi di tengah jalan dengan menggunakan (if)contoh
            if (a == 20) {
                kondisi = false; // kondisi adalah nama variabel dari boolean
            }
            a++;
            // jika inkremennya di bawah if maka pengulangannya dari 1 sampai 20
        }
    }

}

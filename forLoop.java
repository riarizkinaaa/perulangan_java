public class forLoop {
    public static void main(String[] args) {
        // penulisan pengulangan pada for
        // for(inisialisasi;kondisi;inkrement/dekrement){
        // aksi
        // }
        // di nama inisilisasi itu adalah nilai awal
        // kondisi bernilai benar,salah(a<=10)
        // incremen/dekrement(a++,a--)contoh
        System.out.println("cara yang pertama");
        for (int a = 2; a <= 10; a++) {
            System.out.println("nilai ke= " + a);

        }
        System.out.println("cara yang kedua");
        for (int a = 2; a < 10; a++) {
            System.out.println("nilai ke= " + a);
        }
        System.out.println("cara ke tiga");
        for (int a = 10; a >= 1; a--) { // outputnya mulai dari 10 sampai 1
            System.out.println("nilai ke= " + a);
        }
    }

}

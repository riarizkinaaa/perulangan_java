import java.util.Scanner;

public class latihanPengulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilaiAwal, nilai_akhir, total;
        System.out.print("masukkan nilai awal= ");
        nilaiAwal = input.nextInt();
        System.out.print("masukkan nilai akhir= ");
        nilai_akhir = input.nextInt();
        total = 0;
        for (nilaiAwal = 1; nilaiAwal <= nilai_akhir; nilaiAwal++) {
            total = total + nilaiAwal;
            System.out.println("di tambah " + nilaiAwal + " menjadi " + total);
        }
        // do {
        // total = total + nilaiAwal;
        // System.out.println("di tambah " + nilaiAwal + " menjadi " + total);
        // nilaiAwal++;
        // } while (nilaiAwal <= nilai_akhir);
    }

}

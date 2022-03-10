public class doWhile {
    public static void main(String[] args) {
        /*
         * do while adalah mengecek aksi terlebih dahulu baru ke kondisi dan jika false
         * akan di lakukan
         * minimal sekali contoj penulisan
         * do{
         * aksi
         * }while(kondisi);
         * di mana nilai dari kondisi adalah true,false
         */
        int b = 2;
        boolean kondisi = true;
        do {
            b++;
            System.out.println("program ke-" + b);
            if (b == 3) {
                kondisi = false;
            }
        } while (kondisi);
    }

}

public class contohVarargs {
    public static int jumlahkan(int... kumpulanAngka) {
        int total = 0;
        for (int nilai : kumpulanAngka) {
            total += nilai;
        }
        return total;
    }

    public static void main(String[] args) {
        int hasil1 = jumlahkan(1, 2, 3);
        System.out.println("hasil 1: " + hasil1);

        int hasil2 = jumlahkan(4, 5);
        System.out.println("hasil2: " + hasil2);

        int hasil3 = jumlahkan();
        System.out.println("hasil 3: " + hasil3);
    }
}
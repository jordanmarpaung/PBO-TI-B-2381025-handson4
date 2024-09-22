public class contohOverloading {
    public static double hitungLuas(double sisi) {
        return sisi * sisi;
    }
    public static double hitungLuas(double panjang, double lebar) {
        return panjang * lebar; }
    public static double hitungLuas(double jarijari, boolean isLingkaran) {
        if (isLingkaran){
            return Math.PI * jarijari * jarijari;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        double luasPersegi = hitungLuas(5);
        System.out.println("Luas Persegi: " + luasPersegi);

        double luasPersegiPanjang = hitungLuas(4,6);
        System.out.println("Luas persegi panjang: " + luasPersegiPanjang);

        double luasLingkaran = hitungLuas(3, true);
        System.out.println("Luas Lingkaran: " + luasLingkaran);
    }
}


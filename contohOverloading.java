public class contohOverloading {
    public static double hiungLuas(double sisi) {
        return sisi * sisi;
    }
    public static double hitungLuas(double panjang, double lebar) {
        return panjang * lebar;
    }
    public static double hitungLuas(double jarijari, boolean isLingkaran) {
        if (isLingkaran) {
            return Math.PI * jarijari * jarijari;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        double luasPersegi = hitungLuas(5);
        System.out.println("Luas Persegi: ");
    }

}


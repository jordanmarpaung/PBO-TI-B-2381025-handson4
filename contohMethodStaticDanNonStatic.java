public class contohMethodStaticDanNonStatic {
    public static double hitungLuasPersegi(double sisi) {
        return sisi * sisi;
    }
    public void tampilkanPesanSelamatDatang(String nama) {
        System.out.println("selamat datang, " + nama + "!");
    }

    public static void main(String[] args) {
        double luasPersegi = ContohMethodStaticDanNonStatic.hitungLuasPersegi(5);
        System.out.println("Luas persegi dengan sisi 5: " + luasPersegi);
    }
    contohMethodStaticDanNonStatic objek = new contohMethodStaticDanNonStatic();
    objek.tampilkanPesanSelamatDatang(nama:"john");
    objek.hitungLuasPersegi(5);

        }
}
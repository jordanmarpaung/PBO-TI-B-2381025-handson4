public class DenganMethod {
    public static void main(String[] args) {
        int gajiPokok = 5000000;
        int tunjanganTransport = 50000000;
        int tunjanganMakan = 3000000;
        int bonus = 120000;

        int totalPenghasilan = hitungTotalPenghasilan(gajiPokok, tunjanganTransport, tunjanganMakan, bonus);
        int pajak = hitungPajak(totalPenghasilan);
        int gajiBersih = hitungGajiBersih(totalPenghasilan, pajak);

        tampilkanDetailGaji(gajiPokok, tunjanganTransport, tunjanganMakan, bonus, pajak, gajiBersih );
    }

    public static int hitungTotalPenghasilan(int gajiPokok, int tunjanganTransport, int tunjanganMakan, int Bonus) {
        return gajiPokok + tunjanganTransport + tunjanganMakan + Bonus;
    }
    public static int hitungPajak(int totalPenghasilan) {
        return totalPenghasilan * 10 / 100;
    }
    public static int hitungGajiBersih(int totalPenghasilan, int pajak) {
        return totalPenghasilan - pajak; }

    public static void tampilkanDetailGaji (int gajiPokok, int tunjanganTransport, int tunjanganMakan, int bonus, int pajak, int gajiBersih) {
        System.out.println("Gaji pokok: " + gajiPokok);
        System.out.println("tunjangan Transport: " + tunjanganTransport);
        System.out.println("tunjangan Makan:" + tunjanganMakan);
        System.out.println("Bonus: " + bonus);
        System.out.println("Pajak: " + pajak);
        System.out.println("Gaji bersih: " + gajiBersih);
    }
}

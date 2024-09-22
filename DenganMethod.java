public class DenganMethod {
    public static void main(String[] args) {
        int gajiPokok = 5000000;
        int tunjanganTransport = 50000000;
        int tunjanganMakan = 3000000;
        int bonus = 120000;

        int totalPenghasilan = hitungTotalPenghasilan(gajiPokok, tunjanganTransport, tunjanganMakan, bonus);
        int pajak = hitungPajak(totalPenghasilan);
        int gajiBersih = hitungGajiBersih(totalPenghasilan, pajak);

        tampilkanDetailGaji (gajipokok, tunjanganTransport, tunjanganMakan, bonus, pajak, gajiBersih );
    }
    public static int hitungTotalPenghasilan(int gajiPokok, int tunjanganTransport, int tunjanganMakan, int Bonus) {
        return gajiPokok + tunjanganTransport + tunjanganMakan + bonus;
    }
    public static int hitungPajak(int totalPenghasilan) {
        return totalPenghasilan * 10 / 100;
    }
    public static int gajiBersih(int totalPenghasilan, int pajak) {
        return totalPenghasilan
    }
}

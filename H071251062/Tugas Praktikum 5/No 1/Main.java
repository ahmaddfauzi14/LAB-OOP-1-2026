public class Main {
    public static void main(String[] args) {
        KaryawanTetap Fauzi = new KaryawanTetap("Fauzi", "14102006", 1000000, 100000);
        Fauzi.absen();
        Fauzi.absen();
        Fauzi.absen();
        Fauzi.absen();
        Fauzi.absen();
        Fauzi.absen();
        System.out.println("Nama: " + Fauzi.getNama());
        System.out.println("ID Karyawan: " + Fauzi.getIdKaryawan());
        System.out.println("Jumlah Kehadiran: " + Fauzi.getJumlahKehadiran());
        System.out.println("Gaji: " + Fauzi.hitungGaji());
        System.out.printf("Gaji dengan Bonus: %.0f", Fauzi.hitungGaji(10000000));

        KaryawanKontrak Alim = new KaryawanKontrak("Alim", "18082007", 100000);
        Alim.absen();
        Alim.absen();
        Alim.absen();
        Alim.absen();
        Alim.absen();
        Alim.absen();
        Alim.absen();
        Alim.absen();
        Alim.absen();
        Alim.absen();
        Alim.absen();
        Alim.absen();
        Alim.absen();
        Alim.absen();
        Alim.absen();
        Alim.absen();
        Alim.absen();
        Alim.absen();
        Alim.absen();
        Alim.absen();
        Alim.absen();
        System.out.println("\nNama: " + Alim.getNama());
        System.out.println("ID Karyawan: " + Alim.getIdKaryawan());
        System.out.println("Jumlah Kehadiran: " + Alim.getJumlahKehadiran());
        System.out.println("Gaji: " + Alim.hitungGaji());
    }
}

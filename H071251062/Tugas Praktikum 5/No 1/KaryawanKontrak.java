public class KaryawanKontrak extends Karyawan {
    double upahPerHari;

    public KaryawanKontrak(String Nama, String idKaryawan, double upahPerHari) {
        super(Nama, idKaryawan);
        this.upahPerHari = upahPerHari;
    }

    @Override
    double hitungGaji() {
        double totalGaji = upahPerHari * getJumlahKehadiran();;

        if (getJumlahKehadiran() > 20){
            totalGaji += 500000;
        }
        return totalGaji;
    }

}

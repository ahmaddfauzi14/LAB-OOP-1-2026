public class KaryawanTetap extends Karyawan{

    double gajiPokok;
    double tunjanganMakan;

    public KaryawanTetap(String Nama, String idKaryawan, double gajiPokok, double tunjanganMakan) {
        super(Nama, idKaryawan);
        this.gajiPokok = gajiPokok;
        this.tunjanganMakan = tunjanganMakan;
    }

    @Override
    double hitungGaji() {
        double totalGaji = gajiPokok + (tunjanganMakan * getJumlahKehadiran());
        return totalGaji;
    }

    double hitungGaji(double bonusKinerja){
        return hitungGaji() + bonusKinerja;
    }
}

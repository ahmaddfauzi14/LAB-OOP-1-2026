abstract class Karyawan {
    private String Nama;
    private String idKaryawan;
    private int jumlahKehadiran;
    
    public Karyawan(String Nama, String idKaryawan){
        this.Nama = Nama;
        this.idKaryawan = idKaryawan;
    }

    public void absen(){
        this.jumlahKehadiran ++;
    }

    public int getJumlahKehadiran() {
        return jumlahKehadiran;
    }

    public String getNama() {
        return Nama;
    }

    public String getIdKaryawan() {
        return idKaryawan;
    }

    abstract double hitungGaji();
}
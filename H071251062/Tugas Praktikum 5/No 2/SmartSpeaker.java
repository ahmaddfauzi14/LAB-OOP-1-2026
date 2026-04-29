public class SmartSpeaker extends PerangkatElektronik implements InteraksiInternet, KontrolSuara{

    public SmartSpeaker(String merk, int dayaListrik) {
        super(merk, dayaListrik);
    }

    @Override
    void cekFungsi() {
        System.out.println(merk + " Berfungsi dengan baik");
    }

    @Override
    public void hubungkanWiFi() {
        System.out.println(merk + " Mengirim data ke server");
    }

    @Override
    public void prosesPerintah(String perintah) {
        if (perintah == "NYALA"){
            System.out.println(merk + " Lampu Berpijar!");
        }
    }
    
}

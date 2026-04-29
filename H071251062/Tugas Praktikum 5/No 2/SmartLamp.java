public class SmartLamp extends PerangkatElektronik implements KontrolSuara {

    public SmartLamp(String merk, int dayaListrik) {
        super(merk, dayaListrik);
    }

    @Override
    void cekFungsi() {
        System.out.println(merk + " Berfungsi dengan baik");
    }

    @Override
    public void prosesPerintah(String perintah) {
        if (perintah == "NYALA"){
            System.out.println(merk + " Lampu Berpijar!");
        }
    }
    
}

public class SmartCCTV extends PerangkatElektronik implements InteraksiInternet{

    public SmartCCTV(String merk, int dayaListrik) {
        super(merk, dayaListrik);
    }

    @Override
    void cekFungsi() {
        System.out.println(merk + "Berfungsi dengan baik");
    }

    @Override
    public void hubungkanWiFi() {
        System.out.println(merk + " Mengirim data ke server");
    }
    
}

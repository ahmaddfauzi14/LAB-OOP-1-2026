public class Main {
    public static void main(String[] args) {
        SmartLamp Lampu = new SmartLamp("Philips Lamp", 45);
        SmartCCTV CCTV = new SmartCCTV("Hikvision CCTV", 60);
        SmartSpeaker Speaker = new SmartSpeaker("Goojodoq Speaker", 15);
        
        System.out.println("Produk: " + Speaker.merk);
        System.out.println("Daya Listrik: " + Speaker.dayaListrik);
        Speaker.hubungkanWiFi();
        Speaker.prosesPerintah("NYALA");
        Speaker.cekFungsi();

        System.out.println();

        System.out.println("Produk: " + Lampu.merk);
        System.out.println("Daya Listrik: " + Lampu.dayaListrik);
        Lampu.prosesPerintah("NYALA");
        Lampu.cekFungsi();

        System.out.println();

        System.out.println("Produk: " + CCTV.merk);
        System.out.println("Daya Listrik: " + CCTV.dayaListrik);
        CCTV.hubungkanWiFi();
        CCTV.cekFungsi();
    }
}
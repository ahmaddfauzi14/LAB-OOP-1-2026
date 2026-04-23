import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        ArrayList<Product> daftarProduk = new ArrayList<>();
        
        int pilihan;
        do {
            System.out.println("PILIH MENU");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Semua Produk");
            System.out.println("3. Beli Produk");
            System.out.println("4. Keluar");
            System.out.print("Masukkan Pilihan (1-4): ");
            pilihan = Input.nextInt();
            Input.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("\nMasukkan Nama Produk: ");
                    String produk = Input.nextLine();
                    System.out.print("Masukkan Nomor Seri: ");
                    int seri = Input.nextInt();
                    System.out.print("Masukkan Harga: ");
                    double harga = Input.nextDouble();
                    System.out.println("\nPilih Jenis Produk:");
                    System.out.println("1. Smartphone");
                    System.out.println("2. Laptop");
                    System.out.println("3. Kamera");
                    System.out.print("Pilihan: ");
                    int jenis = Input.nextInt();
                    if (jenis == 1) {
                        System.out.print("\nMasukkan Ukuran Layar: ");
                        double layar = Input.nextDouble();
                        System.out.print("Masukkan Besar Storage: ");
                        int storage = Input.nextInt();

                        daftarProduk.add(new Smartphone(produk, seri, harga, layar, storage));

                    } else if (jenis == 2){
                        System.out.print("\nMasukkan RAM: ");
                        int ram = Input.nextInt();
                        Input.nextLine();
                        System.out.print("Masukkan Jenis Processor: ");
                        String processor = Input.nextLine();

                        daftarProduk.add(new Laptop(produk, seri, harga, ram, processor));

                    } else if (jenis == 3){
                        System.out.print("\nMasukkan Resolusi: ");
                        int resolusi = Input.nextInt();
                        Input.nextLine();
                        System.out.print("Masukkan Jenis Lensa: ");
                        String lensa = Input.nextLine();

                        daftarProduk.add(new Camera(produk, seri, harga, resolusi, lensa));

                    } else {
                        System.out.println("\nInputan tidak Valid");
                        break;
                    }
                    System.out.println("\n================================");
                    System.out.println("Produk Berhasil Ditambahkan");
                    System.out.println("================================\n");
                    break;
                case 2:
                    if (daftarProduk.isEmpty()) {
                        System.out.println("\nBelum ada produk\n");
                    } else {
                        System.out.println("\n=========================");
                        System.out.println("DAFTAR PRODUK");
                        for (Product p : daftarProduk) {
                            p.tampilkanInfo();
                            System.out.println("=========================\n");
                        }
                    }
                    break;

                case 3:
                    System.out.print("\nMasukkan Nomor Seri: ");
                    int cari = Input.nextInt();
                    boolean ditemukan = false;

                    for (Product p : daftarProduk) {
                        if (p.getSeriesNumber() == cari) {
                            System.out.println("\nProduk ditemukan:");
                            p.tampilkanInfo();
                            System.out.println("Pembelian Berhasil\n");
                            daftarProduk.remove(p);
                            ditemukan = true;
                            break;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("\nProduk tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.println("\nTerima Kasih!");
                    break;
                default:
                    System.out.println("\nPilihan tidak valid");
                    break;
            }
            
            
        } while (pilihan != 4);
        
        Input.close();
    }
}
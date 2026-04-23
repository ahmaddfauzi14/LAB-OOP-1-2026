import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("DAFTAR BANGUN RUANG");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Bola");
        System.out.println("4. Tabung");
        System.out.println("\nDAFTAR BANGUN DATAR");
        System.out.println("5. Persegi");
        System.out.println("6. Persegi Panjang");
        System.out.println("7. Lingkaran");
        System.out.println("8. Trapesium");
        System.out.println("================================");

        System.out.print("\nMasukkan pilihan: ");

        int Pilihan;

        if (Input.hasNextInt()) {
            Pilihan = Input.nextInt();
        } else {
            System.out.println("Input harus bilangan bulat!");
            Input.close();
            System.out.println("\n================================");
            return;
        }
        System.out.println("\n================================");
        switch (Pilihan) {
            case 1:
                System.out.println("\nBANGUN RUANG KUBUS");
                System.out.print("\nPanjang rusuk: ");
                double rusuk = Input.nextDouble();
                Kubus cube = new Kubus(rusuk);
                System.out.println("\nLuas Permukaan Kubus: " + cube.hitungLuas());
                System.out.println("Volume Kubus: " + cube.hitungVolume());
                System.out.println("\n================================");
                break;
            case 2:
                System.out.println("\nBANGUN RUANG BALOK");
                System.out.print("\nPanjang: ");
                double panjangBalok = Input.nextDouble();
                System.out.print("Lebar: ");
                double lebarBalok = Input.nextDouble();
                System.out.print("Tinggi: ");
                double tinggiBalok = Input.nextDouble();
                Balok block = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                System.out.println("\nLuas Permukaan Balok: " + block.hitungLuas());
                System.out.println("Volume Balok: " + block.hitungVolume());
                System.out.println("\n================================");
                break;
            case 3:
                System.out.println("\nBANGUN RUANG BOLA");
                System.out.print("\nJari-Jari: ");
                double jariJariBola = Input.nextDouble();
                Bola ball = new Bola(jariJariBola);
                System.out.println("\nLuas Permukaan Bola: " + ball.hitungLuas());
                System.out.println("Volume Bola: " + ball.hitungVolume());
                System.out.println("\n================================");
                break;
            case 4:
                System.out.println("\nBANGUN RUANG TABUNG");
                System.out.print("\nJari-Jari: ");
                double jariJariTabung = Input.nextDouble();
                System.out.print("Tinggi: ");
                double tinggiTabung = Input.nextDouble();
                Tabung tube = new Tabung(jariJariTabung, tinggiTabung);
                System.out.println("\nLuas Permukaan Tabung: " + tube.hitungLuas());
                System.out.println("Volume Tabung: " + tube.hitungVolume());
                System.out.println("\n================================");
                break;
            case 5:
                System.out.println("\nBANGUN DATAR PERSEGI");
                System.out.print("\nPanjang Sisi: ");
                double sisi = Input.nextDouble();
                Persegi square = new Persegi(sisi);
                System.out.println("\nKeliling Persegi: " + square.hitungKeliling());
                System.out.println("Luas Persegi: " + square.hitungLuas());
                System.out.println("\n================================");
                break;
            case 6:
                System.out.println("\nBANGUN DATAR PERSEGI PANJANG");
                System.out.print("\nPanjang: ");
                double panjangPersegiPanjang = Input.nextDouble();
                System.out.print("Lebar: ");
                double lebarPersegiPanjang = Input.nextDouble();
                PersegiPanjang rectangle = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
                System.out.println("\nKeliling Persegi Panjang: " + rectangle.hitungKeliling());
                System.out.println("Luas Persegi Panjang: " + rectangle.hitungLuas());
                System.out.println("\n================================");
                break;
            case 7:
                System.out.println("\nBANGUN DATAR LINGKARAN");
                System.out.print("\nJari-Jari: ");
                double jariJariLingkaran = Input.nextDouble();
                Lingkaran circle = new Lingkaran(jariJariLingkaran);
                System.out.println("\nKeliling Lingkaran: " + circle.hitungKeliling());
                System.out.println("Luas Lingkaran: " + circle.hitungLuas());
                System.out.println("\n================================");
                break;
            case 8:
                System.out.println("\nBANGUN DATAR TRAPESIUM");
                System.out.print("\nSisi A: ");
                double a = Input.nextDouble();
                System.out.print("Sisi B: ");
                double b = Input.nextDouble();
                System.out.print("Sisi C: ");
                double c = Input.nextDouble();
                System.out.print("Sisi D: ");
                double d = Input.nextDouble();
                System.out.print("Tinggi: ");
                double tinggiTrapesium = Input.nextDouble();
                Trapesium trapezoid = new Trapesium(a, b, c, d, tinggiTrapesium);
                System.out.println("\nKeliling Trapesium: " + trapezoid.hitungKeliling());
                System.out.println("Luas Trapesium: " + trapezoid.hitungLuas());
                System.out.println("\n================================");
                break;
            default:
                System.out.println("Inputan tidak valid.");
                System.out.println("\n================================");
                break;
        }
        Input.close();
    }
}
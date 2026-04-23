public class Bangun{
    double hitungKeliling(){
        return 0;
    }
    double hitungLuas(){
        return 0;
    }
    double hitungVolume(){
        return 0;
    }
}

class Persegi extends Bangun{
    double sisi;

    Persegi (double sisi){
        if (sisi > 0) {
            this.sisi = sisi;
        }else{
            System.out.println("\nPANJANG SISI HARUS POSITIF");
            this.sisi = 0;
        }
    }
    double hitungKeliling(){
        return 4*sisi;
    }
    double hitungLuas(){
        return sisi*sisi;
    }
}

class PersegiPanjang extends Bangun{
    double panjang, lebar;

    PersegiPanjang (double panjang, double lebar){
        if (panjang > 0 && lebar > 0) {
            this.panjang = panjang;
            this. lebar = lebar;
        }else{
            System.out.println("\nPANJANG ATAUPUN LEBAR HARUS POSIITIF");
            this.panjang = 0;
            this. lebar = 0;
        }
    }
    double hitungKeliling(){
        return 2*(panjang+lebar);
    }
    double hitungLuas(){
        return panjang*lebar;
    }
}

class Lingkaran extends Bangun{
    double jariJari;

    Lingkaran(double jariJari){
        if (jariJari > 0) {
            this.jariJari = jariJari;
        }else{
            System.out.println("\nJARI-JARI HARUS POSITIF");
            this.jariJari = 0;
        }
        
    }
    double hitungKeliling(){
        return 2*(22.0/7)*jariJari;
    }
    double hitungLuas(){
        return (22.0/7)*jariJari*jariJari;
    }
}

class Trapesium extends Bangun{
    double a, b, c, d, t;

    Trapesium(double a, double b, double c, double d, double t) {
        if (a > 0 && b > 0 && c > 0 && d > 0 && t > 0) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.t = t;
        }else{
            System.out.println("\nSEMUA SISI ATAUPUN TINGGI HARUS POSITIF");
            this.a = 0;
            this.b = 0;
            this.c = 0;
            this.d = 0;
            this.t = 0;
        }  
    }
    double hitungKeliling(){
        return a+b+c+d;
    }
    double hitungLuas(){
        return ((a+b)*t)/2;
    }
}

class Kubus extends Bangun{
    double rusuk;

    Kubus(double rusuk){
        if (rusuk > 0) {
            this.rusuk = rusuk;
        }else{
            System.out.println("\nPANJANG RUSUK HARUS POSITIF");
            this.rusuk = 0;
        }
    }
    double hitungLuas(){
        return 6*rusuk*rusuk;
    }
    double hitungVolume(){
        return rusuk*rusuk*rusuk;
    }
}

class Balok extends Bangun{
    double panjang, lebar, tinggi;

    Balok(double panjang, double lebar, double tinggi) {
        if (panjang > 0 && lebar > 0 && tinggi > 0) {
            this.panjang = panjang;
            this.lebar = lebar;
            this.tinggi = tinggi;
        }else{
            System.out.println("\nSEMUA BAGIAN HARUS POSITIF");
            this.panjang = 0;
            this.lebar = 0;
            this.tinggi = 0;
        }
    }
    double hitungLuas(){
        return 2*((panjang*lebar)+(lebar*tinggi)+(panjang*tinggi));
    }
    double hitungVolume(){
        return panjang*lebar*tinggi;
    }
}

class Bola extends Bangun{
    double jariJari;

    Bola(double jariJari){
        if (jariJari > 0) {
            this.jariJari = jariJari;
        }else{
            System.out.println("\nJARI-JARI HARUS POSITIF");
            this.jariJari = 0;
        }
    }
    double hitungLuas() {
        return 4*(22.0/7)*jariJari*jariJari;
    }
    double hitungVolume(){
        return (4.0/3)*(22.0/7)*jariJari*jariJari*jariJari;
    }
}

class Tabung extends Bangun{
    double jariJari, tinggi;

    Tabung(double jariJari, double tinggi) {
        if (jariJari > 0 && tinggi > 0) {
            this.jariJari = jariJari;
            this.tinggi = tinggi;
        }else{
            System.out.println("\nJARI-JARI ATAUPUN TINGGI HARUS POSITIF");
            this.jariJari = 0;
            this.tinggi = 0;
        }
    }
    double hitungLuas() {
        return (2*(22.0/7)*jariJari*tinggi)+(2*(22.0/7)*jariJari*jariJari);
    }
    double hitungVolume(){
        return (22.0/7)*jariJari*jariJari*tinggi;
    }
}
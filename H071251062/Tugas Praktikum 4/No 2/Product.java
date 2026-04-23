class Product {
    String brand;
    int seriesNumber;
    double price;
    
    public Product(String brand, int seriesNumber, double price) {
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;
    }
    public void tampilkanInfo() {
        System.out.println("Merek       : " + brand);
        System.out.println("No Seri     : " + seriesNumber);
        System.out.println("Harga       : " + price);
    }
    public int getSeriesNumber() {
        return seriesNumber;
    }
}
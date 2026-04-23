class Smartphone extends Product {
    double screenSize;
    int storageCapacity;
    
    public Smartphone(String brand, int seriesNumber, double price, double screenSize, int storageCapacity) {
        super(brand, seriesNumber, price);
        this.screenSize = screenSize;
        this.storageCapacity = storageCapacity;
    }

    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Ukuran Layar: " + screenSize + " inch");
        System.out.println("Storage     : " + storageCapacity + " GB");
    }
    
}

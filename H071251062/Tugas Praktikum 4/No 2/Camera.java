class Camera extends Product {
    int resolution;
    String lensType;
    
    public Camera(String brand, int seriesNumber, double price, int resolution, String lensType) {
        super(brand, seriesNumber, price);
        this.resolution = resolution;
        this.lensType = lensType;
    }

    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Resolusi    : " + resolution + " MP");
        System.out.println("Lensa       : " + lensType);
    }
}

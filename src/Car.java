class Car implements CarPrototype {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void info() {
        System.out.println("Marca: " + brand + ", Modelo: " + model + ", Ano: " + year);
    }

    public CarPrototype clone() {
        return new Car(brand, model, year);
    }
}

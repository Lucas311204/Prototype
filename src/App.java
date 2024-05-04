
public class App {
    public static void main(String[] args) {
        CarRegistry registry = new CarRegistry();

        // Obtendo protótipos do registro
        CarPrototype sedanPrototype = registry.getPrototype("sedan");
        CarPrototype suvPrototype = registry.getPrototype("suv");

        // Clonando os protótipos
        Car sedan = (Car) sedanPrototype.clone();
        Car suv = (Car) suvPrototype.clone();

        // Modificando os carros clonados conforme necessário
        sedan.info();
        suv.info();
    }
}

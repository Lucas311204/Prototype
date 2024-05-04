import java.util.HashMap;
import java.util.Map;
class CarRegistry {
    private Map<String, CarPrototype> prototypes;

    public CarRegistry() {
        prototypes = new HashMap<>();
        // Adicionando protótipos iniciais
        prototypes.put("sedan", new Car("Toyota", "Corolla", 2022));
        prototypes.put("suv", new Car("Jeep", "Wrangler", 2021));
    }

    // Adiciona um novo protótipo ao registro
    public void addPrototype(String type, CarPrototype prototype) {
        prototypes.put(type, prototype);
    }

    // Retorna um clone do protótipo especificado
    public CarPrototype getPrototype(String type) {
        CarPrototype prototype = prototypes.get(type);
        if (prototype != null) {
            return prototype.clone();
        }
        return null;
    }
}

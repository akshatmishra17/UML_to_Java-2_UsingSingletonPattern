import java.util.ArrayList;
import java.util.List;

class Equipment {
    private static Equipment instance;
    protected List<EquipmentProperty> properties;

    Equipment() {
        this.properties = new ArrayList<>();
    }

    public static Equipment getInstance() {
        if (instance == null) {
            instance = new Equipment();
        }
        return instance;
    }

    public void addProperty(EquipmentProperty property) {
        properties.add(property);
    }

    public List<EquipmentProperty> getProperties() {
        return properties;
    }
}
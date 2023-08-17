import java.util.ArrayList;
import java.util.List;

class EquipmentClass extends Equipment {
    private static EquipmentClass classInstance;
    private List<EquipmentClassProperty> classProperties;

    private EquipmentClass() {
        super();
        this.classProperties = new ArrayList<>();
    }

    public static EquipmentClass getInstance() {
        if (classInstance == null) {
            classInstance = new EquipmentClass();
        }
        return classInstance;
    }

    public void addClassProperty(EquipmentClassProperty classProperty) {
        classProperties.add(classProperty);
    }

    public List<EquipmentClassProperty> getClassProperties() {
        return classProperties;
    }
}
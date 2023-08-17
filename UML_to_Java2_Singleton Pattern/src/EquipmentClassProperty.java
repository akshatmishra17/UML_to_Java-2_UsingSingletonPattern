class EquipmentClassProperty {
    private String name;

    private EquipmentClassProperty(String name) {
        this.name = name;
    }
    public static EquipmentClassProperty createClassProperty(String name) {
        return new EquipmentClassProperty(name);
    }
    public String getName() {
        return name;
    }
}
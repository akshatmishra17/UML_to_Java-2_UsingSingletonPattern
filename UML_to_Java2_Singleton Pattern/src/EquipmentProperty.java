class EquipmentProperty {
    private String name;

    private EquipmentProperty(String name) {
        this.name = name;
    }
    public static EquipmentProperty createProperty(String name) {
        return new EquipmentProperty(name);
    }
    public String getName() {
        return name;
    }
}
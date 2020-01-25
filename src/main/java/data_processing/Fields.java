package data_processing;


public enum Fields {
    BRAND("brand"),
    BIKEWEIGHT("bikeWeight"),
    ISFRONTANDBACKLIGHT("isFrontAndBackLight"),
    COLOR("color"),
    PRICE("price"),
    EBIKE("E-BIKE"),
    SPEEDELEC("SPEEDELEC"),
    FOLDINGBIKE("FOLDING BIKE"),
    TYPE("type"),
    MAXSPEED("maxSpeed"),
    BATTERYCAPACITY("mAh battery"),
    WHEELSSIZEINCH("wheelsSizeInch"),
    GEARSNUMBER("gearsNumber");

    private final String name;

    private Fields(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

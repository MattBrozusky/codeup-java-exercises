package testing;

public class Building {
    private static String shapeOfBuilding = "rectangle";

    private String materialOfBuilding;
    private int heightOfBuilding;
    private String colorOfBuilding;

    public static String getShapeOfBuilding() {
        return shapeOfBuilding;
    }

    public String getMaterialOfBuilding(){
        return this.materialOfBuilding;
    }

    public int getHeightOfBuilding() {
        return heightOfBuilding;
    }

    public String getColorOfBuilding() {
        return colorOfBuilding;
    }

    public void setMaterialOfBuilding(String materialOfBuilding){
        this.materialOfBuilding = materialOfBuilding;
    }

    public void setHeightOfBuilding(int heightOfBuilding) {
        this.heightOfBuilding = heightOfBuilding;
    }

    public void setColorOfBuilding(String colorOfBuilding) {
        this.colorOfBuilding = colorOfBuilding;
    }

    public static void buildingDemolish(){
        System.out.println("Boom, Boom");
    }
    public void buildingMaintenance(){
        System.out.println("bang, bang, bang");
    }
    public void buildingCleaning(){
        System.out.println("Sweep, Sweep, Sweep");
    }

    public Building(){}

    public Building(String materialOfBuilding, int heightOfBuilding, String colorOfBuilding){
        this.materialOfBuilding = materialOfBuilding;
        this.heightOfBuilding = heightOfBuilding;
        this.colorOfBuilding = colorOfBuilding;
    }
}




//          6. add getters and setters for all instance variables
//          7. add main method to create the objects

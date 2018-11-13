package testing;

public class BuildingTest {
    public static void main(String[] args) {
        Building building1 = new Building("metal", 300, "green");

        building1.setMaterialOfBuilding("wood");
        System.out.println(building1.getMaterialOfBuilding());
        System.out.println(Building.getShapeOfBuilding());


    }
}

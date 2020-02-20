package Epam.HouseConstruct;

public class CostCal {
    private String materialstandard;
    private String automated;
    private double totalarea;

    public CostCal(String materialstandard, double totalarea, String automated) {
        this.materialstandard = materialstandard;
        this.totalarea = totalarea;
        this.automated = automated;
    }

    public double costCalculate() {
        double costperSquareFeet = 0;
        if (materialstandard.equalsIgnoreCase("standard"))
            costperSquareFeet = 1200;
        else if (materialstandard.equalsIgnoreCase("above standard"))
            costperSquareFeet = 1500;
        else if (materialstandard.equalsIgnoreCase("high standard")) {
            costperSquareFeet = 1800;
            if (automated.equals("yes"))
                costperSquareFeet = 2500;
        }
        return costperSquareFeet * totalarea;
    }
}

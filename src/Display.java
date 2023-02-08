public class Display {
    private String brand;
    private double inch;    //Дюйм
    private String matrix;  //Матрица


    public Display(String brand, double inch, String matrix) {
        this.brand = brand;
        this.inch = inch;
        this.matrix = matrix;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getInch() {
        return inch;
    }

    public void setInch(double inch) {
        this.inch = inch;
    }

    public String getMatrix() {
        return matrix;
    }

    public void setMatrix(String matrix) {
        this.matrix = matrix;
    }
}

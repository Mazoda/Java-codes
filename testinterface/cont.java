package testinterface;

public class cont implements thesum {
    private String name;
    private double area;

     cont(String name, double area){
    this.name=name;
    this.area=area;
}

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public double getvalue(){
        return area;
    }
}

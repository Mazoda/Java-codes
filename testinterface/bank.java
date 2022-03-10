package testinterface;

public class bank  implements thesum {
    private double balc;
    public bank (double balc){
        this.balc=balc;
    }
    public void setBalc(double balc){
        this.balc=balc;
    }
    public double getBalc(){
        return balc;
    }

    @Override
    public double getvalue() {
        return balc;
    }
}

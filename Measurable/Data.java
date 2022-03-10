package Measurable;
import javax.swing.JOptionPane;

public class Data {
    public static double average( Measurable[] objects){
        double sum=0;
        for(int i=0; i<objects.length-1 ;i++)
        sum+=objects[i].getMeasure();

        if(objects.length>0)return (sum/(objects.length-1));
        else return 0;
    }

    public static Measurable max(Measurable x, Measurable y) {
        if (x.getMeasure()>y.getMeasure())
        return x;
        else return y;
    }
    public static void sort(Measurable so[]){
        double temp;
        for (int i = 0; i <so.length-1; i++) {     
            for (int j = i+1; j <so.length-1; j++) {     
                if(so[i].getMeasure() > so[j].getMeasure()) {    
                   temp = so[i].getMeasure();    
                   so[i] = so[j];    
                   so[j].setMeasurable(temp);    
                 }     
              }     
          }
          JOptionPane.showMessageDialog(null,so[0] + "Sorted in ascending order:\n"+so[1]+"\n"+so[2],"Sort",0);   
         
    }
    
    
}

package testinterface;

import java.util.Arrays;

public class data {

     public static double getsum(thesum [] sum){
        double thesu= 0;


        for (int i =0; i<sum.length;i++){

               thesu += sum[i].getvalue();


        }

        return (thesu/sum.length);
     }
     
     public static double max(thesum [] max){ 
         double [] maxarea = new double[max.length];
        for(int i =0;i<max.length;i++){
            maxarea [i] = max[i].getvalue();
        }
       Arrays.sort(maxarea);
        return maxarea[max.length-1];
     }

     
}

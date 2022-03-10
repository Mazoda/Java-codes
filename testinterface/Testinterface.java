
package testinterface;


import javax.swing.*;

public class Testinterface {

    public static void main(String[] args) {
      int b= Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number:\n1:country\n2:bank account")) ;
      switch (b)
      {
          case 1:{

             int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of countries")) ;
             cont countries[]= new cont[n];
             int t =0;
             int r=1;
             
             while (true) {
                 
                 int q = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of service:\n1:add country "+r+ "\n2:Get the average of countries's area\n3:get the max\n4:Get all countries's data\n"));
                 
                 switch (q) {
                     case 1:
                         countries [t]= new cont(JOptionPane.showInputDialog(null,"Enter a name:"),Double.parseDouble(JOptionPane.showInputDialog(null,"Enter an area:")));
                         t=t+1;
                         r=r+1;
                         break;
                     case 2:
                         JOptionPane.showMessageDialog(null, "the average is" + data.getsum(countries));
                         break;
                     case 3:

                         for (int i = 0; i < t; i++) {
                             if (countries[i].getArea() == data.max(countries)) {
                                 JOptionPane.showMessageDialog(null, countries[i].getName() + " has the max area " + data.max(countries));
                             }
                         }
                         break;
                     case 4:
                         for (int i =0; i<=t;i++){
                             JOptionPane.showMessageDialog(null,"Name: "+countries[i].getName()+"\nArea: "+countries[i].getArea()+"\n");
                         }
                         break;
                    

                          }

                       }
            
         }

       




      }

    }}
    


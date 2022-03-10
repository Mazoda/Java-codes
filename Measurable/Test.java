package Measurable;

import javax.swing.JOptionPane;


public class Test {
    public static void main(String []args){

        
        while(true){
            String choice=JOptionPane.showInputDialog(null,"1-Countries\n 2-BankAccounts \nEnter your choice:","CHOICE",3);
            if( (choice.equals("1")||choice.equals("2"))){
            switch(choice){
               
                case "1":
                Country countries[]=new Country[4];
                JOptionPane.showMessageDialog(null, "Enter th information of 3 countries","",3);
                countries[0]=new Country(JOptionPane.showInputDialog(null,"Enter the Country's name","first country",3),(Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the Country's Area","first Country",3))));
                countries[1]=new Country(JOptionPane.showInputDialog(null,"Enter the Country's name","Second country",3),(Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the Country's Area","Second Country",3))));
                countries[2]=new Country(JOptionPane.showInputDialog(null,"Enter the Country's name","third country",3),(Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the Country's Area","third Country",3))));
                
                JOptionPane.showMessageDialog(null, "The average countries area = "+Data.average(countries), "Average", 3);
                Measurable la= Data.max(countries[0],countries[1]);
                countries[3]=new Country(((Country)la).getName(),((Country)la).getArea());
                Measurable lag= Data.max(countries[2],countries[3]);
                JOptionPane.showMessageDialog(null, "The largest country is "+((Country)lag).getName()+" With area ="+((Country)lag).getArea(), "MAX", 3);
                  
                Data.sort(countries);
                
                break;
                

                case "2":
                Bankaccounts balance[]=new Bankaccounts[4];
                JOptionPane.showMessageDialog(null, "Enter the information of 3 Balances","",3);

                balance[0]=new Bankaccounts((Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the first balance ","First Account",3))));
                balance[1]=new Bankaccounts((Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the second balance ","Second Account",3))));
                balance[2]=new Bankaccounts((Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the third balance ","Second Account",3))));
                JOptionPane.showMessageDialog(null, "The average balance = "+Data.average(balance), "Average", 3);
                Measurable l= Data.max(balance[0],balance[1]);
                balance[3]=new Bankaccounts(((Bankaccounts)l).getBalance());
                Measurable ls= Data.max(balance[2],balance[3]);
                JOptionPane.showMessageDialog(null, "The biggest balance is "+((Bankaccounts)ls).getBalance() ,"MAX", 3);
                Data.sort(balance);
                break;
            
             }
             }
            else 
            JOptionPane.showMessageDialog(null, "The program will be restarted, please make sure you choose a valid input","warning", 0);


        }
        

        
        

    }
    
}

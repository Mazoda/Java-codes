package filter;
import javax.swing.*;

public class NumFilterTest {

    public static void main(String[]args ){
       Integer [] nums = new Integer[20]; 
       for(int i=0;i<20;i++){
           nums[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the array numbers","nums["+i+"]",1));
        }
        
        System.out.println("\n  The multiple numbers of 3: ");
        filterData( nums,new MultipleOfFilter(3));
        System.out.println("\nThe multiple numbers of 5:  ");
        filterData(nums,new MultipleOfFilter(5));
        System.out.println("\n\nOdd Numbers: ");
        filterData(nums,new OddNumFilter());


    }



    
    public static void filterData(Integer a[],NumFilter filter ) {
    
    
    for (int i=0; i<20;i++){
        if (filter.predicate(a[i])){
            System.out.println(a[i]);
        }}}
        }

package generics;

import javax.swing.JOptionPane;

public class GenericFilterTest {
    public static void main(String[] args) {
         Integer [] nums = new Integer[20]; 
         for(int i=0;i<20;i++){
             nums[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the array numbers","nums["+i+"]",1));
          }
        
         
        String [] strs = {"cat","apple","Galio","bannana","pc"};

        System.out.println("\n  The even numbers: ");
        filterData(nums, new EvenNumFilter());

        System.out.println("\n  StartsWithFilter: ");
        
        filterData(strs,new StartsWithFilter((JOptionPane.showInputDialog(null,"Enter the character to search for")).charAt(0)));
        Student [] s1={new Student(13,"moh"),new Student(25,"joe"),new Student(10,"bot"),new Student(22,"dode")};
        System.out.println("\n  Students age: ");
        filterData(s1 ,new StudentAgeFilter(Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the age to filter"," Students age",1))));
    }
    

    public static <T> void filterData(T a[],Filter <T> filter){

        for (int i=0;i<a.length;i++) {
            if (filter.predicate(a[i]))
            System.out.println(a[i].toString());

        }
    }
    
}

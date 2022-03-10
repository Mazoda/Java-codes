package Collection;

import java.util.*;




public class CollectionTest {
  
    public static void main(String[]args){
        List<Integer>intlist=new ArrayList<Integer>();
        //intlist elements
        intlist.add(12);intlist.add(11);intlist.add(46);intlist.add(31);intlist.add(16);intlist.add(5);
        List<Integer>sourceList=new ArrayList<Integer>();
        // sourcelist elements
        sourceList.add(1); sourceList.add(2); sourceList.add(3); sourceList.add(4); sourceList.add(5); 
        List<Integer>targetList=new ArrayList<Integer>();
        // targetlist elements
        targetList.add(6);targetList.add(7);targetList.add(8);targetList.add(9);
        List<Integer> list=CollectionUtil.filterData(intlist, new EvenNumFilter());
        System.out.println(list);
        CollectionUtil.copy( sourceList, targetList, new EvenNumFilter());
        System.out.println(targetList);
    }
}

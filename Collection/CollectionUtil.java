package Collection;
import java.util.*;
public class CollectionUtil  {
    public static <T> List <T> filterData(Collection<T> col,Filter<T> filter){
        List <T>intlist=new ArrayList<T>();
        for(T elem:col){
            if(filter.predicate(elem))
            intlist.add(elem);
        }
        return intlist;

    }

    public static<T>void copy(List<T>sourceList,List<? super T> targetList,Filter<T> filter) {
        for(T el :sourceList ){
            if(filter.predicate(el))
            targetList.add(el);
        }
    }
    
}

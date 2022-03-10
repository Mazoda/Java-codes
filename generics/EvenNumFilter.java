package generics;

public class EvenNumFilter implements Filter <Integer>{

    @Override
    public boolean predicate(Integer n) {
        
        if (n%2==0)    
        return true;
        else
        return false;
    }


   


    
    
}

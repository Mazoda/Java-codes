package Collection;

public class StartsWithFilter implements Filter<String> {
   
    char cha;
    
    @Override
    public boolean predicate(String n) {
        
     

        if (Character.toLowerCase((n).charAt(0))==Character.toLowerCase(cha))
            return true;
        else
        return false;
    }
 
    


    public StartsWithFilter(char cha) {
        this.cha = cha;
    }
    
}

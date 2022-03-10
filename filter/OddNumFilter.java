package filter;

public class OddNumFilter implements NumFilter{
    

    @Override
    public boolean predicate(Integer n) {
        if (n%2!=0)
        return true;
        else
        return false;
    }
 
}

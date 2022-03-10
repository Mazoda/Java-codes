package filter;

public class MultipleOfFilter implements NumFilter {

    int x;
    public MultipleOfFilter(int x) {
        this.x = x;
    }

    @Override
    public boolean predicate(Integer n) {

        if (n%x==0)
        return true;
        else
        return false;
    
    }
    
    
}

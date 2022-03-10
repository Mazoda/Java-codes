package generics;

public class StudentAgeFilter implements Filter <Student> {
Integer x;

public StudentAgeFilter(Integer x){
    this.x=x;
}
    @Override
    public boolean predicate(Student n) {
        
        if (n.age>=x)
        return true;
        else
        return false;
    
        
    }

   





}

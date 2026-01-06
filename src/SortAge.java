 import java.util.Comparator ;

public class SortAge implements Comparator<Employee>{
    @Override
    public int compare(Employee emp1 , Employee emp2){
        return emp1.getAge() - emp2.getAge() ;
    }

    // ascending emp1 - emp2 , descending emp2 - emp1 ;
}

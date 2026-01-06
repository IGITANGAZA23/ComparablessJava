import java.util.* ;
public class Main {
    public static void main(String[] args) {
        //System.out.println("System working wonderfully" );
        List<Employee> list = new ArrayList<>() ;
        list.add(new Employee("Aloys" , "Byiringiro" , 17 , 2000)) ;
        list.add(new Employee("Nikita" , "Mpuhwe" , 16 , 1500)) ;
        list.add(new Employee("Darius" , "Niyonkuru" , 20 , 2500)) ;
        Collections.sort(list , new SortAge()) ;
        Collections.sort(list) ;
        System.out.println(list);
    }
}
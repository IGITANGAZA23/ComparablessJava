public class Employee implements Comparable<Employee>{
    private String firstName ;
    private String lastName ;
    private int age ;
    private int salary ;
    public Employee(String firstName , String lastname , int age , int salary){
        this.firstName = firstName ;
        this.lastName = lastname ;
        this.age = age ;
        this.salary = salary ;
    }

    public int getAge() {
        return this.age;
    }
    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + age + " yrs, $" + salary + ")";
    }

    public int compareTo(Employee other){
        return Integer.compare(this.age , other.age) ;
    }
}

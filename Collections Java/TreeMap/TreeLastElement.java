import java.util.Comparator;
import java.util.Map.Entry;
import java.util.TreeMap;
 
public class TreeLastElement {
 
    public static void main(String a[]){
        
        //By using salary comparator (int comparison)
        TreeMap<Emp,String> trmap = new TreeMap<Emp, String>(new MySalaryCompr());
        trmap.put(new Emp("Ram",3000), "RAM");
        trmap.put(new Emp("John",6000), "JOHN");
        trmap.put(new Emp("Crish",2000), "CRISH");
        trmap.put(new Emp("Tom",2400), "TOM");

        Emp em = trmap.lastKey();
        System.out.println("Least salary emp: "+em);
        
        Entry<Emp,String> ent = trmap.lastEntry();
        System.out.println("Entry set values: ");
        System.out.println(ent.getKey()+" ==> "+ent.getValue());
    }
}
 
class MySalaryCompr implements Comparator<Emp>{
 
    @Override
    public int compare(Emp e1, Emp e2) {
        if(e1.getSalary() < e2.getSalary()){
            return 1;
        } else {
            return -1;
        }
    }
}
 
class Emp{
     
    private String name;
    private int salary;
     
    public Emp(String n, int s){
        this.name = n;
        this.salary = s;
    }
     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String toString(){
        return "Name: "+this.name+"     Salary: "+this.salary;
    }
}
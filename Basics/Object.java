 class Employee{
            int    id;
            String name;
            public void printMethods(){
                System.out.println("A Id of Emp is : "+id);
                System.out.println("A Name of Emp is: "+name);
            }
    }

public class Object {
   
    public static void main(String[] args) {
     Employee Myobj = new Employee();
     Employee Amit = new Employee();
     Myobj.id=1;
     Myobj.name = "Atul Singh";
     
     Amit.id=2;
     Amit.name="Amit Patel";
     Amit.printMethods();
     
    }
    
}

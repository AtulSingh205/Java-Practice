class Myclass{
      private int id ;
      private String name;

      public Myclass(){
        id=4;
        name = "Your_Name";
      }

      public void getData(){
        System.out.println("Id: "+id);
         System.out.println("name: "+name);
      }
}

public class Cunstructor{
    public static void main(String[] args) {
       Myclass Myobj = new Myclass();
       Myobj.getData();
        
    }
    
}

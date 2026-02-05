class Call{
      void Ringing(){
          System.out.print("Phone is Ringing.......");
      }
      void Vibrating(){
        System.out.println("Phone i Vibrating........");
    }
    
     
}

public class Calling {
    public static void main(String[] args) {
      Call obj = new Call();
      obj.Ringing();
      obj.Vibrating();   
    }
}

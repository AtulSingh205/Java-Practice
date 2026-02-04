 class InnerGetSetMethod {
    private String name;
    private int  id;

    public void setMethod(String n){
        name = n;
    }
    
    public void getMethod( ){
         System.out.println("A name of Owner: "+name);
    }

    public void setId(int m ){
        id=m;
    }
    public void getId(){
        System.out.println("Id of owner: "+id);
    }

}

public class GetSetMethod {
    public static void main(String[] args) {
        InnerGetSetMethod Myobj = new InnerGetSetMethod();
        Myobj.setMethod("Suresh Singh");
        Myobj.getMethod();

        Myobj.setId(27);
        Myobj.getId();
    }
}

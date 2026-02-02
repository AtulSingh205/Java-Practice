public class Patternfibnocis {

    static void Patternrec(int n ){
         if(n>0){
            Patternrec(n-1);
            for(int i = 0;i<n;i++){
                System.out.print("* ");
            }
            System.out.println();
         }
    }
    public static void main(String[] args) {
        Patternrec(4);
    }
}


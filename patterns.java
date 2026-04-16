public class patterns{
    public static void hollow_rectangle(int row,int col){
        for (int i = 1; i <=row; i++) {
            for(int j=1;j<=col;j++){
             if (i == 1 || i == row || j == 1 || j == col) {
                System.out.print("*");
                
             } else {
                System.out.print(" ");
                
             }
            }
           System.out.println(); 
        }
    }
    public static void invrotatedtriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
    public static void half_rev_num_pry(int n){
         for(int i=n;i>0;i--){
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
                // if wish to do with out i-- the use j=n-i+1 for inner loop
            }
          System.out.println();
        }
    }
    public static void floyed_triangle(int n){
        int k = 1;
           for(int i=1;i<=n;i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(k+" ");
                k++;
                
            }
          System.out.println();
        }
    }
    public static void zero_one_triangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if ((i+j)%2==0) {
                    System.out.print("1"+" ");
                    
                } else {
                    System.out.print("0"+" ");
                }
               
            }
            System.out.println();
        }

    }
    public static void butterfly(int n){
        //first half of butterfly
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            for(int j=1;j<2*n-2*i;j++){
                System.out.print(" ");
            }
             for(int j=1;j<=i;j++){
                System.out.print("*");

            }
             System.out.println();

        }
        // second half of butterfly
              for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            for(int j=1;j<2*n-2*i;j++){
                System.out.print(" ");
            }
             for(int j=1;j<=i;j++){
                System.out.print("*");

            }
             System.out.println();

        }

        
       
    }
    public static void rhombus(int n){
        for (int i = 1; i <=n; i++) {
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hollow_rhombus(int n,int row,int col){
          for (int i = 1; i <=row; i++) {
             for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=col;j++){
             if (i == 1 || i == row || j == 1 || j == col) {
                System.out.print("*");
                
             } else {
                System.out.print(" ");
                
             }
            }
           System.out.println(); 
        }
        
    }
    public static void diamond(int n){
        int k=0;
        int f=n;
        // first half
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            
            for(int j=1;j<=i+k;j++){
                System.out.print("*");
            }
            k++;
          

          System.out.println();
        }
        // second half
        for(int i=n;i>=0;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            
            for(int j=1;j<=i+f-1;j++){
                System.out.print("*");
            }
            f--;
          

          System.out.println();
        }
    }
    public static void main(String[] args) {
        // hollow_rectangle(4, 5);
        // hollow_rectangle(4, 10);
        // invrotatedtriangle(4);
        // half_rev_num_pry(5);
        // floyed_triangle(5);
        // zero_one_triangle(3);
        // butterfly(5);
        // rhombus(7);
        // hollow_rhombus(5,5,5);
        diamond(7);

        
    }
}
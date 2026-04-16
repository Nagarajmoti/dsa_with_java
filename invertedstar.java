public class invertedstar{
    public static void main(String[] args) {
        int n=4;
          for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }
        for(int line =1;line<=n;line++){
            for(int star =1;star <=n-line+1;star++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

}
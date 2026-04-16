public class dectobin{
    public static void dtob(int decnum){
        int mydecnum =decnum;
        int pow =0;
        int bin =0;
        int rem;
        while(decnum>0){
          rem =decnum%2;
          bin =bin+ rem* (int)(Math.pow(10,pow));
          pow++;
          decnum=decnum/2;


        }
        System.out.println("The binary  of "+ mydecnum +" is "+ bin);

    }
    public static void main(String[] args) {
        dtob(5);
        dtob(7);
        dtob(10);
        dtob(15);

        
    }
}
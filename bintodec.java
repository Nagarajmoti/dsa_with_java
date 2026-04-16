public class bintodec{
    public static void btod(int binnum){
        int mybinum =binnum;
        int pow=0;
        int decnum =0;
        int lastdig;
        while(binnum>0){
            lastdig=binnum%10;
            decnum =decnum+(lastdig * (int)(Math.pow(2,pow)));
            pow++;
            binnum =binnum/10;
        }
        System.out.println("The decimal of "+ mybinum +" is "+ decnum);
    }
    public static void main(String[] args) {
        btod(101);
        btod(111);
        btod(1010);
        
    }
}
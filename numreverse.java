public class numreverse{
    public void reverse(int x){
        String rev ="";
            while(x>0){
            int res =x%10;
            rev = rev+Integer.toString(res);
            x=x/10;
        }
        System.out.println(rev);
        
    }
    public static void main(String[] args) {
        int x = 123;
        
        
    
    }
}
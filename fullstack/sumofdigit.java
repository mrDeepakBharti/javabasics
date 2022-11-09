package fullstack;

public class sumofdigit {
    static void sumofdigit( int num,int sum){
        if(num==0){
            System.out.println(sum);
            return ;
            
    }
    sum+=num%10;
     num=num/10;
sumofdigit(num,sum);
    
    }
    public static void main(String[] args) {
        int num;
        num=12345;     
        sumofdigit(num,0);
        
            
    }
}



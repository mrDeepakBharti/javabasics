package fullstack;

public class amastrong {
    static void amastrong(int num,int sum,double result,int temp){
   if (num==0) {
   if (sum==temp) {
    System.out.println("number is amastrong");
    return ;
   }
   else{
    System.out.println("number is not amastrong");
   }
    return ;
   }
    
   int p=num%10;
    result=Math.pow(p,3);
    sum+=result;
   num=num/10;
   amastrong(num, sum,result,temp);   
   return ; 

    }
    public static void main(String[] args) {
        int num=371;
       int temp=num;
        amastrong(num, 0,0,temp);
    }
}

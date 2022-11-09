package fullstack;

public class reverse {
    static void reverse(int num){
        if(num==0){
  System.out.println();
            return ;
        }
        System.out.print("*");
        reverse(num-1);
 }
 static void print(int i,int j)
 {
    if (j==0) {
        return ;
    }
    reverse(j);
    print(i+1, j-1);
    
 }
 public static void main(String[] args) {
    print(1, 5);
 }
}

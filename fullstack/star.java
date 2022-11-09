package fullstack;

public class star {
    
        static void star(int num){
            if(num==0)
            {
               System.out.println();
                return ;
            }
             System.out.print("*");
    star(num-1);
        }
        static void print(int i,int j){
            if(i==0)
            {
                return ;
            }
              star(j);
              print(i-1, j+1);
    
        }
        public static void main(String[] args) {
            print(5,1);
        }
    }
     


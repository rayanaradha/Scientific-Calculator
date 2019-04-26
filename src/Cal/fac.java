package Cal;

public class fac {
  
public static int fa(int x){
int y;      
   if(x<1)
        return 1;
   else
       y = x*(fa(x-1));        
        return y;
        }
  
    }
    

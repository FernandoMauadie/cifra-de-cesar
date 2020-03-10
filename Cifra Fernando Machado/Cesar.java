
/**
 * 
 * 
 * @author Fernando Machado 
 * @version 1.0
 */
public class Cesar
{
    
    public static void main(String args[])
    {
        int x;
        int y;
        int z;
        int h;
        int count = args.length;
        
        
        char fim;
        
        
        
       for(h = 0; h < count; h++)
       {
        for(x = 0; x < args[h].length(); x++)
        {
            y = args[h].charAt(x);
            if( y == 90 || y== 122)
            {
                z = y-25;
                System.out.printf("%c",z);
            }
            else if(y == 89 || y == 121) 
            {
                z = y-23;   
                System.out.printf("%c",z);
            }
            else if(y == 32)
            {
                System.out.printf(" ");
            }
            else
            {
                z = y+2;
                System.out.printf("%c",z);
            }
        }
        System.out.printf(" ");
       }
    }
}
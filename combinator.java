package Creations;
import java.io.*;
class combinator
{
    static int n, f = 1,lw,up;
    static char alte,r;
    static char arr[];
    static int j,i,c,count = 0;
    static String a;
     public static void main()throws IOException
     {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("WARNING : Press Ctrl + Shift + R before running the program");
        System.out.println("          else the program can generate wrong results!");
        System.out.println("------------------------------------------");
        System.out.println("THE COMBINATOR");
        System.out.println("------------------------------------------");
        
        // accepting the elements of combination
        System.out.println("Enter the different elements(not similar) of combination(Ex. a2g8#) :");
        a = br.readLine();
        System.out.println();
        n = a.length();
        char arr[] = a.toCharArray();
        
        // converting series of elements into a string
        String combo = new String(arr);
        
        // finding factorial of no. of elements
        for(int i = 1; i <= n; i++)
        {
            f = i*f;
        }
        System.out.println("No. of possible combinations : " + f);
        
        // constructing ar1[]
        int ar1[] = new int[n-1];
        ar1[0] = 1;
        for(int i = 1; i < (n-1); i++)
        {
            ar1[i] = ar1[i-1]*(i+1);
        }
        
        // constructing ar2[]
        int ar2[] = new int[n-1];
        for(int i = 0; i < (n-1); i++)
        {
            ar2[i] = i+2;
        }
        
        String c_arr[] = new String[f];
        c_arr[0] = combo;
        // creating combinations and storing it in array c_arr[]
        for(i = 1; i < f; i++)
        {
            for(j = 0; j < (n-1); j++) //elements of ar1[]
            {
                if(i % ar1[j] == 0)
                {
                    combo = c_arr[i-ar1[j]];
                    arr = combo.toCharArray();
                    
                  // alteration mechanism - *STARTS*
                    c = ar2[j];
                    alte = arr[n-c];
                    arr[n-c] = arr[n-1];
                   for(int i = 1; i < c; i++)
                  {   
                    r = arr[n-c+i];
                    arr[n-c+i] = alte;
                    alte = r;
                  }
                  
                  // alteration mechanism - *ENDS*
                }
                else
                break;
            }
            combo = new String(arr);
            c_arr[i] = combo;
        }
        
        System.out.println("All the possible combinations of " + a + " are :");
        System.out.println();
        
        // displaying the combinations
        for(lw = 0, up = (f-1); (lw != up && lw != (up+1)); lw++,up--)
        {
             for(int i = 0; i < n; i++)
             {
                if(i == (n-1))
                System.out.print(c_arr[lw].charAt(i));
                else
                System.out.print(c_arr[lw].charAt(i) + " ");
             }
             System.out.print("    ");
             for(int j = 0; j < n; j++)
             {
                if(j == (n-1))
                System.out.print(c_arr[up].charAt(j));
                else
                System.out.print(c_arr[up].charAt(j) + " ");
             }
             System.out.print("    ");
             
              count += 2;
              if(count%6==0)
              System.out.println();

            
        }
     }
     
}
                    
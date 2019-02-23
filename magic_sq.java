package Creations;
import java.util.*;
class magic_sq
{
    public static void main()throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int n;
        int r,c;
        
        System.out.println("Enter an odd no. :");
        n = sc.nextInt();
        
        int[][] M = new int[n][n];
        r = n-1;
        c = (n+1)/2 -1;
        
        for(int i = 1; i <= n*n; i++)
        {
            M[r][c] = i;
            
            if(M[(r+1)%n][(c+1)%n] == 0)
            {
               r = (r+1)%n;
               c = (c+1)%n;
            }
            else
             r = (r-1+n)%n;
        }
        
        System.out.println("Magic square of "+n+" by "+n+" :");
        
        for(int i = 0; i < n ; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }
}
package Creations;
import java.util.*;
class Hadamard_matrix
{
    public static void main()throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.println("Enter a no.(a pow of 2) :");
        n = sc.nextInt();
        
        boolean[][] H = new boolean[n][n];
        H[0][0] = true;
        for(int i = 1; i <n; i+=i)
        {
            for(int m =0; m <i; m++)
            {
                for(int p = 0; p < i; p++)
                {
                    H[i+m][p] = H[m][p];
                    H[m][i+p] = H[m][p];
                    H[i+m][i+p] = !H[m][p];
                }
            }
        }
        
        char[][]M = new char[n][n];
        for(int i = 0; i < n ; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(H[i][j] == true)
                M[i][j] = '*';
                else
                M[i][j] = 'O';
            }
        }
        
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


package Creations;
import java.util.*;
class goldbach_conj
{
    public static void main()throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int n;
        int c = 0,ctr=0,s=0;
        
        System.out.println("Enter an even number >2 :");
        n = sc.nextInt();
        
        //Marking primes by Sieve of Eratosthenes
        boolean[]prime = new boolean[n+2];
        for(int i = 2; i <= n+1; i++)
        prime[i] = true;
        
        for(int i = 2; i <= n+1; i++)
        {
            if(prime[i])
            {
                for(int m = 2; m*i <= n; m++)
                prime[m*i] = false;
            }
        }
        
        //Creating list of prime nos.
        int[]primeno = new int[n];
        for(int i = 2; i <= n+1; i++)
        {
            if(prime[i])
            {
                primeno[c] = i;
                c++;
            }
        }
       
        int l=0,u=c-1;
        while(ctr==0)
        {
            s= primeno[u] + primeno[l];
            if(s > n)
            u=u-1;
            else if (s<n)
            l = l+1;
            else if(s==n)
            ctr=1;
        }
        System.out.println(n + "="+primeno[l]+"+"+primeno[u]);
    }
}
            
            
            
            
            
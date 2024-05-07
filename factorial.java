import java.util.*;
class factorial 
{
    public static void main(String args[]) 
    {
        int i,n,f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        n = sc.nextInt();
        f=1;
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println("Fsctorial of the number: "+f);
        sc.close();
    }
}
class prime
{
    public static void(String[]args)
    {
        int n=27,flag=0;
        for(int i=0;i<math.sqrt(n);i++)
        {
            if(n%2==0)
            {
                flag=1;
                break;
            }
        }
            if(flag==0)
            System.out.print("yes");
            else
            System.out.print("no");
        
         
    }
}
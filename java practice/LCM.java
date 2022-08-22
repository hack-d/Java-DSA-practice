public class LCM {
    public static void main(String[] args)
    {
        int a=25;
        int b=35;
        int c=40;
        int gcd=0;
        int greatest=0;
        int product=a*b*c;
        int lcm=0;

        for(int i=1;i<a;i++)
        {
            if(a%i==0 && b%i==0 && c%i==0)
            {
                gcd=i;
            }
        }
       /* if(a>b && a>c)
        {
            greatest=a;
        }
        if(b>a && b>c)
        {
            greatest=b;
        }
        if(c>a && c>b)
        {
            greatest=c;
        }
        for(int i=greatest;i<=product;i++)
        {
          if(i%a==0 && i%b==0 && i%c==0)
          {
              lcm=i;
              System.out.println(lcm);
              return;
          }
        }*/
        
        System.out.println(gcd);
    }
}

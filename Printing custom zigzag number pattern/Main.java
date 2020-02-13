#include <stdio.h>

int main()
{
    int n;
    scanf("%d",&n);
    for(int i=1;i<=n;i++)
    {
        int m=i;
        for(int j=1;j<=n;j++)
        {
            if( ((i%2)!=0)&&(j!=n))
            {
            
                printf("%d",i);
            }
            else if( ((i%2)!=0)&&(j==n))
            { 
                   printf("%d",m+1);
            }
         
         
         
         else if(((i%2)==0)&&(j!=1))
            {
            
                printf("%d",i);
            }
            else if (((i%2)==0)&&(j==1))
               { 
                   printf("%d",m+1);
               }
        }
        
        
        
       printf("\n");
    }
    return 0;
}
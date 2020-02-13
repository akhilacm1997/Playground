#include <stdio.h>
int main()
{
  	int count=0,n;
 scanf("%d",&n);
  for(int i=1;i<=n;i++)
  {
    for(int j=1;j<=i;j++)
    {
      if(count==0)
      {
        printf("*");
        count =1;
      }
        
      else
      {
        printf("#");
        count=0;
      }
    }
  printf("\n");
  }
  	return 0;
}
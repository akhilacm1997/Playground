#include <stdio.h>
int main() {
  int n;
  int count=1;
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
    {
   for(int m=1;m<=n-i;m++)
   {
     printf(" ");
   } 
    for(int j=1;j<=i;j++)
     {
      printf("%d ",count );
      count++;
     }
    printf("\n");
    }
    
	return 0;
}

                         
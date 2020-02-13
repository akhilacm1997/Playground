#include <stdio.h>
int main() {
int n,factor,count=1;
  	scanf("%d",&n);
 while(count<=n)
  {
    if(n%count==0)
    {
      
      printf("%d\n",count);
    }
    count=count+1;
  }
	return 0;
}
#include <stdio.h>
int main() {
	 int n;
  scanf("%d",&n);
  int count=0;
  for(int i=1; i<=n; i++)
  {
    count=count+1;
    if(count%3==0)
      printf("%d,",i);
    else
      printf("%d",i);
  }
	return 0;
}
#include <stdio.h>
int main() {
  int n,m;
  int s=0;
  scanf("%d",&n);
  
  while(n>0){
 m=n%10;
  s=s+m;
  n=n/10;
  }
	printf("%d",s);
  //Type your code
	return 0;
}
#include<stdio.h>
#include<math.h>
int main(){
  int n,a;
  scanf("%d",&n);
  if(n%2==1)
  {
    a=2*((n-1))/2;
    printf("%d",a);
  }
  else{
 a=(n/2)-1;
   printf("%d",a);
  }
return 0;
}
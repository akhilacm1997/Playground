#include<stdio.h>
#include<math.h>
int main(){
  int n,a;
  scanf("%d",&n);
  if(n%2==1)
  {
    a=pow(2,(n-1)/2);
    printf("%d",a);
  }
  else
  { a=pow(3,(n/2)-1);
   printf("%d",a);
  }
}
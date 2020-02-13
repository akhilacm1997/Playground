#include<stdio.h>
#include<math.h>
int main(){
  int n,a,next;
  scanf("%d",&n);
  if(n==1)
  {
    printf("%d",n);
  }
else if(n==2)
  { 
   printf("%d",a);
  }
  else
  { int t=1;int t2=2;
    for(int i=3;i<=n;i++)
    {
       next =t+t2;
      t=t2;
      t2=next;
    }
   printf("%d",next);
}
  return 0;
}
#include <stdio.h>
#include <math.h>
int main() {
int n;
  scanf("%d",&n);
  int num=n;
  int count=0;
  while(n>0)
  {
    n=n/10;
    count++;
    }
  //printf("%d",count);
  int m=num;
  int sum=0;
  int p;
  for(int i=0;i<=count;i++)
  { int r=num%10;
   int p=pow(r,count);
   //printf("%d",p);
   sum=sum+p;
   num=num/10;
  }
  //printf("%d",sum);
  if(sum==m)
  {
    printf("Armstrong Number");
  }
  else
    printf("Not an Armstrong Number");
   return 0;
}
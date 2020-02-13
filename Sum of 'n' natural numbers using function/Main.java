#include<stdio.h>
int sum_of_naturalnumber(int n)
{ int sum=0;
  for(int i=1;i<=n;i++)
  {
    sum=sum+i;
  }
  return sum;
}
int main()
{
  int(n1);
  scanf("%d",&n1);
  int sum1=sum_of_naturalnumber(n1);
  printf("%d",sum1);
}
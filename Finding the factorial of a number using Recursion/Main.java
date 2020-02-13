#include<stdio.h>
int fact(int n);
int main()
{
	int n,mul;
  scanf("%d",&n);
printf("%d", fact(n));

	return 0;
}
int fact(int n)
{ 
  if(n==0)
  {// printf("%d",mul);
    return 1;
  }
  else
  {
    return n*fact(n-1);
  }
}  
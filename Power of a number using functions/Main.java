#include <stdio.h>
int base_expo(int b,int e);
int main()
{ 
  int n1;
  int n2;
  int mul; 
 scanf("%d",&n1);
  scanf("%d",&n2);
  base_expo(n1,n2);
} 
  int base_expo(int b,int e)
  {
 	int mul =1;
 for(int i=1;i<=e;i++)
 {
   mul= mul*b;
 }
 printf("%d",mul);
  return mul;
}
#include<stdio.h>
int main()
{
  int size,r,j,i;
  scanf("%d",&size);
  int a[size];
  for(int i=0;i<size;i++)
  {
    scanf("%d",&a[i]);
  }
   for(int i=0;i<size;i++)
  {
  if(a[i]!=0)
    printf("%d ",a[i]);
  }
  for(int i=0;i<size;i++)
  {
  if(a[i]==0)
    printf("0 ");
  }
  return 0;
}
  
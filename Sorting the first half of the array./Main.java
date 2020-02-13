#include<stdio.h>
int main()
{
	int temp,n;
  scanf("%d",&n);
  int a[n];
   for(int i=0;i<n;i++)
  {
      scanf("%d",&a[i]);
    }
  for(int i=0;i<n/2-1;i++)
  {
     for(int j=0;j<n/2-1;j++)
  {
        if(a[j]>a[j+1])
     {
       temp=a[j];
       a[j]=a[j+1];
       a[j+1]=temp;
     }
   }
  }
    for(int i=0;i<n;i++)
  {
      printf("%d ",a[i]);
    }
  return 0;
}
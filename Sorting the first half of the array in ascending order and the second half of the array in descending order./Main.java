#include<stdio.h>
int main()
{
	int temp,n,i,j;
  scanf("%d",&n);
  int a[n];
   for( i=0;i<n;i++)
  {
      scanf("%d",&a[i]);
    }
  for( i=0;i<n/2-1;i++)
  {
     for(j=0;j<n/2-1;j++)
  {
        if(a[j]>a[j+1])
     {
       temp=a[j];
       a[j]=a[j+1];
       a[j+1]=temp;
     }
   }
  }
    for( i=n/2;i<n;i++)
  {
     for(j=n/2;j<n-1;j++)
  {
        if(a[j]<a[j+1])
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
#include<stdio.h>
int main()
{
  int size,r,k,i;
  scanf("%d",&size);
  int a[size];
  for(int i=0;i<size;i++)
  {
    scanf("%d",&a[i]);
  }
   for(int i=0;i<size;i++)
  { 
     for(int j=i+1;j<size;j++)
     {
       for(int k=j+1;k<size;k++)
       {
       printf("(%d, %d, %d) ",a[i],a[j],a[k]);
     }
      }
     if(i!=size-2)
     printf("\n");
   }

  return 0;
}

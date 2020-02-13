#include <stdio.h>
int main()
{
  int size,m,count;
  scanf("%d",&size);
  int a[size];
  for(int i=0;i<size;i++)
  {
    scanf("%d",&a[i]);
  }
 for(int j=0;j<size;j++)
  {  m=size-j;
    count=0;
 for(int i=0;i<size;i++)
  { 
      if(a[i]==m)
  		{ 
        	count++;
      }
    }
   if(count==0)
   {
     printf("%d",m);
   }
  }
       return 0;
}
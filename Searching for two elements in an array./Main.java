#include<stdio.h>
void main()
{
      int size;
      scanf("%d",&size);
      int arr[size],a, b,f=0,g=0;
      for(int i = 0; i < size; i++)
      {
        scanf("%d",&arr[i]);
      }
  scanf("%d %d",&a,&b);
   for(int i = 0; i <size ; i++)
   {
     if(arr[i]==a)
     {
       printf("%d",i);
       f=1;
     }
        if(arr[i]==b)
        {
          printf("\n%d",i);
			g=1;
        }
      }
if(f==0)
  printf("\n-1");
if(g==0)
  printf("\n-1");
 return 0;
}
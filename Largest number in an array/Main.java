#include<stdio.h>
void main()
{
      int size,temp;
      scanf("%d",&size);
      int arr[size];
      for(int i = 0; i < size; i++)
      {
        scanf("%d",&arr[i]);
      }
  int count =0;
  int large =arr[0];
   for(int i = 1; i <size ; i++)
   {
    
     if(arr[i]>large)
       large= arr[i];
    
   }
  printf("%d",large);
 return 0;
}
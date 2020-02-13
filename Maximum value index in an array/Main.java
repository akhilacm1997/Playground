#include<stdio.h>
int main()
{
  int size,m;
  scanf("%d",&size);
  int arr[size];
  for(int i=0;i<size;i++)
  {
    scanf("%d",&arr[i]);
  }
  int large =arr[0];
  for(int i=1;i<size;i++)
  {
   	if(arr[i]>large)
    {
      arr[i]=large;
       m=i;
    }
  }
    printf("%d",m);
  return 0;
}
#include<stdio.h>
int main()
{        int  f;
         int num;
         int num2,size,g;
  scanf("%d",&size);
  int a[size];
  for(int i=0;i<size;i++)
  {
    scanf("%d",&a[i]);
  }
   scanf("%d",&g);
   for(int i=0;i<size;i++)
  { 
     for(int j=i+1;j<size;j++)
     {
       int sum=a[j]+a[i];
       if(g==sum)
       {
         f=1; 
          num=a[i];
          num2=a[j];
         break;
       }
     } 
       }
 if(f==1)
       printf("Perfect couple: %d %d",num,num2);
 else
     printf("No perfect couple found!");
   
  return 0;
}

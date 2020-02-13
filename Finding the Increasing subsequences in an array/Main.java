#include <stdio.h>
int main()
{
  int n,i,m,j,sum,great;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
   //scanf("%d",&g);
   for(i=0;i<n;i++)
  {  great=a[i];
   for(m=i;m<n;m++)
    {    
    if(great<a[m])
     printf("%d,%d\n",a[i],a[m]);
    }
   }
  
 
   return 0;
}
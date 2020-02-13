#include<stdio.h>
int primenumber(int n);
int main(){
  int m;
  int count=0,i,j;
  scanf("%d",&m);
  primenumber(m);
  //printf("%d",prime1);
}
  int primenumber(int n)
  {
    int i;
    for(int i=2;i<=n;i++)
    {
      int count=0;
      for(int j=1; j<=i;j++)
      {
        if(i%j==0)
          count++;
      }
      if(count==2)
      {
        printf("%d\n",i);
      }
    }
    return i;
  }

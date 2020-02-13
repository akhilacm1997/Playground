#include <stdio.h>
int great(int n1,int n2,int n3);
int main()
{
  int n,m,p;
  //int gr;
  scanf("%d %d %d",&n,&m,&p);
   great(m,n,p);
}
int great(int n1,int n2,int n3)
{
  int gr;
  if(n1>n2)
    gr=n1;
  else
    gr=n2;
    if(n3>gr)
     gr=n3;
    
  printf("%d",gr);
  return gr;
}
   
   
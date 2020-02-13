#include <stdio.h>
int great(int n1,int n2,int n3);
 int i;
int main()
{ int i;
  int n,m,p;
  //int gr;
  scanf("%d %d %d",&n,&m,&p);
  int gcd= great(m,n,p);
}
int great(int n1,int n2,int n3)
{
  int s;
  if(n1<n2 && n1<n3)
    s=n1;
  else if(n2<n3)
  {s=n2;
  }
  else
  { s=n3;
  }
  for(int i=s;i>=1;i--)
  {
    if((n1%i==0)&&(n2%i==0)&&(n3%i==0))
    {   printf("%d",i);
  		break;	
  	}
  }  
   return i;   
}
#include<stdio.h>
#include<string.h>
int main(){
  char a[100],temp[100];
  int count ,j,m=0;
  scanf("%[^\n]s",a);
  for(int i=0;a[i]!='\0';i++)
  {
    count=0;
    for(j=i+1;a[j]!='\0';j++)
    {
    	if(a[i]==a[j])
    {
      count =-1;
          break;
    }
    }
    if(count!=-1)
    {
 temp[m]=a[i];
   m++;
    }
  }
  int l=strlen(temp);
 // printf("%d",l);
  for(int m=l-1;m>=0;m--)
  {
  printf("%c",temp[m]);
  }
  return 0;
}
  
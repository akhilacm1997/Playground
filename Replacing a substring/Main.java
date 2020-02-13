#include<stdio.h>
#include<string.h>
int main()
{ 
  //printf("hai    \n");
  int index=-1,l,l1,l2;
 char a[100],s1[20],s2[20];
  gets(a);
  //printf("%s\n",a);
   gets(s1);
   gets(s2);
  //printf("%s",s2);
  l=strlen(a);
  l1=strlen(s1);
  l2=strlen(s2);
  for(int i=0;i<l;i++)
  {
    if(a[i]==s1[0])
    { index=i;
      for(int j=1;j<l1;j++)
      {
     	if(a[i+j]!=s1[j])
        {
          index=-1;
          break;
        }
      }
     
    }
    if(index!=-1)
     {
       a[index]='\0';
       break;
     }
  }
  printf("%s",a);
  printf("%s",s2);
printf("%s",&a[index+l1]);
  return 0;
}
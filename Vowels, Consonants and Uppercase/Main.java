#include<stdio.h>
#include<string.h>
int main(){
  char str1[100];
  char str2[100];
  char str3[100];
  scanf("%s",str1);
  scanf("%s",str2);
        scanf("%s",str3);
  for(int i=0;str1[i]!='\0';i++)
  {
    if(str1[i]=='a'||str1[i]=='e'||str1[i]=='i'||str1[i]=='o'||str1[i]=='u')
    {
      str1[i]='$';
    }
  }
  for(int j=0;str2[j]!='\0';j++)
  {
    if(str2[j]=='a'||str2[j]=='e'||str2[j]=='i'||str2[j]=='o'||str2[j]=='u')
    {
      str2[j]=str2[j];
    }
    else
    {
      str2[j]='#';    
    }
  }  
   for(int m=0;str3[m]!='\0';m++)
  {
    if(str3[m]>='a'&&str3[m]<='z')
      {
      str3[m]=str3[m]-32;
    }
   }
  printf("%s",str1);
  printf("%s",str2);
  printf("%s",str3);
  return 0;
}
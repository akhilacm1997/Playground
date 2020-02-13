#include<stdio.h>
#include<string.h>

int main()

{int n,len;
char str1[10];
char str2[10];
scanf("%s",str1);
len=strlen(str1);

for(int i=0;i<=len;i++)
{
 str2[len-1-i]=str1[i];
}

int len2=strlen(str2);

if(strcmp(str1,str2)==0)
{
    printf("%s is a palindrome",str1);
}
else
 printf("%s is not a palindrome",str1);

return 0;
}

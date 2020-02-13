
#include <stdio.h>
#include <string.h>
 
int main()
{ 
 char str[1000];
 scanf("%[^\n]s",str);
 int stringlen = strlen(str);
 int stat[26];
  char m;
 for (int idx = 0; idx <= 25; idx++)
 {
   stat[idx] = 0;
 }
  
 for (int idx = 0; idx <= stringlen; idx++)
 {
   if(str[idx] >= 'a' && str[idx] <= 'z')
   {
     int offset = str[idx] - 'a';
     stat[offset]++;
   }
    
   else if(str[idx] >= 'A' && str[idx] <= 'Z')
   {
     int offset = str[idx] - 'A';
     stat[offset]++;
   }
 }
   for (int idx = 0; idx <= 25; idx++)
 {if(stat[idx]>=1)
 {
  m=idx+'a';
   printf("%c",m);
   printf("%d ",stat[idx]); 
 }
 }
  
 /*int max_idx = 0;
 for (int idx = 0; idx <= 25; idx++)
 {
   if(stat[idx] > stat[max_idx])
   {
     max_idx = idx;
   }
 }
 char max_repeating_char = 'a' + max_idx;
 printf("%c", max_repeating_char);*/
 return 0;
}
/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
int main()
{
  int size;
  scanf("%d",&size);
  int arr[size];
  for(int i=0;i<size;i++)
  {
    scanf("%d",&arr[i]);
  }
  int sum =0;
  for(int i=0;i<3;i++)
  {
    sum=sum+arr[i];
  }
  int sum1 =0;
   for(int i=3;i<size;i++)
    {
     sum1=sum1+arr[i];
    }
   if(sum1==sum)
       printf("Perfect Batch");
   else
       printf("Not a Perfect Batch");
  return 0;
}
     
       
  
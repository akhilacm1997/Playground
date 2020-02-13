#include<stdio.h>
void array(int r,int c,int matrix[r][c],int matrix1[r][c])
{
  int i,j,flag=0;
    for(i=0;i<r;i++)
    { 
      for(j=0;j<c;j++)
      {
        if(matrix[i][j]!=matrix1[i][j])
        {
          flag++;
        }
        
      }
    }
  if(flag==0)
    printf("Yes");
  else
    printf("No");
}
void main()
{ int r,c;
 scanf("%d%d",&r,&c);
  int matrix[r][c];
 int matrix1[r][c];
 for(int i=0;i<r;i++)
 {
   for(int j=0;j<c;j++)
   {
     scanf("%d",&matrix[i][j]);
   }
 }
 for(int i=0;i<r;i++)
 {
   for(int j=0;j<c;j++)
   {
     scanf("%d",&matrix1[i][j]);
   }
 }
  array(r,c,matrix,matrix1);
}
#include<stdio.h>
void array(int r,int c,int matrix[r][c])
{
  int i,j;
    for(i=r-1;i>=0;i--)
    {
      for(j=0;j<c;j++)
      {
        printf("%d ",(matrix[j][i]));
        
      }
      printf("\n");
    }
}
void main()
{ int r,c;
 scanf("%d%d",&r,&c);
  int matrix[r][c];
 //int matrix1[r][c];
 for(int i=0;i<r;i++)
 {
   for(int j=0;j<c;j++)
   {
     scanf("%d",&matrix[i][j]);
   }
 }
  array(r,c,matrix);
}
#include <stdio.h>
int main()
{
int n,m;
scanf("%d %d",&n,&m);

int mat[n][m];
int i, j,k;
for(i = 0; i < n; i++)
{
  for(j = 0; j < m; j++)
  {
       scanf("%d",&mat[i][j]);
}
}

        for(k = 0; k < m; k++)
        {
              for(i = 0, j = k; j < m ; i++, j++)
              {
            printf("%d ", mat[i][j]);
        }
    }
return 0;
}
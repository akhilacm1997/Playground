#include <stdio.h>
int main() {int n,m;
            scanf("%d",&n);
            m=n%10;
            while(n>=10){
              n=n/10;
            }
            n=n%10;
            m=n+m;
            printf("%d",m);
	//Type your code
	return 0;
}
#include <stdio.h>
int main()
{
 int a[100],n,t,i;
  scanf("%d",&t);
  while(t)
  {
    scanf("%d",&n);
    for(i=0;i<n;i++)
      scanf("%d",&a[i]);
    for(i=0;i<n;)
    {
      if(a[i]!=a[i+1])
      {
        printf("%d",a[i]);
        break;
      }
    else
      i=i+2;
      }
    printf("\n");
    t--;
  }
	return 0;
}
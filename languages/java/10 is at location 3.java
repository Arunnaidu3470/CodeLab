#include <stdio.h>
int main()
{
 int a[100],n,x,beg=0,end,mid,f=0,i;
  scanf("%d",&n);
  end=n-1;
  for(i=0;i<n;i++)
   scanf("%d",&a[i]);
   scanf("%d",&x);
  while(beg<=end)
  {
    mid=(beg+end)/2;
    if(x==a[mid])
    {
      f=1;
      break;
    }
    else if(x>a[mid])
      beg=mid+1;
    else if(x<a[mid])
      end=mid-1;
  }
   if(f==1)
     printf("%d found at location %d",x,mid+1);
  else
    printf("Not found! %d is not present in the list",x);
  
	return 0;
}
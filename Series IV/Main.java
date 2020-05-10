#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int i=0;
  int j=2;
  if(n<2)
  {
    for(int a=0;a<n;a++)
    {
      cout<<i<<" ";
      i=i+2;
    }
  }
  else
  {
  cout<<i<<" ";
  i=i+j;
  cout<<i<<" ";
  n=n-2;
  while(n>0)
  {
    j=j+4;
    for(int k=0;k<2;k++)
    {
      i=i+j;
      cout<<i<<" ";
      --n;
      if(n==0)
        break;
    }
  }
  }
}
    

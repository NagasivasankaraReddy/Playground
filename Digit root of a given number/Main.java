#include<iostream>
using namespace std;
int sumdig(int a)
{
  int sum=0;
  
  if(a/10==0)
  {
    return a;
  }
  else
  {
    while(a>0)
    {
      sum=sum+(a%10);
      a=a/10;
    }
    return sumdig(sum);
  }
}
int main()
{
  int a;
  cin>>a;
  cout<<sumdig(a);
}
  
  
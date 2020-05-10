#include<iostream>
using namespace std;
int main()
{
  int a,b;
  cin>>a>>b;
  int count=0;
  while(a<=b)
  {
    int sum=0;
    for(int i=1;i<a;i++)
    {
      if(a%i==0)
      {
        sum=sum+i;
      }
    }
    if(sum==a)
    {
      std::cout<<a<<" ";
    }
    a++;
  }
}
  
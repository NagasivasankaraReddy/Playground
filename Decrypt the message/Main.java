#include<iostream>
using namespace std;
int main()
{
  int a,b;
  cin>>a>>b;
  int n=a+b;
  int sum=0;
  for(int i=1;i<n;i++)
  {
    if(n%i==0)
    {
      sum=sum+i;
    }
  }
  if(sum==n)
  {
    std::cout<<"They can read the message";
  }
  else
  {
    std::cout<<"They can't read the message";
  }
}
    
  
      
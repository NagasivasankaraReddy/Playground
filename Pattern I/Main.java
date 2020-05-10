#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  for(int i=0;i<4;i++)
  {
    for(int j=0;j<=i;j++)
    {
      std::cout<<n;
    }
    std::cout<<"\n";
    n++;
  }
  n=n-1;
  for(int i=4;i>=1;i--)
  {
    for(int j=1;j<=i;j++)
    {
      std::cout<<n;
    }
    std::cout<<"\n";
    n--;
  }
}
  
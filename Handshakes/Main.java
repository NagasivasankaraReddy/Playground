#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int sum=0;
  while(n>0)
  {
    n=n-1;
    sum=sum+n;
  }
  std::cout<<sum;
}
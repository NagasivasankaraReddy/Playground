#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c;
  cin>>a>>b>>c;
  
  if(c<=b)
  {
    std::cout<<"Yes";
  }
  else if((c-1)%b==0)
  {
    std::cout<<"Yes";
  }
  else if(c%b==0)
  {
    std::cout<<"Yes";
  }
  else
  {
    std::cout<<"No";
  }
}
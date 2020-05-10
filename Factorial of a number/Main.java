#include<iostream>
using namespace std;
int main(){
  // Type your code here
  int n;
  cin>>n;
  int fact=1;
  if(n==0)
  {
    std::cout<<1;
  }
  else
  {
    for(int i=1;i<=n;i++)
    {
      fact=fact*i;
    }
    std::cout<<fact;
  }
}

#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  std::cout<<n<<endl;
  int count=0;
  if(n==1)
  {
    cout<<0;
  }
  else
  {
 do
  {
    if(n%2==0)
    {
      n=n/2;
      std::cout<<n<<endl;
      count++;
      
    }
    else
    {
      n=3*n+1;
      std::cout<<n<<endl;
      count++;
    } 
}while(n!=1);
  std::cout<<count;
  }
}
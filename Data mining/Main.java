#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int temp=n;
  int count=0;
  int step=1;
  int sum1=0,sum2=0;
  while(n>0)
  {
    n=n/10;
    count++;
  }
  while(count>0)
  {
    if(step%2==1)
    {
      sum1=sum1+(temp%10);
      temp=temp/10;
      step++;
      count--;
    }
    else
    {
      sum2=sum2+(temp%10);
      temp=temp/10;
      step++;
      count--;
    }
  }
  if(sum1==sum2)
  {
    std::cout<<"Yes";
  }
  else
  {
    std::cout<<"No";
  }
}
  

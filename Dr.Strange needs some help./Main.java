#include<iostream>
#include<math.h>
using namespace std;
int power(int a,int b)
{
  return pow(a,b);
}
int main()
{
  int x,y;
  cin>>x>>y;
  int z;
  cin>>z;
  if(power(x,y)>=z)
  {
    std::cout<<"Doctor, you can proceed with your experiment.";
  }
  else
    std::cout<<"Sorry Doctor! You need more bacteria.";
}
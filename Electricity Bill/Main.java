#include<iostream>
using namespace std;
int main()
{
  int x;
  cin>>x;
  int amount;
  if(x<=200)
  {
    amount=(0.5*x);
  }
  else if(x>200&&x<=400)
  {
    amount=(0.65*x)+100;
  }
  else if(x>400&&x<=600)
  {
    amount=(0.8*x)+200;
  }
  else
  {
    amount=(1.25*x)+425;
  }
  cout<<"Rs."<<amount;
}
      
 
#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float m;
  int p,d;
  cin>>m>>p>>d;
  int distance=int(m)*p;
  if(distance>d)
  {
    cout<<"Can reach";
  }
  else
  {
    cout<<"Cannot reach";
  }
  
}
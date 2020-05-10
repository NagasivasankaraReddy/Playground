#include<bits/stdc++.h> 

using namespace std;
int main()
{
  //Type your code here.
  int a;
  float b;
  cin>>a>>b;
  switch(a)
  {
    case 1:
      cout<<b*1<<setprecision(2);
      break;
    case 2:
      cout<<b*1.5<<setprecision(2);
      break;
    case 3:
      cout<<b*2.0<<setprecision(2);
      break;
    default:
      cout<<"Number of items is more";
  }
      
}
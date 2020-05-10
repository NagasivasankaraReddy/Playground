#include<iostream>
using namespace std;
int main()
{
  int x,y,z;
  cin>>x>>y>>z;
  int a=(x*y);
  if(z>x && z<=2*x)
  {
    cout<<"It is a mango tree";
  }
  else if(z>(a-2*x)&&z<=(a-x))
    {
      cout<<"It is a mango tree";
    }
  else
  {
    cout<<"It is not a mango tree";
  }

  //Type your code here.
}
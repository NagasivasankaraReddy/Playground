#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c;
  cin>>a>>b>>c;
  int total_weight=((b*75)+(c*30));
  if(a>=total_weight)
  {
    cout<<"Boat is stable";
  }
  else
  {
    cout<<"Boat will drow";
  }

  
}
#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d;
  cin>>a>>b>>c>>d;
  int dollar=a+c;
  int cent=b+d;
  if(cent%100>=1)
  {
    dollar=dollar+(cent/100);
    cent=cent%100;
  }
  std::cout<<dollar<<endl;
  std::cout<<cent;
  
}
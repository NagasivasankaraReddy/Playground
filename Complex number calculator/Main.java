
#include <iostream>
using namespace std;
struct Distance{
  int f;
  float i;
}d1 , d2, sum;
int main()
{
  int n;
  cin>>n;
  std::cin >> d1.f;
  std::cin >> d1.i;
  std::cin >> d2.f;
  std::cin >> d2.i;
  if(n==1)
  {
  sum.f = d1.f+d2.f;
  sum.i = d1.i+d2.i;
    if(sum.i>=0)
    cout<<sum.f<<"+"<<sum.i<<"i";
    else
       cout<<sum.f<<sum.i<<"i";
  }
  else if(n==2)
  {
    sum.f = d1.f-d2.f;
  sum.i = d1.i-d2.i;
    if(sum.i>=0)
    cout<<sum.f<<"+"<<sum.i<<"i";
    else
       cout<<sum.f<<sum.i<<"i";
  }
  else if(n==3)
  {
    sum.f = (d1.f*d2.f)-(d1.i*d2.i);
  sum.i = (d1.f*d2.i)+(d1.i*d2.i);
    if(sum.i>=0)
    cout<<sum.f<<"+"<<sum.i<<"i";
    else
       cout<<sum.f<<sum.i<<"i";
  }
  else
  {
    cout<<"Invalid choice";
  }
}
    
    
    
  

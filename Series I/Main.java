#include<iostream>
using namespace std;
#include<math.h>
int main()
{
  int n;
  cin>>n;
  float i=0.5;
  int j=0;
  while(n>0)
  {
    cout<<i<<" ";
    i=i+pow(3,j);
    j++;
    n--;
  }
}
#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int i=6;
  int j=5;
  int k=1;
  while(n>0)
  {
    cout<<i<<" ";
    i=i+(k*j);
    k++;
    n--;
  }
}
  
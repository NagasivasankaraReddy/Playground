#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m;
  cin>>n>>m;
  int a[n];
  int sum=0;
  int tr=0;
  for(int i=0;i<n;i++)
    cin>>a[i];
  for(int i=0;i<n;i++)
  {
    sum=sum+a[i];
    if(sum>m)
    {
      tr=1;
      break;
    }
  }
  if(tr==1)
    cout<<"NO";
  else
    cout<<"YES";
  
}
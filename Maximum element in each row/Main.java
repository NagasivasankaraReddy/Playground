#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m;
  cin>>n>>m;
  int a[n][m];

  for(int i=0;i<n;i++)
  {
    for(int j=0;j<m;j++)
    {
    cin>>a[i][j];
    }
  }
  int temp;
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<m-1;j++)
    {
    if(a[i][j]>a[i][j+1])
    {
       temp=a[i][j];
       a[i][j]=a[i][j+1];
       a[i][j+1]=temp;
    }
    }
    
  }
 for(int i=0;i<n;i++)
    {
      cout<<a[i][m-1]<<"\n";
    }
  
  
 

}
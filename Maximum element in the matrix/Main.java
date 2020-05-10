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
  for(int j=0;j<m;j++)
  {
    for(int i=0;i<n-1;i++)
    {
      if(a[i][j]>a[i+1][j])
      {
        temp=a[i][j];
        a[i][j]=a[i+1][j];
        a[i+1][j]=temp;
      }
           
    
    }
  }
  for(int j=0;j<m-1;j++)
  {
    int i=n-1;
      if(a[i][j]>a[i][j+1])
      {
        temp=a[i][j];
        a[i][j]=a[i][j+1];
        a[i][j+1]=temp;
      }
           
    
    }
  
  cout<<"The maximum element is "<<a[n-1][m-1];
}
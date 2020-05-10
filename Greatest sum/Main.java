#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m;
  cin>>n>>m;
  int a[n][m];
  int b[n][m];
  int sum[n][m];
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<m;j++)
    {
    cin>>a[i][j];
    }
  }
  int sum1[n];
  int sum2[m];
  
  for(int i=0;i<n;i++)
  {
    int suma=0;
    for(int j=0;j<m;j++)
    {
     suma=suma+a[i][j];
    }
    sum1[i]=suma;
  }
  for(int j=0;j<m;j++)
  {
    int sumb=0;
    for(int i=0;i<n;i++)
    {
     sumb=sumb+a[i][j];
    }
    sum2[j]=sumb;
  }
    cout<<"Sum of rows is ";
    
  for(int i=0;i<n;i++)
  {
  cout<<sum1[i]<<" ";
  }
  cout<<"\n";
  int maxsum=0;
  int idx;
  for(int i=0;i<n;i++)
  {
    
    if(sum1[i]>maxsum)
    {
      maxsum=sum1[i];
      idx=i;
    }
  }
  cout<<"Row "<<idx+1<<" has maximum sum"<<"\n";
  
    
    int maxsum1=0;
  int idx1;
  cout<<"Sum of columns is ";
  
  for(int j=0;j<m;j++)
  {
    cout<<sum2[j]<<" ";
  }
  cout<<"\n";
  for(int j=0;j<m;j++)
  {
    
    if(sum2[j]>maxsum1)
    {
      maxsum1=sum2[j];
      idx1=j;
    }
  }
  cout<<"Column "<<idx1+1<<" has maximum sum";
  
  
  
}
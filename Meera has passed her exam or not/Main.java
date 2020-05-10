#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  int passed;
  int mark;
    cin>>mark;
  for(int i=0;i<n;i++)
  {
    if(mark==arr[i])
    {
     
      passed=1;
      
      break;
    }
  }
  if(passed==1)
  {
     cout<<"She passed her exam";
  }
  else
  {
    cout<<"She failed";
  }
  
    
  
}
  

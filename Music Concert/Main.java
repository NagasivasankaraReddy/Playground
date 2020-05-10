#include<iostream>
using namespace std;

int main(){
  // Type your code here
  int n;
  cin>>n;
  int arr[n];
  int count=0;
  int count1=0;
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  for(int i=0;i<n;i++)
  {
    if(arr[i]%2==0)
    {
      count++;
    }
    else
    {
      count1++;
    }
  }
  std::cout<<count1<<endl;
  std::cout<<count<<endl;
  return 0;
}
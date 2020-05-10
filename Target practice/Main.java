#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int a;
  int sum=0;
  int count=0;
  do
  {
    cin>>a;
    sum=sum+a;
    count++;
    
    
  }while(sum<n);
  std::cout<<"The number of turns is "<<count;
      
 
}
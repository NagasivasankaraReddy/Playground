#include <iostream>
using namespace std;
int main() 
{
	// Type your code here
  int n;
  cin>>n;
  while(n>0)
  {
    int a=0;
    a=n%10;
    if(a>0)
    {
      std::cout<<a;
    }
    
    n=n/10;
  }
  
      
	return 0;
}
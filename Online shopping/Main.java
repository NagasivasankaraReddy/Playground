#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int f1,f2,f3;
  int s1,s2,s3;
  int a1,a2,a3;
  cin>>f1>>f2>>f3>>s1>>s2>>s3>>a1>>a2>>a3;
  int flipkart=(f1-(f1*(float(f2)/100)))+f3;
  int snapdeal=(s1-(s1*(float(s2)/100)))+s3;
  int amazon=(a1-(a1*(float(a2)/100)))+a3;
  std::cout<<"In Flipkart Rs."<<flipkart<<endl;
  std::cout<<"In Snapdeal Rs."<<snapdeal<<endl;
  std::cout<<"In Amazon Rs."<<amazon<<endl;
  if(flipkart<=snapdeal&&flipkart<=amazon)
  {
    std::cout<<"He will prefer Flipkart";
  }
  else if(snapdeal<=amazon)
  {
    std::cout<<"He will prefer Snapdeal";
  }
  else
  {
    std::cout<<"He will prefer Amazon";
  }
    
    
  
}
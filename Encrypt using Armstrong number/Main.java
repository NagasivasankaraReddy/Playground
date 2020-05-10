#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
  int i,j;
  int count=0;
  int sum=0;
  int temp=n;;
  int fin=temp;
  while(n>0)
  {
    n=n/10;
    count++;
  }
  while(temp>0)
  {
    sum=sum+power((temp%10),count);
    temp=temp/10;
  }
  if(sum==fin)
    return true;
  else
    return false;
  
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}
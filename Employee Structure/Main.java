
#include <iostream>
#include<string.h>
using namespace std;
struct student{
  char name[30]; 
  int id;
  int age; 
  char designation[30]; 
  float salary;; 
};
int main()
{
  int n;
  student s;
  cout<<"Enter name:\n\
Enter ID:\n\
Enter age:\n\
Enter designation:\n\
Enter Salary:\n";
 
    
   cin>>s.name;
    cin>>s.id;
    cin>>s.age;
    cin>>s.designation;
  cin>>s.salary;
  
 
 
  cout<<"Employee Details\n";
  
    cout<<"Name of the Employee : "<<s.name<<"\n";
     cout<<"ID of the Employee : "<<s.id<<"\n";
     cout<<"Age of the Employee : "<<s.age<<"\n";
     cout<<"Designation of the Employee : "<<s.designation<<"\n";
    cout<<"Salary of the Employee : "<<s.salary;
    
   
  
  
    
    
    
    
    
  
}
#include <stdio.h>
#include <string.h>
#include <stdbool.h>
#include <limits.h>
#include <math.h>

// int main()
// {
//     float p=100;
//     float r=10;
//     float t=2;
//     printf("%f",(p*r*t)/100);
//     return 0;
// }

// int main(int argc, char const *argv[])
// {
//     float x;
//     printf("Enter the radius : ");
//     scanf("%f",&x);
//     float y=3.14*x*x;
//     printf("The area of circle is : %f",y);
//     return 0;
// }

// int main(int argc, char const *argv[])
// {
//      int x;
//      int y;
//     printf("Enter you first number : ");
//     scanf("%d",&x);
//     printf("Enter you second number : ");
//     scanf("%d",&y);
//     int z=x+y;
//     printf("sum of two number is : %d",z);
//     return 0;
// }

// int main(int argc, char const *argv[])
// {
// int p;
// int q;
// printf("Enter values of p and q : ");
// scanf("%d %d",&p,&q);
// printf("p=%d,q=%d",p,q);
// return 0;
// }

// int main(int argc, char const *argv[])
// {
//     int a;
//     int b;
//     printf("Enter the number a : ");
//     scanf("%d",&a);
//     printf("Enter the number b : ");
//     scanf("%d",&b);
//     int q=a/b;
//     int z =  a-b*q;
//     printf("%d",z);
//     printf("the remainder when %d id divided by %d is : %d",a,b,z);
//     return 0;
// }

// #include <stdio.h>
// int main()
// {
//     float x;
//     printf("\nEnter the franction part : ");
//     scanf("%f",&x);
//     int z = x;
//     float a = x-z;
//     printf("\nfraction part is : %f",a);
//     return 0;
// }

// int main(){
//     char ch='A';
//     printf("%d",ch);
//     return 0;
// }

// int main(){
//     int x;
//     printf("Enter the number : ");
//     scanf("%d",&x);
//     if(x%2==0){
//         printf("The Number is even");
//     }
//     else
//     {
//         printf("The number is odd");
//     }
//     return 0;
// }

// int main(){
//     int x ;
//     printf("enter the year : ");
//     scanf("%d",&x);
//     if(x%400==0 && x%4==0){
//         printf("%d is a leap year",x);
//     }
//     else{
//         printf("%d is not  leap year",x);
//     }
//     return 0;
// }

// int main(){
//     int cp;
//     int sp;
//     printf("enter the cp : ");
//     scanf("%d",&cp);
//     printf("enter the sp : ");
//     scanf("%d",&sp);
//     if(cp<sp){
//         printf("you profit");
//     }
//     else if(cp==sp){
//         printf("No profit,no loss");
//     }
//     else{
//         printf("You loss");
//     }
// }

// int main(){
//     int x;
//     int y;
//     int z;
//     printf("enter three number : ");
//     scanf("%d %d %d",&x, &y, &z);
//     if(x>y && x>z){
//         printf("%d is greater then %d %d ",x,y,z);
//     }
//     else if (y>x && y>z){
//         printf("%d is greater then %d %d ",y,x,z);
//     }
//     else{
//         printf("%d is greater then %d %d ",z,x,y);
//     }
//     return 0;
// }

// int main(){
//     int x,y,z;
//     printf("Enter three sides : ");
//     scanf("%d %d %d",&x,&y,&z);
//     if(x*x==y*y+z*z || y*y==x*x+z*z || z*z==y*y+x*x){
//         printf("Is's right triangle");
//     }
//     else{
//         printf("Is's not a right triangle");
//     }
//     return 0;
// }

// int main(){
//     int x,y,z;
//     printf("Enter three number : ");
//     scanf("%d %d %d",&x ,&y ,&z);
//     if(x>y){
//         if(x>z){
//             printf("%d is greter ",x);
//         }
//         else{
//             printf("%d is greater ",z);
//         }
//     }
//     else{
//         if (y>z)
//         {
//         printf("%d is greter ",y);
//         }
//         else{
//             printf("%d is greter ",z);
//         }
//     }
//     return 0;
// }

// int main(){
//     int n;
//     if(n==0)
//         printf("W");
// }
// ternary operator
//  int main(){
//      int n=0;
//      n%2==0 ? printf("true") : printf("false") ;
//  }

// int main(){
//     int x;
//     printf("Enter your number : ");
//     scanf("%d",&x);
//     for (int i=1;i<=2*x-1;i=i+2){
//         printf("\n %d",i);
//     }
// }

// int main(){
//     int x;
//     printf("Enter your number : ");
//     scanf("%d",&x);
//     for(int i=4; i<=3*x+1;i=i+3){
//         printf("\n%d",i);
//     }
// }

// int main(){
//     int x;
//     int a;
//     printf("Enter a number : ");
//     scanf("%d",&x);
//     for(int i=1;i<=x;i++){
//         printf("%d",a);
//         a=a*2;
//     }
//     return 0;
// }

// int main(){
//     int x;
//     int a=3;
//     printf("Enter your Number : ");
//     scanf("%d",&x);
//     for(int i=1;i<=x;i++){
//         printf("\n%d",a);
//         a=a*4;
//     }
// }

// int main(){
//     int x;
//     for(int i=100;i>=0;i=i-3){
//         printf("\n%d",i);
//     }
//     return 0;
// }

// int main(){
//     int a=0,x;
//     printf("Enter number to check for prime : ");
//     scanf("%d",&x);
//     for(int i=2; i<=x-1; i++){
//         if(x%i==0){
//             a=1;
//             break;
//         }
//     }
//     if (x==1){
//         printf("\n%d is neither prime nor composite number \n",x);
//     }
//     else if(a==0){
//         printf("\n%d is number is prime\n",x);
//     }
//     else{
//         printf("\n%d is number is composite\n",x);
//     }
//     return 0;
// }

// int main(){
//     int i=1;
//     while(i<=10)
//     {
//         printf("\n%d",i);
//         i++;
//     }
//     return 0;
// }

// int main(){
//     int x = 4, y = 0, z;
//     while (x >= 0){
//         if (x == y){
//             break;;
//         }
//         else{
//             printf("\n%d%d", x, y);
//             x--;
//             y++;
//         }
//     }
// }

// int main(){
//     int i=10;
//     do{
//         printf("Hello");
//         i++;
//     }while(i<10);
//     printf("\n%d",i);
//     return 0;
// }

// int main(){
//     int x,b=0;
//     printf("\nEnter your number : ");
//     scanf("%d",&x);
//     while(x!=0){
//         x=x/10;
//         b=b+1;
//     }
//     printf("total digit are : %d\n",b);
//     return 0 ;
// }

// int main(){
//     int lastdigit=0,x;
//     int sum=0;
//     printf("\nEnter your number : ");
//     scanf("%d",&x);
//     int i=1;
//     while(i<=x){
//         lastdigit=i;
//         sum+=lastdigit;
//         i++;
//     }
//     printf("Sum of number is : %d",sum);
// }

// int main(){
//     int x;
//     printf("Enter your number : ");
//     scanf("%d", &x);
//     int lastdigit = 0;
//     int sum = 0;
//     while (x != 0){
//         lastdigit = x % 10;
//         if (lastdigit % 2 == 0){
//             sum = sum + lastdigit;
//             x = x / 10;
//         }
//         else{
//             x = x / 10;
//             continue;
//         }
//     }
//     printf("The sum of all the digits are : %d",sum);
//     return 0;
// }

// unsolved need more experience
// int main(){
//     int x;
//     printf("Enter number to reverse : ");
//     scanf("%d",&x);
//     int x1=x,lastdigit=0,store[10];
//     while(x!=0){
//         lastdigit=x%10;
//         int store[lastdigit];
//         x=x/10;
//     }
//     size_t size = sizeof(store);
//     printf("%d",size);
//     printf("The reveser of %d is ",x1);
//     int i=0;
//     while (i>=size){
//         i++;
//         printf("%d",store[i]);
//     }
//     return 0;
// }

// int main(){
//     int x;
//     printf("Enter number to reverse : ");
//     scanf("%d",&x);
//     int x1=x;
//     int n,r=0;
//     while(x>0){
//         r=r*10;
//         r=r+(x%10);
//         x=x/10;
//     }
//     printf("\nThe reverse of %d is %d\n",x1,r);
//     return 0;
// }

// int main()
// {
//     int x, sum = 0, lastdigit = 0;
//     printf("Enter the nth term : ");
//     scanf("%d", &x);
//     for (int i = 1; i <= x; i++)
//     {
//         if (i % 2 != 0)
//         {
//             sum = sum + i;
//         }
//         else
//         {
//             sum = sum - i;
//         }
//     }
//     printf("The sum of %d term is : %d", x, sum);
//     return 0;
// }

// int main(){
//     int x,s=1,lastdigit=1;
//     printf("Enter your number : ");
//     scanf("%d",&x);
//     for (int i=1;i<=x;i++){
//         s=s*i;

//     }
//     printf("Fctorial of %d is %d",x,s);
//     return 0;

// }

// int main(){
//     int x,product=1,lastnumber=1;
//     printf("Enter your number : ");
//     scanf("%d",&x);
//     for(int i=1; i<=x; i++){
//         product=product+i;
//     }
// }

// int main(){
//     int n;
//     printf("Enter Your number : ");
//     scanf("%d",&n);
//     int a = 1;
//     int b=1;
//     int sum = 0;
//     for(int i=1; i<=n-2; i++){
//         sum=a+b;
//         a=b;
//         b=sum;
//     }
//     printf("%d",sum);
//     return 0;
// }

// int main()
// {
//     int number, power, x = 0, j = 1;
//     printf("Enter your number : ");
//     scanf("%d", &number);
//     printf("Enter your power : ");
//     scanf(" %d", &power);
//     for (int i = 1; i <= power; i++)
//     {
//         x = number * j;
//         j = x;
//         printf("\nanswer is : %d", x);
//     }
//     return 0;
// }

// int main()
// {
//     for (int i = 65; i <= 90; i++)
//     {
//         char ch = (char)i;
//         printf("\nASCII values of %c is %d", ch, i);
//     }
//     return 0;
// }

// int main(){
//     for(int i = 1; i <= 500; i++){
//         if (i>0 && i<10){
//             int b=i*i*i;
//         }
//     }
// }

/// patarn problems

// int main(){
//     for(int i=4;i>=1;i--){
//         for(int j=1;j<=i;j++){
//             printf("*");
//         }
//         printf("\n");
//     }
//     return 0;
// }

// int main()
// {
//     for (int i = 1; i <= 5; i++)
//     {
//         for (int j = 1; j <= 5-i; j++)
//         {
//             printf("*");
//         }
//         printf("\n");
//     }
//     return 0;
// }

// int main(){
//     int n;
//     printf("Enter your number : ");
//     scanf("%d",&n);
//     for(int i=1;i<=n;i++){
//         int a = 1;
//         for(int j=1; j<=i; j++){
//             printf("%d ",a);
//             a=a+2;
//         }
//         printf("\n");
//     }
//     return 0;
// }

// int main()
// {
//     int n;
//     printf("Enter the number of coloum : ");
//     scanf("%d", &n);
//     for (int i = 1; i <= n; i++)
//     {
//         for (int j = 65; j <= 65 + (n-1); j++)
//         {
//             char ch = (char)j;
//             printf("%c", ch);
//         }
//         printf("\n");
//     }
//     return 0;
// }

// int main()
// {
//     int n;
//     printf("Enter the number of coloum : ");
//     scanf("%d", &n);
//     for (int i = 1; i <= n; i++)
//     {
//         for (int j = 65; j <= i+64; j++)
//         {
//             if(i%2!=0){
//                 printf("%d",j-64);
//             }
//             else{
//                 char ch = (char)j;
//                 printf("%c", ch);
//             }
//         }
//         printf("\n");
//     }
//     return 0;
// }

// int main(){
//     int n;
//     printf("Enter the Number of row : ");
//     scanf("%d",&n);
//     for(int i=1; i<=n; i++){
//         for(int j=1; j<=n+2; j++){
//             if(i==1 || i==n || j==1 || j==n+2){
//                 printf("* ");
//             }
//             else{
//                 printf("  ");
//             }
//         }
//         printf("\n");
//     }
//     return 0;
// }

// int main()
// {
//     int n;
//     printf("Enter your number of row/coloum : ");
//     scanf("%d", &n);
//     for (int i = 1; i <= n; i++)
//     {
//         for (int j = 1; j <= n; j++)
//         {
//             if (i == j || j + i == n + 1)
//             {
//                 printf("*");
//             }
//             else
//             {
//                 printf(" ");
//             }
//         }
//         printf("\n");
//     }
//     return 0;
// }

// int main()
// {
//     int n;
//     printf("Enter the number of rows : ");
//     scanf("%d", &n);
//     int a=1;
//     for (int i = 1; i <= n; i++)
//     {
//         for (int j = 1; j <= i; j++)
//         {
//             printf("%d",a);
//             a++;
//         }
//         printf("\n");
//     }
//     return 0;
// }

// int main()
// {
//     int n, a;
//     printf("enter the number of rows : ");
//     scanf("%d", &n);
//     for (int i = 1; i <= n; i++)
//     {
//         if (i % 2 != 0)
//             a = 1;
//         else
//             a = 0;
//         for (int j = 1; j <= i; j++)
//         {

//             printf("%d", a);
//             if (a == 1)
//                 a = 0;
//             else
//                 a = 1;
//         }
//         printf("\n");
//     }
//     return 0;
// }

// int main()
// {
//     int n;
//     printf("Enter the number of rows : ");
//     scanf("%d",&n);
//     for (int i = 1; i <=n; i++)
//     {
//         for(int j=1;j<=n-i;j++){
//             printf(" ");
//         }
//         for(int k=1;k<=i;k++){
//             printf("*");
//         }
//         printf("\n");
//     }
//     return 0;
// }

// int main()
// {
//     int n;
//     printf("Enter the number of rows : ");
//     scanf("%d",&n);
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//             printf(" ");
//         }
//         for(int k=1;k<=n;k++){
//             printf("*");
//         }
//         printf("\n");
//     }
//     return 0;
// }

// int main()
// {
//     int n;
//     printf("Enter the number of rows : ");
//     scanf("%d",&n);
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//             printf(" ");
//         }
//         for(int k=65;k<=64+i;k++){
//             char ch= (char)k;
//             printf("%c",ch);
//         }
//         printf("\n");
//     }
//     return 0;
// }

// int main(){
//     int n;
//     printf("Enter the number of rows : ");
//     scanf("%d",&n);
//     for (int i=1;i<=n;i++){
//         for (int j=1;j<=n+1-i;j++){
//             printf(" ");
//         }
//         for(int k=1;k<=2*i-1;k++){
//             printf("*");
//         }
//         printf("\n");
//     }
//     return 0;
// }

// int main(){
//     int n;
//     printf("Enter the number of rows : ");
//     scanf("%d",&n);
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//             printf(" ");
//         }
//         for(int j=1;j<=2*i-1;j++){
//             printf("%d",j);
//         }
//         printf("\n");
//     }
//     return 0;
// }

// int main(){
//     int n,a=1;
//     printf("Enter the number of rows : ");
//     scanf("%d",&n);
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//             printf(" ");
//         }
//         for(int j=65;j<=(2*i-1)+64;j++){
//             char ch=(char)j;
//             printf("%c",ch);
//         }
//         printf("\n");
//     }
//     return 0;
// }

// int main(){
//     int n,a=0;
//     printf("Enter the number of rows : ");
//     scanf("%d",&n);
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//             printf(" ");
//         }
//         for(int k=1;k<=i;k++){
//             printf("%d",k);
//         }
//         for(int l=i-1;l>=1;l--){
//             printf("%d",l);
//         }
//         printf("\n");
//     }
//     return 0;
// }

// int main(){
//     int n;
//     printf("Enter the number of rows : ");
//     scanf("%d",&n);
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//             printf(" ");
//         }
//         for(int k=65;k<=i+64;k++){
//             char ch=(char)k;
//             printf("%c",ch);
//         }
//         for(int l=i-1+64;l>=65;l--){
//             char ch=(char)l;
//             printf("%c",ch);
//         }
//         printf("\n");
//     }
//     return 0;
// }

//

// int main(){
//     int n;
//     printf("Enter the number of rows : ");
//     scanf("%d",&n);
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i+1;j++){
//             printf("*");
//         }
//         for(int k=1;k<=2*i-3;k++){
//             printf(" ");
//         }
//         for(int j=1;j<=n-i+1;j++){
//             printf("*");
//         }
//         printf("\n");
//     }
//     return 0;
// }

// int main(){
//     int n;
//     printf("Enter the numebr of rows : ");
//     scanf("%d",&n);
//     for (int i=1;i<=n;i++){
//         int a=0;
//         for(int j=1;j<=n-i+1;j++){
//             printf("%d",j);
//         }
//         for(int k=2;k<=2*i-2;k++){
//             printf(" ");
//         }
//         for(int l=5;l<=n+5-i;l++){
//             printf("%d",l);
//         }
//         printf("\n");
//     }
//     return 8;
// }

// void greet(){
//     char n[50];
//     printf("Enter your name : ");
//     fgets(n,sizeof(n),stdin);
//     printf("Hi %s How Are You ?",n);
// }
// int main(){
//     greet();
//     return 0;
// }

// int factorial(int x){
//     int fact=1;
//     for(int i=2;i<=x;i++){
//         fact=fact*i;
//     }
//     return fact;
// }
// int combination(int n,int r){
//     int ncr=factorial(n)/(factorial(r)*factorial(n-1));
//     return ncr;
// }
// int main(){
//     int n;
//     printf("Enter the number of rows : ");
//     scanf("%d ",&n);
//     for(int i=0;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//             printf(" ");
//         }
//         for(int k=0;k<=i;k++){
//             int icj = combination(i,k);
//             printf("%d ",icj);
//         }
//         printf("\n");
//     }
//     return 0;
// }

// int main(){
//     int a=8;
//     int b=9;
//     int* x=&b;
//     printf("%p",&a);
//     printf("\n%p",&b);
//     printf("\n%d",*x);
//     return 0;
// }

// void rverse_number(int n){
//     printf("%d \n",n);
//     if (n==1) return;
//     rverse_number(n-1);
// }
// int main(){
//     int x;
//     printf("Enter the number to reverse : ");
//     scanf("%d",&x);
//     rverse_number(x);
//     return 0;
// }

// int factorial(int n){
//     if (n<=1) return 1;
//     return n*factorial(n-1);
// }

// int main(){
//     int x,facto=1;
//     int y=1;
//     printf("Enter the number : ");
//     scanf("%d",&x);
//     int fact = factorial(x);
//     printf("factorial of %d is : %d",x,fact);
//     return 0;
// }

// int function(int n){
//     if (n==0) return;
//     printf("%d\n",n);
//     function(n-1);
//     printf("%d\n",n);
//     return;
// }

// int main(){
//     int x;
//     printf("enter your number : ");
//     scanf("%d",&x);
//     function(x);
//     return 0;
// }

// void increasing (int p,int n){
//     if(p>n) return;
//     printf("%d\n",p);
//     increasing(p+1,n);
//     return;
// }
// int main(){
//     int x;
//     printf("Enter your number : ");
//     scanf("%d",&x);
//     increasing(1,x);
//     return 0;
// }

// void sum(int x, int s){
//     if(x==0){
//         printf("%d",s);
//         return;
//     }
//     sum(x-1,s+x);
//     return;
//     }

// int main(){
//     int x;
//     printf("enter the number for sum : ");
//     scanf("%d",&x);
//     sum(x,0);
//     return 0;
// }

// void sum(int x){
//     if (x==0){
//         printf("%d",n);
//         return;
//     }
//     int n=x+sum(x-1);
//     return;
// }
// int main(){
//     int x;
//     printf("enter the number : ");
//     scanf("%d",&x);
//     sum(x);
//     return 0;
// }

// int power(int p,int b){
//     if (p==0 || p==1) return;
//     int in =b*power(p-1,b);
//     return in;
// }

// int main(){
//     int p,b;
//     printf("enter the power : ");
//     scanf("%d",&p);
//     printf("enter the base : ");
//     scanf("%d",&b);
//     int m=power(p,b);
//     printf("%d",m);
//     return 0;
// }

// int fabbo(int x){
//     if (x<=2) return 1;
//     int a=fabbo(x-1);
//     int b=fabbo(x-2);
//     return a+b;
// }
// int main(){
//     int x;
//     printf("enter the term : ");
//     scanf("%d",&x);
//     printf("%d",fabbo(x));
//     return 0;
// }

// int powerlog(int x,int y){
//     if (y==0) return y;
//     int a=x*powerlog(x,y\2);
//     if y%2==0{
//         return a*a;
//     }
//     else{
//         a*a*x;
//     }
// }

// int main(){
//     int b,p;
//     printf("Enter the base : ");
//     scanf("%d",&b);
//     printf("Enter the power : ");
//     scanf("%d",&p);
//     powerlog(b,p);
//     return 0;
// }

// int maze(int n, int m){
//     int rightways = 0;
//     int downways = 0;
//     if (n==1){
//         rightways += maze(n,m-1);
//     }
//     if (m==1){
//         downways += maze(n-1,m);
//     }
//     if (n==1 && m==1){
//         return 1;
//     }
//     if (n>1 && m<1){
//         rightways += maze(n,m-1);
//         downways += maze(n-1,m);
//     }
//     int total = rightways + downways;
//     return total;
// }

// int main(){
//     int n;
//     printf("Enter the total rows : ");
//     scanf("%d",&n);
//     int m;
//     printf("Enter the total colomns : ");
//     scanf("%d",&m);
//     int noOfWays = maze(n,m);
//     printf("%d",noOfWays);
//     return 0;
// }

// int main(){
//     int x;
//     printf("what is your name : ");
//     scanf("%c",&x);
//     printf("Hello %c how are you...",x);
//     return 0;
// }

// #include<stdio.h>
// int main(){
//     int a[500]={3,7,2,8,3};
//     a[2]=10;
//     printf("%d",a[2]);
//     return 0;
// }

// int main(){
//     int a[5];
//     for (int i=0; i<=4; i++){
//         printf("\nEnter the number of %d ",i+1);
//         scanf("%d",&a[i]);
//     }
//     for (int i=0; i<5; i++){
//         printf("%d",a[i]);
//     }
//     return 0;
// }

// int main(){
//     int a[5]={50,30,45,55,93};
//     for (int i=0; i<5; i++){
//         if (a[i]<40){
//             printf("%d",i);
//         }
//     }
//     return 0;

// }

// int main(){
//     int a[5]={50,30,34,56,34};
//     for (int i=4; i>=0; i--){
//         printf("%d\n",a[i]);
//     }
//     return 0;
// }

// int main(){
//     int a[5]={50,11,34,56,78};
//     for(int i=0; i<=4; i++){
//         printf("%p\n",i);
//     }
//     return 0;
// }

// int main(){
//     int i,a=2,b=3;
//     int arr[5];
//     for(int i=0; i<a+b; i++){
//         scanf("%d",&arr[i]);
//         printf("\n%d",arr[i]);
//     }
//     return 0;
// }

// int main(){
//     int lastdigit=0,sum=0,a[5]={2,3,5,2,6};
//     for(int i=0; i<=4; i++){
//         lastdigit = a[i];
//         sum=sum+lastdigit;
// }
//     printf("the sum of all the numbers are : %d",sum);
//     return 0;
// }

// int main(){
//     int max=0,lastdigit=0,a[5]={46,54,67,87,500};
//     for (int i=0; i<=4; i++){
//         lastdigit=a[i];
//         if (max<=lastdigit){
//             max=lastdigit;
//         }
//     }
//     printf("%d",max);
//     return 0;
// }

// int main()
// {
//     int n;
//     printf("Enter the index of array : ");
//     scanf("%d", &n);
//     int a[n];
//     for (int i = 0; i < n; i++)
//     {
//         printf("Enter the %d araay : ", i);
//         scanf("%d", &a[i]);
//     }
//     printf("previous number : ");
//     for (int j = 0; j < n; j++)
//     {
//         printf("%d ", a[j]);
//     }
//     printf("\n");
//     for (int h = 0; h < n; h++)
//     {
//         if (h % 2 == 0)
//         {
//             a[h] += 10;
//         }
//         else
//         {
//             a[h] *= 2;
//         }
//     }
//     printf("Updated number : ");
//     for (int p = 0; p < n; p++)
//     {
//         printf("%d ", a[p]);
//     }
//     return 0;
// }

// int main(){
//     int count=0,a[5]={23,45,43,67,34};
//     for (int i=0; i<5; i++){
//         if (a[i]>35) {
//             count+=1;
//             printf("%d ",a[i]);
//         }
//     }
//     return 0;
// }

// int main()
// {
//     int x = 10, a[5] = {5, 3, 5, 8, 2};
//     for (int i = 0; i < 5; i++)
//     {
//         for (int j = i + 1; j < 5; j++)
//         {
//             if (x == a[i] + a[j])
//             {
//                 printf("(%d,%d)\n", a[i], a[j]);
//             }
//         }
//     }
//     return 0;
// }

// int main()
// {
//     int x = 16, a[7] = {5, 3, 4, 8, 2, 6, 4};
//     for (int i = 0; i < 7; i++)
//     {
//         for (int j = i + 1; j < 7; j++)
//         {
//             for (int h = i + 1; h < 7; h++)
//             {
//                 if (x == a[i] + a[j] + a[h])
//                 {
//                     printf("(%d,%d,%d)\n", a[i], a[j], a[h]);
//                 }
//             }
//         }
//     }
//     return 0;
// }

// int main(){
//     int b[5],a[5]={23,5,2,5,3};
//     for(int i=0; i<=4; i++){
//         b[i]=a[4-i];
//     }
//     for(int j=0; j<=4; j++){
//         printf("%d ",a[j]);
//     }
//     printf("\n");
//     for(int h=0; h<=4; h++){
//         printf("%d ",b[h]);
//     }
//     return 0;
// }

// int main(){
//     int x,a[10]={4,5,7,2,8,4,77,3,6,4};
//     for (int i=0; i<=9; i++){
//         for(int j=i+1; j<=9; j++){
//             if (a[i]==a[j]){
//                 x=a[i];
//             }
//         }
//     }
//     printf("%d ",x);
//     return 0;
// }

// #include <stdbool.h>
// int main(){
//     int x,a[10]={1,2,3,4,5,4,3,2,1,2};
//     for (int i=0; i<=9; i++){
//         bool flag = false;
//         for(int j=i+1; j<=9; j++){
//             if (a[i]==a[j]){
//                 flag = true;
//             }
//         }
//         if (flag==false){
//             printf("%d ",a[i]);
//             break;
//         }
//     }
//     return 0;
// }

// int main(){
//     int r;
//     printf("enter the number of rows : ");
//     scanf("%d",&r);
//     int c;
//     printf("enter the number of coloum : ");
//     scanf("%d",&c);
//     int a[r][c];
//     for(int i=0; i<r; i++){
//         for(int j=0; j<c; j++){
//             printf("enter your matrix for (%d,%d) : ",i,j);
//             scanf("%d",&a[i][j]);
//         }
//         printf("\n");
//     }
//     printf("\n");
//     for (int h=0; h<r; h++){
//         for(int g=0; g<c; g++){
//             printf("%d ",a[h][g]);
//         }
//         printf("\n");
//     }
//     return 0;
// }

// int main(){
//     int r,m,a[4][2];
//     int rows;
//     printf("Enter the number of rows : ");
//     scanf("%d",&rows);
//     for (int i=0; i<rows; i++){
//         for(int j=0; j<3; j++){
//             printf("Enter the roll number : ");
//             scanf("%d",&a[i]);
//             printf("Enter the %d markhs : ",j+1);
//             scanf("%d",&a[i][j]);
//         }
//         printf("\n");
//     }
//     printf("\n");
//     for(int k=0; k<4; k++){
//         for(int l=0; l<2; l++){
//             printf("%d ",a[k][l]);
//         }
//         printf("\n");
//     }
//     return 0;
// }

// int main(){
//     int ten,a[5][5];
//     for (int i=0; i<5; i++){
//         for(int j=0; j<5; j++){
//             printf("Enter 10 : ");
//             scanf("%d",&a[i][j]);
//         }
//         printf("\n");
//     }
//     printf("\n");
//     for(int h=0; h<5; h++){
//         for(int m=0; m<5; m++){
//             printf("%d ",a[h][m]);
//         }
//         printf("\n");
//     }
//     return 0;
// }

// int main()
// {
//     int a[2][2] = {{2, 3}, {4, 5}};
//     int b[2][2] = {{2, 3}, {4, 5}};
//     int c[2][2];
//     for (int i = 0; i < 2; i++)
//     {
//         for (int j = 0; j < 2; j++)
//         {
//             c[i][j] = a[i][j] + b[i][j];
//         }
//     }
//     printf("\n");
//     for (int h = 0; h < 2; h++)
//     {
//         for (int k = 0; k < 2; k++)
//         {
//             printf("%d ", c[h][k]);
//         }
//         printf("\n");
//     }
//     return 0;
// }

// int main(){
//     int sum=0,a[3][2]={{4,22},{2,2},{1,1}};
//     for(int i=0; i<3; i++){
//         for(int j=0; j<2; j++){
//             sum+=a[i][j];
//         }
//     }
//     printf("%d ",sum);
//     return 0;
// }

// int main(){
//     int t,s,max=0,a[3][2]={{2,4},{2,3},{5,2}};
//     for(int i=0; i<3; i++){
//         for(int j=0; j<2; j++){
//             int lastdigit=a[i][j];
//             if (max<lastdigit){
//                 max=lastdigit;
//                 t=i+1;
//                 s=j+1;
//             }
//         }
//     }
//         printf("%d",max);
//         printf("\nthe index is of %d is : (%d,%d)",max,t,s);
//     return 0;
// }

// int main(){
//     int t,max=0,a[3][2]={{2,4},{2,5},{7,3}};
//     for(int i=0; i<3; i++){
//         int sum=0;
//         for(int j=0; j<2; j++){
//             sum+=a[i][j];
//         }
//         if(sum>max){
//             max=sum;
//             t=i+1;
//         }
//     }
//     for(int i=0; i<3; i++){
//         for(int j=0; j<2; j++){
//             printf("%d ",a[i][j]);
//         }
//         printf("\n");
//     }
//     printf("sum of row is %d and the row number %d",max,t);
//     return 0;
// }

// int main(){
//     int maxcount=0,row=0,a[3][3]={{1,0,0},{1,0,1},{1,1,1}};
//     for(int i=0; i<3; i++){
//         int count=0;
//         for(int j=0; j<3; j++){
//             if (a[i][j]==1){
//                 count++;
//                 row=i;
//             }
//         }
//         if(count>maxcount){
//             maxcount=count;
//         }
//     }
//         printf("%d is max count and row is %d",maxcount,row);
//     return 0;
// }

// int main(){
//     int r;
//     printf("enter the numer of rows : ");
//     scanf("%d",&r);
//     int c;
//     printf("enter the numer of colomn : ");
//     scanf("%d",&c);
//     int ex,a[r][c],b[r][c];
//     for(int i=0; i<r; i++){
//         for(int j=0; j<c; j++){
//             printf("enter the value of (%d,%d) : ",i,j);
//             scanf("%d",&a[i][j]);
//         }
//         printf("\n");
//     }
//     printf("The matrix you enterd \n");
//     for(int i=0; i<r; i++){
//         for(int j=0; j<c; j++){
//             printf("%d ",a[i][j]);
//         }
//         printf("\n");
//     }
//     printf("\n Transpos matrix\n");
//     for(int i=0; i<r; i++){
//         for(int j=0; j<c; j++){
//             b[i][j]=a[j][i];
//             printf("%d ",b[i][j]);
//         }
//         printf("\n");
//     }
//     // printf("\n 90 angle bend from orignal matrix \n");
//     // for(int i=0; i<r; i++){
//     //     for(int j=0; j<c; j++){
//     //         printf("%d ",b[i][j]);
//     //     }
//     //     printf("\n");
//     // }
//     return 0;
// }

// int main()
// {
//     int r, c, sum = 0;
//     printf("\nEnter the number of colomn/row 1st matrix : ");
//     scanf("%d %d", &r, &c);
//     int a[r][c];
//     for (int i = 0; i < r; i++)
//     {
//         for (int j = 0; j < c; j++)
//         {
//             printf("\nenter the matrix of (%d,%d) : ", i + 1, j + 1);
//             scanf("%d", &a[i][j]);
//         }
//     }
//     printf("\n");
//     for (int i = 0; i < r; i++)
//     {
//         for (int j = 0; j < c; j++)
//         {
//             printf("%d ", a[i][j]);
//         }
//         printf("\n");
//     }
//     int r1, c1;
//     printf("Enter the number of colomn/row 2nd matrix : ");
//     scanf("%d %d", &r1, &c1);
//     int b[r1][c1];
//     for (int i = 0; i < r1; i++)
//     {
//         for (int j = 0; j < c1; j++)
//         {
//             printf("\nenter the matrix of (%d,%d) : ", i + 1, j + 1);
//             scanf("%d", &b[i][j]);
//         }
//     }
//     printf("\n");
//     for (int i = 0; i < r1; i++)
//     {
//         for (int j = 0; j < c1; j++)
//         {
//             printf("%d ", b[i][j]);
//         }
//         printf("\n");
//     }
//     printf("\nThe multiplication of matrix \n");
//     int res[r][c1];
//     for (int i = 0; i < r; i++)
//     {
//         for (int j = 0; j < c1; j++)
//         {
//             res[i][j] = 0;
//             for (int k = 0; k < r1; k++)
//             {
//                 res[i][j] += a[i][k] * b[k][j];
//             }
//         }
//     }
//     printf("\n");
//     for (int i = 0; i < r; i++)
//     {
//         for (int j = 0; j < c1; j++)
//         {
//             printf("%d ", res[i][j]);
//         }
//         printf("\n");
//     }
//     printf("\n");
//     return 0;
// }

// int main()
// {
//     int r;
//     printf("Enter your rows : ");
//     scanf("%d", &r);
//     int c;
//     printf("Enter your column : ");
//     scanf("%d", &c);
//     int a[r][c], s[r][c];
//     for (int i = 0; i < r; i++)
//     {
//         for (int j = 0; j < c; j++)
//         {
//             printf("Enter the matrix of (%d,%d) : ", i + 1, j + 1);
//             scanf("%d", &a[i][j]);
//         }
//     }
//     int minr = 0;
//     int maxr = r - 1;
//     int minc = 0;
//     int maxc = c - 1;
//     int count = 0;
//     int total = c * r;
//     printf("\nYour matrix is here\n");
//     for (int i = 0; i < r; i++)
//     {
//         for (int j = 0; j < c; j++)
//         {
//             printf("%d ", a[i][j]);
//         }
//         printf("\n");
//     }
//     printf("\n");
//     printf("spiral of the matrix\n");
//     while (count < total)
//     {
//         for (int i = minr; i <= maxr && count <= total; i++)
//         {
//             printf("%d ", a[minr][i]);
//             count++;
//         }
//         minr++;
//         for (int i = minr; i <= maxc && count <= total; i++)
//         {
//             printf("%d ", a[i][maxc]);
//             count++;
//         }
//         maxc--;
//         for (int i = maxc; i >= minc && count <= total; i--)
//         {
//             printf("%d ", a[maxr][i]);
//             count++;
//         }
//         maxr--;
//         for (int i = maxr; i >= minr && count <= total; i--)
//         {
//             printf("%d ", a[i][minc]);
//             count++;
//         }
//         minc++;
//     }
//     return 0;
// }

// int main(){
//     char a[7]="Nikhil";
//     int i=0;
//     while(a[i]!='\0'){
//         printf("%c",a[i]);
//         i++;
//     }
//     return 0;
// }

// int main(){
//     char a[40];
//     // scanf("%s",a); //it's take only one word
//     // printf("your input was : %s ",a);
//     // gets(a);
// scanf("%[^\n]s",a);
//     // printf("Your input was : %s ",a);
//     // gets(a);
//     // puts(a);
//     return 0;
// }

// int main(){
//     char a[50];
//     printf("Enter your string : ");
//     // scanf("%[^\n]s",a);
//     gets(a);
//     int c=0,k=0;
//     while(a[k]!='\0'){
//         c++;
//         k++;
//     }
//     // printf("%d",k);
//     int j;
//     for(int i=0; j=c-1; i<=j, i++, j--){
//         char  temp = a[i];
//         a[i]=a[j];
//         a[j]=temp;
//     }
//     printf("%s",a);
//     return 0;
// }

// int main(){
// char* str[40] = "nikhil singh ";
// char* str1[40] = "is really good";
// int x = strlen(str); //to count the number of character including spaces
// int x = strcpy(str1,str); //to copy from one str to another
// strcat(str,str1); //to concatinte any 2 string
// printf("%d",strcmp(str,str1));
// char* first_str = "Geeks";
// char* second_str = "Geks";

// printing the strings
// printf("First String: %s\n", first_str);
// printf("Second String: %s\n", second_str);

// printing the return value of the strcmp()
// printf("Return value of strcmp(): %d",
//        strcmp(first_str, second_str)); // to compare
// return 0;
// }

// int main(){
//     char a[20]="Nkhil";
//     for(int i=4; i>=1; i--){
//         a[i+1]=a[i];
//     }
//     a[1]= 'i';
//     printf("%s",a);
//     return 0;
// }

// int main(){
//     struct emp{
//         char name;
//         int empId;
//         char grade;
//     }Nikhil ,sourav;
//     // struct emp Nikhil;
//     Nikhil.empId = 7;
//     Nikhil.name = 'Nikhil';
//     Nikhil.grade = 'A';
//     // struct emp sourav;
//     sourav.name = 'Sourav';
//     sourav.empId=5;
//     sourav.grade='B';
//     printf("%d",sourav.empId);
//     return 0;
// }

// int main(){
//     struct Book{
//         char name[2];
//         float price;
//         int pages;
//     };
//     struct Book a;
//     a.price = 540.2;
//     a.pages = 400;
//     strcpy(a.name,"scince");

//     struct Book b;
//     strcpy(b.name,"scince");
//     b.price = 490.00;
//     b.pages = 200;

//     printf("%s\n",a.name);
//     printf("%f\n",a.price);
//     printf("%d\n",a.pages);

// char a[111];
// a = "Nikhil singh"; // this can't be printed because after declaration we can't be value to our codes
// strcpy(a,"is very good");
// printf("%s",a);
//     return 0;
// }

// typedef int Nn;
// int main(){
//     typedef struct book{
//         char name[50];
//         int price;
//         int quntity;
//     }book;
//     // book a;//using typedef
//     // a.price = 9;

//     struct book b;
//     b.price = 8;

//     printf("%d\n",a.price);
//     printf("%d\n",b.price);
//     return 0;
// }

// int main(){
//     typedef struct person{
//         char name[50];
//         int age;
//         int salary;
//     } person;
//     person a[50];
//     strcpy(a[0].name,"Nikhil");
//     a[0].salary = 300000;
//     a[0].age = 17;

//     strcpy(a[1].name,"Sourav");
//     a[1].age = 76;
//     a[1].salary = 76333;

//     strcpy(a[2].name,"Amit");
//     a[2].age = 65;
//     a[2].salary = 86778;

//     for(int i=0; i<=2; i++){
//         printf("%s\n",a[i].name);
//         printf("%d\n",a[i].age);
//         printf("%d\n\n",a[i].salary);
//     }
//     // printf("%s\n",a.name);
//     // printf("%d\n",a.age);
//     // printf("%d\n",a.salary);
//     // int x = 8,y=10;
//     // int* c = &x;
//     // int* d = &y;
//     // printf("%p\n",c);
//     // printf("%p\n",d);
//     return 0;
// }

// int main(){
//     typedef struct criketer{
//         char name[20];
//         int age;
//         int NoOfMatches;
//         float average;
//     }criketer;
//     int x;
//     char n;
//     printf("Total number of criketer records : ");
//     scanf("%d",&x);
//     criketer c[x]; //asked in up total number of cricket
//     for(int i=0; i<x; i++){
//         printf("Name of criketer : ");
//         scanf(" %[^\n]", c[i].name);
//         printf("criketer age : ");
//         scanf("%d",&c[i].age);
//         printf("criketer No of matches : ");
//         scanf("%d",&c[i].NoOfMatches);
//         printf("criketer No of average run : ");
//         scanf("%f",&c[i].average);
//     }
//     for (int i = 0; i < x; i++)
//     {
//         printf("\nName of criketer : %s\n",c[i].name);
//         printf("criketer age : %d\n",c[i].age);
//         printf("criketer No of matches : %d\n",c[i].NoOfMatches);
//         printf("criketer No of average run : %f\n\n",c[i].average);
//     }

//     return 0;
// }

// int main(){
//     typedef struct personalinfo{
//         char name[50];
//         int age;
//         char blood_group[5];
//     }personalinfo;

//     typedef struct schoolinfo{
//         int class;
//         char section;
//         int rollNo;
//         personalinfo personal;
//     }schoolinfo;

//     schoolinfo a;
//     a.class = 12;
//     a.section = 'A';
//     a.rollNo = 18;
//     a.personal.age = 18;

//     strcpy(a.personal.name,"Nikhil");
//     strcpy(a.personal.blood_group,"A+");

//     printf("%s\n",a.personal.name);
//     printf("%d\n",a.personal.age);
//     printf("%s\n",a.personal.blood_group);
//     printf("%d\n",a.class);
//     printf("%d\n",a.rollNo);
//     printf("%c\n",a.section);
//     return 0;
// }

// typedef struct studentinfo {
//     char name[50];
//     int rollnumber;
//     int class;
// } student;

// // Modify function to accept a pointer to the structure
// void calling(student p) {
//     p.rollnumber = 1;  // Use -> to access structure members via pointer
//     p.class = 2;
//     strcpy(p.name, "Sourav");  // Copy string into the name field
//     return;
// }

// int main() {
//     student student1;

//     // Assign initial values
//     strcpy(student1.name, "Nikhil");
//     student1.rollnumber = 918;
//     student1.class = 127;

//     // Pass the address of student1 to the function
//     calling(student1);

//     // Output the updated values
//     printf("%d\n", student1.rollnumber);
//     printf("%s\n", student1.name);
//     printf("%d\n", student1.class);
//     return 0;
// }

// typedef struct person{
//     int age;
//     int weight;
// }person;

// void change(person* p){
//     // p->age = 20;
//     (*p).age = 20;
//     // (*p).weight = 190;
//     p->weight = 190;
//     return;
// }

// int main(){
//     person p1;
//     person* x = &p1;
//     x->age = 19;
//     (*x).weight = 60;
//     printf("%d\n",p1.age);
//     printf("%d\n",p1.weight);
//     change(&p1);
//     change(x); // or you can write like change(x) as above x is pointer for p1
//     printf("%d\n",p1.age);
//     printf("%d\n",p1.weight);
//     return 0;
// }

// int main(){
//     int target = 11;
//     int arr[13] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
//     int i,j;
//     for(i=0, j=12; i<=12 && j>=0; j--, i++){
//         if (arr[i]+arr[j]==target){
//             printf("Got Target %d+%d=%d",arr[i],arr[j],target);
//             break;
//         }
//         if(arr[i]+arr[j]>target){
//             j--;
//         }
//         if(arr[i]+arr[j]<target){
//             i++;
//         }
//     }
//     return 0;
// }
// int main(){
//     int target = 8;
//     int arr[13] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
//     int i=0;
//     int j=12;
//     while (i<j){
//         if (arr[i]+arr[j]==target){
//             printf("Got Target %d+%d=%d",arr[i],arr[j],target);
//             break;
//         }
//         if(arr[i]+arr[j]>target){
//             j--;
//         }
//         if(arr[i]+arr[j]<target){
//             i++;
//         }
//     }
//     return 0;
// }

////bubble sort
// int main(){
//     int n;
//     printf("Enter the size of an array : ");
//     scanf("%d",&n);
//     int arr[n];
//     for(int i=0; i<n; i++){
//         printf("Enter Your %d array : ",i+1);
//         scanf("%d",&arr[i]);
//     }
//     printf("\nYour array\n");
//     for (int i=0; i<n; i++){
//         printf("%d ",arr[i]);
//     }
//     printf("\nNew shorted array\n");
//     for(int i=0; i<n-1; i++){
//         bool flag = true;
//         for(int j=0; j<n-1-i; j++){
//             if (arr[j]>arr[j+1]){
//                 int temp = arr[j];
//                 arr[j] = arr[j+1];
//                 arr[j+1] = temp;
//                 flag = false;
//             }
//         }
//         if(flag==true) break;
//     }
//     for (int i=0; i<n; i++){
//         printf("%d ",arr[i]);
//     }
//     return 0;
// }

////selection sort
// int main(){
//     int n;
//     printf("Enter the size of array : ");
//     scanf("%d",&n);
//     int arr[n];
//     for(int i=0; i<n; i++){
//         printf("Enter the %d array : ",i+1);
//         scanf("%d",&arr[i]);
//     }
//     printf("\nYour unsorted array\n");
//     for(int i=0; i<n; i++){
//         printf("%d ",arr[i]);
//     }

//     for(int i=0; i<n-1; i++){
//         int min=INT_MAX;
//         int minindex = -1;
//         for(int j=i; j<n; j++){
//             if(min>arr[j]){
//                 min=arr[j];
//                 minindex = j;
//             }
//         }
//         int temp = arr[minindex];
//         arr[minindex]=arr[i];
//         arr[i]=temp;
//     }

//     printf("\nYour sorted array\n");
//     for(int i=0; i<n; i++){
//         printf("%d ",arr[i]);
//     }
//     return 0;
// }

////insertion sort
// int main(){
//     int arr[6] = {5,4,3,2,1,6};
//     for(int i=1; i<6; i++){
//         int j=i;
//         while (j>0 && arr[j]<arr[j-1]){
//             int temp = arr[j];
//             arr[j] = arr[j-1];
//             arr[j-1] = temp;
//             j--;
//         }
//     }
//     for(int i=0; i<6; i++){
//         printf("%d ",arr[i]);
//     }
//     return 0;
// }

// void sum(){
//     return;
// }

// int main(){
//     int arr[5] = {1,2,3,4,5};
//     sum()

//     for(int i=0; i<5; i++){
//         printf("%d ",arr[i]);
//     }

//     return 0;
// }

// int is_prime(int p){
//     if(p<2){
//         return 0;
//     }
//     for(int i = 2; i*i <= p; i++ ){
//         printf("%d ",i);
//         if(p%i==0){
//             return 0;
//         }
//     }
//     return 1;
// }

// int main(){
//     int a;
//     printf("ENter your starting value : ");
//     scanf("%d",&a);
//     int b;
//     printf("ENter your ending value : ");
//     scanf("%d",&b);
//     for(int i=a+1; i<b; i++){
//         if(is_prime(i)){
//             printf("\n\n");
//         // printf("%d\n",i);
//         }
//     }
//     return 0;
// }

// int main(){
//     int a,b;
//     printf("Enter your starting value : ");
//     scanf("%d",&a);
//     printf("Enter your ending value : ");
//     scanf("%d",&b);
//     for(int i=a+1; i<b; i++){
//         bool isprime = true;
//         for(int j=2; j<=sqrt(i); j++){
//             if(i%j==0){
//                 isprime=false;
//             }
//         }
//         if(isprime==true && i>1){printf("%d\n",i);
//         }
//     }
//     return 0;
// }

// int main(){
//     int days;
//     printf("enter your days : ");
//     scanf("%d",&days);
//     int years = days/365;
//     int weeks = (days%365)/7;
//     int Days = (days%365)%7;
//     printf("Years : %d\n",years);
//     printf("weeks : %d\n",weeks);
//     printf("days : %d\n",Days);
//     return 0;
// }

// int main(){
//     int a,b,c;
//     printf("Enter the value of a,b,c : ");
//     scanf("%d%d%d",&a,&b,&c);
//     int pr1 = (b*b) - (4*a*c);
//     if(pr1>0 && a!=0){
//         double x,y;
//         pr1 = sqrt(pr1);
//         x = (-b+pr1)/(2*a);
//         y = (-b-pr1)/(2*a);
//         printf("Root1 = %.5lf\n",x);
//         printf("Root2 = %.5lf\n",y);
//     }
//     else{
//         printf("\nimpossible to find roots\n");
//     }
//     return 0;
// }

// int main(){
//     int x;
//     printf("Enter the number between 1 to 12 : ");
//     scanf("%d",&x);
//     switch(x){
//         case 1 : printf("january"); break;
//         case 2 : printf("February"); break;
//         case 3 : printf("March"); break;
//         case 4 : printf("April"); break;
//         case 5 : printf("May"); break;
//         case 6 : printf("June"); break;
//         case 7 : printf("July"); break;
//         case 8 : printf("Augest"); break;
//         case 9 : printf("september"); break;
//         case 10 : printf("obtober"); break;
//         case 11 : printf("November"); break;
//         case 12 : printf("December"); break;
//         default : printf("enter number between 1-12..");
//     }
//     return 0;
// }

//// 24/09/2024
// int main(){
//     int a;
//     printf("Enter the range : ");
//     scanf("%d",&a);
//     for (int i=2; i<=a; i++){
//         if(i%2==0){
//             printf("%d",i);
//         }
//     }
//     return 0;
// }

// int main(){
//     int a,b,sum=0;
//     printf("Enter your first number : ");
//     scanf("%d",&a);
//     printf("Enter your last number : ");
//     scanf("%d",&b);

//     for(int i=a; i<=b; i++){
//         if (i%7==3 || i%7==2){
//             printf("%d ",i);
//         }
//     }
//     return 0;
// }

// int main(){
//     int a,c=0;
//     printf("Enter the number of lines : ");
//     scanf("%d",&a);

//     for(int i=1; i<=a; i++){
//         for(int j=1; j<=3; j++){
//             c+=1;
//             printf("%d ",c);
//         }
//         printf("\n");
//     }
//     return 0;
// }

// int main(){
//     int a,b,c=0;
//     printf("Enter number of lines : ");
//     scanf("%d",&a);
//     printf("Enter number of chracter : ");
//     scanf("%d",&b);
//     for(int i=1; i<=a; i++){
//         for(int j=1; j<=b; j++){
//             c+=1;
//             printf("%d ",c);
//         }
//         printf("\n");
//     }
//     return 0;
// }

// int main(){
//     int sum=0,c=0,avg=0,i=1;
//     while(i>0){
//     printf("Input matimatics marks(0 to terminate) : ");
//     scanf("%d",&i);
//     if(i == 0) {
//         break;
//     }
//     sum+=i;
//     c++;
//     }
//     if (c>0){
//         avg = (sum-1)/c;
//         printf("%d",avg);
//     }
//     else{
//         printf("No marks entered.\n");
//     }
//     return 0;
// }

// int main(){
//     float sum=0;
//     for(int i=1; i<=50; i++){
//         sum+=(float)1/i;
//     }
//     printf("%.2f",sum);
//     return 0;
// }

// int main(){
//     float sum=0,odd=1,d;
//     for(int i=1; i<=8; i+2){
//         d = (float)odd/i;
//         sum += d;
//         odd+=2;
//         i=i*2;
//     }
//     printf("%f",sum);
//     return 0;
// }

////48
// int main(){
//     int a[7]={1,34,5,-1,3,0,5};
//     for(int i=0; i<7; i++){
//         printf("%d ",a[i]);
//     }
//     for(int i=0; i<7; i++){
//         if(a[i]<=0){
//             a[i]=100;
//         }
//     }
//     printf("\n");
//     for(int i=0; i<7; i++){
//         printf("%d ",a[i]);
//     }

//     return 0;
// }/

// int main(){
//     int a,arr[7],x=0;
//     printf("Enter the number : ");
//     scanf("%d",&a);

//     for(int i=0; i<7; i++){
//         arr[i]=a;
//         a=a*3;
//     }
//     printf("\n");
//     for(int i=0; i<7; i++){
//         printf("%d ",arr[i]);
//     }
//     return 0;
// }

// int main(){
//     int arr[6]={3,65,3,46,2,26};
//     int a,b,c,d,e;
//     printf("enter 5 number of array : ");
//     scanf("%d%d%d%d%d",&a,&b,&c,&d,&e);
//     for(int i=0; i<6; i++){
//         if (arr[i]==a){
//             printf("\nA[%d]=%d\n",i,arr[i]);
//         }
//         else if(arr[i]==b){
//             printf("A[%d]=%d\n",i,arr[i]);
//         }
//         else if(arr[i]==c){
//             printf("A[%d]=%d\n",i,arr[i]);
//         }
//         else if(arr[i]==d){
//             printf("A[%d]=%d\n",i,arr[i]);
//         }
//         else if(arr[i]==e){
//             printf("A[%d]=%d\n",i,arr[i]);
//         }
//     }
//     return 0;
// }

// int main(){
//     int arr[5];
//     for(int i=0; i<5; i++){
//         printf("enter 5 array : ");
//         scanf("%d",&arr[i]);
//     }
//     int j=4;
//     for(int i=0; i<j; i++,j--){
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }
//     for(int i=0; i<5; i++){
//         printf("%d ",arr[i]);
//     }
//     return 0;
// }

// int main(){
//     int arr[6] = {3,6,8,8,9,5};
//     int x=arr[0];
//     for(int i=0 ; i<6; i++){
//         if(x>arr[i]){
//             x = arr[i];
//         }
//     }
//     printf("%d",x);
//     return 0;
// }

// int main(){
//     int n,last,first=0;
//     printf("Enter your number to revers : ");
//     scanf("%d",&n);
//     while(n>0){
//         last = n%10;
//         first =first*10 +last;
//         n = n/10;
//     }
//     printf("%d",first);
//     return 0;
// }
////62
// int main(){
//     int x,x1,sum=0;
//     printf("ENter your number : ");
//     scanf("%d",&x);
//     if(x<501){
//         while(x!=0){
//             x1 = x%10;
//             sum += x1;
//             x /= 10;
//         }
//         printf("%d",sum);
//     }
//     else{
//         printf("%d is greater then 500 ",x);
//     }
//     return 0;
// }
////important/////
// int main(){
//     int n,sum=0;
//     printf("enetr +ve number 1-100 : ");
//     scanf("%d",&n);
//     if(n<1 || n>=100){
//         printf("wrong input\n");
//         return 0;
//     }
//     for(int i=1,j=1; j<=n; i++){
//         sum+=j*j*j*j;
//         j=j+i;
//     }
//     printf("%d",sum);
//     return 0;
// }

// int main(){
//     int x, max = 0, min = 0, sum = 0, count = 0;
//     float avg = 0.0;
//     while (x > 0) {
//         printf("Enter your number and exit(0/-ve) : ");
//         scanf("%d", &x);
//         if (x <= 0) {
//             break;
//         }
//         if(x>max){
//             max = x;
//         }
//         if (count == 0 || x < min) {
//             min = x;
//         }
//         sum += x;
//         count++;
//         if(count>0){
//             avg = sum/count;
//         }
//     }
//     printf("\nNumber of positive values entered is %d\n",count-1);
//     printf("Minimum value entered is %d\n",min);
//     printf("Maximum value entered is %d\n",max);
//     printf("Average value is %0.2lf\n\n",avg);
//     return 0;
// }
////65
// int main(){
//     int count=0;
//     int flag;
//     for(int i=2; i<200; i++){
//         flag = 1;
//         for(int j=2; j<=i/2 && flag==1; j++){
//             if(i%j==0){
//                 flag = 0;
//             }
//         }
//         if(flag==1){
//             printf("%5d ",i);
//             count++;
//         }
//         if(count % 10 == 0){
//             printf("\n");
//         }
//     }
//     printf("\n");
//     return 0;
// }

// int main(){
//     double p;
//     for(int i=0; i<=10; i++){
//         if(i==0){
//             p = 1;
//         }
//         else{
//             p*=2;
//         }
//     printf("%50.12lf\n",p);
//     }
//     return 0;
// }
////69
// #define Max 10
// int main(){
//     int x,binom,m;
//     printf("X=");
//     for(int i=0;i<=10;i++){
//         printf("%4d",i);
//     }
//     printf("\nm =\n");
//     m=0;
//     do{
//         printf("%2d",m);
//         x = 0;
//         binom = 1;
//         while(x<=m){
//             if(m==0 || x==0){
//                 printf("%4d",binom);
//             }
//             else{
//                 binom = binom*(m-x+1)/x;
//                 printf("%4d",binom);
//             }
//             x+=1;
//         }
//         m+=1;
//         printf("    \n");
//     }while(m<=Max);
//     // printf("\n");
//     return 0;
// }

// int main(){
//     for (int i=65; i<=122;i++){
//         if(i>90 && i<97){
//             continue;
//         }
//         printf("[%2d-%c]",i,i);
//     }
//     return 0;
// }

// int main(){
//     int x;
//     printf("Enter your number (7 digits) : ");
//     scanf("%d",&x);
//     printf("%d ",x/1000000);
//     x=x-((x/1000000)*1000000);

//     printf("%d ",x/100000);
//     x=x-((x/100000)*100000);

//     printf("%d ",x/10000);
//     x=x-((x/10000)*10000);

//     printf("%d ",x/1000);
//     x=x-((x/1000)*1000);

//     printf("%d ",x/100);
//     x=x-((x/100)*100);

//     printf("%d ",x/10);
//     x=x-((x/10)*10);

//     printf("%d ",x/1);
//     x=x-(x%10);
//     return 0;
// }

// int main(){
//     printf(" x    X+2    x+4    x+6\n");
//     for(int i=1; i<=13; i=i+3){
//         printf("%2d%6d%7d%7d",i,i+2,i+4,i+6);
//         printf("\n");
//     }

//     return 0;
// }

// int main(){
//     int x,lastdigit,new = 0;
//     printf("Enter number : ");
//     scanf("%d",&x);
//     int old = x;
//     while(x > 0){
//         lastdigit = x % 10;
//         new = new * 10 + lastdigit;
//         x /= 10;
//     }
//     if (new == old){
//         printf("%d is a palindrom number",old);
//     }
//     else{
//         printf("%d is not a palindrom number",old);
//     }
//     return 0;
// }

// int main(){
//     int str[400] = {5,4,2};
//     int p = sizeof(str)/sizeof(str[4]);
//     printf("%d",p);
//     return 0;
// }

// int between(int x, int y, int z){
//     if((x>=y && x<=z) || (x<=y && x>=z)){
//         return 1;
//     }
//     else{
//         return 0;
//         }
// }
// int main(){
//     int x,y,z;
//     printf("Enter 3 number : ");
//     scanf("%d%d%d",&x,&y,&z);
//     if(between(x,y,z)) printf("%d",x);
//     else if(between(y,x,z)) printf("%d",y);
//     else printf("%d",z);
//     return 0;
// }

// int test(int x, int y){
//     return x==y? (x+y)*3 : x+y;
// }
// int main(){
//     int x,y;
//     printf("enter 2 number : ");
//     scanf("%d%d",&x,&y);
//     printf("%d",test(x,y));
//     return 0;
// }

// int test(int x){
//     return x>51? (x-51)*3 : 51-x;
// }
// int main(){
//     int x;
//     printf("enter your number : ");
//     scanf("%d",&x);
//     printf("%d",test(x));
//     return 0;
// }

// int main(){
//     int sum=0,arr[50];
//     for(int i=0; i<5; i++){
//         printf("Enter your element %d : ",i);
//         scanf("%d",&arr[i]);
//     }
//     printf("\n");
//     for(int i=0; i<5; i++){
//         sum+=arr[i];
//         // printf("%d\n",sum);
//         printf("%d\n",sum);
//     }
//     return 0;
// }
/////4
// typedef struct employee_info{
//     int emp_number;
//     char *name;
//     // char name[50];
//     int salary;
// }emp;

// int main(){
//     emp a;
//     a.emp_number = 7;
//     // strcpy(a.name,"Nikhil");
//     a.name = "Nikhil singh";
//     a.salary = 100000;

//     printf("%d\n",a.emp_number);
//     printf("%d\n",a.salary);
//     printf("%s\n",a.name);
//     return 0;
// }

// int main() {
//     int i = 65; // Starting ASCII value for 'A'
// while ((i >= 65 && i <= 90) || (i >= 97 && i <= 122)) {
//     printf("%c -> %d\n", i, i); // Print character and ASCII value
//     i = i + 1; // Increment
//     }
//     return 0;
// }

// int main() {
//     int i = 65;
//     while (i <= 122) {
//         if((i>=65 && i<=90) || (i>=97 && i<=122)) printf("%c -> %d\n", i, i);
//         i = i + 1;
//     }
//     return 0;
// }

// int armstrong(int range)
// {
//     int last, sum = 0, i = range, target;
//     target = i;
//     while (i != 0)
//     {
//         last = i % 10;
//         sum += (last * last * last);
//         i = i / 10;
//     }
//     if (sum == target) {
//         return 1;
//     }else{
//         return 0;
//     }
// }
// int main()
// {
//     int r;
//     printf("Enter the range : ");
//     scanf("%d", &r);
//     for(int i=0; i<=r; i++){
//         if(armstrong(i)){
//             printf("%d\n",i);
//         }
//     }
//     printf("\n");
//     return 0;
// }

// int main(){
//     int row;
//     printf("Enter the odd number : ");
//     scanf("%d",&row);
//     for(int i=1; i<=row; i++){
//         for(int j=1; j<=row; j++){
//             if((row+1)/2==i || (row+1)/2==j ){
//                 printf("* ");
//             }
//             else{
//                 printf("  ");
//             }
//         }
//         printf("\n");
//     }
//     return 0;
// }
// int main(){
//     int n=7;
//     printf("%d",n/2);
//     return 0;
// }

// int main()
// {
//     int row;
//     printf("enter the number of row : ");
//     scanf("%d", &row);
//     for (int i = 1; i <= row; i++)
//     {
//         for (int j = 1; j <= i; j++){
//             printf("*");
//         }
//         printf("\n");
//     }
//     // printf("\n");
//     return 0;
// }

// int main(){
//     int n;
//     printf("Enter three digit number : ");
//     scanf("%d",&n);
//     if(n>99 && n<=999){
//         printf("It is three digit number");
//     }
//     else{
//         printf("it is not three digits number");
//     }
//     return 0 ;
// }

// int main(){
//     int n,check=0;
//     printf("enter the number :");
//     scanf("%d",&n);
//     for(int i=1; i<=n; i++){
//         if(n%i==0){
//             check++;
//         }
//     }
//     if(check>2){
//         printf("%d is not a prime ",n);
//     }
//     else{
//         printf("%d is a prime ",n);
//     }
//     return 0;
// }

// int main(){
//     int fact,product=1;
//     printf("Enter  your number : ");
//     scanf("%d",&fact);
//     for(int i=1; i<=fact; i++){
//         product = product * i;
//     }
//     printf("%d",product);
//     return 0;
// }

// int main(){
//     int n;
//     printf("Enter the odd number : ");
//     scanf("%d",&n);
//     for(int i=1;i<=n; i++){
//         int star = (i <= (n+1)/2) ? i : (n-i+1);
//         for(int j = 1; j<=star; j++){
//             printf("* ");
//         }
//         printf("\n");
//     }
//     return 0;
// }

// int main(){
//     int x;
//     printf("Enter the number of rows : ");
//     scanf("%d",&x);
//     for(int i=1; i<=x; i++){
//         for(int j=1; j<=i; j++){
//             printf(" ");
//         }
//         for(int k=1; k<=x-i+1; k++){
//             printf("* ");
//         }
//         printf("\n");
//     }
//     return 0;
// }

// int main(){
//     int x;
//     printf("Enter the number : ");
//     scanf("%d",&x);
//     for(int i=1;i <=x+1; i++){
//         for(int j=1; j<=i;j++){
//             if(i%2!=0){
//                 printf("%d",j)
//             }
//         }
//     }
//     return 0;
// }
// int main(){
//     char* s = "World nikhil";
//     printf("%s\n", s); // Output: WORLD
//     return 0;
// }

// int fibonacci(int x){
//     if(x==1){
//         return 1;
//     }
//     else if(x<=0){
//         return 0;
//     }
//     else{
//         return fibonacci(x-1) + fibonacci(x-2);
//     }
// }

// int main(){
//     int n;
//     printf("Enter the number : ");
//     scanf("%d",&n);
//     printf("Fibonacci Series: ");
//     for(int i=0; i<n; i++){
//         printf("%d ",fibonacci(i));
//     }
//     return 0;
// }

// int main(){
//     const char a[] = "Nikhil";
//     const char b = 'S';
//     printf("%s  /n ",a);
//     printf("%c",b);
//     return 0;
// }
// int main(){
//     int choise,n;
//     printf("*** ankush world ***");
//     printf("\n menu");
//     printf("input element in array :");
//     printf("search element in array :");
//     printf("enter your choise :");
//     scanf("%d",&choise);
//     printf("enter a index of element :");
//     scanf("%d",&n);
//     int arr[n];
//     if(choise==1){
//     }
//     return 0;
// }

// #include<stdio.h>
// int main(){
//     int a = 2;
//     int b = 4;
//     int sum = a + b;
//     printf("%d",sum);
//     return 0;
// }

// #include<stdio.h>
// int main(){
//     int a, b;
//     printf("Enter the 1st number : ");
//     scanf("%d",&a);
//     printf("Enter the 2nd number : ");
//     scanf("%d",&b);
//     int temp = a;
//     a = b;
//     b = temp;
//     printf("Swaping value:\n1st : %d\n2nd : %d",a,b);
// }

// #include<stdio.h>
// int main(){
//     float a,b;
//     printf("Enetr the 1st number : ");
//     scanf("%f",&a);
//     printf("Enetr the 2st number : ");
//     scanf("%f",&b);
//     float avg = (a+b)/2;
//     printf("The average of %f,%f is : %f",a,b,avg);
//     return 0;
// }

// #include<stdio.h>
// int main(){
//     float a,b;
//     printf("Enter the 1st number : ");
//     scanf("%f",&a);
//     printf("Enter the 2st number : ");
//     scanf("%f",&b);
//     float sum = a+b;
//     float sub = a-b;
//     float multi = a*b;
//     float div = a/b;
//     printf("\nAddition of       %f,%f : %f",a,b,sum);
//     printf("\nSubstraction of   %f,%f : %f",a,b,sub);
//     printf("\nMultiplication of %f,%f : %f",a,b,multi);
//     printf("\nDivision of       %f,%f : %f",a,b,div);
//     return 0;
// }

// int main(){
//     float p,r,t;
//     printf("Enter p value : ");
//     scanf("%f",&p);
//     printf("Enter R value : ");
//     scanf("%f",&r);
//     printf("Enter T value : ");
//     scanf("%f",&t);
//     float si = (p*r*t)/100;
//     printf("Simple intrest : %f",si);
// }

// int main(){
//     float f;
//     printf("Enter the temp in farenhiet : ");
//     scanf("%f",&f);
//     float c = (f-32)*5/9;
//     printf("%f",c);
//     return 0 ;
// }

// int main(){
//     int marks[5];
//     int sum = 0;
//     for(int i=1; i<=5; i++){
//         printf("Enter the marks of %d subjects : ",i);
//         scanf("%d",&marks[i]);
//         sum += marks[i];
//     }
//     int per = sum/5;
//     printf("Percentage of 5 sunject : %d",per);
//     return 0;
// }

// int main(){
//     int a,b,c;
//     printf("Enter 1st 2nd 3rd number : ");
//     scanf("%d %d %d",&a,&b,&c);
//     // printf("%s", (a>b) ?  (a>c ? "1 is the greatest" : "3 is the greatest") : (b>c ? "2 is the greatest" : "3 is the greatest"));
//     if(a > b){
//         char *str = a > c ? "1 is the greatest" : "3 is the greatest";
//         printf("%s", str);
//     } else {
//         char *str = b > c ? "2 is the greatest" : "3 is the greatest";
//         printf("%s", str);
//     }
//     return 0;
// }

// int main(){
//     int sum=0,a;
//     printf("Enter the number : ");
//     scanf("%d",&a);
//     for(int i=1; i<=a; i++){
//         sum+=i;
//     }
//     printf("The sum of the numbers is :  %d",sum);
//     return 0;
// }

// int main(){
//     char ch;
//     printf("Enter the character : ");
//     scanf("%c",&ch);
//     if(ch>=65 && ch<91)
//         printf("Upper case :)");
//     else
//         printf("Not a Upper case :(");
//     return 0;
// }

// int main() {
//     int a, b, c, d, e;
//     float percentage;
//     printf("Enter marks of 5 subjects: ");
//     scanf("%d %d %d %d %d", &a, &b, &c, &d, &e);
//     percentage = (a + b + c + d + e) / 5;
//     printf("\nYour percentage: %f", percentage);
//     if (percentage >= 90) {
//         printf("\nA Grade");
//     } else if (percentage >= 80) {
//         printf("\nB Grade");
//     } else if (percentage >= 70) {
//         printf("\nC Grade");
//     } else if (percentage >= 60) {
//         printf("\nD Grade");
//     } else {
//         printf("\nYou failed");
//     }
//     return 0;
// }

// int main(){
//     int day;
//     printf("Enter the day no. : ");
//     scanf("%d",&day);
//     switch (day){
//         case 1: printf("Monday");break;
//         case 2: printf("Tuesday");break;
//         case 3: printf("Wednesday");break;
//         case 4: printf("Thursday");break;
//         case 5: printf("Friday");break;
//         case 6: printf("Saturday");break;
//         case 7: printf("Sunday");break;
//         default : printf("invalid day no. ");
//     }
//     return 0;
// }

// int main(){
//     char ch;
//     printf("Enetr the char : ");
//     scanf("%c",&ch);
//     printf("%d",ch);
//     return 0;
// }

// int main(){
//     int x,first=0,second=1,next;
//     printf("Enter the number of terms : ");
//     scanf("%d",&x);
//     for(int i=1; i<=x; i++){
//         if(i==1){
//             printf("0 ");
//         }
//         else{
//             printf("%d ",second);
//             next = first + second;
//             first = second;
//             second = next;
//         }
//     }
//     return 0;
// }

// int main(){
//     int x,last,pow,sum=0;
//     printf("Enter the armstrong number : ");
//     scanf("%d",&x);
//     int alter_num = x;
//     while(x != 0){
//         last = x%10;
//         pow = last*last*last;
//         sum += pow;
//         x = x/10;
//     }
//     if(alter_num == sum){
//         printf("%d is armstrong number ",alter_num);
//     }else{
//         printf("%d is not armstrong number ",alter_num);
//     }
//     return 0;
// }

// int main(){
//     int x,count=0;
//     printf("Enter the number : ");
//     scanf("%d",&x);
//     for(int i=2; i<=x/2; i++){
//         if(x%i==0){
//             count++;
//         }
//     }
//     if(count>0){
//         printf("%d is not a prime",x);
//     }else{
//         printf("%d is prime",x);
//     }
//     return 0;
// }

// int main(){
//     int size,sum=0;
//     printf("Enter the size of an array : ");
//     scanf("%d",&size);
//     int arr[size];
//     for(int i=0; i<size; i++){
//         printf("Enetr the element %d : ",i+1);
//         scanf("%d",&arr[i]);
//         sum += arr[i];
//     }
//     printf("The sum of an array is : %d",sum);
// }

// int main(){
//     int r1,c1;
//     printf("Ente the row and column : ");
//     scanf("%d %d",&r1,&c1);
//     int a[r1][c1],b[r1][c1],sum[r1][c1];
//     printf("\nFirst Matrix\n");
//     for(int i=0; i<r1; i++){
//         for(int j=0; j<c1; j++){
//             printf("Enter the element of (%d,%d)",i+1,j+1);
//             scanf("%d",&a[i][j]);
//         }
//     }
//     printf("\nSecond Matrix\n");
//     for(int i=0; i<r1; i++){
//         for(int j=0; j<c1; j++){
//             printf("Enter the element of (%d,%d)",i+1,j+1);
//             scanf("%d",&b[i][j]);
//         }
//     }
    // printf("\nAddition of Matrix\n");
    // for(int i=0; i<r1; i++){
    //     for(int j=0; j<c1; j++){
    //         sum[i][j] = a[i][j] + b[i][j];
    //     }
    // }
    // for(int i=0; i<r1; i++){
    //     for(int j=0; j<c1; j++){
    //         printf("%d ",a[i][j]);
    //     }
    //     if(i == r1/2){
    //         printf(" +  ");
    //     }else{
    //         printf("    ");
    //     }
    //     for(int j=0; j<c1; j++){
    //         printf("%d ",b[i][j]);
    //     }
    //     printf("\n");
    // }
//     printf("\nSum of matrix\n");
//     for(int i=0; i<r1; i++){
//         for(int j=0; j<c1; j++){
//             printf("%3d ",sum[i][j]);
//         }
//         printf("\n");
//     }
//     return 0;
// }

// int main(){
//     int r1, c1, r2, c2, sum = 0;
//     printf("Enter rows and columns for first matrix: ");
//     scanf("%d %d", &r1, &c1);
//     printf("\nFirst Matrix\n");
//     int a[r1][c1];
//     for(int i=0; i<r1; i++){
//         for(int j=0; j<c1; j++){
//             printf("Enter the element of (%d,%d) : ",i+1,j+1);
//             scanf("%d",&a[i][j]);
//         }
//     }
//     printf("\nEnter rows and columns for second matrix: ");
//     scanf("%d %d", &r2, &c2);
//     int b[r2][c2], result[r1][c2];
//     if (c1 != r2) {
//         printf("Matrix multiplication not possible!\n");
//         return 1;
//     }
//     printf("\nSecond Matrix\n");
//     for(int i=0; i<r2; i++){
//         for(int j=0; j<c2; j++){
//             printf("Enter the element of (%d,%d) : ",i+1,j+1);
//             scanf("%d",&b[i][j]);
//         }
//     }
//     printf("\nMultiplication of Matrix !!\n\n");
//     for(int i=0; i<r1; i++){
//         for(int j=0; j<c2; j++){
//             result[i][j] = 0;
//             for(int k=0; k<c1; k++){
//                 sum += a[i][k] * b[k][j];
//             }
//             result[i][j] = sum;
//             sum = 0;
//         }
//     }
//     for(int i=0; i<r1; i++){
//         for(int j=0; j<c1; j++){
//             printf("%d ",a[i][j]);
//         }
//         printf("%s", (i == r1/2) ? " *  " : "    ");
//         for(int j=0; j<c1; j++){
//             printf("%d ",b[i][j]);
//         }
//         printf("%s", (i == r1/2) ? " =  " : "    ");
//         for(int j=0; j<c1; j++){
//             printf("%3d ",result[i][j]);
//         }
//         printf("\n");
//     }
//     printf("\n");
//     return 0;
// }

// int main(){
//     int count=0,is_prime,n=2,sum=0;
//     while(count<10){
//         is_prime = 1;
//         for(int i=2; i<n; i++){
//             if(n%i==0){
//                 is_prime = 0;
//                 break;
//             }
//         }
//         if(is_prime){
//             sum += n;
//             count++;
//         }
//         n++;
//     }
//     return 0;
// }

// int main(){
//     int x,num=0;
//     printf("Enter the number : ");
//     scanf("%d",&x);
//     int save = x;
//     while(x!=0){
//         int last = x%10;
//         num = last + 10*num;
//         x = x/10;
//     }
//     printf("%d reversed %d",save,num);
//     return 0;
// }

// int main(){
//     int x;
//     printf("Enter the year : ");
//     scanf("%d",&x);
//     if((x%4==0 && x%100!=0) || (x%400 == 0)){
//         printf("%d is a leap year",x);
//     }
//     else{
//         printf("%d is not a leap year",x);
//     }
//     return 0;
// }

// int main(){
//     int rows;
//     printf("Enter the number of rows : ");
//     scanf("%d",&rows);
//     for(int i=0; i<rows; i++){
//         for(int j=0; j<rows-i; j++){
//             printf(" ");
//         }
//         for(int j=0; j<i; j++){
//             printf("*");
//         }
//         for(int j=1; j<i; j++){
//             printf("*");
//         }
//         printf("\n");
//     }
//     return 0;
// }

// int main(){
//     float unit,amt;
//     printf("Enter the unit : ");
//     scanf("%f",&unit);
//     if(unit<=50){
//         amt = unit*0.5;
//     }
//     else if(unit<=150){
//         amt = 25 + ((unit-50)*0.75);
//     }
//     else if(unit<=250){
//         amt = 100 + ((unit-150)*1.20);
//     }
//     else{
//         amt = 220 + ((unit-250)*1.50);
//     }
//     float super_charge = amt*0.2;
//     printf("%.2f",amt + super_charge);
//     return 0;
// }

// int main(){
//     int arr[2][4] = {
//         {1,2,3,4},
//         {4,3,2,1}
//     };
//     int arr1[2][4] = {1,2,3,4,4,3,2,1};
//     for(int i=0; i<2; i++){
//         for(int j=0; j<4; j++){
//             printf("%d",arr[i][j]);
//         }
//         printf("\n");
//     }
//     printf("\n");
//     for(int i=0; i<2; i++){
//         for(int j=0; j<4; j++){
//             printf("%d",arr1[i][j]);
//         }
//         printf("\n");
//     }
//     return 0;
// }

// int main(){
//     int n,i,j,temp,min;
//     printf("Enter the number of element : ");
//     scanf("%d",&n);
//     int arr[n];
//     for(int k=0; k<n; k++){
//         printf("Enter the array element %d : ",k);
//         scanf("%d",&arr[k]);
//     }
//     for(i=0; i<n-1; i++){
//         min = i;
//         for(j=i+1; j<n; j++){
//             if(arr[j] < arr[min]){
//                 min = j;
//             }
//         }
//         if(min != i){
//             temp = arr[i];
//             arr[i] = arr[min];
//             arr[min] = temp;
//         }
//     }
//     for(int k=0; k<n; k++){
//         printf("%d ",arr[k]);
//     }
//     return 0;
// }

// int main(){
//     int n,i,j,key,arr[100];
//     printf("Enter the number of element : ");
//     scanf("%d",&n);
//     for(int k=0; k<n; k++){
//         printf("Enter the element %d : ",k);
//         scanf("%d",&arr[k]);
//     }
//     for(i=1; i<n; i++){
//         key = arr[i];
//         j = i - 1;
//         while(j>=0 && arr[j]>key){
//             arr[j+1] = arr[j];
//             j--;
//         }
//         arr[j+1] = key;
//     }
//      for(int k=0; k<n; k++){
//         printf("%d ", arr[k]);
//     }
//     return 0 ;
// }

// int fibonacci(int n){
//     if (n==0){
//         return 0;
//     }else if(n==1){
//         return 1;
//     }else{
//         return fibonacci(n-1) + fibonacci(n-2);
//     }
    
// }
// int main(){
//     int x;
//     printf("Enter the number of terms : ");
//     scanf("%d",&x);
//     for(int i=0; i<x; i++){
//         printf("%d ",fibonacci(i));
//     }
// }

// #include <stdio.h>
// #include <string.h>

// struct Book {
//     char title[50];
//     char author[50];
//     char subject[100];
//     int book_id;
// };

// void printBook(const struct Book *book) {
//     printf("Book title   : %s\n", book->title);
//     printf("Book author  : %s\n", book->author);
//     printf("Book subject : %s\n", book->subject);
//     printf("Book id      : %d\n\n", book->book_id);
// }

// int main() {
//     struct Book book1 = {"C Programming", "Nuha Ali", "C Programming Tutorial", 6495407};
//     struct Book book2 = {"Telecom Billing", "Zara Ali", "Telecom Billing Tutorial", 6495700};

//     printBook(&book1);
//     printBook(&book2);

//     return 0;
// } 

// #include<stdio.h>
// #include<string.h>

// struct student{
//     char name[50];
//     int roll_number;
//     float percentage;
// };

// int main(){
//     struct student students[3];

//     strcpy(students[0].name,"Nikhil singh");
//     students[0].roll_number = 104;
//     students[0].percentage = 78.89;

//     strcpy(students[1].name,"Neha kakkar");
//     students[1].roll_number = 201;
//     students[1].percentage = 34.34;

//     strcpy(students[2].name,"rani kakkar");
//     students[2].roll_number = 203;
//     students[2].percentage = 94.34;

//     int max_index = 0;
//     for(int i=1; i<3; i++){
//         if(students[i].percentage > students[max_index].percentage){
//             max_index = i;
//         }
//     }
//     printf("Student with maximum marks:\n");
//     printf("Name: %s\n", students[max_index].name);
//     printf("Roll No: %d\n", students[max_index].roll_number);
//     printf("Percentage: %.2f\n", students[max_index].percentage);
    
//     return 0;
// }
// int main(){
//     printf("Enter the number : ");
//     return 0;
// }
import java.util.*;

// public class JavaCourse {
//     public static void main(String args[]) {
//         System.out.print("Hello World :)");
//     }
// }
// import java.util.*;
// public class JavaCourse {
//     public static void main(String args[] ) {
//         // String a = "Nikhil";
//         // int c = 7;
//         // float b = 8.98f;
//         // System.out.println(a);
//         // System.out.println(b);
//         // System.out.println(c);
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Your Name : ");
//         String name = sc.nextLine();
//         System.out.println("\nHello "+name+" Good Morning\n");
//         sc.close();
//     }
// }
// import java.util.*;
// public class JavaCourse {
//     public static void main(String args[]) {
//         System.out.print("Enter your first number : ");
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         System.out.print("Enter your first number : ");
//         int b = sc.nextInt();
//         int c = a+b;
//         System.out.print("\n"+c);
//         sc.close();
//     }
// 
// public class JavaCourse {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your age : ");
//         int a = sc.nextInt();
//         if(a>=18){
//             System.out.printf("Your age is %d so you're Adult",a);
//         }
//         else{
//             System.out.printf("Your age is %d so you're minor",a);
//         }
//         sc.close();
//     }
// }
// public class JavaCourse{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your Button from (1,2,3) : ");
//         int a = sc.nextInt();
//         switch(a){
//             case 1:
//             System.out.print("Namste");
//             break;
//             case 2:
//             System.out.print("Hello");
//             break;
//             case 3:
//             System.out.print("Bonjour");
//             break;
//             default :
//             System.out.print("Invalid input");
//         }
//         sc.close();
//     }
// }
// public class JavaCourse{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the table number : ");
//         int a = sc.nextInt();
//         for(int i = 1; i<=10; i++){
//             System.out.printf("\n%4d *%2d =%3d",a,i,a*i);
//         }
//         sc.close();
//     }
// }
// public class JavaCourse{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your table number : ");
//         int a = sc.nextInt();
//         int i = 1;
//         while(i!=11){
//             System.out.println(a+"*"+i+"="+a*i);
//             i++;
//         }
//         sc.close();
//     }
// }
// public class JavaCourse{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your table number : ");
//         int a = sc.nextInt();
//         int i = 12;
//         do{
//             System.out.println(a+"*"+i+"="+a*i);
//             i++;
//         }while (i<=10);
//         sc.close();
//     }
// }
// public class JavaCourse{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of row : ");
//         int r = sc.nextInt();
//         System.out.print("Enter the number of column : ");
//         int c = sc.nextInt();
//         for(int i=0; i<c; i++){
//             for(int j=0; j<r; j++){
//                 System.out.print(" *");
//             }
//             System.out.print("\n");
//         }
//         sc.close();
//     }
// }
// public class JavaCourse{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number rows : ");
//         int r = sc.nextInt();
//         System.out.print("Enter the number column : ");
//         int c = sc.nextInt();
//         for(int i=1; i<=r; i++){
//             for(int j=1; j<=c; j++){
//                 if(i==1 || j==1 || i==r || j==c){
//                     System.out.print(" *");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.print("\n");
//         }
//     }
// }
// public class JavaCourse{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of rows : ");
//         int r = sc.nextInt();
//         for(int i=0; i<r; i++){
//             for(int j=0; j<=i; j++){
//                 System.out.print(" *");
//             }
//             System.out.print("\n");
//         }
//         sc.close();
//     }
// }
// public class JavaCourse{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of rows : ");
//         int r = sc.nextInt();
//         for(int i=r; i>0; i--){
//             for(int j=i; j>0; j--){
//                 System.out.print(" *");
//             }
//             System.out.print("\n");
//         }
//         sc.close();
//     }
// }
// public class JavaCourse{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of rows : ");
//         int r = sc.nextInt();
//         for(int i=0; i<r; i++){
//             for(int j=0; j<r-i-1; j++){
//                 System.out.print(" ");
//             }
//             for(int j=0; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//         sc.close();
//     }
// }
// public class JavaCourse{
//     public static void main(String args[]){
//         for(int i=1; i<=5; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(j);
//             }
//             System.out.print("\n");
//         }
//     }
// }
// public class JavaCourse{
//     public static void main(String args[]){
//         for(int i=5; i>=1; i--){
//             for(int j=1; j<=i; j++){
//                     System.out.print(j);
//             }
//             System.out.print("\n");
//         }
//     }
// }
// public class JavaCourse{
//     public static void main(String args[]){
//         int t=1;
//         for(int i=1; i<=5; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.printf("%d ",t);
//                 t++;
//             }
//             System.out.print("\n");
//         }
//     }
// }
// public class JavaCourse{
//     public static void main(String args[]){
//         int num = 0;
//         for(int i=1; i<=5; i++){
//             for(int j=1; j<=i; j++){
//                 if(num==1) num=0;
//                 else  num=1; System.out.print(num);
//             }
//             if(i%2==0) num=0;
//             else num=1;
//             System.out.print("\n");
//         }
//     }
// }
// public class JavaCourse {
//     public static void main(String args[]) {
//         int n = 4;
//         // upper half
//         for (int i=1; i<=n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             for (int k=1; k<=2*(4-i); k++) {
//                 System.out.print(" ");
//             }
//             for (int l = 1; l <= i; l++) {
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//         // lower half
//         for (int  i=n; i>=1; i--){
//             for (int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }
//             for (int k=1; k<=2 *(4-i); k++) {
//                 System.out.print(" ");
//             }
//             for (int l=1; l<=i; l++) {
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//     }
// }
// public class JavaCourse{
//     public static void main(String args[]){
//         for(int i=1; i<=5; i++){
//             for(int j=5; j>=i; j--){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=5; j++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//     }
// }
// public class JavaCourse{
//     public static void main(String args[]){
//         for(int i=1; i<=5; i++){
//             for(int j=1; j<=5-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print(" "+i);
//             }
//             System.out.print("\n");
//         }
//     }
// }
// public class JavaCourse{
//     public static void main(String args[]){
//         for(int i=1; i<=5; i++){
//             for(int j=1; j<=5-i; j++){
//                 System.out.print("  ");
//             }
//             for(int j=i; j>=1; j--){
//                 System.out.print(" "+j);
//             }
//             for(int j=2; j<=i; j++){
//                 System.out.print(" "+j);
//             }
//             System.out.print("\n");
//         }
//     }
// }
// public class JavaCourse{
//     public static void PrintMyName(String name){
//         System.out.print(name);
//         return;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your name : ");
//         String a = sc.nextLine();
//         PrintMyName(a);
//         System.out.print(" Thanks :)");
//     }
// }
// public class JavaCourse{
//     public static int sum_of_number(int a, int b){
//         return a+b;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the 1st number : ");
//         int a = sc.nextInt();
//         System.out.print("Enter the 2nd number : ");
//         int b = sc.nextInt();
//         System.out.print(sum_of_number(a, b));
//     }
// }
// public class JavaCourse{
//     public static int factorial(int a){
//         int pr = 1;
//         if(a==0){
//             return 1;
//         }else{
//             for(int i=1; i<=a; i++){
//                 pr *= i; 
//             }
//         }return pr;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int a = sc.nextInt();
//         System.out.print(factorial(a));
//     }
// }
// public class JavaCourse{
//     public static int sum_odd(int a){
//         int sum=0;
//         for(int i=1; i<=a; i++){
//             if (i%2!=0){
//                 sum+=i;
//             }
//         }
//         return sum;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int num = sc.nextInt();
//         System.out.print(sum_odd(num));
//     }
// }
// public class JavaCourse{
//     static int pCount = 0, oCount = 0, zCount = 0;
//     public static void Count(int x){
//         if (x>0){
//             pCount++;
//         }else if(x<0){
//             oCount++;
//         }else zCount++;
//     }
//     public static void main(String args[]){
//         Boolean flag = true;
//         Scanner s = new Scanner(System.in);
//         while(flag == true){
//             System.out.print("Enter your number : ");
//             int b = s.nextInt();////here after nextInt the next line is reserved and no more nextline can be excepted but we can use next() instard of nextline() because next() take only one space but nextline take entire line which is already took by nextInt()...
//             Count(b);
//             System.out.print("Do you want to coninue (Y/N) : ");
//             String a = s.next().toUpperCase();
//             if(a.equals("N")){
//                 flag = false;
//             }
//         }
//         System.out.println("\nThe number of positive are " + pCount);
//         System.out.println("The number of negative are " + oCount);
//         System.out.println("The number of zero are " + zCount);
//         s.close();
//     }
// }
// public class JavaCourse{
//     public static int power(int x, int y){
//         int product = 1;
//         for(int i=1; i<=y; i++){
//             product*=x;
//         }
//         return product;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int num = sc.nextInt();
//         System.out.print("Enter the power : ");
//         int p = sc.nextInt();
//         System.out.print(power(num,p));
//     }
// }
// public class JavaCourse{
//     public static int gci(int x, int y){
//         while(y!=0){
//             int temp = y;
//             y = x%y;
//             x = temp;
//         }
//         return x;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your 1st number : ");
//         int a = sc.nextInt();
//         System.out.print("Enter your 2nd number : ");
//         int b = sc.nextInt();
//         System.out.print(gci(a,b));
//     }
// }
// public class JavaCourse{
//     static int before =0;
//     public static void fibonacci(int x){
//         int after = 1,pronew=0;
//         System.out.print("0 ");
//         for(int i=1; i<=x; i++){
//             int temp = after;
//             pronew = before+after;
//             after = pronew;
//             before = temp;
//             System.out.print(after+" ");
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the nth number for fibonacci : ");
//         int a = sc.nextInt();
//         fibonacci(a);
//     }
// }
// public class JavaCourse{
//     public  static void main(String args[]){
//         int arr[] = new int[20];
//         arr[0] = 1;
//         arr [1] = 4;
//         for(int i=2; i<=19; i++){
//             arr[i] = i*2;
//         }
//         for(int i=0; i<=19; i++){
//             System.out.println(arr[i]);
//         }
//     }
// }
// public class JavaCourse{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Size of array : ");
//         int a = sc.nextInt();
//         int arr[] = new int[a];
//         for(int i=0; i<a; i++){
//             System.out.printf("Enter the %d array : ",i+1);
//             arr[i] = sc.nextInt();
//         }
//         for(int i=0; i<=a; i++){
//             System.out.println(arr[i]);
//         }
//     }
// }
// public class JavaCourse{
//     public static void main(String args[]){
//         int arr[] = {2,5,3,6,3,4,3};
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your number : ");
//         int a = sc.nextInt();
//         for(int i=0; i<=arr.length-1; i++){
//             if(arr[i] == a){
//                 System.out.printf("The index of %d is %d",arr[i],i);
//             }
//         }
//     }
// }
// public class JavaCourse{
//     public static void main(String args[]){
//         int arr[][] = new int[2][4];
//         Scanner sc = new Scanner(System.in);
//         //To input array
//         for(int i=0; i<=1; i++){
//             for(int j=0; j<=3; j++){
//                 System.out.printf("Enter the array of (%d,%d) : ",i,j);
//                 arr[i][j]=sc.nextInt();
//             }
//         }
//         //To print array
//         for(int i=0; i<=1; i++){
//             for(int j=0; j<=3; j++){
//                 System.out.print(" "+arr[i][j]);
//             }
//             System.out.print("\n");
//         }
//     }
// }

// public class JavaCourse{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of rows : ");
//         int r = sc.nextInt();
//         System.out.print("Enter the number of column : ");
//         int c = sc.nextInt();
//         int arr[][] = new int[r][c];
//         for(int i=0; i<r; i++){//to store int array
//             for(int j=0; j<c; j++){
//                 System.out.printf("Enter the array of (%d,%d) : ",i+1,j+1);
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         for(int i=0; i<r; i++){//to display the array
//             for(int j=0; j<c; j++){
//                 System.out.print(" "+arr[i][j]);
//             }
//             System.out.print("\n");
//         }
//         System.out.print("Write number to be searched : ");
//         int find = sc.nextInt();
//         Boolean flag = false;
//         for(int i=0; i<r; i++){
//             for(int j=0; j<c; j++){
//                 if (arr[i][j]==find){
//                     System.out.printf("The index of %d if (%d,%d)",find,i+1,j+1);
//                     flag = true;
//                 }
//             }
//         }
//         if(flag==false){
//             System.out.printf("%d is'nt present in array",find);
//         }
//     }
// }

// public class JavaCourse{
//     public static void main(String args[]){
//         String name = "nikhilz";
//         String name1 = "znikhil";
//         System.out.print(name1.substring(1));
//         if(name.compareTo(name1)==0) System.out.print("\nEqual string");
//         else if(name.compareTo(name1)<0) System.out.print("\nname1 is greater then name");
//         else System.out.print("\nname1 is smaller then name");
//     }
// }
// public class JavaCourse{
//     public static void main(String args[]){
//         StringBuilder a = new StringBuilder("NIkhil");
//         System.out.println(a);
//         System.out.println(a.charAt(0));
//         a.setCharAt(0,'P');
//         System.out.println(a);
//         a.insert(0,"s");
//         System.out.println(a);
//         a.delete(0,2);
//         System.out.println(a);
//         a.append('n');
//         System.out.println(a);
//     }
// }
// public class JavaCourse{
//     public static void main(String args[]){
//         int n = 4;//0100
//         int position = 3;
//         int bitmask = 1<<position;
//         int newnumber = n | position;
//         System.out.print(newnumber);

//     }
// }
// public class JavaCourse{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("What you like to change:)\n 1) 0 to 1\n 2) 1 to 0\nChoose--> : ");
//         int a = sc.nextInt();
//         int num = 5;
//         int positon = 2; 
//         int bitmask = 1<<positon;
//         if (a==1){
//             System.out.print(num | bitmask);
//         }else{ 
//             int not = ~(bitmask);
//             System.out.print(not & num);
//         }
//     }
// }
// public class JavaCourse{////Bubble sort
//     public static void main(String args[]){////check one by one if the element is smaller then next then it shift by one and check the same for all
//         int arr[] = {1,55,4,0,2};
//         for(int i=0; i<arr.length; i++){
//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[i]>arr[j]){
//                     int temp = arr[i];
//                     arr[i] = arr[j];
//                     arr[j] = temp;
//                 }
//             }
//         }
//         for(int i=0; i<arr.length; i++){
//             System.out.print(" "+arr[i]);
//         }
//     }
// }
// public class JavaCourse{
//     public static void main(String args[]){//selection sort
//         int arr[] = {6,4,2,5,3,6};//in this code i value is compared with j+1 value when we get any smallest element then i is changed with j so that next inner loop will have i value with last j value and then it will go on comparing when i=0 complete we would have got the smallest and swapped with i value
//         for(int i=0; i<arr.length; i++){
//             int small=i;
//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[small]>arr[j]){
//                     small = j;
//                 }
//             }
//             int temp = arr[small];
//             arr[small] = arr[i];
//             arr[i] = temp;
//         }
//         for(int i=0; i<arr.length; i++){
//             System.out.print(" "+arr[i]);
//         }
//     }
// }
// public class JavaCourse{
//     public static void main(String args[]){//insertion sort
//         int arr[] = {5,4,7,3,8,3};
//         for(int i=1; i<arr.length; i++){
//             int current = arr[i];
//             int j = i-1;
//             while(j>=0 && current<arr[j]){
//                 arr[j+1] = arr[j];
//                 j--;
//             }
//             arr[j+1] = current;
//         }
//         for(int i=0; i<arr.length;i++){
//             System.out.print(" "+arr[i]);
//         }
//     }
// }
// public class JavaCourse{
//     public static int recursion(int x){
//         System.out.println(x);
//         if (x==5){
//             return 0;
//         }
//         return recursion(x+1);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int a = sc.nextInt();
//         recursion(a);
//         System.out.print("Thankyou");
//     }
// } 
// public class JavaCourse{
//     public static void PrintSum(int i, int n, int sum){
//         if(i > n){
//             System.out.print(sum);
//             return;
//         }
//         sum+=i;
//         PrintSum(i+1,n,sum);
//     }
//     public static void main(String args[]){
//         PrintSum(1,5,0);
//     }
// public class JavaCourse{
//     public static int factorial(int a){
//         if(a==1){
//             return 1;
//         }
//         return a*factorial(a-1);
//     }
//     public static void main(String args[]){
//         System.out.print(factorial(4));
//     }
// }
// public class JavaCourse{
//     public static void fibonacci(int nth, int a, int b){
//         if(nth==0){
//             return;
//         }
//         int c = a + b;
//         System.out.print(" "+c);
//         fibonacci(nth-1, b, c);
//     }
//     public static void main(String args[]){
//         int a=0,b=1;
//         System.out.print(" "+a);
//         System.out.print(" "+b);
//         fibonacci(5,a,b);
//     }
// }
// public class JavaCourse{
//     public static int power(int x, int n){
//         if(n==0){
//             return 1;
//         }
//         int power1 = x*power(x, n-1);
//         // int power2 = x * power1;
//         return power1;
//     }
//     public static void main(String args[]){
//         System.out.print(power(4,3));
//     }
// }
// public class JavaCourse{
//     public static int power(int x, int n){
//         if(n==0) return 1;
//         if(x==0) return 0;
//         int a = power(x, n/2);
//         if(n%2==0) return a * a;
//         else return a *a * x;
//     }
//     public static void main(String args[]){
//         System.out.print(power(2, 5));
//     }
// }
// public class JavaCourse{////Tower Of Honai
//     public static void TowerOfHonai(int n, String s, String h, String d){
//         if(n==1){
//             System.out.println("Transfor Disk "+ n +" from "+ s + " to "+d);
//             return;
//         }
//         TowerOfHonai(n-1, s, d, h);
//         System.out.println("Transfor. Disk "+ n +" from "+ s + " to "+d);
//         TowerOfHonai(n-1, h, s, d);
//     }
//     public static void main(String args[]){
//         TowerOfHonai(3, "S", "H", "D");
//     }
// }
// public class JavaCourse{
//     public static void reverse(String x, int c){
//         if (c==-1){
//             return;
//         }
//         System.out.print(x.charAt(c));
//         reverse(x, c-1);
//         }
//     public static void main(String args[]){
//         String a = "Nikhil";
//         reverse(a, a.length()-1);
//     }
// }
// public class JavaCourse{
//     public static int first = -1;
//     public static int last = -1;
//     public static void FindMyString(String str, int idx, char element){
//         if(idx==str.length()){
//             System.out.println(first);
//             System.out.println(last);
//             return;
//         }
//         char currchar = str.charAt(idx);
//         if(currchar == element){ 
//             if(first == -1) first = idx;
//             else last = idx;
//         }
//         FindMyString(str, idx+1, element);

//     }
//     public static void main(String args[]){
//         String s = "abdjjbanabk";
//         FindMyString(s,0,'a');
//     }
// }
// public class JavaCourse{
//     public static boolean sorted(int arr[],int idx){
//         if(idx == arr.length-1){
//             // System.out.print("sorted");
//             return true;
//         }
//         if(arr[idx]<arr[idx+1]) return sorted(arr, idx+1);
//         else return false;
//     }
//     public static void main(String args[]){
//         int arr[] = {1,2,5,7,9,12};
//         System.out.print(sorted(arr, 0));
//     }
// }
// public class JavaCourse{
//     public static void pushAllX(String x, int count, String newString, int idx){
//         if(idx == x.length()){
//         System.out.print(newString);
//         for(int i=0; i<count; i++){
//             System.out.print("x");
//         }
//             return;
//         }
//         char eachchar = x.charAt(idx);
//         if(eachchar != 'X' && eachchar != 'x'){
//             newString += eachchar;
//         }else{
//             count++;
//         }
//         pushAllX(x, count, newString, idx+1);
//     }
//     public static void main(String args[]){
//         String a = "n the land of Xylon, exotic and vast,Where xyo and xen";
//         pushAllX(a, 0, "", 0);
//     }
// }
// public class JavaCourse{
//     public static boolean arr[] = new boolean[26];
//     public static void dublicate(String x,int idx,String newstring){
//         if(idx == x.length()){
//             System.out.print(newstring);
//             return;
//         }
//         char eachchar = x.charAt(idx);
//         if(arr[eachchar - 'a'] == true){
//             dublicate(x, idx+1,newstring);
//         }else{
//             newstring += eachchar;
//             arr[eachchar - 'a'] = true;
//             dublicate(x, idx+1, newstring);
//         }
//     }
//     public static void main(String args[]){
//         String a = "Nikhil";
//         a = a.toLowerCase();
//         dublicate(a,0,"");
//     }
// }
// public class JavaCourse{
//     public static void subsequences(String x, int idx, String newString, HashSet<String> set){
//         if(idx == x.length()){
//             if(set.contains(newString)){
//                 return;
//             }else{
//                 System.out.println(newString);
//                 set.add(newString);
//                 return;
//             }
//         }
//         char eachstr = x.charAt(idx);
//         //to be
//         subsequences(x, idx+1, newString+eachstr,set);
//         //not to be
//         subsequences(x, idx+1, newString,set);
//     }
//     public static void main(String args[]){
//         String a = "abc";
//         HashSet<String> set = new HashSet<>();
//         subsequences(a, 0, "",set);
//     }
// }
// public class JavaCourse{
//     public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
//     public static void printcomb(String str, int idx, String combination){
//         if(idx == str.length()){
//             System.out.println(combination);
//             return;
//         }
//         char eachChar = str.charAt(idx);
//         String mapping = keypad[eachChar - '0'];

//         for(int i=0; i<mapping.length(); i++){
//             printcomb(str, idx+1, combination+mapping.charAt(i));
//         }
//     }
//     public static void main(String args[]){
//         String a = "12";
//         printcomb(a, 0, "");
//     }
// }
// public class JavaCourse{
//     public static void printpermutation(String str, String permutation){
//         if(str.length() == 0){
//             System.out.println(permutation);
//             return;
//         }
//         for(int i=0; i<str.length(); i++){
//             char currchar = str.charAt(i);
//             String newstr = str.substring(0, i) + str.substring(i+1);
//             printpermutation(newstr, permutation+currchar);
//         }
//     }
//     public static void main(String args[]){
//         String a = "abc";
//         printpermutation(a, "");
//     }
// }
// public class JavaCourse{
//     public static int matrixCountPath(int i, int j, int n, int m){
//         if(i==n || j==m){
//             return 0;
//         }
//         if(i == n-1 && j == m-1){
//             return 1;
//         }
//         //move downwards
//         int downpath = matrixCountPath(i+1, j, n, m);

//         //move rightwards
//         int rightpath = matrixCountPath(i, j+1, n, m);
//         return downpath + rightpath; 
//     }
//     public static void main(String args[]){
//         int n = 3;
//         int m = 3;
//         System.out.println(matrixCountPath(0, 0, n, m));
//     }
// }
// public class JavaCourse{////output wrong
//     public static int placeTiles(int n, int m){
//         if(n == m){
//             return 2;
//         }
//         if(n < m){
//             return 1;
//         }
//         //vertically
//         int vertically = placeTiles(n-m, m);

//         //horizontally
//         int horizontally = placeTiles(n-1, m);

//         return vertically + horizontally;
//     }
//     public static void main(String args[]){
//         int n = 4;
//         int m = 2;
//         System.out.print(placeTiles(n, m));
//     }
// }
// public class JavaCourse{
//     public static int callguest(int n){
//         if(n<=1){
//             return 1;
//         }
//         //single 
//         int single = callguest(n-1);
//         //pair
//         int pair = (n-1)*callguest(n-2);
//         return single + pair;
//     }
//     public static void main(String args[]){
//         int n = 4;
//         System.out.println(callguest(n));
//     }
// }
// public class JavaCourse{
//     public static void printpermutation(String str, String permString, int idx){
//         if(str.length() == 0){
//             System.out.println(permString);
//             return ;
//         }
//         for(int i=0; i<str.length(); i++){
//             char currchar = str.charAt(i);
//             String newstr = str.substring(0, i) + str.substring(i+1);
//             printpermutation(newstr, permString + currchar, idx+1);
//         }
//     }
//     public static void main(String args[]){
//         String a = "ABC";
//         printpermutation(a, "", 0);
//     }
// }

// public class jav{
//     public static int dublicate(List<Integer> list){
//         if(list == null){
//             return 0;
//         }
//         int count = 1;
//         for(int i=1; i<list.size(); i++){
//            if(!list.get(i).equals(list.get(i-1))){
//             list.set(count, list.get(i));
//             count++;
//            }
//         }
//         return count;
//     }
    
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         List<Integer> list = new ArrayList<>();

//         System.out.print("Enter the number of elements: ");
//         int len = sc.nextInt();

//         for (int i = 0; i < len; i++) {
//             System.out.printf("Enter the %d array: ", i + 1);
//             int newarray = sc.nextInt();
//             list.add(newarray);
//         }

//         System.out.print(dublicate(list));
//         sc.close();
//     }
// }

// public class jav{
//     public static int remove_dublicate(Integer[] nums, int val){
//         int index = 0;
//         for(int i=0; i<nums.length; i++){
//             if(nums[i] != val){
//                 nums[index] = nums[i];
//                 index++;
//             }
//         }
//         return index;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter the Array index: ");
//         int index_num = sc.nextInt();
//         Integer[] arr = new Integer[index_num]; // int[] arr = new int[index_num]; here i did'nt used this because this type of array does'nt take null value 
//         for(int i = 0; i<index_num; i++){
//             System.out.printf("Enter Element at index %d : ",i);
//             arr[i] = sc.nextInt();
//         }
//         // jav obj = new jav();
//         int newLength = remove_dublicate(arr, 3);
//         for(int j = newLength; j<arr.length; j++){
//             arr[j]=null;
//         }
//         System.out.printf("The length of Array is %d\n",newLength);
//         System.out.println(Arrays.toString(arr));
//     }
// }

// public class jav{
//     public static int similarity(String first, String second){

//         if(first.length() < second.length()){
//             return -1;
//         }
//         for(int i=0; i<=first.length(); i++){
//             if(first.substring(i, i+second.length()).equals(second)){
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String args[]){
        
//         Scanner sc = new Scanner(System.in);

//         System.out.printf("Enter the first string : ");
//         String f = sc.nextLine();

//         System.out.printf("Enter the second string : ");
//         String s = sc.nextLine();

//         System.out.printf("%d",similarity(f, s));

//     }
// }

// public class jav{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of a : ");
//         int a = sc.nextInt();
//         System.out.println("Enter the value of b : ");
//         int b = sc.nextInt();
//         System.out.println("Enter your operator : ");
//         char ch=sc.next().charAt(0);
//         switch(ch){
//             case '+' : System.out.print(a+b);
//                         break;
//             case '-' : System.out.print(a-b);
//                         break;
//             case '*' : System.out.print(a*b);
//                         break;
//             case '/' : System.out.print(a/b);
//                         break;
//             default : System.out.print("Invalid");
//         }
//     }
// }

// public class jav{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         do{
//             System.out.print("Enter the number : ");
//             int num = sc.nextInt();

//             if (num % 10==0){
//                 break;
//             }

//             System.out.println(num);
//         }while(true);
//     }
// }

// public class jav{
//     public static void main(String []args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int num = sc.nextInt();

//         if (num==2){
//             System.out.println(num+" is prime");
//         }
//         else{
//             int count = 0;
//             for(int i=2; i*i<=num; i++){
//                 if (num % i == 0){
//                     count+=1;
//                 }
//             }
//             String result = (count>=1) ? num+" is composite number"  : num+" is prime" ;
//             System.out.println(result);
//         }
//     }
// }


// public class jav{
//     public static void main(String args[]){

//         Scanner sc = new Scanner(System.in);
//         int sum_even = 0;
//         int sum_odd = 0;
//         char stop = 'Y';

//         while (stop == 'Y'){
//             System.out.print("Enetr the number : ");
//             int num = sc.nextInt();
//             if(num % 2 == 0){
//                 sum_even += num;
//             }
//             else{
//                 sum_odd += num;
//             }
//             System.out.print("Want to continue y/n : ");
//             stop = Character.toUpperCase(sc.next().charAt(0));
//         }

//         System.out.println("The sum of all the even number is : "+sum_even);
//         System.out.println("The sum of all the odd number is : "+sum_odd);
//     }
// }

// public class jav{
//     public static void main(String args[]){

//         int fact = 1;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enetr the Factorial number : ");
//         int num = sc.nextInt();
//         if(fact == 0){
//             System.out.println("The factorial of "+num+" is : 1");
//         }
//         else{
//             for(int i=1; i<=num; i++){
//                 fact *= i;
//             }
//         }
//         System.out.print("The factorial of "+num+" is : "+fact);
//     }
// }

// public class jav{
//     public static void main(String args[]){

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the table : ");
//         int num = sc.nextInt();
        
//         for(int i=1; i<=10; i++){
//             System.out.println(i+" X "+num+" = "+i*num);
//         }
//     }
// }

// public class jav{
//     public static void main(String args[]){

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of rows : ");
//         int num = sc.nextInt();
        
//         for(int i=0; i<num; i++){
//             for(int j=0; j<=i; j++){
//                 System.out.print(" *");
//             }
//             System.out.print("\n");
//         }
//     }
// }

// public class jav{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of rows : ");
//         int num = sc.nextInt();

//         for(int i=num; i>0; i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print(" *");
//             }
//             System.out.println();
//         }
//     }
// }

// public class jav{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of rows : ");
//         int num = sc.nextInt();

//         for(int i=1; i<=num; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// public class jav{
//     public static void main(String[] args){

//         int count = 65;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of rows : ");
//         int num = sc.nextInt();

//         for(int i=0; i<num; i++){
//             for(int j=0; j<=i; j++){
//                 System.out.print((char) count);
//                 count++;
//             }
//             System.out.println();
//         }
//     }
// }

// public class jav{
//     public static void swap(int a, int b){
//         int temp = a; 
//         b = a;
//         a = temp; 
//     }
//     public static void main(String args[]){

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of a : ");
//         int a = sc.nextInt();
//         System.out.print("Enter the value of b : ");
//         int b = sc.nextInt();
//         swap(a, b);
//     }
// }

// public class jav{
//     public static int fun_product(int x, int y){
//         int multi = x*y;
//         return multi;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the 1st number : ");
//         int x = sc.nextInt();
//         System.out.print("Enter the 2nd number : ");
//         int y = sc.nextInt();
//         System.out.print(fun_product(x,y));
//     }
// }

// public class jav{
//     public static void binary_to_decimal(int bin_num){
//         int dec = 0, pow = 0;
//         while(bin_num != 0){
//             int last_dig = bin_num%10;
//             dec = dec + (last_dig * (int)Math.pow(2,pow));
//             pow++;
//             bin_num /= 10;
//         }
//         System.out.println(dec);
//     }
//     public static void main(String []args){
//         binary_to_decimal(111);
//     }
// }

// public class jav{
//     public static void decToBin(int n){
//         int pow=0,bin=0;
//         while(n>0){
//             int rem = n % 2;
//             bin = bin + (rem * (int)Math.pow(10,pow));
//             pow++;
//             n /= 2;
//         }
//         System.out.println(bin);
//     }
//     public static void main(String []args){
//         decToBin(100);
//     }
// }

// public class jav{
//     public static void hollow_rectangle(int row, int column){
//         for(int i=0; i<row; i++){
//             for(int j=0; j<column; j++){
//                 if(i==0 || j==0 || i==row-1 || j==column-1){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         hollow_rectangle(3,9);
//     }
// }

// public class jav{
//     public static void inverted_pyramid(int row){
//         for(int i=0; i<row; i++){
//             for(int j=0; j<row-i-1; j++){
//                 System.out.print("  ");
//             }
//             for(int k=0; k<i+1; k++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         inverted_pyramid(100);
//     }
// }

// public class jav{
//     public static void inv_half_py_num(int row){
//         for(int i=0; i<row; i++){
//             for(int j=1; j<row-i+1; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String []args){
//         inv_half_py_num(5);
//     }
// }

// public class jav{
//     public static void floyds_tringle(int row){
//         int k=1;
//         for(int i=0; i<row; i++){
//             for(int j=1; j<=i+1; j++){
//                 System.out.print(k+" ");
//                 k++;
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         floyds_tringle(5);
//     }
// }

// public class jav{
//     public static void tringle_0_1(int row){
//         for(int i=0; i<row; i++){
//             for(int j=0; j<i+1; j++){
//                 if((i+j)%2==0){
//                     System.out.print("1 ");
//                 }else{
//                     System.out.print("0 ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         tringle_0_1(5);
//     }
// }

// public class jav{
//     public static void butterfly_pattern(int rows){
//         for(int i=0; i<rows; i++){
//             //up side
//             for(int j=0; j<i; j++){
//                 System.out.print("* ");
//             }
//             for(int j=0; j<2*(rows-i-1); j++){
//                 System.out.print("  ");
//             }
//             for(int j=0; j<i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//             //lower side
//             for(int i=0; i<rows; i++){
//                 for(int j=0; j<rows-i-1; j++){
//                 System.out.print("* ");
//             }
//             for(int j=0; j<2*(i); j++){
//                 System.out.print("  ");
//             }
//             for(int j=0; j<rows-i-1; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//             }
//     }
//     public static void main(String args[]){
//         butterfly_pattern(5);
//     }
// }

// public class jav{
//     public static void solid_rombus(int rows){
//         for(int i=0; i<rows; i++){
//             for(int j=0; j<rows-i; j++){
//                 System.out.print("  ");
//             }
//             for(int j=0; j<rows; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         solid_rombus(5);
//     }
// }

// public class jav{
//     public static void hollow_rombus(int rows){
//         for(int i=0; i<rows; i++){
//             for(int j=0; j<rows-i; j++){
//                 System.out.print("  ");
//             }
//             for(int j=0; j<rows; j++){
//                 if(i==0 || j==0 || j==rows-1 || i==rows-1){
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         hollow_rombus(5);
//     }
// }

// public class jav{
//     public static void diamond_partern(int rows){
//         //upper side
//         for(int i=1; i<=rows; i++){
//             for(int j=0; j<rows-i; j++){
//                 System.out.print("  ");
//             }for(int j=0; j<i; j++){
//                 System.out.print("* ");
//             }
//             for(int j=0; j<i-1; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         //Lower side
//         for(int i=1; i<=rows; i++){
//             for(int j=0; j<i; j++){
//                 System.out.print("  ");
//             }for(int j=0; j<rows-i; j++){
//                 System.out.print("* ");
//             }
//             for(int j=0; j<rows-i-1; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         diamond_partern(5);
//     }
// }

// public class jav{
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int arr[] = new int[20];
//         for(int i=0; i<6; i++){
//             System.out.print("Enter the element of index "+(i+1)+" : ");
//             arr[i] = sc.nextInt();
//         }
//         for(int i=0; i<20; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

// public class jav{
//     public static int find_word(String arr[], String word){
//         for(int i=0; i<arr.length; i++){
//            if (arr[i].equals(word))
//                 return i;
//         }
//         return -1;
//     }
//     public static void main(String []args){
//         String fruits[] = {"Apple", "Bannana", "orange"};
//         String find = "Bannana";
//         int index = find_word(fruits, find);
//         System.out.print((index == -1) ? "Not fount" : "found at index "+index);
//     }
// }

// public class jav{
//     public static int arr_small(int arr[]){
//         int smallest = Integer.MAX_VALUE;
//         for(int i=0; i<arr.length; i++){
//             if(arr[i]<smallest){
//                 smallest = arr[i];
//             }
//         }
//         return smallest;
//     }
//     public static void main(String args[]){
//         int arr[] = {3,6,2,1,7,3,8,10};
//         System.out.print(arr_small(arr));
//     }
// }

// public class jav{
//     public static int find_index(int arr[], int num){
//         int start = 0, end = arr.length-1;
//         while(start<=end){
//             int mid = (start+end)/2;
//             if(arr[mid]==num){
//                 return mid;
//             }
//             if(arr[mid]<num){
//                 start = mid + 1;
//             }else{
//                 end = mid - 1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int arr[] = {2,4,6,8,23,45,78,90};
//         int key = 78;
//         System.out.print(find_index(arr, key));
//     }
// }

// public class jav{
//     public static void arr_reverse(int arr[]){
//         int first = 0, last = arr.length-1;
//         while(first<last){
//             int temp = arr[first];
//             arr[first] = arr[last];
//             arr[last] = temp;
//             first++;
//             last--;
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {1,12,5,48,9};
//         arr_reverse(arr);
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

// public class jav{
//     public static void printpairs(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             for(int j=i+1; j<arr.length; j++){
//                 System.out.print("("+arr[i]+","+arr[j]+") ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {1,4,6,8,9,10};
//         printpairs(arr);
//     }
// }

// public class jav{
//     public static void PrintSubarrays(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             for(int j=i; j<arr.length; j++){ 
//                 System.out.print("[ ");
//                 for(int k=i; k<=j; k++){
//                     System.out.print(arr[k]+" ");
//                 }
//                 System.out.print("]");
//                 System.out.println();
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String []args){
//         int arr[] = {7,3,8};
//         PrintSubarrays(arr);
//     }
// }

// public class jav{
//     public static void MaxSubarraySum(int arr[]){
//         int MaxSum = Integer.MIN_VALUE;
//         for(int i=0; i<arr.length; i++){
//             for(int j=i; j<arr.length; j++){
//                 int currSum = 0;
//                 for(int k=i; k<=j; k++){
//                     currSum += arr[k];
//                 }
//                 // System.out.print(currSum);
//                 if(MaxSum < currSum){
//                     MaxSum = currSum;
//                 }
//             }
//         }
//         System.out.print("MaxSum : "+MaxSum);
//     }
//     public static void main(String args[]){
//         int arr[] = {-2,-3,4,-1,-2,1,5,-3};
//         MaxSubarraySum(arr);
//     }
// }

// public class jav{
//     public static void PreMaxSubarraySum(int arr[]){
//         int MaxSum = Integer.MIN_VALUE;
//         int CurrSum = 0;
//         int prefix[] = new int[arr.length];
//         prefix[0] = arr[0];
//         for(int i=1; i<prefix.length; i++){
//             prefix[i] = prefix[i-1] + arr[i];
//         }
//         for(int i=0; i<arr.length; i++){
//             for(int j=i; j<arr.length; j++){
//                 CurrSum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
//                 if(MaxSum<CurrSum){
//                     MaxSum = CurrSum;
//                 }
//             }
//         }
//         System.out.print("Max Sum of an subarray is : "+MaxSum);
//     }
//     public static void main(String args[]){
//         int arr[] = {-2,-3,4,-1,-2,1,5,-3};
//         PreMaxSubarraySum(arr);
//     }
// }

// public class jav{
//     public static void kadanes(int arr[]){
//         int cs = 0;
//         int ms = Integer.MIN_VALUE;
//         for(int i=0; i<arr.length; i++){
//             cs = cs + arr[i];
//             if(cs<0){
//                 cs = 0;
//             }
//             ms = Math.max(cs,ms);
//         }
//         System.out.print(ms);
//     }
//     public static void main(String args[]){
//         int arr[] = {-2,-3,4,-1,-2,1,5,-3};
//         kadanes(arr);
//     }
// }

// public class jav{
//     public static int trappedRainWater(int height[]){
//         int n = height.length;
//         //calculate the left max boundary - array
//         int leftMax[] = new int[height.length];
//         leftMax[0] = height[0];
//         for(int i=1; i<n; i++){
//             leftMax[i] = Math.max(leftMax[i-1], height[i]);
//         }

//         //calculate the right max boundary - array
//         int rightMax[] = new int[n];
//         rightMax[n-1] = height[n-1];
//         for(int i = n-2; i>=0; i--){
//             rightMax[i] = Math.max(height[i], rightMax[i+1]);
//         }

//         int trappwater = 0;
//         for(int i=0; i<n; i++){
//             int waterLevel = Math.min(leftMax[i], rightMax[i]);
//             trappwater = trappwater + (waterLevel - height[i]);
//         }
//         return trappwater;
//     }

//     public static void main(String args[]){
//         int height[] = {4,2,0,6,3,2,5};
//         System.out.print(trappedRainWater(height));
//     }
// }

// public class jav{
//     public static int BuyAndSellStock(int arr[]){
//         int buyPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;
//         for(int i=0; i<arr.length; i++){
//             if(buyPrice < arr[i]){
//                 int profit = arr[i] - buyPrice;
//                 maxProfit = Math.max(profit, maxProfit);
//             }else{
//                 buyPrice = arr[i];
//             }
//         }
//         return maxProfit;
//     }
//     public static void main(String args[]){
//         int arr[] = {7,1,5,3,6,4};
//         System.out.print(BuyAndSellStock(arr));
//     }
// }

// public class jav{
//     public static boolean containsDuplicate(int[] nums){
//         HashSet<Integer> set = new HashSet<>();
//         for(int num : nums){
//             if(set.contains(num)){
//                 return true;
//             }
//             set.add(num);
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         int arr[] = {1,2,4,5};
//         System.out.print(containsDuplicate(arr));
//     }
// }

// public class jav{
//     public static int searchTarget(int arr[], int target){
//         int left = 0;
//         int right = arr.length - 1;
//         while(left<=right){
//             int mid = (left + right)/2;
//             if(arr[mid] == target){
//                 return mid;
//             }
//             if(arr[left] <= arr[mid]){
//                 if(arr[left] <= target && target <= arr[mid]){
//                     right = mid - 1;
//                 }else{
//                     left = mid + 1;
//                 }
//             }
//             else{
//                 if(target > arr[mid] && target <= arr[right]){
//                 left = mid + 1;
//                 }
//                 else{
//                     right = mid - 1;
//                 }
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int arr[] = {4, 5, 6, 7, 0, 1, 2};
//         System.out.print(searchTarget(arr, 6));
//     }
// }

// public class jav{
//     public static void BubbleSorting(int arr[]){
//         int n = arr.length;
//         for(int i=0; i<n-1; i++){
//             for(int j=0; j<n-i-1; j++){
//                 if(arr[j] > arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//         for(int i=0; i<n; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {5,4,1,3,2};
//         BubbleSorting(arr);
//     }
// }

// public class jav{
//     public static void SelectionSort(int arr[]){
//         int n = arr.length;
//         for(int i=0; i<n-1; i++){
//             int minIdx = i;
//             for(int j=i+1; j<n; j++){
//                 if(arr[minIdx]>arr[j]){
//                    minIdx = j;
//                 }
//             }
//             int temp = arr[minIdx];
//             arr[minIdx] = arr[i];
//             arr[i] = temp;
//         }
//         for(int i=0; i<n; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {5,4,3,1,2};
//         SelectionSort(arr);
//     }
// }

// public class jav{
//     public static void InsertionSort(int arr[]){
//         int n = arr.length;
//         for(int i=1; i<n; i++){
//             int curr = arr[i];
//             int prev = i-1;
//             while(prev >= 0 && arr[prev]>curr){
//                 arr[prev+1] = arr[prev];
//                 prev--;
//             }
//             arr[prev+1] = curr;
//         }
//         for(int i=0; i<n; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {5,4,3,1,2};
//         InsertionSort(arr);
//     }
// }

// public class jav{
//      public static void printArr(Integer[] arr) {
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
//     public static void main(String args[]){
//         Integer arr[] = {5,4,3,1,2};
//         Arrays.sort(arr,0,5,Collections.reverseOrder());
//         printArr(arr);
//     }
// }

// public class jav{
//     public static void CountingSort(int arr[]){
//         int largest = Integer.MIN_VALUE;
//         for(int i=0; i<arr.length; i++){
//             largest = Math.max(largest, arr[i]);
//         }
//         int count[] = new int[largest + 1];
//         for(int i=0; i<arr.length; i++){
//             count[arr[i]]++;
//         }
//         int j=0;//count = [0][2][1][1] arr = [2][1][1][3]
//         for(int i=0; i<count.length; i++){
//             while(count[i]>0){
//                 arr[j] = i;
//                 j++;
//                 count[i]--;
//             }
//         }
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }

//     }
//     public static void main(String args[]){
//         int arr[] = {3,4,5,2,3,4,5};
//         CountingSort(arr);
//     }
// }

// public class jav{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter row and column : ");
//         int row = sc.nextInt();
//         int column = sc.nextInt();
//         int arr[][] = new int[row][column];
//         for(int i=0; i<arr.length; i++){
//             for(int j=0; j<arr[0].length; j++){
//                 System.out.printf("Enter the value of (%d,%d)",i+1,j+1);
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         for(int i=0; i<arr.length; i++){
//             for(int j=0; j<arr[0].length; j++){
//                 System.out.printf(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class jav {
//     public static void printSpiral(int arr[][]) {
//         int startRow = 0;
//         int startColumn = 0;
//         int endRow = arr.length - 1;
//         int endColumn = arr[0].length - 1;

//         while (startRow <= endRow && startColumn <= endColumn) {
//             // top row
//             for (int j = startColumn; j <= endColumn; j++) {
//                 System.out.print(arr[startRow][j] + " ");
//             }
//             startRow++;

//             // right column
//             for (int i = startRow; i <= endRow; i++) {
//                 System.out.print(arr[i][endColumn] + " ");
//             }
//             endColumn--;

//             // bottom row
//             if (startRow <= endRow) {
//                 for (int j = endColumn; j >= startColumn; j--) {
//                     System.out.print(arr[endRow][j] + " ");
//                 }
//                 endRow--;
//             }

//             // left column
//             if (startColumn <= endColumn) {
//                 for (int i = endRow; i >= startRow; i--) {
//                     System.out.print(arr[i][startColumn] + " ");
//                 }
//                 startColumn++;
//             }
//         }
//     }

//     public static void main(String args[]) {
//         int arr[][] = {
//             {1, 2, 3, 4},
//             {5, 6, 7, 8},
//             {9, 10, 11, 12},
//             {13, 14, 15, 16}
//         };
//         printSpiral(arr);
//     }
// }

// public class jav{
//     public static int diagonalSum(int arr[][]){
//         int sum=0;
//         for(int i=0; i<arr.length; i++){
//             for(int j=0; j<arr.length; j++){
//                 if(i==j){
//                     sum += arr[i][j];
//                 }
//             }
//         }
//         return sum;
//     }
//     public static void main(String args[]){
//          int arr[][] = {
//             {1, 2, 3, 4},
//             {5, 6, 7, 8},
//             {9,10,11,12},
//             {13,14,15,16}
//         };
//        System.out.print( diagonalSum(arr));
//     }
// }

// public class jav{
//     public static boolean staircaseSearch(int matrix[][], int key){
//         int row = 0, col = matrix[0].length-1;
//         while(row < matrix.length && col >= 0){
//             if(matrix[row][col] == key){
//                 System.out.printf("found key at : (%d,%d)",row,col);
//                 return true;
//             }
//             else if(key > matrix[row][col]){
//                 row++;
//             }
//             else{
//                 col--;
//             }
//         }
//         System.out.printf("%d not found!",key);
//         return false;
//     }
//     public static void main(String args[]){
//         int arr[][] = {{10, 20, 30, 40},
//                        {15, 25, 35, 45},
//                        {27, 29, 37, 48},
//                        {32, 33, 39, 50}};
//         int key = 33;
//         staircaseSearch(arr,key);
//     }
// }

// public class jav{
//     public static void TransposeOfMatrix(int arr[][]){
//         int matrix[][] = new int[arr[0].length][arr.length];
//         for(int i=0; i<=arr.length-1; i++){
//             for(int j=0; j<=arr[0].length-1; j++){
//                 matrix[j][i] = arr[i][j];
//             }
//         }
//         for(int i=0; i<=arr[0].length-1; i++){
//             for(int j=0; j<=arr.length-1; j++){
//                 System.out.print(matrix[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         int arr[][] =  {{10, 20, 30, 40},
//                         {15, 25, 35, 45},
//                         {27, 29, 37, 48},
//                         {32, 33, 39, 50}};
//         TransposeOfMatrix(arr);
//     }
// }

// public class jav{
//     public static boolean isPalindrom(String str){
//         for(int i=0; i<str.length()/2; i++){
//             int n = str.length();
//             if(str.charAt(i) != str.charAt(n-1-i)){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]){
//         String str = "racecar";
//         System.out.print(isPalindrom(str));
//     }
// }

// public class jav{
//     public static float sortestPath(String str){
//         int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
//         for(int i=0; i<str.length(); i++){
//             char dir = str.charAt(i);
//             if(dir == 'W'){
//                 x2--;
//             }
//             else if(dir == 'N'){
//                 y2++;
//             }
//             else if(dir == 'S'){
//                 y2--;
//             }
//             else{
//                 x2++;
//             }
//         }
//         x2 = x2*x2;
//         y2 = y2*y2;
//         return (float)Math.sqrt(x2 + y2);
//     }
//     public static void main(String args[]){
//         String str = "WNEENESENNN";
//         System.out.print(sortestPath(str));
//     }
// }

// public class jav{
//     public static void main(String args[]){
//         String str = "Helloworld";
//         System.out.print(str.substring(0,5));
//     }
// }

// public class jav{
//     public static void main(String args[]){
//         String str[] = {"apple", "mango", "bannana"};
//         String largest = str[0];
//         for(int i=0; i<str.length; i++){
//             if(largest.compareTo(str[i]) < 0){
//                 largest = str[i];
//             }
//         }
//         System.out.print(largest);
//     }
// }

// public class jav{
//     public static void main(String args[]){
//         StringBuilder sb = new StringBuilder("");
//         for(char i='a'; i<='z'; i++){
//             sb.append(i+" ");
//         }
//         System.out.print(sb);
//     }
// }

// public class jav{
//     public static String toUpperCase(String str){
//         StringBuilder sb = new StringBuilder("");
//         sb.append(Character.toUpperCase(str.charAt(0)));
//         for(int i=1; i<str.length(); i++){
//             if(str.charAt(i) == ' ' && i<str.length()-1){
//                 sb.append(str.charAt(i));
//                 i++;
//                 sb.append(Character.toUpperCase(str.charAt(i)));
//             }else{
//                 sb.append(str.charAt(i));
//             }
//         }
//         return sb.toString();
//     }
//     public static void main(String args[]){
//         String str = "hey i am nikhil singh";
//         System.out.print(toUpperCase(str));
//     }
// }

// public class jav{
//     public static String stringCompression(String str){
//         StringBuilder sb = new StringBuilder();
//         for(int i=0; i<str.length(); i++){
//             char curr = str.charAt(i);
//             int count = 1;
//             while(i + 1 < str.length() && str.charAt(i+1) == curr){
//                 count++;
//                 i++;
//             }
//             sb.append( (count>1) ? (""+curr+count) : curr);
//         }
//         return sb.toString();
//     }
//     public static void main(String args[]){
//         String str = "aaabbccccdd";
//         System.out.print(stringCompression(str));
//     }
// }

// public class jav{
//     public static boolean anagrams(String str1, String str2){
//         str1 = str1.toLowerCase();
//         str2 = str2.toLowerCase();
//         if(str1.length() == str2.length()){
//             char[] str1CharArray = str1.toCharArray();
//             char[] str2CharArray = str2.toCharArray();
//             Arrays.sort(str1CharArray);
//             Arrays.sort(str2CharArray);
//             if(Arrays.equals(str1CharArray, str2CharArray)){
//                 System.out.print("These strings are anagrams.");
//                 return true;
//             }
//             else{
//                 System.out.print("These strings are not anagrams");
//                 return false;
//             }
//         }else{
//             System.out.print("Strings are of different lengths and not anagrams.");
//             return false;
//         }
//     }
//     public static void main(String args[]){
//         String str = "race";
//         String str1 = "care";
//         anagrams(str, str1);
//     }
// }

// public class jav{
//     public static void EvenOrOdd(int n){
//         int BitMask = 0;
//         if((n & BitMask) == 0){
//             System.out.println("even number");
//         }else{
//             System.out.println("Odd number");
//         }
//     }
//     public static void main(String args[]){
//         EvenOrOdd(12);
//         EvenOrOdd(2);
//         EvenOrOdd(3);
//     }
// }

// public class jav{
//     public static int getIthBit(int n, int i){
//         int bitWise = 1<<i;
//         if((n & bitWise) == 0){
//             return 0;
//         }else{
//             return 1;
//         }
//     }
//     public static void main(String args[]){
//         System.out.print(getIthBit(10, 1));
//     }
// }

// public class jav{
//     public static int setIthBit(int n, int i){
//         int bitWise = 1<<i;
//         return n | bitWise;        
//     }
//     public static void main(String args[]){
//         System.out.print(setIthBit(10, 2));
//     }
// }

// public class jav{
//     public static int clearIthBit(int n, int i){
//         int BitMask = ~(1<<i);
//         return n & BitMask;
//     }
//     public static void main(String args[]){
//         System.out.print(clearIthBit(10, 1));
//     }
// }

// public class jav{
//     public static void main(String args[]){
//         Pen p1 = new Pen();
//         p1.setColor("Blue");
//         System.out.println(p1.color);
//         BankAccount myAcc = new BankAccount();
//         myAcc.Username = "Nikhil singh";
//         myAcc.setPassword("@12345");
//         System.out.println(myAcc.Username);
//         // System.out.print(myAcc.password);
//     }
// }
// class BankAccount{
//     public String Username;
//     private String password;
//     public void setPassword(String pwd){
//         password = pwd;
//     }
// }
// class Pen{
//     String color;
//     int tip;
//     void setColor(String newColor){
//         color = newColor;
//     }
//     void setTip(int newTip){
//         tip = newTip;
//     }
// }
// class Student{
//     String name;
//     int age;
//     float percentage;
//     void calPercentage(int phy, int chem, int maths){
//         int per = (phy + chem + maths) / 3; 
//     }
// }

// public class jav{
//     public static void main(String args[]){
//         Student s1 = new Student();
//         s1.name = "Nikhil";
//         s1.Roll_no = 12;
//         s1.password = "abcd";
//         Student s2 = new Student(s1);
//         s2.password = "xyz";
//         // System.out.print(s2.password);
//     }
// }
// class Student{
//     String name;
//     int Roll_no;
//     String password;
//     Student(Student s1){
//         this.name = s1.name;
//         this.Roll_no = s1.Roll_no;
//     }
//     Student(){
//         // this.name = name;
//         // System.out.print("Hey i am constructor");
//     }
// }

// public class jav{
//     public static void main(String args[]){
//         // Fish shark = new Fish();
//         // shark.eat();
//         Dog dogy = new Dog();
//         dogy.eat();
//         dogy.color = "blue";
//         System.out.println(dogy.color);
//     }
// }
// class Animal{
//     String color;
//     void eat(){
//         System.out.println("Eat");
//     }
//     void breath(){
//         System.out.println("Breath");
//     }
// }
// class Mammal extends Animal{
//     int legs;
// }
// class Dog extends Animal{
//     String breed;
// }
// // class Fish extends Animal{
// //     int fins;
// //     void swim(){
// //         System.out.print("Fish swims in water");
// //     }
// // }

// public class jav{
//     public static void main(String args[]){
//         Horse h = new Horse();
//         h.eat();
//         h.walk();
//         Chicken c = new Chicken();
//         c.walk();
//     }
// }
// abstract class Animal{
//     void eat(){
//         System.out.println("Animal eats");
//     }
//     abstract void walk();
// }
// class Horse extends Animal{
//     void walk(){
//         System.out.println("Walk on 4 legs");
//     }
// }
// class Chicken extends Animal{
//     void walk(){
//         System.out.println("Walk on 2 legs");
//     }
// }

// public class jav{
//     public static void main(String args[]){
//         Queen q = new Queen();
//         q.moves();
//     }
// }
// interface ChessPlayer{
//     void moves();
// }
// class Queen implements ChessPlayer{
//     public void moves(){
//         System.out.println("right, left, up, down, diagonal");
//     }
// }
// class Rock implements ChessPlayer{
//     public void moves(){
//         System.out.println("right, left, up, down");
//     }
// }
// class King implements ChessPlayer{
//     public void moves(){
//         System.out.println("right, left, up, down, diagonal (by one step)");
//     }
// }

// public class jav{
//     public static void main(String args[]){
//         Student s1 = new Student();
//         s1.SchoolName = "JVM";
//         s1.name = "Nikhil";
//         System.out.println(s1.getName());
//         Student s2 = new Student();
//         System.out.println(s2.SchoolName);
//     }
// }
// class Student{
//     String name;
//     int age;

//     static String SchoolName;

//     void setName(String name){
//         this.name = name;
//     }
//     String getName(){
//         return this.name;
//     }
// }

// public class jav{
//     public static void decreaseNumber(int n){
//         if(n==1){
//             System.out.print(n+" ");
//             return;
//         }
//         decreaseNumber(n-1);
//         System.out.print(n+" ");
//     }
//     public static void main(String args[]){
//         decreaseNumber(10);
//     }
// }

// public class jav{
//     public static int factorial(int n){
//         if(n==0){
//             return 1;
//         }
//         return n*factorial(n-1);
//     }
//     public static void main(String args[]){
//         System.out.print(factorial(5));
//     }
// }

// public class jav{
//     public static int Sum(int n){
//         if(n==1){
//             return 1;
//         }
//         return n + Sum(n-1);
//     }
//     public static void main(String args[]){
//         System.out.print(Sum(3));
//     }
// }

// public class jav{//0 1 1 2 3 5 8 13 21
//     public static int fabonacci(int n){
//         if(n==0 || n==1){
//             return n;
//         }
//         return fabonacci(n-1) + fabonacci(n-2);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter fabonacci terms : ");
//         int term = sc.nextInt();
//         for(int i=0; i<term; i++){
//             System.out.print(fabonacci(i)+" ");
//         }
//     }
// }
    
// public class jav{
//     public static boolean isSorted(int arr[], int i){
//         if(i == arr.length - 1){
//             return true;
//         }
//         if(arr[i] > arr[i+1]){
//             return false;
//         }
        
//         return isSorted(arr, i+1);
//     } 
//     public static void main(String args[]){
//         int arr[] = {1,2,8,5,6};
//         System.out.print(isSorted(arr, 0));
//     }
// }

// public class jav{
//     public static int firstOccurance(int arr[], int key, int i){
//         if(i == arr.length){
//             return -1;
//         }
//         if(arr[i] == key){
//             return i;
//         }
//         return firstOccurance(arr, key, i+1);
//     }
//     public static void main(String args[]){
//         int arr[] = {2,3,4,1,1,4,8,0,1};
//         int key = 1;
//         if(firstOccurance(arr, key, 0) < 0){
//             System.out.print("Value doesn't exist :(");
//         }else{
//             System.out.print("The index of the value "+key+" is : "+firstOccurance(arr, key, 0));
//         }
//     }
// }

// public class jav{
//     public static int lastOccurance(int arr[], int key, int i){
//         if(i == arr.length){
//             return -1;
//         }
//         if(lastOccurance(arr, key, i+1) != -1){
//             return lastOccurance(arr, key, i+1);
//         }
//         if(arr[i] == key){
//             return i;
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//     int arr[] = {1,2,5,3,6,2,6,2,4};
//     int key = 2;
//     if(lastOccurance(arr, key, 0) < 0){
//         System.out.print("Value doesn't exist :(");
//     }else{
//         System.out.print(lastOccurance(arr, key, 0));
//     }
// }
// }

// public class jav{
//     public static int power(int num, int pow){
//         if(pow == 0){
//             return 1;
//         }
//         return num * power(num, pow-1);
//     }
//     public static void main(String args[]){
//         System.out.print(power(2, 10));
//     }
// }

// public class jav{
//     public static int optimizedPower(int x, int n){
//         if(n==0){
//             return 1;
//         }
//         int powerHalf = optimizedPower(x, n/2) * optimizedPower(x, n/2);
//         if(n%2 != 0){
//             powerHalf = x * powerHalf;
//         }
//         return powerHalf;
//     }
//     public static void main(String args[]){
//         System.out.print(optimizedPower(2, 10));
//     }
// }

// public class jav{
//     public static int tilingProblem(int n){
//         if(n==0 || n==1){
//             return 1;
//         }
//         return tilingProblem(n-1) + tilingProblem(n-2);
//     }
//     public static void main(String args[]){
//         System.out.print(tilingProblem(3));
//     }
// }

// public class jav{
//     public static void removeDublicateElement(String str, int idx, StringBuilder newstr, boolean map[]){
//         if(idx == str.length()){
//             System.out.print(newstr);
//             return;
//         }
//         char currChar = str.charAt(idx);
//         if(map[currChar - 'a'] == true){
//             removeDublicateElement(str, idx+1, newstr, map);
//         }else{
//             map[currChar - 'a'] = true;
//             removeDublicateElement(str, idx+1, newstr.append(currChar), map);
//         }
//     }
//     public static void main(String args[]){
//         String str = "Niikhillsingh";
//         removeDublicateElement(str.toLowerCase(), 0, new StringBuilder(""), new boolean[26]);
//     }
// }

// public class jav{
//     public static int friendsPairing(int n){
//         if(n==1 || n==2){
//             return n;
//         }
//         int fdp1 = friendsPairing(n-1);
//         int fdp2 = friendsPairing(n-2);
//         int pairWay = fdp2 *  (n-1);
//         return fdp1 + pairWay;
//     }
//     public static void main(String args[]){
//         System.out.print(friendsPairing(4));
//     }
// }

// public class jav{
//     public static void printBinaryString(int n, int lastplace, String str){
//         if(n==0){
//             System.out.println(str);
//             return;
//         }
//         printBinaryString(n-1, 0, str+"0");
//         if(lastplace == 0){
//             printBinaryString(n-1, 1, str+"1");
//         }
//     }
//     public static void main(String args[]){
//         printBinaryString(3, 0, "");
//     }
// }

// public class jav{
//     public static void printIndices(int arr[], int key, int i){
//         if(i==arr.length){
//             return;
//         }
//         if(key == arr[i]){
//             System.out.print(i+" ");
//         }
//         printIndices(arr, key, i+1);
//     }
//     public static void main(String args[]){
//         int arr[] = {1,2,3,7,5,4,7,3,5,3,2,2};
//         printIndices(arr, 2, 0);
//     }
// }

// public class jav{
//     public static void numberToString(int num){
//         String digit[] = {"zero ", "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine "};
//         if(num == 0){
//             return;
//         }
//         int last = num % 10;
//         numberToString(num/10);
//         switch(last){
//             case 0 : System.out.print(digit[0]);break;
//             case 1 : System.out.print(digit[1]);break;
//             case 2 : System.out.print(digit[2]);break;
//             case 3 : System.out.print(digit[3]);break;
//             case 4 : System.out.print(digit[4]);break;
//             case 5 : System.out.print(digit[5]);break;
//             case 6 : System.out.print(digit[6]);break;
//             case 7 : System.out.print(digit[7]);break;
//             case 8 : System.out.print(digit[8]);break;
//             case 9 : System.out.print(digit[9]);break;
//         }
//     }
//     public static void main(String args[]){
//         numberToString(2006);
//     }
// }

// public class jav{
//     public static int lenOfString(String str, int i){
//         if(i == str.length()){
//             return 0;
//         }
//         return 1 + lenOfString(str, i+1);
//     }
//     public static void main(String args[]){
//         String str = "nikhil";
//         System.out.print(lenOfString(str, 0));
//     }
// }

// public class jav{
//     public static void TowerOfHanoi(int n, String src, String helper, String dest){
//         if(n==1) {
//             System.out.println("Transfer desk " + n + " from " + src + " to " + dest);
//             return;
//         }
//         TowerOfHanoi(n-1, src, dest, helper);
//         System.out.println("Transfer desk " + n + " from " + src + " to " + dest);
//         TowerOfHanoi(n-1, helper, src, dest);
//     }
//     public static void main(String args[]){
//         TowerOfHanoi(3, "A", "B", "C");
//     }
// }

// public class jav{
//     public static void printArr(int arr[]){
//         for(int i=0; i<=arr.length-1; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void mergeSort(int arr[], int si, int ei){
//         if(si >= ei){
//             return;
//         }
//         int mid = si + (ei - si)/2;
//         mergeSort(arr, si, mid);
//         mergeSort(arr, mid+1, ei);
//         merge(arr, si, mid, ei);
//     }
//     public static void merge(int arr[], int si, int mid, int ei){
//         int temp[] = new int[ei-si+1];
//         int i = si;
//         int j = mid+1;
//         int k = 0;
//         while(i <= mid && j <= ei){
//             if(arr[i] <= arr[j]){
//                 temp[k] = arr[i];
//                 i++;
//             }else{
//                 temp[k] = arr[j];
//                 j++;
//             }
//             k++;
//         }
//         while(i <= mid){
//             temp[k++] = arr[i++];
//         }
//         while(j <= ei){
//             temp[k++] = arr[j++];
//         }
//         for(int idx = 0; idx <= temp.length-1; idx++){
//             arr[si + idx] = temp[idx];
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {6, 3, 9};
//         mergeSort(arr, 0, arr.length-1);
//         printArr(arr);
//     }
// }

// public class jav{
//     public static void printArr(int arr[]){
//         for(int i=0; i<=arr.length-1; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void quickSort(int arr[], int si, int ei){
//         if(si >= ei){
//             return;
//         }
//         int pIdx = partition(arr, si, ei);
//         quickSort(arr, si, pIdx-1);
//         quickSort(arr, pIdx+1, ei);
//     }
//     public static int partition(int arr[], int si, int ei){
//         int pivot = arr[ei];
//         int i = si-1;
//         for(int j=si; j<= ei-1; j++){
//             if(arr[j] <= pivot){
//                 i++;
//                 int temp = arr[j];
//                 arr[j] = arr[i];
//                 arr[i] = temp;
//             }
//         }
//         i++;
//         int temp = pivot;
//         arr[ei] = arr[i];
//         arr[i] = temp;
//         return i;
//     }
//     public static void main(String args[]){
//         int arr[] = {4, 1, 7, 2, 3};
//         quickSort(arr, 0, arr.length-1);
//         printArr(arr);
//     }
// }

// public class jav{
//     public static int search(int arr[], int tar, int si, int ei){
//         if(si > ei){
//             return -1;
//         }
//         int mid = si + (ei-si)/2;
//         if(arr[mid] == tar){
//             return mid;
//         }
//         if(arr[si] <= arr[mid]){//mid on L1
//             if(arr[si] <= tar && tar <= arr[mid-1]){//left
//                 return search(arr, tar, si, mid);
//             }else{//right
//                 return search(arr, tar, mid+1, ei);
//             }
//         }else{//mid on L2
//             if(arr[mid] <= tar && tar <= arr[ei]){//right
//                 return search(arr, tar, mid+1, ei);
//             }else{//left
//                 return search(arr, tar, si, mid-1);
//             }
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {4,5,6,7,0,1,2};
//         int target = 6;
//         System.out.print(search(arr, target, 0, arr.length-1));
//     }
// }

// public class jav{//backtracking concept
//     public static void printArr(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void changeArr(int arr[], int i, int val){
//         if(i == arr.length){
//             printArr(arr);
//             return;
//         }
//         arr[i] = val;
//         changeArr(arr, i+1, val+1);
//         arr[i] = arr[i] - 2;
//     }
//     public static void main(String args[]){
//         int arr[] = new int[5];
//         changeArr(arr, 0, 1);
//         printArr(arr);
//     }
// }

// public class jav{
//     public static void findSubsets(String str, String ans, int i){
//         if(i == str.length()){
//             if(ans.length() == 0){
//                 System.out.println("Null");
//             }else{
//                 System.out.println(ans);
//             }
//             return;
//         }
//         findSubsets(str, ans+str.charAt(i),i+1);
//         findSubsets(str, ans, i+1);
//     }
//     public static void main(String args[]){
//         String str = "abc";
//         findSubsets(str, "", 0);
//     }
// }

// public class jav{
//     public static void findPermutation(String str, String ans){
//         if(str.length() == 0){
//             System.out.println(ans);
//             return;
//         }
//         for(int i=0; i<str.length(); i++){
//             char curr = str.charAt(i);
//             String newStr = str.substring(0 + i)  + str.substring(i + 1);
//             findPermutation(newStr, ans + curr);
//         }
//     }
//     public static void main(String args[]){
//         String str = "abc";
//         findPermutation(str, "");
//     }
// }

// public class jav{
//     public static void printBoard(char board[][]){
//         System.out.println();
//         System.out.println("-chess Board-"+count+"-");
//         count++;
//         for(int i=0; i<board.length; i++){
//             System.out.print("  ");
//             for(int j=0; j<=board.length-1; j++){
//                 System.out.print(board[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     public static boolean isSafe(char board[][], int row, int col){
//         for(int i=row-1; i>=0; i--){//vertical
//             if(board[i][col] == 'Q'){
//                 return false;
//             }
//         }
//         for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){//left diagonal
//             if(board[i][j] == 'Q'){
//                 return false;
//             }
//         }
//         for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){//right diagonal
//             if(board[i][j] == 'Q'){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void nQueens(char board[][], int row){
//         if(row == board.length){
//             printBoard(board);
//             return;
//         }
//         for(int j=0; j<board.length; j++){
//             if(isSafe(board, row, j)){
//                 board[row][j] = 'Q';
//                 nQueens(board, row+1);
//                 board[row][j] = 'x';
//             }
//         }
//     }
//     static int count = 1;
//     public static void main(String args[]){
//         int n = 10;
//         char board[][] = new char[n][n];
//         for(int i=0; i<=n-1; i++){
//             for(int j=0; j<=n-1; j++){
//                 board[i][j] = 'x';
//             }
//         }
//         nQueens(board, 0);
//     }
// }

// public class jav{
//     public static void printBoard(char board[][]){
//         System.out.println("--Chess Board--");
//         for(int i=0; i<board.length; i++){
//             for(int j=0; j<board.length; j++){
//                 System.out.print(board[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     public static boolean isSafe(char board[][], int row, int col){
//         for(int i=row-1; i>=0; i--){//vertical
//             if(board[i][col] == 'Q'){
//                 return false;
//             }
//         }
//         for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){//right diagonal
//             if(board[i][j] == 'Q'){
//                 return false;
//             }
//         }
//         for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){//left diagonal
//             if(board[i][j] == 'Q'){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void nQueens(char board[][], int row){
//         if(row == board.length){
//             printBoard(board);
//             return;
//         }
//         for(int j=0; j<board.length; j++){
//             if(isSafe(board, row, j)){
//                 board[row][j] = 'Q';
//                 nQueens(board, row+1);
//                 board[row][j] = 'x';
//             }
//         }
//     }
//     public static void main(String args[]){
//         int n = 5;
//         char board[][] = new char[n][n];
//         for(int i=0; i<n; i++){
//             for(int j=0; j<n; j++){
//                 board[i][j] = 'x';
//             }
//         }
//         nQueens(board, 0);
//     }
// }

// public class jav{
//     public static int gridWay(int i, int j, int n, int m){
//         if(i == n-1 && j == m-1){
//             return 1;
//         }else if( i >= n || j >= m){
//             return 0;
//         }
//         int w1 = gridWay(i+1, j, n, m);
//         int w2 = gridWay(i, j+1, n, m);
//         return w1 + w2;
//     }
//     public static void main(String args[]){
//         int n=30, m=30;
//         System.out.print(gridWay(0, 0, n, m));
//     }
// }

// public class jav {
//     public static void printsudoku(int sudoku[][]){
//         for(int i=0; i<sudoku.length; i++){
//             if(i % 3 == 0 && i != 0){
//                 System.out.println("------+-------+------");
//             }
//             for(int j=0; j<sudoku[0].length; j++){
//                 if(j % 3 == 0 && j != 0){
//                     System.out.print("| ");
//                 }
//                 System.out.print(sudoku[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static boolean isSafe(int sudoku[][], int row, int col, int digit){
//         for(int i=0; i<sudoku.length; i++){
//             if(sudoku[i][col] == digit){
//                 return false;
//             }
//         }
//         for(int j=0; j<sudoku[0].length; j++){
//             if(sudoku[row][j] == digit){
//                 return false;
//             }
//         }
//         int sr = (row/3) * 3;
//         int sc = (col/3) * 3;
//         for(int i=sr; i<sr+3; i++){
//             for(int j=sc; j<sc+3; j++){
//                 if(sudoku[i][j] == digit){
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }

//     public static boolean sudokuSolver(int sudoku[][], int row, int col){
//         if(row == sudoku.length){
//             return true;
//         }
//         int nextRow = row;
//         int nextcol = col + 1;
//         if(col + 1 == sudoku[0].length){
//             nextRow = row + 1;
//             nextcol = 0;
//         }
//         if(sudoku[row][col] != 0){
//             return sudokuSolver(sudoku, nextRow, nextcol);
//         }

//         for(int digit = 1; digit <= 9; digit++){
//             if(isSafe(sudoku, row, col, digit)){
//                 sudoku[row][col] = digit;
//                 if(sudokuSolver(sudoku, nextRow, nextcol)){
//                     return true;
//                 }
//                 sudoku[row][col] = 0;
//             }
//         }
//         return false;
//     }

//     public static void main(String args[]){
//         int sudoku[][] = {
//             {0, 0, 8, 0, 0, 0, 0, 0, 0},
//             {4, 9, 0, 1, 5, 7, 0, 0, 2},
//             {0, 0, 3, 0, 0, 4, 1, 9, 0},
//             {1, 8, 5, 0, 6, 0, 0, 2, 0},
//             {0, 0, 0, 0, 2, 0, 0, 6, 0},
//             {9, 6, 0, 4, 0, 5, 3, 0, 0},
//             {0, 3, 0, 0, 7, 2, 0, 0, 4},
//             {0, 4, 9, 0, 3, 0, 0, 5, 7},
//             {8, 2, 7, 0, 0, 9, 0, 1, 3}
//         };

//         if(sudokuSolver(sudoku, 0, 0)){
//             System.out.println("--Solution exists--");
//             printsudoku(sudoku);
//         } else {
//             System.out.println("--Solution doesn't exists--");
//         }
//     }
// }

// public class jav{
//     public static int mouseMaze(int i, int j, int n, int maze[][], boolean visited[][]){
//         if(i == n-1 && j == n-1){
//             return 1;
//         }
//         if(i < 0 || j < 0 || i >= n || j >= n || maze[i][j] == 0 || visited[i][j]){
//             return 0;
//         }
//         visited[i][j] = true;//current cell
//         int w1 = mouseMaze(i+1, j, n, maze, visited);
//         int w2 = mouseMaze(i, j+1, n, maze, visited);
//         int w3 = mouseMaze(i-1, j, n, maze, visited);
//         int w4 = mouseMaze(i, j-1, n, maze, visited);
//         visited[i][j] = false;//backtracking 
//         return w1+w2+w3+w4;
//     }
//     public static void main(String args[]){
//         int n = 3;
//         int[][] maze = {
//             {1,1,1},
//             {1,0,1},
//             {1,1,1}
//         };
//         boolean[][] visited = new boolean[n][n];
//         System.out.print("The number of ways are : "+mouseMaze(0, 0, n, maze, visited));
//     }
// }

// public class jav{
//     public static void show(){
//         String keypad[][] = {
//             {"1     ","2 abc ","3 def "},
//             {"4 ghi ","5 jkl ","6 mno "},
//             {"7 pqrs","8 tuv ","9 wxyz"},
//             {"*tone ","0 oper","  #   "}
//         };
//         for(int i=0; i<keypad.length; i++){
//             System.out.println("+-----------------------+");
//             for(int j=0; j<keypad[0].length; j++){
//                 if(j==0){
//                     System.out.print("| "+keypad[i][j]+"| ");
//                 }else{
//                     System.out.print(keypad[i][j]+"| ");
//                 }
//             }
//             System.out.println();
//         }
//         System.out.println("+-----------------------+");
//     }
//     public static void keypadCombination(String str, int i, String ans, int k){
//         if(ans.length() == k){//if you want ans to be 2 character so....
//             System.out.println(ans);
//             return;
//         }
//         if(i >= str.length()){
//             return;
//         }
//         char curr = str.charAt(i);
//         // String str1 = str.substring(0,i) + str.substring(i+1);
//         // keypadCombination(str1, i+1, ans + curr, k);
//         // keypadCombination(str1, i+1, ans, k);
//         keypadCombination(str, i+1, ans + curr, k);
//         keypadCombination(str, i+1, ans, k);
//     }
    
//     public static void main(String args[]){
//         show();
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enetr the number for combination : ");
//         String numStr = sc.next();
//         String concat= "";
//         String map[] = {"", "", "abc", "def", "ghi","jkl", "mno", "pqrs", "tuv", "wxyz"};
//         for(int i=0; i<numStr.length(); i++){
//             char c = numStr.charAt(i);
//             int d = c - '0';
//             if(d >= 0 && d <= 9){
//                 concat += map[d];
//             }
//         }
//         int k = 2;
//         keypadCombination(concat, 0, "", k);
//     }
// }

// public class jav{
//     public static void printBoard(char board[][]){
//     int count = 0;
//     System.out.println();
//     System.out.println("-chess Board-");
//     for(int i=0; i<board.length; i++){
//         System.out.print("  ");
//         for(int j=0; j<board.length; j++){
//             System.out.print(board[i][j]+" ");
//             }
//         System.out.println();
//     }
//     }
//     public static boolean isSafe(char board[][], int row, int col){
//         int n = board.length;
//         if (row - 2 >= 0 && col - 1 >= 0) {  // (2 up, 1 left)
//             if (board[row - 2][col - 1] == 'K') return false;
//         }
//         if (row - 2 >= 0 && col + 1 < n) {// (2 up, 1 right)
//             if (board[row - 2][col + 1] == 'K') return false;
//         }
//         if (row - 1 >= 0 && col - 2 >= 0) {// (1 up, 2 left)
//             if (board[row - 1][col - 2] == 'K') return false;
//         }
//         if (row - 1 >= 0 && col + 2 < n) {// (1 up, 2 right)
//             if (board[row - 1][col + 2] == 'K') return false;
//         }
//             return true;
//     }
//     public static void nKnight(char board[][], int row){
//         if(row == board.length){
//             printBoard(board);
//             return;
//         }
//         for(int j=0; j<board.length; j++){
//             if(isSafe(board, row, j)){
//                 board[row][j] = 'K';
//                 nKnight(board, row+1);
//                 board[row][j] = 'x';
//             }
//         }
//     }
//     public static void main(String args[]){
//         int n = 3;
//         char board[][] = new char[n][n];
//         for(int i=0; i<n; i++){
//             for(int j=0; j<=n-1; j++){
//                 board[i][j] = 'x';
//             }
//         }
//         nKnight(board, 0);
//     }
// }

// public class jav{
//     public static void main(String args[]){
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(2); 
//         list.add(98); 
//         list.add(26); 
//         list.add(3); 
        // list.add(2,98);
        // System.out.println(list);
        // list.remove(2);
        // System.out.println(list);
        // list.set(2,10);
        // System.out.println(list);
        // System.out.println(list.contains(2));
        // int max = Integer.MIN_VALUE;
        // for(int i=0; i<list.size(); i++){
        //     if(max<list.get(i)){
        //         max = list.get(i);
        //     }
            // max = Math.max(max, list.get(i));
        // }
        // System.out.print(max);
//     }
// }

// public class jav{
    // public static void swap(ArrayList<Integer> list, int idx1, int idx2){
    //     int temp = list.get(idx1);
    //     list.set(idx1, list.get(idx2));
    //     list.set(idx2, temp);
    // }
    // public static void main(String args[]){
    //     ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

    //     ArrayList<Integer> list = new ArrayList<>();//list
    //     list.add(1);list.add(2); list.add(98); list.add(26); list.add(3);

    //     mainList.add(list);

    //     ArrayList<Integer> list1 = new ArrayList<>();//list1
    //     list1.add(2);list1.add(5); list1.add(87); list1.add(6); list1.add(13);

    //     mainList.add(list1);

    //     for(int i=0 ; i<mainList.size(); i++){
    //         ArrayList<Integer> currList = mainList.get(i);
    //         for(int j=0; j<currList.size(); j++){
    //             System.out.print(currList.get(j)+" ");
    //         }
    //         System.out.println();
    //     }
    //     System.out.print(mainList);
        // int idx1 = 1, idx2 = 3;
        // System.out.println(list);
        // swap(list, idx1, idx2);
        // System.out.println(list);
        // Collections.sort(list);
        // Collections.sort(list, Collections.reverseOrder());
        // System.out.println(list);
//     }
// }

// public class jav{
//     public static void main(String args[]){
//         ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();//parent list
//         ArrayList<Integer> list = new ArrayList<>();//child list
//         list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);//add element
//         mainList.add(list);
//         ArrayList<Integer> list1 = new ArrayList<>();// child list
//         list1.add(2);list1.add(4);list1.add(6);list1.add(8);list1.add(10);//add element
//         mainList.add(list1);
//         ArrayList<Integer> list2 = new ArrayList<>();// child list
//         list2.add(3);list2.add(6);list2.add(9);list2.add(12);list2.add(15);//add element
//         mainList.add(list2);
//         for(int i=0; i<mainList.size(); i++){
//             ArrayList<Integer> currList = mainList.get(i);
//             for(int j=0; j<currList.size(); j++){
//                 System.out.print(currList.get(j)+" ");
//             }
//             System.out.println();
//         }
//         System.out.print(mainList);
//     }
// }

// public class jav{
//     static int max = Integer.MIN_VALUE;
    // public static int storeWater(ArrayList<Integer> height){// methor 1-->brute force for max water in two pairs//
    //     int h, w, water;
    //     for(int i=0; i<height.size(); i++){
    //         for(int j=i+1; j<height.size(); j++){
    //             h = Math.min(height.get(i), height.get(j));
    //             w = j-i;
    //             water = h * w;
    //             max = Math.max(max, water);
    //         }
    //     }
    //     return max;
    // }

//     public static int storeWater(ArrayList<Integer> height){// method 2--> 2 pointer approch
//         int Lp = 0, Rp = height.size()-1, h, w, water;
//         while(Lp < Rp){
//             h = Math.min(height.get(Lp), height.get(Rp));
//             w = Rp - Lp;
//             water = h * w;
//             max = Math.max(max, water);
//             if(height.get(Lp) < height.get(Rp))
//                 Lp++;
//             else
//                 Rp--;
//         }
//         return max;
//     }
//     public static void main(String args[]){
//         ArrayList<Integer> height = new ArrayList<>();
//         height.add(1);height.add(8);height.add(6);height.add(2);height.add(5);height.add(4);height.add(8);height.add(3);height.add(7);
//         System.out.println("The max water from pair is : "+storeWater(height));
//     }
// }

// public class jav{
    // public static boolean pairSum(ArrayList<Integer> list, int target){//brute force
    //     for(int i=0; i<list.size(); i++){
    //         for(int j=i+1; j<list.size(); j++){
    //             if(list.get(i) + list.get(j) == target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
//     public static boolean pairSum(ArrayList<Integer> list, int target){//2 pointer approch
//         int rp = list.size()-1, lp = 0;
//         while(lp<rp){
//             if(list.get(rp) + list.get(lp) == target){
//                 return true;
//             }else if(list.get(rp) + list.get(lp) > target){
//                 rp--;
//             }else{
//                 lp++;
//             }
//         }
//         return false;
//     }
//     public static boolean pairSum(ArrayList<Integer> list, int target){
//         int bp = -1, n = list.size();
//         for(int i=0; i<list.size()-1; i++){
//             if(list.get(i) > list.get(i+1)){
//                 bp = i;
//                 break;
//             }
//         }
//         if(bp == -1){
//         bp = n - 1;
//         }
//         int lp = (bp+1);
//         int rp = bp;
//         while(lp != rp){
//             if(list.get(lp) + list.get(rp) == target){
//                 return true;
//             }
//             if(list.get(lp) + list.get(rp) < target){
//                 lp = (lp + 1) % n;
//             }else{
//                 rp = (n + rp - 1) % n;
//             }
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(11);list.add(15);list.add(6);list.add(7);list.add(8);list.add(8);list.add(9);list.add(10);
//         if(pairSum(list, 16)){
//             System.out.println("Exist");
//         }else{
//             System.out.println("not Exist");
//         }
//     }
// }

// public class jav{
//     public static void findLonely(ArrayList<Integer> list, ArrayList<Integer> list1){
//         Collections.sort(list);
//         for(int i=1; i<list.size()-1; i++){
//             if(list.get(i-1)+1 < list.get(i) && list.get(i+1) > list.get(i)+1){
//                 list1.add(list.get(i));
//             }
//         }
//         if (list.size() == 1) {
//             list1.add(list.get(0));
//         }
//         if(list.size() > 1){
//             if(list.get(0)+1 < list.get(1)){
//                 list1.add(list.get(0));
//             }
//             if(list.get(list.size()-2) + 1 < list.get(list.size()-1)) {
//                 list1.add(list.get(list.size()-1));
//             }
//         }
//     }
//     public static void main(String args[]){
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(10);list.add(6);list.add(5);list.add(8);
//         ArrayList<Integer> lonely = new ArrayList<>();
//         findLonely(list, lonely);
//         System.out.println(lonely);
//     }
// }

// public class jav{
//    public class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addFirst(int data){
//         size++;
//         Node newNode = new Node(data);
//         if(head == null){
//             head = tail = newNode;
//             return;
//         }
//             newNode.next = head;
//             head = newNode;
//     }
//     public void addLast(int data){
//         size++;
//         Node newNode = new Node(data);
//             if(head == null){
//                 head = tail = newNode;
//                 return;
//             }
//             tail.next = newNode;
//             tail = newNode;
//     }
//     public void print(){
//         if(head == null){
//             System.out.println("List is empty");
//             return;
//         }
//         Node temp = head;
//         System.out.print("\n");
//         while(temp != null){
//             System.out.print(temp.data+" -> ");
//             temp = temp.next;
//         }
//         System.out.print("null\n\n");
//     }
//     public void add(int index, int data){
//         if(index == 0){
//             addFirst(data);
//             return;
//         }
//         size++;
//         Node newNode = new Node(data);
//         Node temp = head;
//         int i = 0;
//         while(index-1 > i){
//             temp = temp.next;
//             i++;
//         }
//         newNode.next = temp.next;
//         temp.next = newNode;
//     }
//     public int removeFirst(){
//         if(size == 0){
//             System.out.println("linklist is Empty");
//         }else if(size == 1){
//             int val = head.data;
//             head = tail = null;
//             size = 0;
//             return val;
//         }
//         int val = head.data;
//         head = head.next;
//         size--;
//         return val;
//     }
//     public int removeLast(){
//         if(size == 0){
//             System.out.println("linklist is Empty");
//             return Integer.MIN_VALUE;
//         }else if(size == 1){
//             int val = head.data;
//             head = tail = null;
//             size = 0;
//             return val;
//         }
//         Node prev = head;
//         for(int i=0; i<size-2; i++){
//             prev = prev.next;
//         }
//         size--;
//         int val = prev.next.data;
//         prev.next = null;
//         tail = prev;
//         return val;
//     }
//     public int itrSearch(int key){
//         int i = 0;
//         Node temp = head;
//         while(temp != null){
//             if(temp.data == key){
//                 return i+1;
//             }
//             temp = temp.next;
//             i++;
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         jav ll = new jav();
//         ll.addFirst(2);ll.addFirst(1);ll.addLast(3);ll.addLast(4);ll.addLast(5);
//         ll.add(1, 8);
//         ll.print();
        // ll.removeFirst();
        // ll.print();
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.removeFirst());
        // System.out.println(ll.size);
        // System.out.println(ll.itrSearch(3));
//     }
// }

// public class jav{
//     public class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addFirst(int data){
//         size++;
//         Node newNode = new Node(data);
//         if(head == null){
//             head = tail = newNode;
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
//     }
//     public void print(){
//         if(head == null){
//             System.out.println("Linklist is empty");
//             return;
//         }
//         Node temp = head;
//         System.out.print("\n\n");
//         while(temp != null){
//             System.out.print(temp.data+" --> ");
//             temp = temp.next;
//         }
//         System.out.print("null \n\n");
//     }
//     public int helper(Node head, int key){
//         if(head == null){
//             return -1;
//         }
//         if(head.data == key){
//             return 0;
//         }
//         int idx = helper(head.next, key);
//         if(idx == -1){
//             return -1;
//         }
//         return idx+1;
//     }
//     public int recSearch(int key){
//         return helper(head, key);
//     }
//     public static void main(String args[]){
//         jav ll = new jav();
//         ll.addFirst(5);ll.addFirst(4);ll.addFirst(3);ll.addFirst(2);ll.addFirst(1);
//         ll.print();
//         System.out.println(ll.recSearch(4));
//         // System.out.println(ll.recSearch(40));
//     }
// }

// public class jav{
//     class Node{
//         int data;
//         Node next; 
//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static int size;
//     public void addFirst(int data){
//         size++;
//         Node newNode = new Node(data);
//         if(head == null){
//             head = tail = newNode;
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
//     }
//     public void print(){
//         if(head == null){
//             System.out.println("Linklist is Empty");
//         }
//         Node temp = head;
//         System.out.print("\n\n");
//         while(temp != null){
//             System.out.print(temp.data+" --> ");
//             temp = temp.next;
//         }
//         System.out.print("null\n\n");
//     }
//     public void reverse(){
//         if(head == null){
//             System.out.println("Linklist is Empty");
//             return;
//         }
//         Node prev = null;
//         Node curr = tail = head;
//         Node next;
//         while(curr != null){
//             next = curr.next; 
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }
//         head = prev; 
//     }
//     public void deleteNthfromEnd(int n){
//         if(head == null){
//             System.out.println("Linklist is Empty");
//             return;
//         }
//         if(n == size){
//             head = head.next;
//             return;
//         }
//         Node prev = head;
//         for(int i=1; i<(size-n); i++){
//             prev = prev.next;
//         }
//         Node curr = prev.next;
//         prev.next = curr.next;
//         return;
//     }
//     public Node findMid(){//Slow and Fast Approch
//         Node slow = head;
//         Node fast = head;
//         while(fast != null && fast.next != null){
//             fast = fast.next.next;//+2
//             slow = slow.next;//+1
//         }
//         return slow;
//     }
//     public boolean checkPalindrome(){
//         if(head == null || head.next == null){
//             System.out.println("Linklist is Empty");
//             return true;
//         }
//         Node midNode = findMid();
//         Node prev = null;
//         Node curr = midNode;
//         Node next;
//         while(curr != null){
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }
//         Node right = prev;
//         Node left = head;
//         while(right != null){
//             if(left.data != right.data){
//                 return false;
//             }
//             left = left.next;
//             right = right.next;
//         }
//         return true;
//     }
//     public static void main(String args[]){
//         jav ll = new jav();
//         ll.addFirst(5);ll.addFirst(4);ll.addFirst(3);ll.addFirst(4);ll.addFirst(5);
//         ll.print();
        // ll.reverse();
        // ll.print();
        // System.out.println(size);
        // ll.deleteNthfromEnd(3);
        // ll.print();
        // System.out.println(ll.findMid().data);
//         System.out.println(ll.checkPalindrome());
//     }
// }

// public class jav{
//     public class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addLast(int data){
//         size++;
//         Node newNode = new Node(data);
//         if(head == null){
//             head = tail = newNode;
//             return;
//         }
//         tail.next = newNode;
//         tail = newNode;
//     }
//     public void print(){
//         if(head == null){
//             System.out.print("Linklist is Empty :(");
//             return;
//         }
//         Node temp = head;
//         System.out.print("\n\n");
//         while(temp != null){
//             System.out.print(temp.data+" --> ");
//             temp = temp.next;
//         }
//         System.out.print("null\n\n");
//     }
//     public static boolean isCycle(){//floyd's cycle finding algorithm
//         Node slow = head;
//         Node fast = head;
        
//         while(fast != null && fast.next != null){
//             slow = slow.next;
//             fast = fast.next.next;
//             if(slow == fast){
//                 return true;
//             }
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         jav ll = new jav();
//         ll.addLast(1);ll.addLast(2);ll.addLast(3);ll.addLast(4);ll.addLast(5);
//         ll.print();
        // head = new Node(1);
        // head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = head;
        // System.out.println(isCycle());
//     }
// }

// public class jav{
//     public static void main(String args[]){
//         LinkedList<Integer> ll = new LinkedList<>();
//         ll.addLast(2);
//         ll.addLast(3);
//         ll.addFirst(1);
//         System.out.print(ll);
//     }
// }

// public class jav{
//     class Node {
//     int data;
//     Node next;
//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
//     }
//     private Node head;
//     private Node getMid(Node head){
//         Node slow = head;
//         Node fast = head.next;
//         while(fast != null && fast.next != null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;
//     }
//     private Node merge(Node head1, Node head2){
//         Node mergeLL = new Node(-1);
//         Node temp = mergeLL;
//         while(head1 != null && head2 != null){
//             if(head1.data <= head2.data){
//                 temp.next = head1;
//                 head1 = head1.next;
//                 temp = temp.next;
//             }else{
//                 temp.next = head2;
//                 head2 = head2.next;
//                 temp = temp.next;
//             }
//         }
//         while(head1 != null){
//             temp.next = head1;
//             head1 = head1.next;
//             temp = temp.next;
//         }
//         while(head2 != null){
//             temp.next = head2;
//             head2 = head2.next;
//             temp = temp.next;
//         }
//         return mergeLL.next;
//     }
//     public Node mergeSort(Node head){
//         if(head == null || head.next == null){
//             return head;
//         }
//         Node mid = getMid(head);
//         //left and right
//         Node rightHead = mid.next;
//         mid.next = null;

//         Node newLeft = mergeSort(head);
//         Node newRight = mergeSort(rightHead);

//         return merge(newLeft, newRight);
//     }
//      public void print() {
//         Node temp = head;
//         System.out.print("\n\n");
//         while(temp != null) {
//             System.out.print(temp.data + " --> ");
//             temp = temp.next;
//         }
//         System.out.print("null\n\n");
//     }
//     public void addFirst(int data) {
//         Node newNode = new Node(data);
//         newNode.next = head;
//         head = newNode;
//     }
//     public static void main(String args[]){
//         jav ll = new jav();
//         ll.addFirst(1);ll.addFirst(2);ll.addFirst(3);ll.addFirst(4);ll.addFirst(5);
//         ll.print();
//         ll.head = ll.mergeSort(ll.head);
//         ll.print();
//     }
// }

// public class jav{
//     public class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public static Node head;
//     private Node getMid(Node head){
//         Node slow = head;
//         Node fast = head.next;
//         while(fast != null && fast.next != null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;
//     }  
//     private Node reverse(Node rightHead){
//         Node curr = rightHead;
//         Node prev = null;
//         Node next;
//         while(curr != null){
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }
//         return prev;
//     }
//     private void merge(Node left, Node right){
//         Node nextL, nextR;
//         while(left != null && right != null){
//             nextL = left.next;
//             left.next = right;
//             nextR = right.next;
//             right.next = nextL;

//             left = nextL;
//             right = nextR; 
//         }
//     }
//     public void zigZag(){
//         Node mid = getMid(head);
//         Node rightHead = mid.next;
//         Node leftHead = head;

//         Node rightRevHead = reverse(rightHead);
//         mid.next = null;

//         merge(leftHead, rightRevHead);
//     }
//         public void print() {
//         Node temp = head;
//         System.out.print("\n\n");
//         while(temp != null) {
//             System.out.print(temp.data + " --> ");
//             temp = temp.next;
//         }
//         System.out.print("null\n\n");
//     }
//     public void addFirst(int data) {
//         Node newNode = new Node(data);
//         newNode.next = head;
//         head = newNode;
//     }
//     public static void main(String args[]){
//         jav ll = new jav();
//         ll.addFirst(5);ll.addFirst(4);ll.addFirst(3);ll.addFirst(2);ll.addFirst(1);
//         ll.print();
//         ll.zigZag();
//         ll.print();
//     }
// }

// public class jav{
//     public class Node{
//         int data;
//         Node next;
//         Node prev;
//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//             this.prev = null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addFirst(int data){
//         size++;
//         Node newNode = new Node(data);
//         if(head == null){
//             head = tail = newNode;
//             return;
//         }
//         newNode.next = head;
//         head.prev = newNode;
//         head = newNode;
//     }
//     public int removeFirst(){
//         if(head == null){
//             System.out.println("Empty DLL");
//             return Integer.MIN_VALUE;
//         }
//         if(size == 1){
//             int val = head.data;
//             head = tail = null;
//             size--;
//             return val;
//         }
//         int val = head.data;
//         head = head.next;
//         head.prev = null;
//         size--;
//         return val;
//     }
//     public void reverse(){
//          if(head == null){
//             System.out.println("Empty DLL");
//             return;
//         }
//         Node curr = head;
//         Node prev = null;
//         Node next;
//         while(curr != null){
//             next = curr.next;
//             curr.next = prev;
//             curr.prev = next;
//             prev = curr;
//             curr = next;
//         }
//         head = prev;
//     }
//     public void print(){
//         Node temp = head;
//         System.out.print("\n\n");
//         while(temp != null){
//             System.out.print(temp.data+" <--> ");
//             temp = temp.next;
//         }
//         System.out.print("null\n\n");
//     }
//     public static void main(String args[]){
//         jav Dll = new jav();
//         Dll.addFirst(3);
//         Dll.addFirst(2);
//         Dll.addFirst(1);
//         Dll.print();
//         // Dll.removeFirst();
//         // Dll.print();
//         Dll.reverse();
//         Dll.print();

//     }
// }

// public class jav{
//     public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public Node getIntersectionNode(Node head1, Node head2){
//         while(head2 != null){
//             Node temp = head1;
//             while(temp != null){
//                 if(temp == head2){
//                     return head2;
//                 }
//                 temp = temp.next;
//             }
//             head2 = head2.next;
//         }
//         return null;
//     }
//     public void print() {
//         Node temp = head;
//         System.out.print("\n\n");
//         while(temp != null) {
//             System.out.print(temp.data + " --> ");
//             temp = temp.next;
//     }
//     System.out.print("null\n\n");
//     }
//     public static void main(String args[]){
//         jav ll = new jav();
//         Node head1, head2;
//         head1 = new Node(1);
//         head2 = new Node(3);

//         Node newNode = new Node(6);
//         head2.next = newNode;

//         newNode = new Node(9);
//         head2.next.next = newNode;

//         newNode = new Node(15);
//         head1.next = newNode;
//         head2.next.next.next = newNode;
        
//         newNode = new Node(30);
//         head1.next.next = newNode;

//         head1.next.next.next = null;

//         Node interSection = ll.getIntersectionNode(head1, head2);
//         if(interSection == null){
//             System.out.println("Not found intersection ");
//         }else{
//             System.out.println(interSection.data);
//         }
//     }
// }

// public class jav{
//     public class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public void skipMdeleteN(int M, int N){
//         if(head == null){
//             System.out.print("Empty ll");
//             return;
//         }
//         if (M == 0) {
//             head = null;
//             return;
//         }
//         Node current = head;
//         int kept=1;
//         // while(current != null){

//             while(kept < M && current != null){
//                 current = current.next;
//                 kept++;
//             }
//             // if(current == null) break;
//             Node temp = current.next;
//             int deleted = 0;
//             while(deleted < N && temp != null){
//                 temp = temp.next;
//                 deleted++;
//             }
//             current.next = temp;
//         // }
//     }
//     public void print() {
//         Node temp = head;
//         System.out.print("\n\n");
//         while(temp != null) {
//             System.out.print(temp.data + " --> ");
//             temp = temp.next;
//         }
//         System.out.print("null\n\n");
//     }
//     public void addFirst(int data) {
//         Node newNode = new Node(data);
//         newNode.next = head;
//         head = newNode;
//     }
//     public static void main(String args[]){
//         jav ll = new jav();
//         ll.addFirst(6);ll.addFirst(5);ll.addFirst(4);ll.addFirst(3);ll.addFirst(2);ll.addFirst(1);
//         ll.print();
//         ll.skipMdeleteN(2, 2);
//         ll.print();
//     }
// }

// public class jav{
//     static class stack{
//         static ArrayList<Integer> list = new ArrayList<>();
//         public static boolean isEmpty(){
//             return list.size() == 0;
//         }
//         //push
//         public static void push(int data){
//             list.add(data);
//         }
//         //pop
//         public static int pop(){
//             if (isEmpty){
//                 return -1;
//             }
//             int top = list.get(list.size() - 1);
//             list.remove(list.size() - 1);
//             return top;
//         }
//         //peek
//         public static int peek(){
//             if (isEmpty){
//                 return -1;
//             }
//             return list.get(list.size() - 1);
//         }
//     }
//     public static void main(String args[]){
//         stack s = new stack();
//         s.push(1);s.push(2);s.push(3);
//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }

//     }
// }

// public class jav{
//     static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     static class Stack{
//         static Node head = null;
//         public static boolean isEmpty(){//isEmpty
//             return head == null;
//         }
//         public static void push(int data){//push
//             Node newNode = new Node(data);
//             if(isEmpty()){
//                 head = newNode;
//                 return ;
//             }
//             newNode.next = head;
//             head = newNode;
//         }
//         public static int pop(){//pop
//             if(isEmpty()){
//                 return -1;
//             }
//             int top = head.data;
//             head = head.next;
//             return top;
//         }
//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             return head.data;
//         }
//     }
//     public static void main(String args[]){
//         Stack s = new Stack();
//         s.push(1);s.push(2);s.push(3);
//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }

// public class jav{
//     public static void main(String args[]){//java collections framwork
//         // Stack s = new Stack();
//         Stack<Integer> s = new Stack<>();
//         s.push(1);s.push(2);s.push(3);
//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }

// public class jav{
//     public static void PushAtBottom(Stack<Integer> s, int data){
//         if(s.isEmpty()){
//             s.push(data);
//             return;
//         }
//         int top = s.pop();
//         PushAtBottom(s, data);
//         s.push(top);
//     }
//     public static void main(String args[]){
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         PushAtBottom(s, 4);
//         while(!s.isEmpty()){
//             System.out.println(s.pop());
//         }
//     }
// }

// public class jav{
//     public static String reveseString(String str){
//         Stack<Character> s = new Stack<>();
//         int idx = 0;
//         while(idx < str.length()){
//             s.push(str.charAt(idx));
//             idx++;
//         }
//         StringBuilder result = new StringBuilder("");
//         while(!s.isEmpty()){
//             char curr = s.pop();
//             result.append(curr);
//         }
//         return result.toString();
//     }
//     public static void main(String args[]){
//         String str = "abcd";
//         System.out.print(reveseString(str));
//     }
// }

public class jav{
    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }
    public static void pritnStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        // pritnStack(s);
        reverseStack(s);
        pritnStack(s);
    }
}
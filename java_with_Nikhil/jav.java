import java.util.*;

// public class JavaCourse { //tab completion
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

// public class jav{
//     public static void pushAtBottom(Stack<Integer> s, int data){
//         if(s.isEmpty()){
//             s.push(data);
//             return;
//         }
//         int top = s.pop();
//         pushAtBottom(s, data);
//         s.push(top);
//     }
//     public static void reverseStack(Stack<Integer> s){
//         if(s.isEmpty()){
//             return;
//         }
//         int top = s.pop();
//         reverseStack(s);
//         pushAtBottom(s, top);
//     }
//     public static void pritnStack(Stack<Integer> s){
//         while(!s.isEmpty()){
//             System.out.print(s.pop()+" ");
//         }
//     }
//     public static void main(String args[]){
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         // pritnStack(s);
//         reverseStack(s);
//         pritnStack(s);
//     }
// }

// public class jav{
//     public static void main(String args[]){
//         int arr[] = {6, 8, 0, 1, 3};
//         Stack<Integer> s = new Stack<>();
//         int nxtGreater[] = new int[arr.length];
//         for(int i=arr.length-1; i>=0; i--){
//             while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
//                 s.pop();
//             }
//             if(s.isEmpty()){
//                 nxtGreater[i] = -1;
//             }else{
//                 nxtGreater[i] = arr[s.peek()];
//             }
//             s.push(i);
//         }
//         for(int i=0; i<nxtGreater.length; i++){
//             System.out.print(nxtGreater[i]+ " ");
//         }
//         System.out.println();
//     }
// }

// public class jav{
//     public static boolean isValidParantheses(String str){
//         Stack<Character> s = new Stack<>();
//         for(int i=0; i<str.length(); i++){
//             char ch = str.charAt(i);
//             if(ch == '{' || ch == '(' || ch == '[' ){
//                 s.add(ch);
//             }else{
//                 if(s.isEmpty()){
//                     return false;
//                 }
//                 if((s.peek() == '(' && ch == ')' ) || (s.peek() == '[' && ch == ']' ) || (s.peek() == '{' && ch == '}' )){
//                     s.pop();
//                 }else{
//                     return false;
//                 }
//             }
//         }
//         return s.isEmpty() ? true : false;
//     }
//     public static void main(String args[]){
//         String str = "([{}()[]])";
//         System.out.print(isValidParantheses(str));
//     }
// }

// public class jav{
//     public static boolean  dublicateParantheses(String str){
//         Stack<Character> s = new Stack<>();
//         for(int i=0; i<str.length(); i++){
//             char ch = str.charAt(i);
//             if(ch != ')'){
//                 s.add(ch); //(, (, a, +, b
//             }else{
//                 int count = 0;
//                 while(s.peek() != '('){
//                     s.pop();
//                     count++;
//                 }
//                 s.pop();
//                 if(count == 0){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         String str = "((a+b))";
//         String str1 = "(a+b)";
//        System.out.println(dublicateParantheses(str));
//        System.out.println(dublicateParantheses(str1));
//     }
// }

// public class jav{
//     public static void maxArea(int arr[]){
//         int maxArea = 0;
//         int nsr[] = new int[arr.length];
//         int nsl[] = new int[arr.length];
//         //Next smaller right
//         Stack<Integer> s = new Stack<>();
//         for(int i=arr.length-1; i>-1; i--){
//             while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
//                 s.pop();
//             }
//             if(s.isEmpty()){
//                 nsr[i] = arr.length;
//             }else{
//                 nsr[i] = s.peek();
//             }
//             s.push(i);
//         }
//         //Next smaller left
//         s = new Stack<>();
//         for(int i=0; i<arr.length; i++){
//             while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
//                 s.pop();
//             }
//             if(s.isEmpty()){
//                 nsl[i] = -1;
//             }else{
//                 nsl[i] = s.peek();
//             }
//             s.push(i);
//         }
//         //current area : width = j-i-1;
//         for(int i=0; i<arr.length; i++){
//             int height = arr[i];
//             int width = nsr[i] - nsl[i] - 1;
//             int curreara = height * width;
//             maxArea = Math.max(curreara, maxArea);
//         }
//         System.out.print("Max area in histogram is : "+ maxArea);
//     }
//     public static void main(String args[]){
//         int arr[] = {2, 1, 5, 6, 2, 3};
//         maxArea(arr);
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

//     public static Node findMid(){
//         Node slow = head;
//         Node fast = head;
//         while(fast != null && fast.next != null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;
//     }
//     public static boolean palindrome(){
//         if(head == null || head.next == null){
//             return true;
//         }
//         Node mid = findMid();
//         Node prev = null;
//         Node curr = mid.next;
//         while(curr!=null){
//             Node next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }
//         Node left = head;
//         Node right = prev;

//         while(right != null){
//             if(left.data != right.data){
//                 return false;
//             }
//             left = left.next;
//             right = right.next;
//         }
//         return true;
//     }
//     public static void addLast(int data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = tail = newNode;
//             return;
//         }
//         tail.next = newNode;
//         tail = newNode;
//     }
//     public static void print(){
//         if(head == null){
//             System.out.println("Linked list is Empty :(");
//             return;
//         }
//         Node temp = head;
//         System.out.print("\n");
//         while(temp != null){
//             System.out.print(temp.data+" --> ");
//             temp = temp.next;
//         }
//         System.out.print("null\n\n");
//     }
//     public static void main(String args[]){
//         jav ll = new jav();
//         ll.addLast(1);ll.addLast(2);ll.addLast(2);ll.addLast(1);
//         ll.print();
//         System.out.print(ll.palindrome());
//     }
// } 

// public class jav{
//     public static String simplyPath(String str){
//         Stack<String> s = new Stack<>();
//         String[] parts = str.split("/");
//         for(String part : parts){
//             if(part.equals("") || part.equals(".")){
//                 continue;
//             }
//             if(part.equals("..")){
//                 if(!s.isEmpty()){
//                     s.pop();
//                 }
//             }else{
//                 s.push(part);
//             }
//         }
//         if(s.isEmpty()){
//             return "/";
//         }
//         String result = "";
//         for(String dir : s){
//             result += "/" + dir;
//         }
//         return result;
//     }
//     public static void main(String args[]){
//             String str = "/../a/b/./";
//             System.out.print(simplyPath(str));
//     }
// }

// public class jav{
//     public static String decodeAString(String str){
//         Stack<String> s = new Stack<>();
//         Stack<Integer> n = new Stack<>();

//         int currentNumber = 0;
//         String currentString = "";

//         for(char ch : str.toCharArray()){
            
//             if(Character.isDigit(ch)){
//                 currentNumber = currentNumber * 10 + (ch - '0');
//             }
//             else if(ch == '['){
//                 s.push(currentString);
//                 n.push(currentNumber);
//                 currentNumber = 0;
//                 currentString = "";
//             }
//             else if(ch == ']'){
//                 int repeat = n.pop();
//                 String prev = s.pop();
//                 String temp = "";
//                 for(int i=0; i<repeat; i++){
//                     temp += currentString;
//                 }
//                 currentString = prev + temp;
//             }else{
//                 currentString += ch;
//             }
//         }
//         return currentString;
//     }
//     public static void main(String args[]){
//         String str = "3[b2[v]]";
//         System.out.print(decodeAString(str));
//     }
// }

// public class jav{
//     public static int TrappingRainWater(int arr[]){
//         int lMax[] = new int[arr.length];

//         int lMaxValue = arr[0];
//         lMax[0] = arr[0];

//         for(int i=1; i<arr.length; i++){
//             lMaxValue = Math.max(arr[i], lMaxValue);
//             lMax[i] = lMaxValue;
//         }

//         int rMax[] = new int[arr.length];
//         int rMaxValue = arr[arr.length-1];
//         rMax[arr.length-1] = arr[arr.length-1];

//         for(int i=arr.length-2; i>=0; i--){
//             rMaxValue = Math.max(arr[i], rMaxValue);
//             rMax[i] = rMaxValue;
//         }

//         int sumWater = 0;
//         for(int i=0; i<arr.length; i++){
//             int water = Math.min(lMax[i], rMax[i]) - arr[i];
//             sumWater += water;
//         }
//         return sumWater;
//     }
//     public static void main(String args[]){
//         int arr[] = {7, 0, 4, 2, 5, 0, 6, 4, 0, 5};
//         System.out.print(TrappingRainWater(arr));
//     }
// }

// public class jav{
//     static class Queue{
//         static int arr[];
//         static int rear;
//         static int size;
//         static int front;
//         Queue(int n){
//             arr = new int[n];
//             size = n;
//             rear = -1;
//             front = -1;
//         }
//         public static boolean isEmpty(){
//             return rear == -1 && front == -1;
//         }
//         public static boolean isFull(){
//             return (rear+1)% size == front;
//         }
//         public static void add(int data){
//             if(isFull()){
//                 System.out.print("Queue Full");
//                 return;
//             }
//             if(front == -1){
//                 front = 0;
//             }
//             rear = (rear+1) % size;
//             arr[rear] = data;
//         }
//         public static int remove(){
//             if(isEmpty()){
//                 System.out.print("Queue Empty");
//                 return -1;
//             }
//             int result = arr[front];
//             if(rear == front){
//                 rear = front = -1;
//             }else{
//                 front = (front+1)%size;
//             }
//             return result;
//         }
//         public static int peek(){
//              if(isEmpty()){
//                 System.out.print("Queue Empty");
//                 return -1;
//             }
//             return arr[front];
//         }
// }
//     public static void main(String args[]){
//         Queue q = new Queue(5);
//         q.add(1);q.add(2);q.add(3);q.add(4);
//         System.out.print(q.remove());
//         q.add(5);
//         System.out.print(q.remove());
//         q.add(6);

//         while(!q.isEmpty()){
//             System.out.print(q.peek() +" ");
//             q.remove();
//         }
//     }
// }

// public class jav{
//     static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     static class Queue{
//         static Node head = null;
//         static Node tail = null;

//         public static boolean isEmpty(){
//             return head == null && tail == null;
//         }
//         public static void add(int data){
//             Node newNode = new Node(data);
//             if(head == null){
//                 head = tail = newNode;
//                 return;
//             }
//             tail.next = newNode;
//             tail = newNode;
//         }
//         public static int remove(){
//             if(isEmpty()){
//                 System.out.print("Empty Queue");
//                 return-1;
//             }
//             int front = head.data;
//             if(tail == head){
//                 tail = head = null;
//             }else{
//                 head = head.next;
//             }
//             return front;
//         }
//         public static int peek(){
//             if(isEmpty()){
//                 System.out.print("Empty Queue");
//                 return-1;
//             }
//             return head.data;
//         }
//     }
//     public static void main(String args[]){
//         Queue q = new Queue();
//         q.add(1);q.add(2);q.add(3);

//         while(!q.isEmpty()){
//             System.out.print(q.peek()+" ");
//             q.remove();
//         }
//     }
// }

// public class jav{
//     public static void main(String args[]){
//         Queue<Integer> q = new LinkedList<>();
//         // Queue<Integer> q = new ArrayDeque<>();
//         q.add(1);q.add(2);q.add(3);
//         while(!q.isEmpty()){
//             System.out.print(q.peek()+" ");
//             q.remove();
//         }
//     }
// }

// public class jav{
//     static class Queue{
//         Stack<Integer> s1 = new Stack<>();
//         Stack<Integer> s2 = new Stack<>();

//         public boolean isEmpty(){
//             return s1.isEmpty();
//         }
//         public void add(int data){
//             while(!s1.isEmpty()){
//                 s2.push(s1.pop());
//             }
//             s1.push(data);
//             while(!s2.isEmpty()){
//                 s1.push(s2.pop());
//             }
//         }
//         public int remove(){
//             if(isEmpty()){
//                 System.out.print("queue Empty");
//                 return -1;
//             }
//             return s1.pop();
//         }
//         public int peek(){
//             if(isEmpty()){
//                 System.out.print("queue Empty");
//                 return -1;
//             }
//             return s1.peek();
//         }
//     }
//     public static void main(String args[]){
//         Queue q = new Queue();
//         q.add(1);q.add(2);q.add(3);
//         while(!q.isEmpty()){
//             System.out.print(q.peek()+" ");
//             q.remove();
//         }
//     }
// }

// public class jav{
//     public static void printNonRepeating(String str){
//         Queue<Character> q = new LinkedList<>();
//         int freq[] = new int[26];//a-z
//         for(int i=0; i<str.length(); i++){
//             char ch = str.charAt(i);
//             q.add(ch);//x
//             freq[ch - 'a']++;//a = 2, b = 2, c = 1
//             while(!q.isEmpty() && freq[q.peek() - 'a'] > 1){
//                 q.remove();
//             }
//             if(q.isEmpty()){
//                 System.out.print(-1+" ");
//             }else{
//                 System.out.print(q.peek()+" ");//a a a a c c x
//             }
//         }
//     }
//     public static void main(String args[]){
//         String str = "abcbaxc";
//         printNonRepeating(str);
//     }
// }

// public class jav{
//     public static void interLeave(Queue<Integer> q){
//         Queue<Integer> firstHalf = new LinkedList<>();
//         int size = q.size()/2;
//         for(int i=0; i<size; i++){
//             firstHalf.add(q.remove());
//         }
//         while(!firstHalf.isEmpty()){
//             q.add(firstHalf.remove());
//             q.add(q.remove());
//         }
//         return;
//     }
//     public static void main(String args[]){
//         Queue<Integer> q = new LinkedList<>();
//         q.add(1);q.add(2);q.add(3);q.add(4);q.add(5);q.add(6);q.add(7);q.add(8);q.add(9);q.add(10);
//         interLeave(q);
//         while(!q.isEmpty()){
//             System.out.print(q.peek()+" ");
//             q.remove();
//         }
//     }
// }

// public class jav{
//     public static void QueueReverse(Queue<Integer> q){
//         Stack<Integer> s = new Stack<>();
//         while(!q.isEmpty()){
//             s.push(q.remove());
//         }
//         while(!s.isEmpty()){
//             q.add(s.pop());
//         }
//         return;
//     }
//     public static void main(String args[]){
//         Queue<Integer> q = new LinkedList<>();
//         q.add(1);q.add(2);q.add(3);q.add(4);q.add(5);
//         QueueReverse(q);
//         while(!q.isEmpty()){
//             System.out.print(q.peek()+" ");
//             q.remove();
//         }
//     }
// }

// public class jav{
//     public static void main(String args[]){
//         Deque<Integer> deque = new LinkedList<>();
//         deque.addFirst(1);
//         deque.addFirst(2);
//         System.out.println(deque);
//         deque.removeLast();
//         System.out.println(deque);
//     }
// }

// public class jav{
//     static class Stack{
//         Deque<Integer> deque = new LinkedList<>();
//         public void push(int data){
//             deque.addLast(data);
//             return;
//         }
//         public int pop(){
//             return deque.removeLast();
//         }
//         public int peek(){
//             return deque.getLast();
//         }
//     }
//     static class Queue{
//         Deque<Integer> deque = new LinkedList<>();
//         public void add(int data){
//             deque.addLast(data);
//         }
//         public int remove(){
//             return deque.removeFirst();
//         }
//         public int peek(){
//             return deque.getFirst();
//         }
//     }
//     public static void main(String args[]){
//         // Stack s = new Stack();
//         // s.push(1);s.push(2);s.push(3);
//         // System.out.print("peek --> " + s.peek()+" ");
//         // System.out.print(s.pop()+" ");
//         // System.out.print(s.pop()+" ");
//         // System.out.print(s.pop()+" ");
        
//         Queue q = new Queue();
//         q.add(1);q.add(2);q.add(3);
//         System.out.print(q.remove()+" ");
//         System.out.print(q.remove()+" ");
//         System.out.print(q.remove()+" ");
//     }
// }

// public class jav{
//     public static void main(String args[]){
//         int start[] = {1, 3, 0, 5, 8, 5};
//         int end[] = {2, 4, 6, 7, 9, 9};

//         int activities[][] = new int[start.length][3];
//         for(int i=0; i<start.length; i++){
//             activities[i][0] = i;
//             activities[i][1] = start[i];
//             activities[i][2] = end[i];
//         }
//         Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

//         int maxAct;
//         ArrayList<Integer> ans = new ArrayList<>();

//         maxAct = 1;
//         ans.add(activities[0][0]);
//         int lastEnd = activities[0][2];

//         for(int i=1; i<start.length; i++){
//             if(lastEnd <= activities[i][1]){
//                 maxAct++;
//                 ans.add(activities[i][0]);
//                 lastEnd = activities[i][2];
//             }
//         }
//         System.out.println("Max Activities = "+ maxAct);
//         for(int i=0; i<ans.size(); i++){
//             System.out.print("A"+ans.get(i)+" ");
//         }
//     }
// }

// public class jav{
//     public static void intToBinary(int num){
//         if(num == 0){
//             System.out.print("0 ");
//             return;
//         }
//         int binary =0;
//         int place = 1;
//         while(num>0){
//             int rem = num % 2;
//             binary = binary + rem * place;
//             place *= 10;
//             num /= 2;
//         }
//         System.out.print(binary+" ");
//     }
//     public static void main(String args[]){
//         int num = 5;
//         for(int i=0; i<=5; i++){
//             intToBinary(i);
//         }
//     }
// }

// public class jav{
//     public static void main(String args[]){
//         int val[] = {60, 100, 120};
//         int weight[] = {10, 20, 30};
//         int w = 50;
//         double ratio[][] = new double[val.length][2];
//         for(int i=0; i<ratio.length; i++){
//             ratio[i][0] = i;
//             ratio[i][1] = val[i]/(double)weight[i];
//         }
//         Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
//         int capacity = w;
//         int finalval = 0;
//         for(int i=ratio.length-1; i>=0; i--){
//             int idx = (int)ratio[i][0];
//             if(capacity >= weight[idx]){
//                 finalval += val[idx];
//                 capacity -= weight[idx];
//             }else{
//                 finalval += (ratio[i][1] * capacity);
//                 capacity = 0;
//                 break;
//             }
//         }
//         System.out.print(finalval);
//     }
// }

// public class jav{
//     public static void main(String args[]){
//         int A[] = {4, 1, 8, 7};
//         int B[] = {2, 3, 6, 5};
//         Arrays.sort(A);
//         Arrays.sort(B);

//         int minDiff = 0;
//         int minSum = 0;
//         for(int i=0; i<A.length; i++){
//             minDiff = A[i] - B[i];
//             if(minDiff < 0){
//                 minDiff = -(minDiff);
//             }
//             minSum += minDiff;
//         }
//         System.out.print(minSum);
//     }
// }

// public class jav{
//     public static void main(String args[]){
//         int pairs[][] = {
//             {5, 24},
//             {39, 60},
//             {5, 28},
//             {27, 40},
//             {50, 90}
//         };
//         Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
//         int chainLen = 1;
//         int chainEnd = pairs[0][1];
//         for(int i=1; i<pairs.length; i++){
//             if(chainEnd < pairs[i][0]){
//                 chainLen++;
//                 chainEnd = pairs[i][1];
//             }
//         }
//         System.out.print(chainLen);
//     }
// }

// public class jav{
//     public static void main(String args[]){

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your amount : ");
//         int amount = sc.nextInt();//590

//         int coins[] = {2000, 500, 100, 50, 20, 10, 5, 2, 1};
//         int countOfCoins = 0;

//         for(int i=0; i<coins.length; i++){
//             if(coins[i] <= amount){
//                 while(coins[i] <= amount){
//                     countOfCoins++;
//                     System.out.print(coins[i]+" ");
//                     amount -= coins[i];
//                 }
//             }
//         }
//         System.out.println(countOfCoins);
//     }
// }

// public class jav{
//     static class Job{
//         int deadline;
//         int profit;
//         int id;
//         public Job(int i, int d, int p){
//             id = i; 
//             deadline = d;
//             profit = p;
//         }
//     }
//     public static void main(String args[]){
//         int jobsInfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};

//         ArrayList<Job> jobs = new ArrayList<>();

//         for(int i=0; i<jobsInfo.length; i++){
//             jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
//         }

//         Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);

//         ArrayList<Integer> seq = new ArrayList<>();
//         int time = 0;
//         for(int i=0; i<jobs.size(); i++){
//             Job curr = jobs.get(i);
//             if(curr.deadline > time){
//                 seq.add(curr.id);
//                 time++;
//             }
//         }
//         System.out.println(time);
//         for(int i=0; i<seq.size(); i++){
//             System.out.print(seq.get(i)+" ");
//         }
//     }
// }

// public class jav{
//     public static void main(String args[]){
//         int n = 4, m = 6;
//         Integer costVer[] = {2, 1, 3, 1, 4};
//         Integer costHor[] = {4, 1, 2};  

//         Arrays.sort(costVer, Collections.reverseOrder());
//         Arrays.sort(costHor, Collections.reverseOrder());
        
//         int h = 0, v = 0 ;
//         int hp = 1, vp = 1;
//         int cost = 0;
//         while(h < costVer.length && v < costHor.length){
//             if(costVer[v] <= costHor[h]){//horizontal cuts
//                 cost += (costHor[h] * vp);
//                 hp++;
//                 h++;
//             }else{//vertical cuts
//                 cost += (costVer[v] * hp);
//                 vp++;
//                 v++;
//             }
//         }
//         while(h < costHor.length){
//             cost += (costHor[h] * vp);
//             hp++;
//             h++;
//         }
//         while(v < costVer.length){
//             cost += (costVer[v] * hp);
//             vp++;
//             v++;
//         }
//         System.out.print("Minimum cost : "+cost);
//     }
// }

// public class jav{
//     public static void main(String args[]){
//         int arr[] = {12, 4, 7, 2, 9, 15, 3};

//         PriorityQueue<Integer> pq = new PriorityQueue<>();
        
//         for(int x : arr){
//             pq.add(x);
//         }

//         int totalCost = 0;

//         while(pq.size() > 1){
//             int first = pq.poll();
//             int second = pq.poll();

//             int cost = first + second;
//             totalCost += cost;
//             System.out.print(totalCost+" ");
//             pq.add(cost);
//         }

//         System.out.println("\n"+totalCost);
//     }
// }

// public class jav{
//     public static void main(String args[]){
//         int deadLine[] = {3, 3, 1};
//         int profit[]   = {100, 90, 80};

//         int jobs[][] = new int[profit.length][2];

//         for(int i=0; i<profit.length; i++){
//             jobs[i][0] = deadLine[i];
//             jobs[i][1] = profit[i];
//         }

//         Arrays.sort(jobs, (a, b) -> b[1] - a[1]);

//         int maxDeadline = 0;
//         for(int i=0; i<jobs.length; i++){
//             maxDeadline = Math.max(maxDeadline, jobs[i][0]);//3
//         }

//         boolean slot[] = new boolean[maxDeadline + 1];

//         int totalProfit = 0;
//         for(int i=0; i<jobs.length; i++){
//             for(int j=jobs[i][0]; j>0; j--){
//                 if(!slot[j]){
//                     slot[j] = true;
//                     totalProfit += jobs[i][1];
//                     break;
//                 }
//             }
//         }
//         System.out.print(totalProfit);
//     }
// }

// public class jav{
//     public static void main(String args[]){
//         Queue<Integer> q = new LinkedList<>();
//         q.add(10);q.add(20);q.add(30);q.add(40);q.add(50);
//         q.add(60);q.add(70);q.add(80);q.add(90);q.add(100);
//         int k = 5;

//         Stack<Integer> s = new Stack<>();
//         for(int i=0; i<k; i++){
//             s.push(q.remove());
//         }
//         for(int i=0; i<k; i++){
//             q.add(s.pop());
//         }

//         int reverse = q.size() - k;
//         for(int i=0; i<reverse; i++){
//             q.add(q.remove());
//         }

//         while(!q.isEmpty()){
//             System.out.print(q.remove()+" ");
//         }
//     }
// }

// public class jav{
//     public static void main(String args[]){
//         int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
//         int k = 3;
//         int n = arr.length;

//         Deque<Integer> dq = new LinkedList<>();

//         for(int i=0; i<k; i++){
//             while(!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]){
//                 dq.removeLast();
//             }
//             dq.addLast(i);
//         }

//         for(int i=k; i<n; i++){
//             System.out.print(arr[dq.peekFirst()]+" ");
//             while(!dq.isEmpty() && dq.peekFirst() <= i - k){
//                 dq.removeFirst();
//             }

//             while(!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]){
//                 dq.removeLast();
//             }
//             dq.addLast(i);
//         }
//         System.out.print(arr[dq.peekFirst()]);
//     }
// }

// public class jav{
//     static class Node{
//         int data;
//         Node left;
//         Node right;
//         public Node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }
//     static class BinaryTree {
//         static int idx = -1;
//         public static Node buildTree(int nodes[]){
//             idx++;
//             if(nodes[idx] == -1){
//                 return null;
//             }
//             Node newNode = new Node(nodes[idx]);
//             newNode.left = buildTree(nodes);
//             newNode.right = buildTree(nodes);
//             return newNode;
//         }
//         public static void preorder(Node root){
//             if(root == null){
//                 return;
//             }
//             System.out.print(root.data+" ");
//             preorder(root.left);
//             preorder(root.right);
//         }
//         public static void inorder(Node root){
//             if(root == null){
//                 return;
//             }
//             inorder(root.left);
//             System.out.print(root.data+" ");
//             inorder(root.right);
//         }
//         public static void postorder(Node root){
//             if(root == null){
//                 return;
//             }
//             postorder(root.left);
//             postorder(root.right);
//             System.out.print(root.data+" ");
//         }
//         //Level Order Traversal
//         public static void levelOrder(Node root){
//             if(root == null){
//                 return;
//             }
//             Queue<Node> q = new LinkedList<>();
//             q.add(root);
//             q.add(null);

//             while(!q.isEmpty()){
//                 Node currNode = q.remove();
//                 if(currNode == null){
//                     System.out.println();
//                     if(q.isEmpty()){
//                         break;
//                     }else{
//                         q.add(null);
//                     }
//                 }else{
//                     System.out.print(currNode.data+" ");
//                     if(currNode.left != null){
//                         q.add(currNode.left);
//                     }
//                     if(currNode.right != null){
//                         q.add(currNode.right);
//                     }
//                 }
//             }
//         }
//     }
//     public static void main(String args[]){
//         int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
//         BinaryTree tree = new BinaryTree();
//         Node root = tree.buildTree(nodes);
//         tree.levelOrder(root);
//     }
// }

// public class jav{
//     static class Node{
//         int data;
//         Node left;
//         Node right; 
//         public Node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     } 
//     public static int height(Node root) {
//         if(root == null){
//             return 0;
//         }
//         int lh = height(root.left);
//         int rh = height(root.right);
//         return Math.max(lh, rh) + 1;
//     }
//     public static int countNodes(Node root){
//         if(root == null){
//             return 0;
//         }
//         int ls = countNodes(root.left);
//         int rs = countNodes(root.right);
//         return (ls + rs) + 1;
//     }
//     public static int sumNodes(Node root){
//         if(root == null){
//             return 0;
//         }
//         int ls = sumNodes(root.left);
//         int rs = sumNodes(root.right);
//         return ls + rs + root.data;
//     }
//     public static int diameter1(Node root){//approch 1) --> o(n^2) 
//         if(root == null){
//             return 0;
//         }
//         int leftDiam = diameter1(root.left);
//         int leftHt = height(root.left);
//         int rightDiam = diameter1(root.right);
//         int rightHt = height(root.right);

//         int selfDiam = leftHt + rightHt + 1;

//         return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
//     }
//     static class Info{
//         int diam;
//         int ht;
//         public Info(int diam, int ht){
//             this.diam = diam;
//             this.ht = ht;

//         }
//     }
//     public static Info diameter(Node root){////approch 2) --> o(n) 
//         if(root == null){
//             return new Info(0, 0);
//         }
//         Info leftInfo = diameter(root.left);
//         Info rightInfo = diameter(root.right);

//         int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
//         int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;
//         return new Info(diam, ht);
//     }
//     public static void main(String args[]){
//         /*          1
//                    / \        
//                   2   3     
//                  / \ / \   
//                 4  5 6  7      
//         */                       
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);

//         System.out.println(diameter(root).ht);
//     }
// }

// public class jav{
//     static class Node{
//         int data;
//         Node left;
//         Node right;
//         public Node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }
    
//     public static boolean isIdentical(Node root, Node subRoot){
//         if(root == null && subRoot == null){
//             return true;
//         }else if(root == null || subRoot == null || root.data != subRoot.data){
//             return false;
//         }
        
//         if(!isIdentical(root.left, subRoot.left)){
//             return false;
//         }
//         if(!isIdentical(root.right, subRoot.right)){
//             return false;
//         }
//         return true;
//     }

//     public static boolean isSubtree(Node root, Node subRoot){
//         if(root == null){
//             return false;
//         }
//         if(root.data == subRoot.data) {
//             if(isIdentical(root, subRoot)){
//                 return true;
//             }
//         }
//         return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
//     }
//     public static void main(String args[]){
//         Node root = new Node(1);       //           1 
//         root.left = new Node(2);       //          / \   
//         root.right = new Node(3);      //         2   3  
//         root.left.left = new Node(4);  //        / \ / \ 
//         root.left.right = new Node(5); //       4  5 6  7
//         root.right.left = new Node(6);             
//         root.right.right = new Node(7); 

//         Node subRoot = new Node(2);     //           2 
//         subRoot.left = new Node(4);     //          / \ 
//         subRoot.right = new Node(5);    //         4   5
//         System.out.println(isSubtree(root, subRoot));
//     }
// }

// public class jav{
//     static class Node{
//         int data;
//         Node left;
//         Node right;
//         public Node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }
//     static class Info{
//         Node node;
//         int hd;
//         public Info(Node node, int hd){
//             this.node = node;
//             this.hd = hd;
//         }
//     }
//     public static void topView(Node root){
//         Queue<Info> q = new LinkedList<>();
//         HashMap<Integer, Node> map = new HashMap<>();

//         q.add(new Info(root, 0));
//         q.add(null);
//         int min = 0, max = 0;

//         while(!q.isEmpty()){
//             Info curr = q.remove();
//             if(curr == null){
//                 if(q.isEmpty()){
//                     break;
//                 }else{
//                     q.add(null);
//                 }
//             }else{
//                 if(!map.containsKey(curr.hd)){
//                     map.put(curr.hd, curr.node);
//                 }

//                 if(curr.node.left != null){
//                     q.add(new Info(curr.node.left, curr.hd - 1));
//                     min = Math.min(min, curr.hd - 1);
//                 }

//                 if(curr.node.right != null){
//                     q.add(new Info(curr.node.right, curr.hd + 1));
//                     max = Math.max(max, curr.hd + 1);
//                 }
//             }
//         }
//         for(int i=min; i<=max; i++){
//             System.out.print(map.get(i).data + " ");
//         }
//     }
//     public static void main(String args[]){
//         Node root = new Node(1);       //           1 
//         root.left = new Node(2);       //          / \   
//         root.right = new Node(3);      //         2   3  
//         root.left.left = new Node(4);  //        / \ / \ 
//         root.left.right = new Node(5); //       4  5 6  7
//         root.right.left = new Node(6);             
//         root.right.right = new Node(7); 

//         topView(root);
//     }
// }

// public class jav{//job sequencing
//     static class Job{
//         int id;
//         int deadline;
//         int profit;
//         public Job(int id, int deadline, int profit){
//             this.id = id;
//             this.deadline = deadline;
//             this.profit = profit;
//         }
//     }
//     public static void main(String args[]){
//         int jobsInfo[][] = {{4,20}, {1,10}, {1,40}, {1,30}};

//         ArrayList<Job> jobs = new ArrayList<>();

//         for(int i=0; i<jobsInfo.length; i++){
//             jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
//         }

//         Collections.sort(jobs, (a, b) -> b.profit - a.profit);

//         int maxDeadline = 0;
//         for(Job j : jobs){
//             maxDeadline = Math.max(maxDeadline, j.deadline);
//         }

//         boolean slot[] = new boolean[maxDeadline + 1];
//         int totalProfit = 0;

//         for(Job curr : jobs){
//             for(int t = curr.deadline; t>0; t--){
//                 if(!slot[t]){
//                     slot[t] = true;;
//                     totalProfit += curr.profit;
//                     System.out.print(curr.id + " ");
//                     break;
//                 }
//             }
//         }
//         System.out.println("\nTotal Profit = " + totalProfit);
//     }
// }

// public class jav{

//     static class Node{
//         int data;
//         Node left;
//         Node right;
//         public Node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

    // public static void KLevel(Node root, int level, int k){
    //     if(root == null){
    //         return;
    //     }

    //     if(level == k){
    //         System.out.print(root.data+" ");
    //         return;
    //     }

    //     KLevel(root.left, level+1, k);
    //     KLevel(root.right, level+1, k);
    // }

    // public static boolean getPath(Node root, int n, ArrayList<Node> path){
    //     if(root == null){
    //         return false;
    //     }

    //     path.add(root);

    //     if(root.data == n){
    //         return true;
    //     }

    //     boolean pathLeft = getPath(root.left, n, path);
    //     boolean pathRight = getPath(root.right, n, path);

    //     if(pathLeft || pathRight){
    //         return true;
    //     }

    //     path.remove(path.size()-1);
    //     return false;
    // }

    // public static Node lowestCommonAncestor1(Node root, int n1, int n2){//time - > o(n)
    //     ArrayList<Node> path1 = new ArrayList<>();                      //space - >o(n)
    //     ArrayList<Node> path2 = new ArrayList<>();

    //     getPath(root, n1, path1);
    //     getPath(root, n2, path2);

    //     int i=0;
    //     for(; i<path1.size() && i<path2.size();i++){
    //         if(path1.get(i) != path2.get(i)){
    //             break;
    //         }
    //     }
    //     return path1.get(i-1);
    // }

    // public static Node lowestCommonAncestor2(Node root, int n1, int n2){
    //     if(root == null || root.data == n1 || root.data == n2){
    //         return root;
    //     }

    //     Node leftLca = lowestCommonAncestor2(root.left, n1, n2);
    //     Node rightLca = lowestCommonAncestor2(root.right, n1, n2);

    //     if(rightLca == null){
    //         return leftLca;
    //     }
    //     if(leftLca == null){
    //         return rightLca;
    //     }

    //     return root;
    // }

    // public static int lcaDist(Node root, int n){
    //     if(root == null){
    //         return -1;
    //     }
    //     if(root.data == n){
    //         return 0;
    //     }

    //     int leftDist = lcaDist(root.left, n);
    //     int rightDist = lcaDist(root.right, n);

    //     if(leftDist == -1 && rightDist == -1){
    //         return -1;
    //     }else if(leftDist == -1){
    //         return rightDist + 1;
    //     }else{
    //         return leftDist + 1;
    //     }
    // }

    // public static int minDist(Node root, int n1, int n2){
    //     Node lca = lowestCommonAncestor2(root, n1, n2);

    //     int dist1 = lcaDist(lca, n1);
    //     int dist2 = lcaDist(lca, n2);

    //     return dist1 + dist2;
    // }

    // public static int KAncestor(Node root, int n, int k){
    //     if(root == null){
    //         return -1;
    //     }
    //     if(root.data == n){
    //         return 0;
    //     }
    //     int leftDist = KAncestor(root.left, n, k);
    //     int rightDist = KAncestor(root.right, n, k);

    //     if(leftDist == -1 && rightDist == -1){
    //         return -1;
    //     }

    //     int max = Math.max(leftDist, rightDist);
    //     if(max+1 == k){
    //         System.out.println(root.data);
    //     }
    //     return max+1;
    // }

//     public static int transformToSum(Node root){    //      1              27                     
//         if(root == null){                           //     / \            /  \    
//             return 0;                               //    2   3   -->    9    13                                                                  
//         }                                           //   / \ / \        /  \ /  \                                                                        
//                                                     //  4  5 6  7      0   0 0   0                                                                
//         int leftChild = transformToSum(root.left);                                                                                                                     
//         int rightChild = transformToSum(root.right);                                                                                                                     
                                                                                                                     
//         int data = root.data;//this value will be update in root.data so we keep in leftchild or rightchild through return data

//         int newLeft = root.left == null ? 0 : root.left.data;
//         int newRight = root.right == null ? 0 : root.right.data;

//         root.data = newLeft + leftChild + newRight + rightChild;

//         return data;
//     }

//     public static void preOrder(Node root){
//         if(root == null){
//             return;
//         }
//         System.out.print(root.data+" ");
//         preOrder(root.left);
//         preOrder(root.right);
//     }

//     public static void main(String args[]){
//         Node root = new Node(1);       //           1   
//         root.left = new Node(2);       //          / \    
//         root.right = new Node(3);      //         2   3  
//         root.left.left = new Node(4);  //        / \ / \ 
//         root.left.right = new Node(5); //       4  5 6  7
//         root.right.left = new Node(6);             
//         root.right.right = new Node(7); 

//         transformToSum(root);
//         preOrder(root);
//     }
// }

// public class jav {
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         public Node(int data) {
//             this.data = data;
//             this.left = left;
//             this.right = right;
//         }
//     }
//     public static boolean checkUnivalued(Node root) {
//         if(root == null){
//             return true;
//         }

//         if(root.left != null && root.left.data != root.data) {
//             return false;
//         }
//         if(root.right != null && root.right.data != root.data) {
//             return false;
//         }
        
//         return checkUnivalued(root.left) && checkUnivalued(root.right);
//     }

    
//     public static void main(String args[]) {
//         Node root = new Node(2);       //        2                                          
//         root.left = new Node(2);       //       / \                                          
//         root.right = new Node(2);      //      2   2                                          
//         root.left.left = new Node(5);  //     / \                                              
//         root.left.right = new Node(2); //    5   2                                              

//         System.out.print(checkUnivalued(root));
//     }
// }

// public class jav{
//     static class Node{
//         int data;
//         Node left;
//         Node right;
//         public Node(int data){
//             this.data = data;
//             left = right = null;
//         }
//     }

    // public static void invertBinaryTree(Node root){
    //     if(root == null){                        //       1              1                                                                                                 
    //         return;                              //      / \            / \                                                                                        
    //     }                                        //     2   3    -->   3   2                                                                               
    //                                              //    / \ / \        / \ / \                                                                      
    //     Node temp = root.left;                   //   4  5 6  7      7  6 5  4                                                                                                 
    //     root.left = root.right;                                                                                                             
    //     root.right = temp;                                                                                                              
                                                                                                                
    //     invertBinaryTree(root.left);                                                                                                                
    //     invertBinaryTree(root.right);                                                                                                               

    // }

    // public static Node removeLeafNodesWithX(Node root, int x){                                                                                                                                      
    //     if(root == null){                               //       1              1                                                                                                           
    //         return null;                                //      / \            / \                                                                                                          
    //     }                                               //     2   3    -->   2   3                                                                                         
    //                                                     //    / \ / \          \   \                                                                                
    //     root.left = removeLeafNodesWithX(root.left, x); //   3  5 3  7         5    7                                                                                                                                   
    //     root.right = removeLeafNodesWithX(root.right, x);                                                                                                                                       
                                                                                                                                        
    //     if(root.left == null && root.right == null && root.data == x){
    //         return null;
    //     }

    //     return root;
    // }

    // public static String DuplicateSubtrees(Node root, HashMap<String, Integer> map, ArrayList<Node> res){
    //     if(root == null){                                     //           1                                                                                   
    //         return "#";                                       //          / \                                                                              
    //     }                                                     //         3   3                                                                 
    //                                                           //        / \ / \                                                        
    //     String left = DuplicateSubtrees(root.left, map, res); //       4  5 4  7                                                                                                                   
    //     String right = DuplicateSubtrees(root.right, map, res);                                                                                                                     
                                                                                                                        
    //     String subtree = left + "," + root.data + "," + right;                                                                                                                      
                                                                                                                        
    //     map.put(subtree, map.getOrDefault(subtree, 0) + 1);

    //     if(map.get(subtree) == 2){
    //         res.add(root);
    //     }
        
    //     return subtree;
    // }

    // public static void preOrder(Node root){
    // if(root == null){
    //     return;
    // }

    // System.out.print(root.data+" ");
    // preOrder(root.left);
    // preOrder(root.right);

    // }

    // public static void main(String args[]){
    //     Node root = new Node(1);       //           1                                       
    //     root.left = new Node(2);       //          / \                                       
    //     root.right = new Node(3);      //         2   3         
    //     root.left.left = new Node(4);  //        / \ / \                                
    //     root.left.right = new Node(5); //       4  5 6  7                               
    //     root.right.left = new Node(6);             
    //     root.right.right = new Node(7); 

        // invertBinaryTree(root);
        // removeLeafNodesWithX(root, 3);
        // preOrder(root);

//         HashMap<String, Integer> map = new HashMap<>();
//         ArrayList<Node> res = new ArrayList<>();
//         DuplicateSubtrees(root, map, res);
//         for(int i=0; i<res.size(); i++){
//             System.out.print(res.get(i).data+" ");
//         }
//     }
// }

// public class jav{
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node (int data) {
//             this.data = data;
//         }
//     }

//     public static Node insert(Node root, int val) {
//         if(root == null){
//             root = new Node(val);
//             return root;
//         }

//         if(root.data > val){
//             root.left = insert(root.left, val);
//         }else{
//             root.right = insert(root.right, val);
//         }
//         return root;
//     }

//     public static void inorder(Node root){
//         if(root == null){
//             return;
//         }

//         inorder(root.left);
//         System.out.print(root.data+" ");
//         inorder(root.right);
//     }

//     public static void main(String args[]){
//         int values[] = {5, 1, 3, 4, 2, 7};
//         Node root = null;

//         for(int i=0; i<values.length; i++){
//             root = insert(root, values[i]);
//         }

//         inorder(root);
//         System.out.println();
//     }
// }

// public class jav{
//     static class Node{
//         int data;
//         Node left;
//         Node right;
//         public Node (int data){
//             this.data = data;
//         }
//     }

//     public static boolean search(Node root, int val){
//         if(root == null){
//             return false;
//         }

//         if(root.data == val){
//             return true;
//         }

//         if(root.data > val){
//             return search(root.left, val);
//         }else{
//             return search(root.right, val);
//         }
//     }

//     public static void main(String args[]){     //        5                                                                                                                          
//         Node root = new Node(5);                //      /   \                                                                                                                                                                          
//         root.left = new Node(1);                //     1     7                                                                                                                                                                          
//         root.right = new Node(7);               //      \                                                                                                                                                                          
//         root.left.right = new Node(3);          //       3                                                                                                                                                                              
//         root.left.right.left = new Node(2);     //      / \                                                                                                                                                                                  
//         root.left.right.right = new Node(4);    //     2   4                                                                                                                                                                                      

//         System.out.print(search(root, 4));
//     }
// }

// public class jav{
//     static class Node{
//         int data;
//         Node left;
//         Node right;
//         public Node(int data){
//             this.data = data;
//         }
//     }

//     public static void inorder(Node root){
//         if(root == null){
//             return;
//         }

//         inorder(root.left);
//         System.out.print(root.data+" ");
//         inorder(root.right);
//     }

//     public static Node insert(Node root, int val){
//         if(root == null){
//             return new Node(val);
//         }

//         if(root.data > val){
//             root.left = insert(root.left, val);
//         }else{
//             root.right = insert(root.right, val);
//         }
//         return root;
//     }

//     public static Node delete(Node root, int val){
//         if(root.data > val){
//             root.left = delete(root.left, val);
//         }
//         else if(root.data < val){
//             root.right = delete(root.right, val);
//         }
//         else{//viola

//             //case 1 -> leaf node
//             if(root.left == null && root.right == null){
//                 return null;
//             }

//             //case 2 -> single child 
//             if(root.left == null){
//                 return root.right;
//             }else if(root.right == null){
//                 return root.left;
//             }

//             //case 3 -> both child
//             Node Is = findInorderSuccessor(root.right);
//             root.data = Is.data;
//             root.right = delete(root.right, Is.data);
//         }
//         return root;
//     }

//     public static Node findInorderSuccessor(Node root){
//         while(root.left != null){
//             root = root.left;
//         }
//         return root;
//     }

//     public static void printInRange(Node root, int k1, int k2){
//         if(root == null) return;

//         if(root.data >= k1 && root.data <= k2){
//             printInRange(root.left, k1, k2);
//             System.out.print(root.data + " ");
//             printInRange(root.right, k1, k2);
//         }
//         else if(root.data < k1){
//             printInRange(root.left, k1, k2);
//         }
//         else{
//             printInRange(root.right, k1, k2);
//         }
//     }

//     public static void printPath(ArrayList<Integer> path){
//         for(int i=0; i<path.size(); i++){
//             System.out.print(path.get(i)+"->");
//         }
//         System.out.println("Null");
//     }

//     public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
//         if(root == null){
//             return;
//         }

//         path.add(root.data);

//         if(root.right == null && root.left == null){
//             printPath(path);
//         }
        
//         printRoot2Leaf(root.left, path);
//         printRoot2Leaf(root.right, path);

//         path.remove(path.size()-1);
//     }

//     public static boolean isValidBST(Node root, Node min, Node max){
//         if(root == null){
//             return true;
//         }

//         if(min != null && root.data <= min.data){
//             return false;
//         }

//         if(max != null && root.data >= max.data){
//             return false;
//         }

//         return (isValidBST(root.left, min, root)) && 
//                (isValidBST(root.right, root, max));
//     }

//     public static void main(String args[]){
//         int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};

//         Node root = null;

//         for(int i=0; i<values.length; i++){
//             root = insert(root, values[i]);
//         }

//         inorder(root);
//         System.out.println();

//         // root = delete(root, 6);
//         // System.out.println();

//         // inorder(root);

//         // printInRange(root, 5, 12);

//         // printRoot2Leaf(root, new ArrayList<>());

//         // if(isValidBST(root, null, null)){
//         //     System.out.println("valid BST");
//         // }else{
//         //      System.out.println("Not valid BST");
//         // }
//     }
// }

// public class jav{
//     static class Node{
//         int data;
//         Node left;
//         Node right;
//         public Node(int data){
//             this.data = data;
//             this.left = this.right = null;
//         }
//     }

//     public static Node createMirror(Node root){
//         if(root == null){
//             return null;
//         }

//         Node leftMirror = createMirror(root.left);
//         Node rightMirror = createMirror(root.right);

//         root.right = leftMirror;
//         root.left = rightMirror;

//         return root;
//     }

//     public static void preorder(Node root){
//         if(root == null){
//             return;
//         }

//         System.out.print(root.data+" ");
//         preorder(root.left);
//         preorder(root.right);
//     }

//     public static void main(String args[]){
//         Node root = new Node(8);         //       8                                                      
//         root.left = new Node(5);         //      / \                                                      
//         root.right = new Node(10);       //     5   10                                                          
//         root.left.left = new Node(3);    //    / \    \                                                          
//         root.left.right = new Node(6);   //   3   6     11                                                              
//         root.right.right = new Node(11);                                                                      

//         root = createMirror(root);
//         preorder(root);
//     }
// }

// public class jav{
//     static class Node{
//         int data;
//         Node left;
//         Node right;
//         public Node(int data){
//             this.data = data;
//         }
//     }

//     public static Node createBST1(int arr[], int st, int end){
//         if(st > end){                             //         8                                                                                      
//             return null;                          //        / \                                                                                          
//         }                                         //       5   11                                                                          
//                                                   //      / \  / \                                                                  
//         int mid = st + (end - st)/2;              //     3  6 10 12                                                                                              
//         Node root = new Node(arr[mid]);                                                                                                                     

//         root.left = createBST(arr, st, mid-1);
//         root.right = createBST(arr, mid+1, end);

//         return root;
//     }

//     public static void preorder(Node root){
//         if(root == null){
//             return;
//         }

//         System.out.print(root.data+" ");
//         preorder(root.left);
//         preorder(root.right);
//     }

//     public static void getInorder(Node root, ArrayList<Integer> inorder){
//         if(root == null){
//             return;
//         }

//         getInorder(root.left);
//         inorder.add(root.data);
//         getInorder(root.right);
//     }

//     public static Node createBST(ArrayList<Integer> inorder, int st, int end){
//         if(st > end){
//             return null;
//         }

//         int mid = st + (end - st)/2;
//         Node root = new Node(inorder.get(mid));

//         root.left = createBST(root.left, st, mid-1);
//         root.right = createBST(root.right, mid+1, end);
        
//         return root;
//     }

//     public static Node balanceBST(Node root){             //     8                                                                                                                                        
//         ArrayList<Integer> inorder = new ArrayList<>();   //    / \                                                                                                                                                
//         getInorder(root, inorder);                        //   5   11                                                                                                                            
//                                                           //  / \  / \                                                                                            
//         root = createBST(inorder, 0, inorder.size()-1);   // 3  6 10 12                                                                                                                                                
//         return root;                                                                                                                                                    
//     }                                                                                                                                                   

//     public static void main(String args[]){
//         // int arr[] = {3, 5, 6, 8, 10, 11, 12};

//         // Node root = createBST(arr, 0, arr.length-1);
//         // preorder(root);

//         Node root = new Node(8);                //         8                                                                                                                   
//         root.left = new Node(6);                //        / \                                                                                                                   
//         root.left.left = new Node(5);           //       6   10                                                                                                                       
//         root.left.left.left = new Node(3);      //      /      \                                                                                                                                                                                        
//         root.right = new Node(10);              //     5        11                                                                                                                    
//         root.right.right = new Node(11);        //    /           \                                                                
//         root.right.right.right = new Node(12);  //   3             12                        

//         root = balanceBST(root);
//         preorder(root);
//     }
// }

// public class jav{
//     static class Node{
//         int data;
//         Node left;
//         Node right;
//         public Node(int data){
//             this.data = data;
//             left = right = null;
//         }
//     }

//     static class Info{
//         boolean isBST;
//         int size;
//         int min;
//         int max;
//         public Info(boolean isBST, int size, int min, int max){
//             this.isBST = isBST;
//             this.size = size;
//             this.min = min;
//             this.max = max;
//         }
//     }

//     public static int maxBST = 0;

//     public static Info largestBST(Node root){
//         if(root == null){
//             return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
//         }

//         Info leftInfo = largestBST(root.left);
//         Info rightInfo = largestBST(root.right);

//         int size = leftInfo.size + rightInfo.size + 1;
//         int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
//         int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

//         if(root.data <= leftInfo.max || root.data >= rightInfo.min){
//             return new Info(false, size, min, max);
//         }

//         if(leftInfo.isBST && rightInfo.isBST){
//             maxBST = Math.max(maxBST, size);
//             return new Info(true, size, min, max);
//         }
//         return new Info(false, size, min, max);
//     }

//     public static void main(String args[]){
//         Node root = new Node(50);       //          50                     60                         
//         root.left = new Node(30);       //        /    \     largestBST   /  \                               
//         root.right = new Node(60);      //      30      60       -->     45   70                                   
//         root.left.left = new Node(5);   //     /  \    /  \                   / \                                   
//         root.left.right = new Node(20); //    5   20  45   70               65  80                                    
//         root.right.left = new Node(45); //                 / \                                           
//         root.right.right = new Node(70);//               65  80                                               
//         root.right.right.left = new Node(65);                                                   
//         root.right.right.right = new Node(80);

//         Info info = largestBST(root);
//         System.out.print(maxBST);
//     }
// }

// public class jav{
//     static class Node{
//         int data;
//         Node left;
//         Node right;
//         public Node(int data){
//             this.data = data;

//         }
//     }

//     public static int printRange(Node root, int st, int end){
//         if(root == null){
//             return 0;
//         }
//         int sum = 0;
        
//         if(root.data >= st && root.data <= end){
//             return printRange(root.left, st, end)
//             + root.data
//             + printRange(root.right, st, end);
//         }
//         else if(root.data < st){
//             return printRange(root.right, st, end);
//         }else{
//             return printRange(root.left, st, end);
//         }
//     }

//     public static void main(String args[]){
//         Node root = new Node(8);         //      8                                        
//         root.left = new Node(5);         //     / \                                        
//         root.left.left = new Node(3);    //    5   11                                            
//         root.left.right = new Node(6);   //   / \    \                                            
//         root.right = new Node(11);       //  3   6    20                                        
//         root.right.right = new Node(20);     

//         System.out.print(printRange(root, 6, 10));                                           
//     }
// }

// public class jav{
//     static class Node{
//         int data;
//         Node left;
//         Node right;
//         public Node(int data){
//             this.data = data;
//         }
//     }

//     public static Node closestValue(Node root, Node closest, int value){
//         if(root == null){
//             return closest;
//         }

//         if(Math.abs(root.data - value) < Math.abs(closest.data - value)){
//             closest = root;
//         }

//         if(root.data > value){
//             return closestValue(root.left, closest, value);
//         }
//         else if(root.data < value){
//             return closestValue(root.right, closest, value);
//         }else{
//             return root;
//         }
//     }

//     public static void main(String args[]){
//         Node root = new Node(8);         //      8                                        
//         root.left = new Node(5);         //     / \                                        
//         root.left.left = new Node(3);    //    5   11                                            
//         root.left.right = new Node(6);   //   / \    \                                            
//         root.right = new Node(11);       //  3   6    20                                        
//         root.right.right = new Node(20);  

//         System.out.print(closestValue(root, root, 16).data);
//     }
// }

// public class jav{
//     static class Student implements Comparable<Student> {
//         String name;
//         int rank;
//         public Student(String name, int rank){
//             this.name = name;
//             this.rank = rank;
//         }

//         @Override
//         public int compareTo(Student s2){
//             return this.rank - s2.rank;
//         }
//     }
//     public static void main(String args[]){
//         PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());

//         pq.add(new Student("A", 4));
//         pq.add(new Student("B", 3));
//         pq.add(new Student("C", 5));
//         pq.add(new Student("D", 1));

//         while(!pq.isEmpty()){
//             System.out.println(pq.peek().name +" -> "+ pq.peek().rank);
//             pq.remove();
//         }

//     }
// }

// public class jav{
//     static class Heap{
//         ArrayList<Integer> arr = new ArrayList<>();

//         public void add (int val){
//             arr.add(val);
//             int x = arr.size()-1;

//             while(x > 0){
//                 int par = (x - 1)/2;
//                 if(arr.get(x) < arr.get(par)){
//                     int temp = arr.get(x);
//                     arr.set(x, arr.get(par));
//                     arr.set(par, temp);

//                     x = par;
//                 }else break;
//             }     
//         } 

//         public int peek(){
//             return arr.get(0);
//         }

//         private void heapfy(int i){
//             int left = 2*i + 1;
//             int right = 2*i + 2;
//             int minIdx = i;

//             if(left < arr.size() && arr.get(minIdx) > arr.get(left)){
//                 minIdx = left;
//             }

//             if(right < arr.size() && arr.get(minIdx) > arr.get(right)){
//                 minIdx = right;
//             }

//             if(minIdx != i){
//                 int temp = arr.get(i);
//                 arr.set(i, arr.get(minIdx));
//                 arr.set(minIdx, temp);

//                 heapfy(minIdx);
//             }
//         }

//         public int remove(){
//             int data = arr.get(0);

//             int temp = arr.get(0);
//             arr.set(0, arr.get(arr.size() - 1));
//             arr.set(arr.size() - 1, temp);

//             arr.remove(arr.size() - 1);

//             heapfy(0);
//             return data;
//         }

//         public boolean isEmpty(){
//             return arr.size() == 0;
//         }
        
//     }
//     public static void main(String args[]){
//         Heap h = new Heap();
//         h.add(3);
//         h.add(4);
//         h.add(1);
//         h.add(5);

//         while(!h.isEmpty()){
//             System.out.println(h.remove());
//         }
//     }
// }

// public class jav{
//     static class Point implements Comparable<Point>{
//         int x;
//         int y;
//         int distsq;
//         int index;
//         public Point(int x, int y, int distsq, int index){
//             this.x = x;
//             this.y = y;
//             this.distsq = distsq;
//             this.index = index;
//         }

//         @Override
//         public int compareTo(Point p2){
//             return this.distsq - p2.distsq;
//         }
//     }
//     public static void main(String args[]){
//         int pts[][] = {{3, 3}, {5, -1}, {-2, 4}};
//         int k = 2;

//         PriorityQueue<Point> pq = new PriorityQueue<>();

//         for(int i=0; i<pts.length; i++){
//             int distsq = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
//             pq.add(new Point(pts[i][0], pts[i][1], distsq, i));
//         }

//         for(int i=0; i<k; i++){
//             System.out.println("C"+ pq.remove().index);
//         }
//     }
// }

// public class jav{
//     public static void main(String args[]){
//         int ropes[] = {2, 3, 3, 4, 6};

//         PriorityQueue<Integer> pq = new PriorityQueue<>();

//         for(int i=0; i<ropes.length; i++){
//             pq.add(ropes[i]);
//         }

//         int cost = 0;
//         while(pq.size() > 1){
//             int min1 = pq.remove();
//             int min2 = pq.remove();

//             cost += min1 + min2;
//             pq.add(min1 + min2);
//         }

//         System.out.print("cost of connecting the  ropes is -> "+ cost);
//     }
// }

// public class jav{
//     static class Row implements Comparable<Row>{
//         int count;
//         int idx;
//         public Row(int count, int idx){
//             this.count = count;
//             this.idx = idx;
//         }

//         @Override
//         public int compareTo(Row r2){
//             if(this.count == r2.count){
//                 return this.idx - r2.idx;
//             }else{
//                 return this.count - r2.count;
//             }
//         }
//     }
//     public static void main(String args[]){
//         int [][] army = {
//             {1, 0, 0, 0},
//             {1, 1, 1, 1},
//             {1, 0, 0, 0},
//             {1, 0, 0, 0}
//         };

//         int k = 2;

//         PriorityQueue<Row> pq = new PriorityQueue<>();

//         for(int i=0; i<army.length; i++){
//             int count = 0;
//             for(int j=0; j<army[0].length; j++){
//                 count += army[i][j] == 1 ? 1 : 0;
//             }
//             pq.add(new Row(count, i));
//         }

//         for(int i=0; i<k; i++){
//             System.out.println("R"+pq.remove().idx);
//         }
//     }
// }

// public class jav{
//     public static void main(String args[]){
//         int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
//         int k = 3;

//         PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> arr[b] - arr[a]);

//         for(int i=0; i<arr.length; i++){
//             while(!pq.isEmpty() && pq.peek() <= i - k){
//                 pq.remove();
//             }

//             pq.add(i);

//             if(i >= k - 1){
//                 System.out.print(arr[pq.peek()] + " ");
//             }
//         }
//     }
// }

// public class jav{
//     public static void main(String args[]){
//         int nums[] = {10, 20, 11, 70, 50, 40, 100, 5};
//         int k = 3;

//         PriorityQueue<Integer> pq = new PriorityQueue<>();

//         for(int num : nums){
//             pq.add(num);

//             if(pq.size() > k){
//                 pq.poll();
//             }

//             if(pq.size() < k){
//                 System.out.print("- ");
//             }else{
//                 System.out.print(pq.peek() +" ");
//             }
//         }
//     }
// }

// public class jav{
//     public static void main(String args[]){
//         int[] arr = {2, 7};
//         int N = 10;

//         Queue<Integer> queue = new LinkedList<>();
//         boolean filled[] = new boolean[N + 1];

//         for(int num : arr){
//             filled[num] = true;
//             queue.add(num);
//         }

//         int time = -1;

//         while(!queue.isEmpyt()){
//             int size = queue.size();
//             time++;

//             for(int i=0; i<size; i++){
//                 int curr = queue.poll();
//                 //left
//                 if(curr - 1 >= 1 && !filled(curr - 1)){
//                     queue.add(curr -1);
//                     filled[curr - 1] = true;
//                 }
//                 //right
//                 if(curr + 1 <= N && !filled(curr + 1)){
//                     queue.add(curr + 1);
//                     filled[curr + 1] = true;
//                 }
//             }
//         }
//         return time;
//     }
// }

// public class jav{
//     static class Node implements Comparable<Node>{
//         int row;
//         int col;
//         int cost;
//         public Node (int row, int col, int cost){
//             this.row = row;
//             this.col = col;
//             this.cost = cost;
//         }

//         @Override
//         public int compareTo(Node other){
//             return this.cost - other.cost;
//         }
//     }

//     public static int minPathCost(int grid[][]){
//         PriorityQueue<Node> pq = new PriorityQueue<>();

//         int n = grid.length;
//         int m = grid[0].length;
//         int[][] dist = new int[n][m];

//         for (int i = 0; i < n; i++) {
//             Arrays.fill(dist[i], Integer.MAX_VALUE);
//         }

//         dist[0][0] = grid[0][0];
//         pq.add(new Node(0, 0, grid[0][0]));

//         int dr[] = {1, -1, 0, 0};
//         int dc[] = {0, 0, 1, -1};

//         while(!pq.isEmpty()){
//             Node curr = pq.poll();
//             int r = curr.row;
//             int c = curr.col;
//             int cost = curr.cost;

//             if(r == n - 1 && c == m - 1) {
//                 return cost;
//             }

//             for(int i=0; i<4; i++){
//                int nr = r + dr[i];
//                int nc = c + dc[i];

//                if((nr >= 0) && (nc >= 0) && (nr < n) && (nc < m)){
//                     int newCost = cost + grid[nr][nc];

//                     if(newCost < dist[nr][nc]){
//                         dist[nr][nc] = newCost;
//                         pq.add(new Node(nr, nc, newCost));
//                     }
//                } 
//             }
//         }
//         return -1;
//     }

//     public static void main(String args[]){
//         int[][] grid = {
//             {31, 100, 65, 12, 18},
//             {10, 13, 47, 157, 6},
//             {100, 113, 174, 11, 33},
//             {88, 124, 41, 20, 140},
//             {99, 32, 111, 41, 20}
//         };

//         System.out.println(minPathCost(grid));
//     }
// }

// public class jav{
//     public static void main(String args[]){
//         HashMap<String, Integer> hm = new HashMap<>();

//         hm.put("india", 100);
//         hm.put("china", 150);
//         hm.put("nepal", 10);
//         hm.put("corona", 20);

//         // System.out.println(hm);
//         // System.out.println(hm.keySet());

//         Set<String> keys = hm.keySet();
        
//         for(String key : keys){
//             System.out.println(hm.get(key));
//         }
//     }
// }
//                     /\                                              /\
                      //\\      |-----------------------------|       //\\  
                     //\/\\ --> |IMPLIMENTATION OF THE HASHMAP|  <-- //\/\\
                    //\/\/\\    |-----------------------------|     //\/\/\\                                                            
// public class jav{                  
//     static class HashMap<K, V>{                             
//         private class Node{
//             K key;
//             V value;

//             public Node(K key, V value){
//                 this.key = key;
//                 this.value = value;
//             }
//         }
//         private int n; //nodes
//         private int N; //size
//         private LinkedList<Node> buckets[];

//         @SuppressWarnings("unchecked")
//         public HashMap(){
//             this.N = 4;
//             this.buckets = new LinkedList[4];
//             for(int i=0; i<4; i++){
//                 this.buckets[i] = new LinkedList<>();
//             }
//         }
        
//         private int hashFunction(K key){
//             int hc = key.hashCode();
//             return Math.abs(hc) % N;
//         }

//         private int SearchInLL(K key, int bi){
//             LinkedList<Node> ll = buckets[bi];

//             for(int i=0; i<ll.size(); i++){
//                 Node node = ll.get(i);
//                 if(node.key.equals(key)){
//                     return i;
//                 }
//             }
//             return -1;
//         }

//         @SuppressWarnings("unchecked")
//         private void rehash(){
//             LinkedList<Node> oldBuck[] = buckets;
//             buckets = new LinkedList[2*N];
//             N = 2*N;
//             for(int i=0; i<buckets.length; i++){
//                 buckets[i] = new LinkedList<>();
//             }

//             //nodes -> add in buckets
//             for(int i=0; i<oldBuck.length; i++){
//                 LinkedList<Node> ll = oldBuck[i];
//                 for(Node node : ll){
//                     put(node.key, node.value);
//                 }
//             }
//         }

//         public void put(K key, V value){ // o(lambda) -> o(1)
//             int bi = hashFunction(key);  // buckets index
//             int di = SearchInLL(key, bi);// data index 

//             if(di != -1){
//                 Node node = buckets[bi].get(di);
//                 node.value = value;
//             }else{
//                 buckets[bi].add(new Node(key, value));
//                 n++;
//             }
//             double lambda = (double) n/N;
//             if(lambda > 2.0){
//                 rehash();
//             }
//         }

//         public boolean containsKey(K key){
//             int bi = hashFunction(key);
//             int di = SearchInLL(key, bi);

//             if(di != -1){
//                 return true;
//             }else{
//                 return false;
//             }
//         }

//         public V get(K key){
//             int bi = hashFunction(key);
//             int di = SearchInLL(key, bi);

//             if(di != -1){
//                 Node node = buckets[bi].get(di);
//                 return node.value;
//             }else{
//                 return null;
//             }
//         }

//         public V remove(K key){
//             int bi = hashFunction(key);
//             int di = SearchInLL(key, bi);

//             if(di != -1){
//                 Node node = buckets[bi].remove(di);
//                 n--;
//                 return node.value;
//             }else{
//                 return null;
//             }
//         }

//         public ArrayList<K> keySet(){
//             ArrayList<K> keys = new ArrayList<>();

//             for(int i=0; i<buckets.length; i++){
//                 LinkedList<Node> ll = buckets[i];
//                 for(Node node : ll){
//                     keys.add(node.key);
//                 }
//             }
//            return keys; 
//         }

//         public boolean isEmpty(){
//             return n==0;
//         }
//     }
//     public static void main(String args[]){
//         HashMap<String, Integer> hm = new HashMap<>();
//         hm.put("India", 550);
//         hm.put("Nepal", 250);
//         hm.put("China", 450);

//         ArrayList<String> keys = hm.keySet();

//         for(String key : keys){
//             System.out.println(key);
//         }
//         System.out.println(hm.remove("China"));
//     }
// }

// public class jav{
//     public static void main(String args[]){
//         HashSet<String> cities = new HashSet<>();
//         cities.add("delhi");
//         cities.add("Bnagkore");
//         cities.add("noida");
//         cities.add("mumbai");

//         // Iterator it = cities.iterator(); //iterator
//         // while(it.hasNext()){
//         //     System.out.println(it.next());
//         // }

//         for(String str : cities){
//             System.out.println(str);
//         }
//     }
// }

// public class jav{
//     public static void main(String args[]){
//         int arr1[] = {7, 3, 9};
//         int arr2[] = {6, 3, 9, 2, 9, 4};

//         Set<Integer> set = new HashSet<>();

//         for(int num : arr1){
//             set.add(num);
//         }

//         for(int num : arr2){
//             set.add(num);
//         }

//         int countUnion = set.size();

//         Set<Integer> set1 = new HashSet<>();

//         for(int num : arr1){
//             set1.add(num);
//         }

//         int countIntersection = 0;
//         for(int num : arr2){
//             if(set1.contains(num)){
//                 countIntersection++;
//                 set1.remove(num);
//             }
//         }
//         System.out.println("Union -> " + countUnion);
//         System.out.println("Intersection -> " + countIntersection);
//     }
// }

// public class jav{
//     public static void main(String args[]){
//         HashMap<String, String> tickets = new HashMap<>();

//         tickets.put("Chennai", "Bengaluru");
//         tickets.put("Mumbai", "Delhi");
//         tickets.put("Goa", "Chennai");
//         tickets.put("Delhi", "Goa");

//         HashSet<String> destination = new HashSet<>();

//         for(String dest : tickets.values()){
//             destination.add(dest);
//         }

//         String start = "";

//         for(String city : tickets.keySet()){
//             if(!destination.contains(city)){
//                 start = city;
//                 break;
//             }
//         }
//         System.out.print(start);
//         for(int i=0; i<tickets.size(); i++){
//             if(tickets.containsKey(start)){
//                 System.out.print(" -> "+tickets.get(start));
//                 start = tickets.get(start);
//             }
//         }
//     }
// }

// public class jav{
//     public static void main(String args[]){
//         int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};

//         HashMap<Integer, Integer> map = new HashMap<>();
//         int sum = 0;
//         int maxLen = 0;

//         for(int i=0; i<arr.length; i++){
//             sum += arr[i];

//             if(sum == 0){
//                 maxLen = i + 1;
//             }

//             if(map.containsKey(sum)){
//                 int len = i - map.get(sum);
//                 maxLen = Math.max(len, maxLen);
//             }else{
//                 map.put(arr[i], i);
//             }
//         }
//         System.out.println("Largest Subarray Length -> " + maxLen);
//     }
// }

// public class jav{
//     public static void main(String args[]){
//         int arr[] = {10, 2, -2, -20, 10};
//         int k = -10;

//         HashMap<Integer, Integer> map = new HashMap<>();
//         map.put(0, 1);

//         int sum = 0;
//         int ans = 0;

//         for(int i=0; i<arr.length; i++){
//             sum += arr[i];
//             if(map.containsKey((sum - k))){
//                 ans += map.get(sum - k);
//             }
//             map.put(sum, map.getOrDefault(sum, 0) + 1);
//         }
//         System.out.print("Subarray --> " + ans);
//     }
// }

// public class jav{
//     public static class Node{
//         Node children[] = new Node[26];
//         boolean eow = false;

//         public Node(){
//             for(int i=0; i<26; i++){
//                 children[i] = null;
//             }
//         }
//     }

//     public static Node root = new Node();

//     public static void insert(String word){
//         Node curr = root;

//         for(int level = 0; level<word.length(); level++){
//             int idx = word.charAt(level) - 'a';
//             if(curr.children[idx] == null){
//                 curr.children[idx] = new Node();
//             }
//             curr = curr.children[idx];
//         }
//         curr.eow = true;
//     }

//     public static boolean search(String word){
//         Node curr = root;

//         for(char c : word.toCharArray()){
//             int idx = c - 'a';

//             if(curr.children[idx] == null){
//                 return false;
//             }
//             curr = curr.children[idx];
//         }
//         return curr.eow;
//     }

//     public static void main(String args[]){                         // (root)                                                                                                                                                                             
//         String words[] = {"the", "a", "there", "their", "any"};     //  ├── t                                                                                                                                                                                                 
//                                                                     //  │    └── h                                                                                                                                   
//         for(int i = 0; i < words.length; i++) {                     //  │         └── e   (the)                                                                                                                                                                                 
//             insert(words[i]);                                       //  │              |                                                                                                                                                                 
//         }                                                           //  │              ├── r → e  (there)                                                                                                                                            
//                                                                     //  │              └── i → r  (their)                                                                                
//         System.out.println(search("the"));                          //  ├── a   (a)                                                                                                                                                                             
//         System.out.println(search("any"));                          //  │    └── n                                                                                                                                                                             
//         System.out.println(search("anyboy"));                       //  │         └── y  (any)                                                                                                                                                                                 
//     }                                                                                                                                                                                                 
// }

// public class jav{

//     static class Node{
//         Node children[] = new Node[26];
//         boolean eow = false;

//         public Node(){
//             for(int i=0; i<26; i++){
//                 children[i] = null;
//             }
//         }
//     }

//     public static Node root = new Node();

//     public static void insert(String word){
//         Node curr = root;

//         for(int i=0; i<word.length(); i++){
//             int idx = word.charAt(i) - 'a';

//             if(curr.children[idx] == null){
//                 curr.children[idx] = new Node();
//             }
//             curr = curr.children[idx];
//         }
//         curr.eow = true;
//     }

//     public static boolean search(String key){
//         Node curr = root;
//         for(int i=0; i<key.length(); i++){
//             int idx = key.charAt(i) - 'a';
//             if(curr.children[idx] == null){
//                 return false;
//             }
//             curr = curr.children[idx];
//         }
//         return curr.eow;
//     }

//     public static boolean wordBreak(String key){
//         if(key.length() == 0) return true;

//         for(int i=1; i<=key.length(); i++){
//             if(search(key.substring(0, i)) && wordBreak(key.substring(i))){
//                 return true;
//             }
//         }
//         return false;
//     }

//     public static void main(String args[]){                               // (root)                                                                                                                                                                                                       
//         String arr[] = {"i", "like", "sam", "samsung", "mobile", "ice"};  //  ├── i                                                                                                                                                                                                                                   
//                                                                           //  │    ├── (i)                                                                                                                                                           
//         for (int i = 0; i < arr.length; i++) {                            //  │    └── c → e     (ice)                                                                                                                                                                                                           
//             insert(arr[i]);                                               //  │                                                                                                                                                                                       
//         }                                                                 //  ├── l → i → k → e  (like)                                                                                                                                                                       
//                                                                           //  │                                                                                                                                                           
//         String key = "ilikesamsung";                                      //  ├── s → a → m      (sam)                                                                                                                                                                                               
//                                                                           //  │           └── s → u → n → g  (samsung)                                                                                                                                                           
//         System.out.println(wordBreak(key));                               //  │                                                                                                                                                                                                       
//     }                                                                     //  └── m → o → b → i → l → e      (mobile)                                                                                                                                                                   
// }

// public class jav{

//     static class Node{
//         Node children[] = new Node[26];
//         boolean eow = false;
//         int freq;

//         public Node(){
//             for(int i=0; i<26; i++){
//                 children[i] = null;
//             }
//             freq = 1;
//         }
//     }

//     public static Node root = new Node();

//     public static void insert(String word){
//         Node curr = root;

//         for(int i=0; i<word.length(); i++){
//             int idx = word.charAt(i) - 'a';

//             if(curr.children[idx] == null){
//                 curr.children[idx] = new Node();
//             }else{
//                 curr.children[idx].freq++;
//             }
//             curr = curr.children[idx];
//         }
//         curr.eow = true;
//     }

//     public static void findPrefix(Node root, String ans){
//         if(root == null) return;

//         if(root.freq == 1){
//             System.out.println(ans);
//             return;
//         }

//         for(int i=0; i<root.children.length; i++){

//             if(root.children[i] != null){
//                 findPrefix(root.children[i], ans+(char)(i+'a'));
//             }
//         }
//     }

//     public static void main(String args[]){               // (root)                                                                                                                                                                           
//                                                           //  ├── z → e → b → r → a        (zebra)                                                                                                                                 
//         String arr[] = {"zebra", "dog", "duck", "dove"};  //  │                                                                                                                                                                                       
//                                                           //  └── d                                                                                                                               
//         for (int i = 0; i < arr.length; i++) {            //       ├── o                                                                                                                                                                               
//             insert(arr[i]);                               //       │    ├── g              (dog)                                                                                                                                                           
//         }                                                 //       │    └── v → e          (dove)                                                                                                                                           
//         root.freq = -1;                                   //       │                                                                                                                                                       
//         findPrefix(root, "");                             //       └── u → c → k           (duck)                                                                                                                                                               
//     }                                                                                                                                                                                            
// }

// public class jav{
//     static class Node{
//         Node children[] = new Node[26];
//         boolean eow = false;

//         public Node(){
//             for(int i=0; i<children.length; i++){
//                 children[i] = null;
//             }
//         }
//     }

//     public static Node root = new Node();

//     public static void insert(String word){
//         Node curr = root;

//         for(int i=0; i<word.length(); i++){
//             int idx = word.charAt(i) - 'a';

//             if(curr.children[idx] == null){
//                 curr.children[idx] = new Node();
//             }
//             curr = curr.children[idx];
//         }
//         curr.eow = true;
//     }

//     public static boolean startsWith(String prefix){
//         Node curr = root;

//         for(int i=0; i<prefix.length(); i++){
//             int idx = prefix.charAt(i) - 'a';

//             if(curr.children[idx] == null){
//                 return false;
//             }
//             curr = curr.children[idx];
//         }
//         return true;
//     }

//     public static int countNodes(Node root){
//         if(root == null){
//             return 0;
//         }

//         int count = 0;
//         for(int i=0; i<root.children.length; i++){
//             if(root.children[i] != null){
//                 count += countNodes(root.children[i]);
//             }
//         }
//         return count + 1;
//     }

//     public static String ans = "";

//     public static void longestWord(Node root, StringBuilder temp){
//         if(root == null){
//             return;
//         }

//         for(int i=0; i<root.children.length; i++){
//             if(root.children[i] != null && root.children[i].eow == true){
//                 char ch = (char)(i + 'a');
//                 temp.append(ch);

//                 if(temp.length() > ans.length()){
//                     ans = temp.toString();
//                 }
//                 longestWord(root.children[i], temp);
//                 temp.deleteCharAt(temp.length()-1);
//             }
//         }
//     }

//     public static void main(String args[]){                            // (root)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
//         // String words[] = {"apple", "app", "mango", "man", "woman"}; //  ├── a                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
//                                                                        //  │    └── p                                                                                                                                                                                                                                                                                            
//         // String prefix1 = "app";                                     //  │         └── p  (app)                                                                                                                                                                                                                                                                                                                                                                                            
//         // String prefix2 = "moon";                                    //  │              └── l                                                                                                                                                                                                                                                                                                                                                                                            
//                                                                        //  │                   └── e  (apple)                                                                                                                                                                                                                                                                                                                                                                                
//         // for (int i = 0; i < words.length; i++) {                    //  │                                                                                                                                                                                                                                                                                                                                                                                                            
//         //     insert(words[i]);                                       //  ├── m                                                                                                                                                                                                                                                                                                                                                                                        
//         // }                                                           //  │    └── a                                                                                                                                                                                                                                                                                                                                                                    
//         // System.out.println(startsWith(prefix1));                    //  │         └── n  (man)                                                                                                                                                                                                                                                                                                                                                                                                            
//                                                                        //  │              └── g                                                                                                                                                                                                                                                                                                                                                                                
//         // String str = "apple";                                       //  │                   └── o  (mango)                                                                                                                                                                                                                                                                                                                                                                                        
//                                                                        //  │                                                                                                                                                                                                                                                                                                                                                                                
//         // for(int i = 0; i < str.length(); i++) {                     //  └── w                                                                                                                                                                                                                                                                                                                                                                                
//         //     String suffix = str.substring(i);                       //       └── o                                                                                                                                                                                                                                                                                                                                                                            
//         //     insert(suffix);                                         //            └── m                                                                                                                                     
//         // }                                                           //                 └── a                                                                                                                                                                                     
//                                                                        //                      └── n  (woman)                                                                                                                                                                         
//         // System.out.println(countNodes(root));                                                                                                                                                                                                                                                 
                                                                                                                                                                                                                                                    
//         String words[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};

//         for(int i=0; i<words.length; i++) {
//             insert(words[i]);
//         }

//         longestWord(root, new StringBuilder(""));
//         System.out.println(ans);
//     }
// }

// public class jav{
//     public static void main(String args[]){
//         int n = 4;
//         int size = 2 * n-1;
//         for(int i=0; i<size; i++){
//             for(int j=0; j<size; j++){
//                 int min = Math.min(Math.min(i, j), Math.min((size - 1 - i), size - 1 -j));
//                 int value = n - min;
//                 System.out.print(value+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class jav{
//     static class Edge{// Adjancency List \\
//         int src;
//         int dest;
//         int wt;

//         public Edge(int s, int d, int w){
//             this.src = s;
//             this.dest = d;
//             this.wt = w;
//         }
//     }

//     public static void main(String args[]){
//         int V = 5;
//         ArrayList<Edge>[] graph = new ArrayList[V];

//         for(int i=0; i<graph.length; i++){
//             graph[i] = new ArrayList<>();
//         }

//         // 0-vertex
//         graph[0].add(new Edge(0, 1, 5));       //       (5)                        
//         // 1-vertex                            //   0 ------- 1                                            
//         graph[1].add(new Edge(1, 0, 5));       //            / \                        
//         graph[1].add(new Edge(1, 2, 1));       //        (1)/   \(3)                        
//         graph[1].add(new Edge(1, 2, 3));       //          /     \                        
//         // 2-vertex                            //         2 ----- 3                                
//         graph[2].add(new Edge(2, 1, 1));       //          \ (1)                        
//         graph[2].add(new Edge(2, 3, 1));       //           \                        
//         graph[2].add(new Edge(2, 4, 4));       //           (2)                        
//         // 3-vertex                            //            \                                
//         graph[3].add(new Edge(3, 1, 3));       //             4                        
//         graph[3].add(new Edge(3, 2, 1));                           
//         // 4-vertex                                                             
//         graph[4].add(new Edge(4, 2, 2));           

//         for(int i=0; i<graph[2].size(); i++){
//             Edge e = graph[2].get(i); // src, dest, wt
//             System.out.println(e.dest);
//         }             
//     }
// }

// public class jav{

//     static class Edge{
//         int src;
//         int dest;
//         int wt;

//         public Edge(int s, int d, int w){
//             this.src = s;
//             this.dest = d;
//             this.wt = w;
//         }
//     }

//     static void createGraph(ArrayList<Edge>[] graph) {

//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         // 0 -> vertex <-
//         graph[0].add(new Edge(0, 1, 1));   //      1 ---- 3                                                                           
//         graph[0].add(new Edge(0, 2, 1));   //     /       | \                                                                           
//         // 1 -> vertex <-                  //    0        |  5 ---- 6                                                       
//         graph[1].add(new Edge(1, 0, 1));   //     \       | /                                                                           
//         graph[1].add(new Edge(1, 3, 1));   //      2 ---- 4                                                                           
//         // 2 -> vertex <-
//         graph[2].add(new Edge(2, 0, 1));
//         graph[2].add(new Edge(2, 4, 1));
//         // 3 -> vertex <-
//         graph[3].add(new Edge(3, 1, 1));
//         graph[3].add(new Edge(3, 4, 1));
//         graph[3].add(new Edge(3, 5, 1));
//         // 4 -> vertex <-
//         graph[4].add(new Edge(4, 2, 1));
//         graph[4].add(new Edge(4, 3, 1));
//         graph[4].add(new Edge(4, 5, 1));
//         // 5 -> vertex <-
//         graph[5].add(new Edge(5, 3, 1));
//         graph[5].add(new Edge(5, 4, 1));
//         graph[5].add(new Edge(5, 6, 1));
//         // 6 -> vertex <-
//         graph[6].add(new Edge(6, 5, 1));
//     }

//     public static void bsf(ArrayList<Edge>[] graph){ // Group A (connected)    Group B (disconnected)                                                                                       
//         boolean vis[] = new boolean[graph.length];   //                                                                                                                    
//         for(int i=0; i<graph.length; i++){           //      0                     3                                                                                                                
//             if(!vis[i]){                             //     / \                   / \                                                                                                
//                 bfsUtil(graph, vis, i);              //    1---2                 5---4                                                                                                            
//             }                                                                                                                                                                      
//         }                                            // output -> 0 1 2 3 4 5                                       
//     }

//     public static void bfsUtil(ArrayList<Edge>[] graph, boolean vis[], int start){
//         Queue<Integer> q = new LinkedList<>();
//         q.add(start);

//         while(!q.isEmpty()){
//             int curr = q.remove();

//             if(!vis[curr]){
//                 System.out.println(curr+" ");
//                 vis[curr] = true;
//                 for(int i=0; i<graph[curr].size(); i++){
//                     Edge e = graph[curr].get(i);
//                     q.add(e.dest);
//                 }
//             }
//         }
//     }

//     public static void dfs(ArrayList<Edge>[] graph){ // Group A (connected)    Group B (disconnected)                                                                                                       
//         boolean vis[] = new boolean[graph.length];   //                                                                                                                                                 
//         for(int i=0; i<graph.length; i++){           //      0                     3                                                                                                            
//             if(!vis[i]){                             //     / \                   / \                                                                                           
//                 dfsUtil(graph, i, vis);              //    1---2                 5---4                                                                                                      
//             }                                                                                                                                                       
//         }                                            // output -> 0 1 2 3 4 5 (Depends on Order of edges in ArrayList)                                                                                  
//     }

//     public static void dfsUtil(ArrayList<Edge>[] graph, int curr, boolean vis[]){
//         vis[curr] = true;
//         System.out.print(curr +" ");

//         for(int i=0; i<graph[curr].size(); i++){
//             Edge e = graph[curr].get(i);

//             if(!vis[e.dest]){
//                 dfsUtil(graph, e.dest, vis);
//             }   
//         }
//     }

//     public static boolean hasPath(ArrayList<Edge>graph[], int src, int dest, boolean vis[]){
//         if(src == dest){
//             return true;
//         }

//         for(int i=0; i<graph[src].size(); i++){
//             Edge e = graph[src].get(i);

//             if(!vis[e.dest]){
//                 vis[e.dest] = true;
//                 if( hasPath(graph, e.dest, dest, vis)){
//                     return true;
//                 }
//             }

//         }
//         return false;
//     }

//     public static void main(String args[]){
//         int V = 7;
//         ArrayList<Edge> graph[] = new ArrayList[V];

//         createGraph(graph);

//         boolean vis[] = new boolean[V];
//         // dfs(graph, 0, vis);

//         System.out.println(hasPath(graph, 0, 1, vis));
//     }
// }

// public class jav{
//     static class Edge{
//         int src;
//         int dest;

//         public Edge(int s, int d){
//             this.src = s;
//             this.dest = d;
//         }
//     }

//     static void createGraph(ArrayList<Edge> graph[]){
//         for(int i=0; i<graph.length; i++){
//             graph[i] = new ArrayList<>();
//         }

//         graph[0].add(new Edge(0, 1));
//         graph[0].add(new Edge(0, 2));
//         graph[0].add(new Edge(0, 3));

//         graph[1].add(new Edge(1, 0));
//         graph[1].add(new Edge(1, 2));

//         graph[2].add(new Edge(2, 0));
//         graph[2].add(new Edge(2, 1));

//         graph[3].add(new Edge(3, 0));
//         graph[3].add(new Edge(3, 4));

        
//     }

//     public static void main(String args[]){

//     }
// }

// public class jav{ //Prim’s Algorithm

//     static class Edge implements Comparable<Edge>{
//         int dest;
//         int cost;

//         public Edge(int d, int c){
//             this.dest = d;
//             this.cost = c;
//         }

//         @Override
//         public int compareTo(Edge e2){
//             return this.cost - e2.cost;
//         }
//     }

//     public static int connectCities(int cities[][]){
//         PriorityQueue<Edge> pq = new PriorityQueue<>();
//         boolean vis[] = new boolean[cities.length];

//         pq.add(new Edge(0, 0));
//         int finalCost = 0;

//         while(!pq.isEmpty()){
//             Edge curr = pq.remove();

//             if(!vis[curr.dest]){
//                 vis[curr.dest] = true;
//                 finalCost += curr.cost;

//                 for(int i=0; i<cities[curr.dest].length; i++){
//                     if(cities[curr.dest][i] != 0){
//                         pq.add(new Edge(i, cities[curr.dest][i]));
//                     }
//                 }
//             }
//         }
//         return finalCost;
//     }

//     public static void main(String args[]){
//         int cities[][] = {
//                          {0, 1, 2, 3, 4},
//                          {1, 0, 5, 0, 7},
//                          {2, 5, 0, 6, 0},
//                          {3, 0, 6, 0, 0},
//                          {4, 7, 0, 0, 0}
//     };

//     System.out.println(connectCities(cities));
//     }
// }

// public class jav{

//     static int n = 7;
//     static int par[] = new int[n];
//     static int rank[] = new int[n];

//     public static void init(){
//         for(int i=0; i<n; i++){
//             par[i] = i;
//         }
//     }

//     public static int find(int x){
//         if(x == par[x]){
//             return x;
//         }
//         return par[x] = find(par[x]);
//     }

//     public static void union(int a, int b){
//         int parA = find(a);
//         int parB = find(b);

//         if(rank[parA] == rank[parB]){
//             par[parB] = parA;
//             rank[parA]++;
//         }
//         else if(rank[parA] < rank[parB]){
//             par[parA] = parB;
//         }else{
//             par[parB] = parA;
//         }
//     }

//     public static void main(String args[]){
//         init();
//         union(1, 3);
//         System.out.println(find(3));
//         union(2, 4);
//         union(3, 6);
//         union(1, 4);
//         System.out.println(find(3));
//         System.out.println(find(4));
//         union(1, 5);
//     }
// }

// public class jav{

//     static class Edge implements Comparable<Edge>{
//         int dest;
//         int src;
//         int wt;

//         public Edge(int d, int s, int wt){
//             this.dest = d;
//             this.src = s;
//             this.wt = wt;
//         }

//         @Override
//         public int compareTo(Edge e2){
//             return this.wt - e2.wt;
//         }
//     }

//     static void createGraph(ArrayList<Edge> edges){
//         edges.add(new Edge(0, 1, 10));
//         edges.add(new Edge(0, 2, 15));
//         edges.add(new Edge(0, 3, 30));
//         edges.add(new Edge(1, 3, 40));
//         edges.add(new Edge(2, 3, 40)); 
//     }

//     static int n = 4;
//     static int par[] = new int[n];
//     static int rank[] = new int[n];

//     public static void init(){
//         for(int i=0; i<n; i++){
//             par[i] = i;
//         }
//     }

//     public static int find(int x){
//         if(par[x] == x){
//             return x;
//         }
//         return par[x] = find(par[x]);
//     }

//     public static void union(int a, int b){
//         int parA = find(a);
//         int parB = find(b);

//         if(rank[parA] == rank[parB]){
//             par[parB] = parA;
//             rank[parA]++;
//         }
//         else if(rank[parA] < rank[parB]){
//             par[parA] = parB;
//         }else{
//             par[parB] = parA;
//         }
//     }

//     public static void KruskalsMST(ArrayList<Edge> edges, int V){
//         init();
//         Collections.sort(edges);
//         int mstCost = 0;
//         int count = 0;

//         for(int i=0; count<V-1; i++){
//             Edge e = edges.get(i);
//             int parA = find(e.src);
//             int parB = find(e.dest);

//             if(parA != parB){
//                 union(e.src, e.dest);
//                 mstCost += e.wt;
//                 count++;
//             }
//         }
//         System.out.println(mstCost);
//     }

//     public static void main(String args[]){
//         int V = 4;
//         ArrayList<Edge> edges = new ArrayList<>();
//         createGraph(edges);
//         KruskalsMST(edges, V);
//     }
// }

public class jav{

    public static int[][] colorFill(int image[][], int sr, int sc, int color){
        int orignal = image[sr][sc];

        if(orignal == color) return image;

        int m = image.length;
        int n = image[0].length;

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{sr, sc});
        image[sr][sc] = color;

        int dir[][] = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        while(!q.isEmpty()){
            int[] curr = q.poll();

            for(int[] d : dir){
                int r = curr[0] + d[0];
                int c = curr[1] + d[1];

                if(r>=0 && c>=0 && r<m && c<n && image[r][c]==orignal){
                    image[r][c] = color;
                    q.add(new int[]{r,c});
                }
            }
        } 
        return image;
    }

    public static void main(String args[]){
        int[][] image = {
                        {1,1,1},
                        {1,1,0},
                        {1,0,1}
                        };
        int arr[][] = colorFill(image, 1, 1, 2);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}

# print("Nikhil","i am good")
name = "nikhil"
age = 23
price = 23.99
# print(type(age))
# print(type(name))
# print(type(price))
name = "nikhil"
name1 = 'Nikhil'
name2 = '''n'''
# print(name)
# print(name1)
# print(name2)
a = None
b = True
true = 23
# print(a)
# print(true)
a = 4
b = -3
# print(a%b)
c = -4
d = 3
# print(c%d)
# name = input("Enter your name : ")
# age = int(input("Enter the age : "))
# print(age)
# print("nice to mean you "+name)
# age = int(input("Enter your age : "))
# if(age<18):
    # print("You aren't eligible for voting")
# elif(age>=18):
    # print("you are eligible :)")
# else:
    # print("Enter valid age")
# ternary operator
# age = int(input("Enter your age : "))
eligible = "yes eligible" if age>=18 else "no eligible"
# print(eligible)

# food = input("Enter the food name : ")
# print("sweet") if food == "cake" or food == "jalebi" else print("not sweet")

# age = int(input("Enter the age : "))
vote = ("Yes","No") [age<18]
# print(vote)

# sal = float(input("Enter the salary : "))
# tax = sal*(0.1, 0.2) [sal>50000]
# sal*0.2 if sal>50000 else sal*0.1
# print(tax)
a = "a"
b = "b"
# print((a+(b)*2)*2)
# string and condition statement
str = "Nikhil"
# print(len(str))
str1 = "Singh"
full_name = str+str1
# print(full_name)
name = "Nikhil_singh"
# print(name[:3])
# print(name[:3])
# num = int(input("Enter the number  : "))
# if(num%2==0):
#     print(num," is even")
# else:
#     print(num," is odd")
# num1,num2,num3 = map(int,input("Enter the 3 number :").split())
# if(num1 > num2):
#     if(num1>num3):
#         print(num1," is the greatest")
#     else:
#         print(num3," is the greatest")
# else:
#     if(num2>num3):
#         print(num2," is the greatest")
#     else:
#         print(num3," is the greatest")
# num = int(input("Enter the number : "))
# if(num%7==0):
#     print("Number is divisble by 7")
# else:
#     print("Not")
# list and tuple
marks = [2,5,3,8,1,0]
# print(*marks)
# print(len(marks))
# print(marks.sort())
# print(marks)
# print(marks.reverse())
# print(marks)
# marks.sort(reverse = True)
# print(marks)
# marks.insert(1,45)
# print(marks)
tup = (1,2,3)
# print(tup[0:2])
# print(tup.index(3))
movies = []
# movie1 = input("Enter the 1 movie name : ")
# movie2 = input("Enter the 2 movie name : ")
# movie3 = input("Enter the 3 movie name : ")
# movies.append(input("Enter the 1 movie : "))
# movies.append(movie1)
# movies.append(movie2)
# movies.append(movie3)
# print(*movies)
# list1 = [1,2,3,1]
# copy_list1 = list1.copy()
# copy_list1.reverse()
# if(copy_list1 == list1):
#     print("It is palindrome :)")
# else:
#     print("Its not a palindrome")
# tup = ('C','D','A','A','B','B','A')
# print(tup.count('A'))
info = {
    "name" : "Nikhil",
    "age" : 25,
    "marks" : {
        "phy" : 69,
        "che" : 99,
        "maths" : 1
    }
}
# print(info["age"])
# info["name"] = "Nikhil"
# info["surname"] = "singh"
# print(info["marks"]["maths"])
# print(list(info.keys()))
# print(len(list(info.keys())))
# print(len(info))
# print(info.values())
# print(list(info.items()))
# print(list(info.items())[1])
# print(info.get("mark"))#if not exist value then return none
# print(info["marks"])
collection = {1,2,4,5,2,"nikhil",3}
# print(collection)
# print(len(collection))
# set1 = set()
# print(type(set1))
set1 = {2}
set1.add(1)
set1.add(76)
set1.add(24)
# print(set1)
# set1.remove(24)
# print(set1)
# set1.add((1,2,3))//can't add list because list is mutable but set is also mutable but not its elements are always immutable 
# print(set1)
# set1.clear()
# print(set1.pop())
# print(set1)
set2 = (1,56,2)
# print(set1.union(set2))
# print(set1.intersection(set2))
dic = {
    "Cat" : "is a small animal",
    "table" : ["a piece of furniture", "list of fact and figure"]
    }
print(dic)
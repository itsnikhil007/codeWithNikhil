import mysql.connector as mysql
from tabulate import tabulate
from termcolor import colored

def color(a):
    b=colored(a,"cyan")
    return b

print("\n\n\n|--------------------SESSION 2023 - 2024----------------------|")
print("\n|                   JINDAL VIDYA MANDIR                       |")
print("|                    WELCOME To MSQL_2                        |")
print("\n|------------------DESIGNED AND MAINTAINED BY:----------------|")
print("                      -->"+color("Nikhil Singh")+"<--                       ")

while True:
    k=0
    try:
        x=input("\nEnter Your MSQL Password : ")
        con=mysql.connect(host="localhost",password=x,user="root")
        if con.is_connected:
            break
        k=1
    except:
        if k!=1:
            print(colored("\nWRONG PASSWORD :(\n","red"))
            inpu=input("Do You Want To Try Again y/n : ").upper()
            if inpu!="Y":
                break

# --------------------------------Menu--------------------------------
def Menu():
    while True:
        print("\n+-------------------+")
        print("|1. CREATE DATABASE |")
        print("+-------------------+")        
        print("|2. SHOW DATABASES  |")
        print("+-------------------+")
        print("|3. CREATE TABLE    |")
        print("+-------------------+")        
        print("|4. SHOW TABLES     |")
        print("+-------------------+")
        print("|5. INSERT RECORD   |")
        print("+-------------------+")        
        print("|6. UPDATE RECORD   |")
        print("+-------------------+")
        print("|7. DELETE RECORD   |")
        print("+-------------------+")        
        print("|8. SEARCH RECORD   |")
        print("+-------------------+")
        print("|9. DISPLAY RECORD  |")
        print("+-------------------+")        
       
        ch=input(colored("\nEnter Your Choise {1-9} : ","light_blue"))
        if ch=="1":
            create_database()
        elif ch=="2":
            show_database()
        elif ch=="3":
            create_table()
        elif ch=="4":
            show_table()
        elif ch=="5":
            insert_record()
        elif ch=="6":
            update()
        elif ch=="7":
            delete()
        elif ch=="8":
            search_record()
        elif ch=="9":
            display_record()
        else:
            print(colored("Inavalid Choise","red"))
        c=input(colored("\nDo You Want To Continue y/n : ","light_blue")).upper()
        print()
        if c!="Y":
            print("+------------------------------+")
            print("| Thankyou For Using MSQL_2 :) |")
            print("+------------------------------+\n")
            break

# --------------------------create database---------------------------
def create_database():
    con=mysql.connect(host="localhost",password=x,user="root")
    if con.is_connected():
        print("\nMysql Successfully Connected:)\n")
    k=0
    cur=con.cursor()
    while True:
        ch=input("Do You Want To "+color("database_create")+" y/n : ",).upper()
        print()
        if ch!="Y":
            break
        try:
            name=input("Enter "+color("New Database")+" Name : ").upper()
            cur.execute('create database {}'.format(name))
            print("\nDatabase created :)\n")
            con.commit()
            k=1
        except:
            if k==1:
                print()
            else:
                print(colored("\nSorry, But The Database You Wrote Is Already Exist\n","red"))

# --------------------------Show database-----------------------------
def show_database():
    con=mysql.connect(host="localhost",password=x,user="root")
    if con.is_connected():
        print("\nMysql Successfully Connected:)\n")
        cur=con.cursor()
        cur.execute("show databases")
        data=cur.fetchall()
        print(tabulate(data,headers=[colored("___Database___","dark_grey"),],tablefmt='grid'))
        p=cur.rowcount
        print("\n-->Total No Of Database are",p)
        print()
        con.close()

# --------------------------create table------------------------------
def create_table():
    show_database()
    database=input("Enter "+color("Choosen Database")+" : ")
    con=mysql.connect(host="localhost",user="root",password=x,database=database)
    cur=con.cursor()
    cur.execute("show tables")
    p=cur.fetchall()
    if p == []:
        print(colored("NO TABLES :(","red"))
    else:
        print(colored("\n---------------------------------\nNot To Use Those Existing Tables\n---------------------------------",'red'))
        print(tabulate(p,headers=[colored("_Tables List_","dark_grey"),],tablefmt="grid"))
        print()
    while True:
        k=0
        try:
            table_name=input("\nEnter "+color("New Table")+" Name : ")
            print("\nOne By One Write Column Name")
            print(colored("E.g-->'Column_name','varchar'\n","green"))
            c2=input("Enter "+color("Column Name")+" With "+color("datatype")+" : ")
            cur.execute("create table "+table_name+"({})".format(c2))
            con.commit()
            k=1
            cur.execute("create table "+tablme+"({})".format(c1))
        except:
            if k!=1:
                print(colored("Syntax Error","red"))
                print(colored("\nBe More Careful Towards Datatype",'red'))
                print(colored("E.g-->'Column_name','varchar'\n","green"))
                ch=input(colored("Do You Like To Try Again y/n : ","light_blue")).upper()
                print()
                if ch!="Y":
                    break
            else:
                while True:
                    k=0
                    try:
                        c2=input("Enter "+color("Column Name")+" With "+color("Datatype")+" : ")
                        cur.execute("ALTER TABLE "+table_name+" ADD {}".format(c2))
                        print("\nTable created Succesfully :)\n")
                        con.commit()
                        cur.execute("desc "+table_name+"")
                        da=cur.fetchall()
                        print(tabulate(da,tablefmt='psql'))
                        k=1
                        cur.execute("create table "+tablme+"()".format())
                        ch=input(colored("Do You Want To Add More Column y/n : ","light_blue")).upper()
                        print()
                        if ch!="Y":
                            break
                    except:
                        if k!=1:
                            print(colored("Syntax Error","red"))
                            print(colored("Be More Careful Towards Datatype\n",'red'))
                            print(colored("E.g-->'Column_name','varchar'\n","green"))
                            ch=input(colored("Do You Like To Try Again y/n : ","light_blue")).upper()
                            print()
                            if ch!="Y":
                                break
                    ch=input(colored("Do You Want To Add More Column y/n : ","light_blue")).upper()
                    print()
                    if ch!="Y":
                        break
        ch=input(colored("Do You Want To Create More Table y/n : ","light_blue")).upper()
        print()
        if ch!="Y":
            break       

# --------------------------show table--------------------------------
def show_table():
    while True:
        show_database()
        database=input("Enter "+color("Choosen Database")+" : ")
        con=mysql.connect(host="localhost",user="root",password=x,database=database)
        cur=con.cursor()
        cur.execute("show tables")
        data=cur.fetchall()
        print(tabulate(data,headers=[colored("_Tables List_","dark_grey"),],tablefmt="grid"))
        if data == []:
            print(colored("NO TABLES :(","red"))
            choise=input("I Recomend You To Create Table : ").upper()
            if choise=="Y":
                create_table()
            else:
                break
        print()
        ch=input(colored("Do You Want To See More Tables y/n : ","light_blue")).upper()
        if ch!="Y":
            break

# --------------------------insert record-----------------------------
def insert_record():
    show_database()
    database=input("Enter "+color("Choosen Database")+" : ")
    print()
    con=mysql.connect(host="localhost",user="root",password=x,database=database)
    cur=con.cursor()
    cur.execute("show tables")
    data=cur.fetchall()
    if data!=[]:
        print(tabulate(data,headers=[colored("Tables_List","dark_grey"),],tablefmt="grid"))
        table_name=input("\nEnter "+color("Table Name")+" : ")
        while True:
            cur.execute("desc "+table_name+"")
            data=cur.fetchall()
            print(colored("\n__________________________DESC Form_________________________","grey"))
            print(tabulate(data,tablefmt='psql'))
            k=0
            try:
                print(colored("\nE.g-->'Varchar',Char,int,'Date'","green"))
                values=input("\nEnter "+color("Values")+" According To "+color("DESC Shown")+" : ")
                cur.execute("Insert into "+table_name+" values({})".format(values))
                con.commit()
                print("\nValue Inserted Succesfully :)\n")
                k=1
                ch=input(colored("Do You Want To Add More Column y/n : ","light_blue")).upper()
                if ch!="Y":
                    break
            except:
                if k!=1:
                    print(colored("\nSyntax Error","red"))
                    print(colored("E.g-->'Varchar',Char,'Date'","green"))
                    ch=input(colored("\nDo You Like To Try Again y/n : ","light_blue")).upper()
                    print()
                    if ch!="Y":
                        break
    else:
        print(colored("No Table :(\n","red"))
        Press=input(colored("I Recomend You To Make New Table y/n : ","light_blue")).upper()
        if Press == "Y":
            create_table()

# --------------------------update------------------------------------
def update():
    print("\n1.Update Table Record")
    print("2.Update Table Name")
    ch=input(colored("Enter Your Choise : ","light_blue"))
    if ch=="1":
        UPDATE_record()
    elif ch=="2":
        UPDATE_Table()
    else:
        print(colored("Inavalid Choise","red"))

def UPDATE_record():
    show_database()
    database=input("Enter "+color("Choosen Database")+" : ")
    con=mysql.connect (host='localhost', user='root', passwd=x, database=database) 
    cur=con.cursor()
    cur.execute("show tables")
    data=cur.fetchall()
    if data!=[]:
        print(tabulate(data,headers=[colored("Tables_List","dark_grey"),],tablefmt="grid"))
        table_name=input("\nEnter "+color("Table Name")+" : ")
        cur.execute("select*from "+table_name+"")
        while True:
            k=0
            try:
                d=cur.fetchall()
                if d!=[]:
                    print(colored("\n                   Value Form                  ","grey"))
                    print(tabulate(d,tablefmt='psql'))
                else:
                    print(colored("\nNo Record :(\n","red"))
                    P=input(colored("I Recomend You To Insert Record y/n : ","light_blue")).upper()
                    if P == "Y":
                        insert_record()
                    else:
                        break
                cur.execute("desc "+table_name+"")
                data=cur.fetchall()
                print(colored("\n                   DESC Form                    ","grey"))
                print(tabulate(data,tablefmt='psql'))
                print()
                a=input("Enter "+color("Column Name")+" for "+color("Updating Value")+" : ")
                print(colored("\nE.g-->'Varchar',Char,int,'Date'","green"))
                b=input("Enter "+color("New Value")+" For "+colored(a)+" : ")
                c=input(""+color("Primary Key")+" Column Name : ").upper()
                d=input("'"+color(c)+"' value : ")
                cur.execute("update "+table_name+" set {}={} where {}={}".format(a,b,c,d))
                con.commit()
                k=1
                print("\nRecord Updated Succesfully :)\n")
                ask=input(colored("Want To Update_Record Again y/n : ","light_blue")).upper()
                print()
                if ask!="Y":
                    break
            except:
                if k!=1:
                    print(colored("\nSYNTAX ERROR :(","red"))
                    print(colored("E.g-->'Variable','Number'\n","green"))
                    do=input(colored("Do You Want To Try Again y/n : ","light_blue")).upper()
                    print()
                    if do != "Y":
                        break
    else:
        print(colored("No Table :(\n","red"))
        Press=input(colored("I Recomend You To Create New Table y/n : ","light_blue")).upper()
        if Press == "Y":
            create_table()

def UPDATE_Table():
    show_database()
    database=input("Enter "+color("Choosen Database")+" : ")
    con=mysql.connect (host='localhost', user='root', passwd=x, database=database) 
    print()
    cur=con.cursor()
    cur.execute("show tables")
    data=cur.fetchall()
    if data!=[]:
        while True:
            k=0
            try: 
                print(tabulate(data,headers=[colored("Tables_List","dark_grey"),],tablefmt="grid"))
                table_name=input("\nEnter "+color("Table Name")+" : ")
                table_name1=input("Enter "+color("New")+" table Name : ")
                cur.execute("RENAME TABLE "+table_name+" TO "+table_name1+"")
                print("\nTable Name Updated Succesfully :)\n")
                con.commit()
                k=1
                ch=input(colored("Do You Want To Update Table Again y/n : ","light_blue")).upper()
                print()
                if ch!="Y":
                    break
            except:
                if k!=1:
                    print(colored("\nTable "+table_name+" Not Exist\n","red"))
                    P=input(colored("Do You Want To Try Again y/n : ","light_blue")).upper()
                    if P != "Y":
                        break
    else:
        print("No Table :(")
        Press=input(colored("I Recomend You To Make New Table y/n : ","light_blue")).upper()
        if Press == "Y":
            create_table()

# --------------------------detele------------------------------------
def delete():
    print("\n1.Delete Database")
    print("2.Delete Table")
    print("3.Delete Column")
    ch=input(colored("Enter Your Choise : ","light_blue"))
    if ch=="1":
        delete_database()
    elif ch=="2":
        delete_table()
    elif ch=="3":
        delete_column()
    else:
        print(colored("Inavalid Choise","red"))

def delete_database():
    while True:
        k=0
        try:
            con=mysql.connect (host='localhost', user='root', passwd=x) 
            cur=con.cursor()
            cur.execute("show databases")
            data=cur.fetchall()
            print(tabulate(data,headers=[colored("___Database___","dark_grey"),],tablefmt='grid'))
            p=cur.rowcount
            print("\n-->Total No Of Database are",p)
            if data!=[]:
                cur=con.cursor()
                databas=input("\nEnter "+color("Database")+" To "+color("Delete")+" : ")
                cur.execute("DROP DATABASE "+databas+"")
                print("\nDatabase Succesfully Deleted :)\n")
                con.commit()
                k=1
                ch=input(colored("Do You Want To Delete More Databse y/n : ","light_blue")).upper()
                print()
                if ch!="Y":
                    break
            else:
                print(colored("NO DATABASE","red"))
                Press=input(colored("I Recomend You To Create New Database y/n : ","light_blue")).upper()
                if Press == "Y":
                    create_database()
        except:
            if k!=1:
                print(colored("\nWrong Database :(\n","red"))
                choise=input(colored("DO you Want To Try Again y/n : ","light_blue")).upper()
                if choise!="Y":
                    break 
     
def delete_table():
    show_database()
    database=input("Enter "+color("Choosen Database")+" : ")
    print()
    con=mysql.connect(host='localhost', user='root', passwd=x,database=database) 
    while True:
        k=0
        try:
            cur=con.cursor()
            cur.execute("show tables")
            data=cur.fetchall()
            if data!=[]:
                cur=con.cursor()#to display updated record in while this line are writen again
                cur.execute("show tables")
                data=cur.fetchall()
                print(tabulate(data,headers=[colored("Tables_List","dark_grey"),],tablefmt="grid"))
                table_name=input("\nEnter "+color("Table Name")+" to "+color("Delete")+" : ")
                cur.execute("DROP TABLE "+table_name+"")
                print("\nTable Succesfully Deleted :)\n")
                con.commit() 
                k=1
                ch=input(colored("Do You Want To Delete More Table y/n : ","light_blue")).upper()
                print()
                if ch!="Y":
                    break
            else:
                print(colored("No Table To Delete :(\n","red"))
                Press=input(colored("I Recomend You To Make New Table Or Delete Database y/n : ","light_blue")).upper()
                if Press == "Y":
                    print("1.Create Table")
                    print("2.Delete Database")
                    print("3.Exit")
                    p=input(colored("Enter Your Choise : ","light_blue")).upper()
                    print()
                    if p=="1":
                        create_table()
                    elif p=="2":
                        delete_database()
                    else:
                        break
                else:
                    break
        except:
            if k!=1:
                print(colored("\n "+table_name+" Not Exist\n","red"))
                l=input("Like To Try Again y/n : ").upper()
                if l!="Y":
                    break
            else:
                print("\nTable '"+table_name+"' Not Exist")
                break

def delete_column():
    show_database()
    database=input("Enter "+color("Choosen Database")+" : ")
    print()
    while True:
        con=mysql.connect(host='localhost', user='root', passwd=x,database=database) 
        cur=con.cursor()
        cur.execute("show tables")
        data=cur.fetchall()
        if data!=[]:
            print(tabulate(data,headers=[colored("Tables_List","dark_grey"),],tablefmt="grid"))
            table_name=input("\nEnter "+color("Table Name")+" : ")
            print("For To "+color("Delete")+" "+color("Column")+" You Want To "+color("See Table")+" In \n 1.DESC Form\n 2.Values Form")
            table=input("Enter Your "+color("Choise")+" : ")#i recomend you to create table
            if table=="1":
                cur.execute("desc "+table_name+"")
                da=cur.fetchall()
                print(colored("\n__________________________DESC Form_________________________","grey"))
                print(tabulate(da,tablefmt='psql'))
            elif table=="2":
                cur.execute("select*from "+table_name+"")
                d=cur.fetchall()
                print(colored("\n____________________________Value Form_____________________________","grey"))
                print(tabulate(d,tablefmt='psql'))
            else:
                print(colored("Inavlid Choise","red"))
                break
            k=0
            try:
                while True:
                    con=mysql.connect(host='localhost', user='root', passwd=x,database=database) 
                    cur=con.cursor()
                    column=input("Enter "+color("Column Name")+" To "+color("Delete")+" : ")
                    print()
                    cur.execute("ALTER TABLE "+table_name+" DROP COLUMN "+column+";")
                    print("\nTable Column Succesfully Deleted :)\n")
                    con.commit()
                    con.close()
                    ch=input(colored("Do You Want To Delete More Column y/n : ","light_blue")).upper()
                    print()
                    if ch!="Y":
                        break
                    k=1
            except:
                if k==0:
                    print(colored("Sorry To Say But Its Not Posible To Delete Last Column \n           Insterd You Can Delete Table\n ","light_green"))
                    e=input(colored("Do You Want To Delete Table y/n : ","light_blue")).upper()
                    if e=="Y":
                        delete_table()
                    else:
                        break
                else:
                    print("Table Column Succesfully Deleted :)")
        else:
            print(colored("NO TABLES :(","red"))
            Press=input(colored("I Recomend You To Make New Table y/n : ","light_blue")).upper()
            if Press == "Y":
                create_table()
            else:
                break

# --------------------------search record-----------------------------
def search_record():
    show_database()
    database=input("Enter "+color("Choosen Database")+" : ")
    print()
    con=mysql.connect(host='localhost', user='root', passwd=x,database=database) 
    cur=con.cursor()
    cur.execute("show tables")
    data=cur.fetchall()
    if data!=[]:
        print(tabulate(data,headers=[colored("Tables_List","dark_grey"),],tablefmt="grid"))
        print()
        table_name=input("Enter "+color("Table Name")+" : ")
        cur.execute("desc "+table_name+"")
        da=cur.fetchall()
        while True:
            print(colored("\n__________________________DESC Form_________________________","grey"))
            print(tabulate(da,tablefmt='psql'))
            aa=input("\nEnter "+color("Coloum Name")+" : ").upper()
            ch=input("\nChoise The "+color("Data Type")+" Of '"+aa+"' "+color("Column")+" \n 1.Char/Int\n 2.varchar\n 3.Date\n-->  ")

            if ch=="1":
                bb=int(input("Enter "+color(aa)+" value You Are Searching For: "))
                con=mysql.connect(host='localhost', user='root', passwd=x,database=database)
                cur=con.cursor()
                cur.execute("select * from "+table_name+" where {} = {}".format(aa,bb))

            elif ch=="2" or ch=="3":
                bb=input("Enter '"+aa+"' value You Are Searching For : ")
                con=mysql.connect(host='localhost', user='root', passwd=x,database=database)
                cur=con.cursor()
                cur.execute("select * from "+table_name+" where {} = '{}'".format(aa,bb))

            else:
                print(colored("Inavalid Choise","red"))
            data=cur.fetchall()
            if data!=[]:
                print(colored("\n____________________________Value Form_____________________________","grey"))
                print(tabulate(data,tablefmt='psql'))

            else:
                print(colored("\nNO RECORDS :(","red"))
                choise=input(colored("I Recomend You To Insert Record y/n : ","light_blue")).upper()
                if choise=="Y":
                    insert_record()
                else:
                    break
            choise=input(colored("\nDO you Want To See More Recods y/n : ","light_blue")).upper()
            if choise!="Y":
                break    
    else:
        print(colored("NO TABLES :(","red"))
        Press=input(colored("I Recomend You To Make New Table y/n : ","light_blue")).upper()
        if Press == "Y":
            create_table()

# --------------------------display record----------------------------
def display_record():
    print("\n1.Record")
    print("2.Record Order")
    ch=input(colored("Enter Your Choise : ","light_blue"))
    print()
    if ch=="1":
        Record()
    elif ch=="2":
        Record_Order()
    else:
        print(colored("Inavalid Choise","red"))

def Record():
    while True:
        show_database()
        database=input("Enter "+color("Choosen Database")+" : ")
        con=mysql.connect(host='localhost', user='root', passwd=x,database=database) 
        cur=con.cursor()
        cur.execute("show tables")
        data=cur.fetchall()
        if data!=[]:
            print()
            print(tabulate(data,headers=[colored("__Tables List__","dark_grey"),],tablefmt="grid"))
            table_name=input("\nEnter "+color("Table Name")+" : ")
            cur.execute("select*from "+table_name+"")
            d=cur.fetchall()
            if d==[]:
                print(colored("\nNO RECORDS :(","red"))
                choise=input(colored("I Recomend You To Insert Record y/n : ","light_blue")).upper()
                if choise=="Y":
                    insert_record()
                else:
                    break
            else:
                print(colored("\n                   Value Form                  ","grey"))
                print(tabulate(d,tablefmt='psql'))
            print("\n+Total No. Of Records Are", cur.rowcount,"\n")
        else:
            print(colored("\nNO TABLES :(","red"))
            choise=input(colored("I Recomend You To Make New Table y/n : ","light_blue")).upper()
            if choise=="Y":
                create_table()
            else:
                break
        ch=input(colored("Do You Want To Display More Record y/n : ","light_blue")).upper()
        if ch!="Y":
            break

def Record_Order():
    print("1.Accending")
    print("2.Decending")
    ch=input(colored("Enter Your Choise : ","light_blue"))
    if ch=="1":
        Record_Accending()
    elif ch=="2":
        Record_Desending()
    else:
        print(colored("Inavalid Choise","red"))    

def Record_Accending():
    while True:
        show_database()
        database=input("Enter "+color("Choosen Database")+" : ")
        print()
        con=mysql.connect(host='localhost', user='root', passwd=x,database=database) 
        cur=con.cursor()
        cur.execute("show tables")
        data=cur.fetchall()
        if data!=[]:
            print(tabulate(data,headers=[colored("Tables_List","dark_grey"),],tablefmt="grid"))
            print()
            table_name=input("\nEnter "+color("Table Name")+" : ")
            cur.execute("select*from "+table_name+"")
            da=cur.fetchall()
            if da==[]:
                print(colored("\nNO RECORDS :(","red"))
                choise=input(colored("I Recomend You To Insert Record y/n : ","light_blue")).upper()
                if choise=="Y":
                    insert_record()
                else:
                    break
            else:
                cur.execute("DESC "+table_name+"")
                d=cur.fetchall()
                print(colored("\n__________________________DESC Form_________________________","grey"))
                print(tabulate(d,tablefmt='psql'))
                column=input("Enter "+color("Column Name")+" For "+color("Order By Asc")+" : ")
                cur.execute("select*from "+table_name+" order by "+column+"")
                data=cur.fetchall()
                print(colored("\n____________________________Value Form_____________________________","grey"))
                print(tabulate(data,tablefmt='psql'))

            print("\n+Total No. Of Records Are", cur.rowcount,"\n")
        else:
            print(colored("NO TABLES :(","red"))
            choise=input(colored("I Recomend You To Create Table : ","light_blue")).upper()
            if choise=="Y":
                create_table()
            else:
                break
        ch=input(colored("Do You Want To Display More Record y/n : ","light_blue")).upper()
        if ch!="Y":
            break

def Record_Desending():
    while True:
        show_database()
        database=input("Enter "+color("Choosen Database")+" : ")
        print()
        con=mysql.connect(host='localhost', user='root', passwd=x,database=database) 
        cur=con.cursor()
        cur.execute("show tables")
        data=cur.fetchall()
        if data!=[]:
            print(tabulate(data,headers=[colored("Tables_List","dark_grey"),],tablefmt="grid"))
            print()
            table_name=input("\nEnter "+color("Table Name")+" : ")
            cur.execute("select*from "+table_name+"")
            da=cur.fetchall()
            if da==[]:
                print(colored("\nNO RECORDS :(","red"))
                choise=input(colored("I Recomend You To Insert Record y/n : ","light_blue")).upper()
                if choise=="Y":
                    insert_record()
                else:
                    break
            else:
                cur.execute("DESC "+table_name+"")
                d=cur.fetchall()
                print(colored("\n__________________________DESC Form_________________________","grey"))
                print(tabulate(d,tablefmt='psql'))
                column=input("\nEnter "+color("Column Name")+" For "+color("Order By DESC")+" : ")
                cur.execute("select*from "+table_name+" order by "+column+" DESC")
                data=cur.fetchall()
                print(colored("\n____________________________Value Form_____________________________","grey"))
                print(tabulate(data,tablefmt='psql'))

            print("\n+Total No. Of Records Are", cur.rowcount,"\n")
        else:
            print(colored("NO TABLES :(","red"))
            choise=input(colored("I Recomend You To Create Table : ","light_blue")).upper()
            if choise=="Y":
                create_table()
            else:
                break
        ch=input(colored("Do You Want To Display More Record y/n : ","light_blue")).upper()
        if ch!="Y":
            break

Menu()
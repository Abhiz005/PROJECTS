from tkinter import *
from tkinter import messagebox
import random
root=Tk()
root.geometry("1340x500")
root.title("Bill Management")
root.resizable(False,False)


        
def Reset():
    entry_dosa.delete(0,END)
    entry_cookies.delete(0,END)
    entry_Tea.delete(0,END)
    entry_coffee.delete(0,END)
    entry_juice.delete(0,END)
    entry_pancakes.delete(0,END)
    entry_eggs.delete(0,END)


        
def Total():
    global nameEntry,phoneEntry,dateEntry,totalcost,a1,a2,a3,a4,a5,a6,a7,c1,c2,c3,c4,c5,c6,c7
    
    try:a1=int(dosa.get())
    except: a1=0

    try:a2=int(cookies.get())
    except: a2=0

    try:a3=int(Tea.get())
    except: a3=0

    try:a4=int(coffee.get())
    except: a4=0

    try:a5=int(juice.get())
    except: a5=0

    try:a6=int(pancakes.get())
    except: a6=0

    try:a7=int(eggs.get())
    except: a7=0

#Define cost of each item per quantity
    c1 = 60*a1
    c2 = 30*a2
    c3 = 7*a3
    c4 = 100*a4
    c5 = 20*a5
    c6 = 15*a6
    c7 = 7*a7

    lbl_total=Label(f2,font=('aria',20,'bold'),text="Total",width=16,fg="lightyellow",bg="black")
    lbl_total.place(x=10,y=50)
    
    entry_total=Entry(f2,font=('aria',20,'bold'),textvariable=Total_bill,bd=6,width=15,bg="lightgreen")
    entry_total.place(x=30,y=100)
   
    totalcost=c1+c2+c3+c4+c5+c6+c7
    string_bill="Rs.",str('%.2f' %totalcost)
    Total_bill.set(string_bill)

    
    
    lbl_total=Label(f2,font=("Gabriola",15,"bold"),text="NAME:",width=5,fg="black")
    lbl_total.place(x=0,y=180)
    nameEntry=Entry(f2,font=("ariel", 20),width=15)
    nameEntry.place(x=60,y=183)
    
    lbl_total=Label(f2,font=("Gabriola",15,"bold"),text="NUMBER:",width=8,fg="black")
    lbl_total.place(x=0,y=230)
    phoneEntry=Entry(f2,font=("ariel", 20),width=14)
    phoneEntry.place(x=80,y=233)
    
    lbl_total=Label(f2,font=("Gabriola",15,"bold"),text="DATE:",width=5,fg="black")
    lbl_total.place(x=0,y=280)
    dateEntry=Entry(f2,font=("ariel", 20),width=12)
    dateEntry.place(x=60,y=283)
   
    
    billButton=Button(f2,bd=5, fg="black", bg="lightblue", font=("ariel", 12, 'bold'), width=8, text="BILL",command=generate_bill)
    billButton.place(x=90,y=326)


billnumber=random.randint(500,1000)   
def generate_bill():
    
    customer_name = nameEntry.get()
    customer_phone = phoneEntry.get()
    customer_date = dateEntry.get()

    if not customer_name or not customer_phone or not customer_date:
        messagebox.showerror('Error', 'Please Fill the customer details')
    else:
        text_area.insert(END, '\t**Welcome Customer**\n\n')
        text_area.insert(END, f'Bill Number: {billnumber}')
        text_area.insert(END, '\n=====================================\n')
        text_area.insert(END, f'Customer Name: {customer_name}\n')
        text_area.insert(END, f'Customer Phone Number: {customer_phone}\n')
        text_area.insert(END, f'DATE: {customer_date}')
        text_area.insert(END, '\n======================================')
        text_area.insert(END, '\t Name           QTY          Price')
        text_area.insert(END, '\n======================================\n')
        if entry_dosa.get()!=0:
            text_area.insert(END,f' Dosa\t\t{a1}\t\t{c1}\n')
        if entry_dosa.get()!=0:
            text_area.insert(END,f' Cookies\t\t{a2}\t\t{c2}\n')
        if entry_dosa.get()!=0:
            text_area.insert(END,f' Tea\t\t{a3}\t\t{c3}\n')
        if entry_dosa.get()!=0:
            text_area.insert(END,f' Coffee\t\t{a4}\t\t{c4}\n')
        if entry_dosa.get()!=0:
            text_area.insert(END,f' Juice\t\t{a5}\t\t{c5}\n')
        if entry_dosa.get()!=0:
            text_area.insert(END,f' Pancakes\t\t{a6}\t\t{c6}\n')
        if entry_dosa.get()!=0:
            text_area.insert(END,f' Eggs\t\t{a7}\t\t{c7}\n')
        text_area.insert(END,'--------------------------------------')
        text_area.insert(END, f'Total Amount: Rs.{totalcost}\n')
        text_area.insert(END,'--------------------------------------\n')
        text_area.insert(END, 'Thank you!!! please come again\n')

        
Label(text="BILL MANAGEMENT",bg="black",fg="white",font=("calibri",33),width="300",height="2").pack()

#MENU CARD
f=Frame(root, bg="lightgreen", highlightbackground="black", highlightthickness=1,width=300,height=370) 
f.place(x=10,y=118)

Label(f, text="Menu", font=("Gabriola",40,"bold"), fg="black", bg="lightgreen").place(x=80,y=0)
Label(f, font=("Lucida Calligraphy", 15, 'bold'), text="Dosa.......Rs.60/plate", fg="black", bg="lightgreen").place(x=10,y=80)
Label(f, font=("Lucida Calligraphy", 15, 'bold'), text="Cookies....Rs.30/plate",fg="black", bg="lightgreen").place(x=10,y=110)
Label(f, font=("Lucida Calligraphy", 15, 'bold'), text="Tea.......Rs.7/cup", fg="black",bg="lightgreen").place(x=10,y=140)
Label(f, font=("Lucida Calligraphy", 15, 'bold'), text="Coffee.....Rs.100/cup", fg="black",bg="lightgreen").place(x=10,y=170)
Label(f, font=("Lucida Calligraphy", 15, "bold"), text="Juice...Rs.20/glass", fg="black", bg="lightgreen").place(x=10,y=200)
Label(f, font=("Lucida Calligraphy", 15, 'bold'), text="Pancakes...Rs.15/pack", fg="black", bg="lightgreen").place(x=10,y=230)
Label(f, font=("Lucida Calligraphy", 15, 'bold'), text="Eggs....... Rs.7/egg",fg="black", bg="lightgreen").place(x=10,y=260)

#Order
f2=Frame(root,bg="yellow",highlightbackground="black",highlightthickness=1,width=300,height=370)
f2.place(x=700,y=118)

order=Label(f2,text="ORDER",font=('calibri',20),bg="lightyellow")
order.place(x=100,y=10)



#ENTRY WORK
f1=Frame(root,bd=5,height=370, width=300)
f1.place(x=320,y=118)

dosa=StringVar()
cookies=StringVar()
Tea=StringVar()
coffee=StringVar()
juice=StringVar()
pancakes=StringVar() 
eggs=StringVar()
Total_bill=StringVar() 
#LABEL
lbl_dosa=Label(f1,font=("aria",20,'bold'),text="Dosa", width=12,fg="blue")
lbl_cookies=Label(f1,font=("aria",20,'bold'),text="Cookies", width=12,fg="blue")
lbl_Tea=Label(f1,font=("aria",20,'bold'),text="Tea", width=12,fg="blue")
lbl_coffee=Label(f1,font=("aria",20,'bold'),text="Coffee", width=12,fg="blue")
lbl_juice=Label(f1,font=("aria",20,'bold'),text="Juice", width=12,fg="blue")
lbl_pancakes=Label(f1,font=("aria",20,'bold'),text="Pancakes", width=12,fg="blue")
lbl_eggs=Label(f1,font=("aria",20,'bold'),text="Eggs", width=12,fg="blue")

lbl_dosa.grid(row=1,column=0)
lbl_cookies.grid(row=2,column=0)
lbl_Tea.grid(row=3,column=0)
lbl_coffee.grid(row=4,column=0)
lbl_juice.grid(row=5,column=0)
lbl_pancakes.grid(row=6,column=0)
lbl_eggs.grid(row=7,column=0)


#ENTRY
entry_dosa=Entry (f1, font=("aria", 20, 'bold'), textvariable=dosa, bd=6, width=8, bg="lightpink") 
entry_cookies=Entry (f1, font=("aria", 20, 'bold'), textvariable=cookies, bd=6,width=8, bg="lightpink") 
entry_Tea=Entry (f1, font=("aria", 20, 'bold'), textvariable=Tea, bd=6, width=8, bg="lightpink") 
entry_coffee=Entry(f1, font=("aria", 20, 'bold'), textvariable=coffee, bd=6,width=8, bg="lightpink") 
entry_juice=Entry (f1, font=("aria", 20, 'bold'), textvariable=juice, bd=6,width=8, bg="lightpink") 
entry_pancakes=Entry (f1, font=("aria", 20, 'bold'), textvariable=pancakes, bd=6,width=8,bg="lightpink")
entry_eggs=Entry (f1, font=("aria", 20, 'bold'), textvariable=eggs, bd=6,width=8, bg="lightpink")


entry_dosa.grid(row=1,column=1)
entry_cookies.grid(row=2,column=1) 
entry_Tea.grid(row=3,column=1)
entry_coffee.grid(row=4,column=1)
entry_juice.grid(row=5,column=1)
entry_pancakes.grid(row=6, column=1)
entry_eggs.grid(row=7,column=1)

#buttons
btn_reset=Button (f1,bd=5, fg="black", bg="lightblue", font=("ariel", 16, 'bold'), width=10, text="Reset", command=Reset)
btn_reset.grid(row=8, column=0)

btn_total=Button (f1,bd=5, fg="black", bg="lightblue", font=("ariel", 16, 'bold'), width=10, text="Total", command=Total)
btn_total.grid(row=8, column=1)


#bill paper
f3=Frame(root,bg="white",highlightbackground="black",highlightthickness=1,width=330,height=370)
f3.place(x=1000,y=118)

Bill=Label(f3,text="BILL",font=('calibri',20),bg="lightyellow")
Bill.place(x=130,y=5)

text_area = Text(f3, wrap=WORD, width=38, height=26)
text_area.place(x=5, y=50)

scrollbar = Scrollbar(f3, command=text_area.yview)
scrollbar.place(x=310, y=60, height=300)

text_area.config(yscrollcommand=scrollbar.set)




root.mainloop()

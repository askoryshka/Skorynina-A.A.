def add(a):
    if a%4==0 and a%100!=0:
        print ("ДА")
    else:
        if a%400==0:
            print("ДА")
        else:
            print("НЕТ")
a1=int(input())
print(add(a1))
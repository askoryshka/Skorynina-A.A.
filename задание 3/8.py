def add(a,b,c):
    if a==b==c:
        print (3)
    else:
        if a==b or b==c or a==c:
            print (2)
        else:
            print(0)
a1=int(input())
b1=int(input())
c1=int(input())
print(add(a1,b1,c1))
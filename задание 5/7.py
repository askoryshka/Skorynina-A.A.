n=int(input('Число:'))
a=0
b=n
while n!=0:
    n=int(input('Число:'))
    if b>n:
        a+=1
    b=n
else:
    print(a)
n=int(input('Число:'))
a=0
while n!=0:
    b=n
    n=int(input('Число:'))
    if n==b:
        a+=1
else:
    print(a)
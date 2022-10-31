def x(n):
    a=0
    b=n
    while n!=0:
        a+=1
        n=int(input('Число:'))
        b+=n
    else:
        print(b/a)
j=int(input('Число:'))
print(x(j))
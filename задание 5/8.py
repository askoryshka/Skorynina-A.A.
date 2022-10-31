def x(n):
    a=0
    c=0
    while n!=0:
        b=n
        n=int(input('Число:'))
        if n==b:
            a+=1
        else:
            if a>c:
                c=a
                a=0
    return c 
o=int(input('Число:'))
print(x(o))
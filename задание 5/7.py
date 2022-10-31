def x(n):
    a=0
    b=n
    while n!=0:
        n=int(input('Число:'))
        if n>b:
            a+=1
        b=n
    else:
        return a
S=int(input('Число:'))
print(x(S))
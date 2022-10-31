from re import A


def x(n):
    a=0
    b=1
    c=0
    for i in range(n):
        c=c+a
        d=a+b
        a=b
        b=d
    return c
e=int(input('Число'))
k=int(input('число'))
print(x(e)-x(k))
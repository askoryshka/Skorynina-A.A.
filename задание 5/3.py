def x(n):
    a=0
    b=1
    while b<=n:
        b*=2
        a+=1
        return a-1, b//2
f=int(input('Введите число:'))
print(x(f))
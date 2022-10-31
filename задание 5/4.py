def x(x,y):
    den=1
    while y>x:
        x *= 1.1
        den += 1
    print(den)
a=int(input('Расстояние 1:'))
b=int(input('Расстояние 2:'))
print(x(a,b))
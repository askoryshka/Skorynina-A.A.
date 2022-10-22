x=int(input('Расстояние 1:'))
y=int(input('Расстояние 2:'))
den=1
while y>x:
    x *= 1.1
    den += 1
print(den)
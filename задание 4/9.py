def y(n):
    a=0
    b=1
    sum=0
    for i in range(n):
        sum=sum+a
        c=a+b
        a=b
        b=c
    print(sum)
m=int(input('Число:'))
print(y(m))
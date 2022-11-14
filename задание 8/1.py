def x(b):
    for i in range(1, b+1):
        if i % 10 != 0:
            if b % i == 0:
                print(i)


b = int(input('введите число:'))
print(x(b))

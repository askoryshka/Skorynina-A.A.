def x(A,B):
    for i in range(A - (A + 1) % 2, B - B % 2, -2):
        print(i, end=' ')
C=int(input('Введите число'))
D=int(input('Введите число меньше первого'))
print(x(C,D))
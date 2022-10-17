A=int(input('Введите число'))
B=int(input('Введите число'))
if A<B:
    while A<=B:
        print(A)
        A=A+1
else:
    while B<=A:
        print(A)
        A=A-1
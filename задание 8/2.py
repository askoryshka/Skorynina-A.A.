def massive(m, a):
    a[0], a[m - 1] = a[m - 1], a[0]
    print(a)


M = int(input('Введите кол-во элементов массива:'))
j = []
j = [int(input("Введите элемент массива:")) for i in range(M)]
print(massive(M, j))

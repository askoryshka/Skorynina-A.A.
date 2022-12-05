def x():
    n = int(input('Введите элемент:'))
    if n == 0:
        return 0
    a = x()
    if n > a:
        return n
    else:
        return a


print('Наибольшее число:', x())

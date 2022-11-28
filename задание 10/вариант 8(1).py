from contextlib import redirect_stdout


def matrix():
    file = open('Скорынина Анна Алексеевна_У-222_vvod.txt', 'r')
    global a
    a = file.readlines()
    for i in range(len(a)):
        a[i] = a[i].split(' ')
        for j in range(len(a[i])):
            a[i][j] = int(a[i][j])
    file.close()


def vivod(a):
    for i in range(len(a)):
        for j in range(len(a[i])):
            print(a[i][j], end=' ')
        print()


def x(a, k):
    for j in range(len(a)):
        t = a[k][j] / a[k][k]
        print(t)


a = []
k = int(input('Введите число:'))
matrix()
with open('Скорынина Анна Алексеевна_У-222_vivod.txt', 'w') as file:
    with redirect_stdout(file):
        file.write('Массив:')
        vivod(a)
        file.write('Итог:')
        x(a, k)


def x(t):
    a=0
    for i in range (len(t)):
        if (t[i] == '.') or (t[i] == ' '):
            a+=1
    print('Кол-во слов:', a)
text=str(input('Введите предложение:'))
print(x(text))
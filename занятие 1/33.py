age = int(input())
name = str(input())
a=16-age
if age>0 and age<75:
    if name == 'Иван':
        if age>=16:
            print ('Поздравляем вы поступили в ВГУИТ')
        if age<16:
            print ('Сначала нужно окончить школу!',a)
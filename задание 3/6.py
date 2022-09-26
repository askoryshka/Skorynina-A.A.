def add(x1,y1,x2,y2):
    if (x1+y1+x2+y2)%2==0:
        print('ДА')
    else:
        print('НЕТ')
x11=int(input())
y11=int(input())
x22=int(input())
y22=int(input())
print (add(x11,y11,x22,y22))
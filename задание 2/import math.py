import math
x=-0.02235
y=2.23
z=15.221
s=((math.pow(math.e,abs(x-y))*math.pow(abs(x-y),(x+y)))/((math.atan(x))+(math.atan(z))))+(math.pow(math.sqrt((math.pow(x,6)+math.pow(math.log(y),2))),1/3))
print(s)
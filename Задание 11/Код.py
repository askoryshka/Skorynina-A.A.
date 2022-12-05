import requests
import json
from tkinter import *


def clicked():
    name = txt.get()
    # Имя = 'Kubernetes'
    url = f'https://api.github.com/users/{name}'
    userdata = requests.get(url).json()

    js = {
        'company': userdata['company'],
        'created_at': userdata['created_at'],
        'email': userdata['email'],
        'id': userdata['id'],
        'name': userdata['name'],
        'url': userdata['url']
    }

    with open('file.json', 'a') as file:
        json.dump(js, file)


window = Tk()
window.title('Окно')
window.geometry('500x69')
lbl = Label(window, text='Введите имя: ')
lbl.grid(column=0, row=0)
txt = Entry(window, width=30)
txt.grid(column=1, row=0)
btn = Button(window, text='Нажмите', command=clicked)
btn.grid(column=1, row=1)
lbl_2 = Label(window, text='', anchor='w')
lbl_2.grid(column=0, row=2)
window.mainloop()

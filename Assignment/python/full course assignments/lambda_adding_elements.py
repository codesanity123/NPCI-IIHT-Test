# -*- coding: utf-8 -*-
"""Lambda adding elements

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/14yZI2fOQt2OQ9MR9Eny9F6OqGwu8uSRN
"""

x = lambda l, element : l.append(element)
l=[]
num=int(input("Enter no. of elements to append "))
for i in range(num):
    e=int(input("Enter the number:"))
    x(l,e)

print("list: ",l)


#Convert list to dictionary
new_dict = { l[i]:l[i] for i in range(len(l))}
print("List converted to dictionary: ",new_dict)

#sort dictionary based on values
d=dict(sorted(new_dict.items(), key=lambda item: item[1]))
print("Sorted dictionary: ", d)
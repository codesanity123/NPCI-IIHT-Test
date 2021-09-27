# -*- coding: utf-8 -*-
"""Grading

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1FUVE_bB9b99slu-BuW5FvtfnjHnIWkIY
"""

print("Enter the number of Students:")
student_count = int(input())
students = list()
student_passed = list()
distinction = list() 
first_div = list()
second_div = list()
reappear = list()
failed = list()

for i in range(student_count) :
    roll_no = i + 1
    marks_list = list(map(int, input("Enter the marks for Physics, Chemistry and Mathematics : ").split()))
    count = 0 
    for marks in marks_list :
        if marks < 50 : 
            count += 1
    if count > 1 :
        failed.append(roll_no)
    elif count == 1 :
        reappear.append(roll_no)
    else : 
        student_passed.append(roll_no)
        avg_marks = sum(marks_list)/3
        if ( avg_marks >= 80) :
            distinction.append(roll_no)
        elif (avg_marks >= 60) :
            first_div.append(roll_no)
        else : 
            second_div.append(roll_no)

print("Class Result : ")
print("Percentage of Students failed : ", (len(failed)/student_count) * 100)
print("Percentage of Students reappearing : ", (len(reappear)/student_count) * 100)
print("Percentage of Students student passed : ", (len(student_passed)/student_count) * 100)
print("Percentage of Students in Distinction : ", (len(distinction)/student_count) * 100)
print("Percentage of Students in First Division : ", (len(first_div)/student_count) * 100)
print("Percentage of Students in Second Division : ", (len(second_div)/student_count) * 100)
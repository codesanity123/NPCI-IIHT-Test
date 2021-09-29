# -*- coding: utf-8 -*-
"""Tuples

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/14yZI2fOQt2OQ9MR9Eny9F6OqGwu8uSRN
"""

from collections import defaultdict 

elem_level_count = defaultdict(lambda  : list())

def traverse_tuple(tup, level) :
    for elem in tup : 
        if isinstance(elem, tuple) :
            traverse_tuple(elem, level + 1)
        else : 
            if level >= len(elem_level_count[elem]) :
                elem_level_count[elem].append(1)
            else : 
                elem_level_count[elem][level] += 1


### Input Part : 
elements_tuple = (1, 2, 3, 4, (5, 3, 2, 3, 1, (1, 4, 2, 3, (4, 5, 23, 2), (1, 2, 3))))

### Output Part : 
traverse_tuple(elements_tuple, 0)

## Printing the output : 
for elem in elements_tuple : 
    if len(elem_level_count[elem]) > 1 :
        step = ""
        for i, times in enumerate(elem_level_count[elem]) :
            print(step + (str(elem) + " ") * times)
            step += " " * (i + 1)
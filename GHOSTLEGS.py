# Difficulty: Easy
# Language: Python
# Time: 15 minutes
# Date: 7/20/2020

# Given the location of fire on the strip, you have to command the firefighter to put out all fire with the least number of water drops.

# https://www.codingame.com/training/easy/ghost-legs

import sys
import math

w, h = [int(i) for i in input().split()]
lines = []
for i in range(h):
    lines += [input()]
results = []
for i in range(0, len(lines[0]), 3):
    result = lines[0][i]
    index = i
    for j in range(1, len(lines)):
        if(j == len(lines)-1):
            result = result + lines[j][index] 
        elif(index > 0 and lines[j][index-1] == "-"):
            index -=3
        elif( index < len(lines[0])-1 and lines[j][index+1] == "-"):
            index +=3
    print(result)

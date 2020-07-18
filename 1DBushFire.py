# Difficulty: Easy
# Language: Python
# Time: 30 minutes
# Date: 7/16/2020

# Given the location of fire on the strip, you have to command the firefighter to put out all fire with the least number of water drops.

# https://www.codingame.com/training/easy/1d-bush-fire


import sys
import math

n = int(input())
forest = []
for i in range(n):
    forest += [input()]
for i in forest:
    count = 0
    fire = 0
    for j in range(0, len(i)):
        if(i[j] == 'f'):
            fire +=1
            if(fire == 3):
                count +=1
                fire = 0
        elif(fire == 2):
            count +=1
            fire = 0
        elif(fire == 1):
            if(j < len(i)-1 and i[j+1] == 'f'):
                count +=1
                fire = -1
            else:
                count +=1
                fire = 0
    if(fire > 0):
        count +=1
    print(count)

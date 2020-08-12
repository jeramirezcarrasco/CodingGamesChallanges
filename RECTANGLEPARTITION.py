# Difficulty: Easy
# Language: Python
# Time: 1 hour
# Date: 8/11/2020

# Draw perpendicular lines from the measurements to partition the rectangle into smaller rectangles.
#In all sub-rectangles (include the combinations of smaller rectangles), how many of them are squares?

# https://www.codingame.com/training/easy/rectangle-partition

import sys
import math

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.

w, h, count_x, count_y = [int(i) for i in input().split()]

x = []
y = []
for i in input().split():
    x+= [int(i)]
x.insert(0,0)
x.append(w)
for i in input().split():
    y+= [int(i)]
y.insert(0,0)
y.append(h)
sx = set(x)
sy = set(y)
min = 0
if h < w:
    min = h
else:
    min = w
count = 0

for l in range(1,min + 1):
    for i in y:
        if(i + l > h):
            break
        elif((i + l) in sy):
            for j in x:
                if(j + l > w):
                    break
                if( (j + l) in sx):
                    count +=1
            
print(count)


# Write an answer using print
# To debug: print("Debug messages...", file=sys.stderr, flush=True)


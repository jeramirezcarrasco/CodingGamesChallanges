# Difficulty:Easy
# Language:Python
# Time:1 hours
# Date:7/15/202
#
# Your mission is to write a program that can display a line of text in ASCII art in a style you are given as input.
#
# https://www.codingame.com/ide/puzzle/ascii-art


import sys
import math

# A = 65
# Z = 90
# a = 97
# a -> A = -32
y = int(input())
h = int(input())
t = input()
art = []
for i in range(h):
    art += [input()]

for f in range(0, h):
    for i in t:
        if((ord(i)) <= 90 and (ord(i) ) >= 65 ):
            for j in range((ord(i) -65) * y, ((ord(i) -65) * y) + y):
                print(art[f][j], end = '')
        elif((ord(i)) <= 122 and (ord(i)) >= 97  ):
            for j in range((ord(i) -97) * y, ((ord(i) -97) * y) + y):
                print(art[f][j], end = '')
        else:
            for j in range( len(art[0]) - 4, len(art[0])):
                print(art[f][j], end = '')
    print('')


# Difficulty: Easy
# Language:Python
# Time: 1 hour

# Description:The city of Montpellier has equipped its streets with defibrillators to help save victims of cardiac arrests
# Based on the data we provide in the tests, write a program that will allow users to find the defibrillator nearest to their location

import sys
import math

def distance(DLon, DLat ,ULon ,ULat):
    x = (DLon - ULon) * math.cos((ULat + DLat)/2)
    y = DLat - ULat
    d = math.sqrt(pow(x,2) + math.pow(y,2)) * 6371
    return d

lon = input().replace(",", ".")
lat = input().replace(",", ".")
n = int(input())
dif = []
for i in range(n):
    dif.append(input().replace(",", ".").split(";"))

min = distance(float(dif[0][-2]),float(dif[0][-1]),float(lon), float(lat))
name = dif[0][1]

for i in range(1, len(dif) -1):
    x = distance(float(dif[i][-2]),float(dif[i][-1]),float(lon), float(lat))
    if(min > x):
        min  = x
        name = dif[i][1]

print(name)

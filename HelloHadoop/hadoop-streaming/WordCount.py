#!/usr/bin/python

import re
import sys

words = re.compile("\W")

for input in sys.stdin.readlines():
  for w in words.split(input):
    if len(w) > 0:
      print w + '\t' + str(1)

    

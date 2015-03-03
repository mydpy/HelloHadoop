#!/usr/bin/python

import sys

wordcount = 0
key = None
for input in sys.stdin.readlines():
  input = input.rstrip()
  parts = input.split("\t")
  if len(parts) < 2:
    continue
  newkey=parts[0]
  count=int(parts[1])
  if not key: 
    key = newkey
  if key != newkey:
    print key + "\t" + str(wordcount)
    key = newkey;
    wordcount = 0
  wordcount = wordcount + count
if key != None:
  print key + "\t" + str(wordcount)

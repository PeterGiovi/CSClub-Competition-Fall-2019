#!/usr/bin/env python3
import sys

DEBUG = False

all_lines = open(sys.argv[1], 'r').read().split('\n')
stack1 = all_lines[0]
stack2 = all_lines[1]
stack3 = all_lines[2]
stacks = [list(stack1), list(stack2), list(stack3)]

try:
    instructions = input()
except:
    instructions = None

if instructions == None:
    print(0)
    sys.exit() 

pairs = instructions.split(';')
pairs.pop()
for pair in pairs:
    both = pair.split(',')
    f = int(both[0]) - 1
    t = int(both[1]) - 1
    
    if len(stacks[f]) > 0:
        temp = stacks[f].pop()
        stacks[t] += temp
    else:
        print(0)
        sys.exit()

s_char = 'S'
m_char = 'M'
l_char = 'L'

def is_uniform(mList, mChar):
    if len(mList) == 0:
        return False
    for c in mList:
        if c != mChar:
            return False
    return True

found_s_stack = False
found_m_stack = False
found_l_stack = False
for stack in stacks:
    if is_uniform(stack, s_char):
        found_s_stack = True
    elif is_uniform(stack, m_char):
        found_m_stack = True
    elif is_uniform(stack, l_char):
        found_l_stack = True
    else:
        print(0)
        sys.exit()

if found_s_stack and found_m_stack and found_l_stack:
    score = ((3 * (len(stack1) + len(stack2) + len(stack3))) // len(pairs)) * 100
    print(score)
else:
    print(0)


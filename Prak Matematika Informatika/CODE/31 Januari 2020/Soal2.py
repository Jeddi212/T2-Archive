"""
Nama    : Jedediah Fanuel
Nim     : 1119023
Soal    : 2
"""
#konstanta global

NEGATION = '\u00ac'
CONJUNTION = '\u2227'
DISJUNTION = '\u2228'
XOR = '\u2295'
IMPLICATION = '\u21d2'
IFF = '\u21d4'

import itertools

if __name__ == '__main__':

    input_truth_values_iterator = itertools.product([True, False], repeat = 3)
    input_truth_values = list(input_truth_values_iterator)

    def out_tuple(a):
        for bul in a:
            print('{:6<}{:6}{:6}{:10}'.format(bul[0], bul[1], bul[2], (bul[0] or bul[1] or bul[2])))


nega = "p " + DISJUNTION + " q " + DISJUNTION + " r"
print("Truth Table")
print("Proposisi : p " + DISJUNTION + " q " + DISJUNTION + " r")
print('{:6}{:6}{:6}{:10}'.format("p", "q", "r", nega))
out_tuple(input_truth_values)
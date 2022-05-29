"""
Nama    : Jedediah Fanuel
Nim     : 1119023
Soal    : 1
"""
# konstanta global
NEGATION = '\u00ac'
CONJUNTION = '\u2227'
DISJUNTION = '\u2228'
XOR = '\u2295'
IMPLICATION = '\u21d2'
IFF = '\u21d4'

if __name__ == '__main__':

    def out_tuple(a):
        for bul in a:
            print('{:6<}{:6}{:6}{:10}'.format(bul[0], bul[1], bul[2], (bul[0] and bul[1] and bul[2])))

input_truth_values = [(True, True, True), (True, True, False), (True, False, True),
                      (True, False, False), (False, True, True), (False, True, False),
                      (False, False, True), (False, False, False)]

nega = "p " + NEGATION + " q " + NEGATION + " r"
print("Truth Table")
print("Proposisi : p " + NEGATION + " q " + NEGATION + " r")
print('{:6}{:6}{:6}{:10}'.format("p", "q", "r", nega))
out_tuple(input_truth_values)

"""
Nama    : Jedediah Fanuel
Nim     : 1119023
Soal    : 3
"""
#konstanta global
NEGATION = '\u00ac'
CONJUNTION = '\u2227'
DISJUNTION = '\u2228'
XOR = '\u2295'
IMPLICATION = '\u21d2'
IFF = '\u21d4'

if __name__ == '__main__':

    boolean_func = input("Masukkan Nilai : ")

    code = compile(boolean_func, '<string>', 'eval')
    variable_names = code.co_names

    i = 0
    for x in variable_names:
        print('{:6}'.format(variable_names[i]), end='')
        i += 1

    print('{:20}'.format(boolean_func), end='')


#contoh variable
NAMA_CONST_1 = 'nilai var'
NAMA_CONST_2 = 5
NAMA_CONST_3 = 5.1
NAMA_VAR_4 = True
NAMA_VAR_5 = False
#namaVar
NEGATION = '\u00ac'

if __name__ == '__main__':
    print('Truth table')
    print('Proposisi: ' + NEGATION + 'p')
    print('Proposisi: {}{}'.format(NEGATION, 'p'))
    print('p      ¬p')
    print('{:7}{:7}'.format('p', NEGATION + 'p'))
    print('True   (False)')
    print('False  (True)')

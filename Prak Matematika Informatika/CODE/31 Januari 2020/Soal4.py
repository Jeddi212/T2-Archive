"""
Nama    : Jedediah Fanuel
Nim     : 1119023
Soal    : 4
"""

import itertools

if __name__ == '__main__':

    bool_input = input("Masukkan Nilai : ")

    code = compile(bool_input, '<string>', 'eval')
    variable_names = code.co_names

    banyak_elemen_list = len(variable_names)

    input_truth_values_iterator = itertools.product([True, False], repeat = banyak_elemen_list)
    input_truth_values = list(input_truth_values_iterator)

    print(input_truth_values)

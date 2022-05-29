"""
Nama    : Jedediah Fanuel
Nim     : 1119023
Soal    : 6
"""

import itertools

if __name__ == '__main__':

    bool_input = input("Masukkan Nilai : ")

    code = compile(bool_input, '<string>', 'eval')
    variable_names = code.co_names
    banyak_elemen_list = len(variable_names)

    input_truth_values_iterator = itertools.product([True, False], repeat=banyak_elemen_list)
    input_truth_values = list(input_truth_values_iterator)

    #Header
    i = 0
    for idx, name in enumerate(variable_names):
        print('{:<6}'.format(variable_names[i]), end='')
        i += 1

    print('{}'.format(bool_input))

    #Truth Table
    for tupl in input_truth_values:
        var_assignment = {}

        for idx, name in enumerate(variable_names):
            var_assignment[name] = tupl[idx]

        eval_rslt = eval(bool_input, var_assignment)

        for idx, name in enumerate(variable_names):
            print('{:<6}'.format(var_assignment[name]), end='')

        print(eval_rslt)

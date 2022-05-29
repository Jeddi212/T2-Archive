"""
Nama    : Jedediah Fanuel
Nim     : 1119023
Soal    : 5
"""

if __name__ == '__main__':

    var_assignment = {}

    bool_input = input("Masukkan Nilai : ") #contoh (p and q)

    code = compile(bool_input, '<string>', 'eval')
    variable_names = code.co_names

    for bebas in variable_names:
        print("Masukkan nilai untuk variable (1 atau 0)")
        masukkan = input(bebas + " : ")

        if(masukkan == "1"):
            simpen = True
        else:
            simpen = False

        var_assignment[bebas] = simpen

    eval_rslt = eval(bool_input, var_assignment)

    print("")
    print(eval_rslt)

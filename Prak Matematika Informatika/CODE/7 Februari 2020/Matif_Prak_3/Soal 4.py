# Nama  :   Jedediah Fanuel
# Nim   :   1119023

if __name__ == '__main__':

    boolean = "(p and q) or r"
    var_names = ('p', 'q', 'r')
    var_assignment = {}

    for idx in var_names:
        masukkan = input("Masukkan Nilai " + str(idx) + " : ")
        if masukkan == 't' or masukkan == 'T':
            var_assignment[idx] = True
        else:
            var_assignment[idx] = False

    print("\nFungsi boolean : ", boolean)

    for logik in var_assignment:
        print(logik, ": ", var_assignment[logik])

    eval_rslt = eval(boolean, var_assignment)
    print("(p and q) or r = ", eval_rslt)

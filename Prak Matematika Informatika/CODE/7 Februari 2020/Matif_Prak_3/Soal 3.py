# Nama  :   Jedediah Fanuel
# Nim   :   1119023

if __name__ == '__main__':

    boolean = "(p and q) or r"
    var_assignment = {}

    var_assignment['p'] = True
    var_assignment['q'] = False
    var_assignment['r'] = True

    print("Fungsi boolean : ", boolean)

    for logik in var_assignment:
        print(logik, ": ", var_assignment[logik])

    eval_rslt = eval(boolean, var_assignment)
    print("(p and q) or r = ", eval_rslt)

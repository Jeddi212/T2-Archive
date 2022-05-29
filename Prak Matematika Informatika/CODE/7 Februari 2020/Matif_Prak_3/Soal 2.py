# Nama  :   Jedediah Fanuel
# Nim   :   1119023

if __name__ == '__main__':
    boolean = "(p and q) or r"

    var_assignment = {
        'p' : True ,
        'q' : False,
        'r' : True
    }

    print("Fungsi boolean : ", boolean)

    for logik in var_assignment:
        print(logik, ": ", var_assignment[logik])
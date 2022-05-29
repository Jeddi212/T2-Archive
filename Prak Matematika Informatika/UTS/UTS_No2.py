# Nama : Jedediah Fanuel
# Nim  : 1119023

if __name__ == '__main__':
    list_p_or_q_values = [
        (True, True, True),
        (True, False, True),
        (False, True, True),
        (False, False, False)
    ]

    list_p_xor_q_values = [
        (True, True, False),
        (True, False, True),
        (False, True, True),
        (False, False, False)
    ]

    def cetak_truth_table(list_pq_values):
        for interpretasi in list_pq_values:
            for values in interpretasi:
                if values == 1:
                    hasil = "True"
                else:
                    hasil = "False"

                print('{:<7}'.format((hasil)), end="")

            print("")

    print('{:<7}{:<7}{:<7}'.format(("p"), ("q"), ("p or q")))
    cetak_truth_table(list_p_or_q_values)

    print(" ")

    print('{:<7}{:<7}{:<7}'.format(("p"), ("q"), ("p xor q")))
    cetak_truth_table(list_p_xor_q_values)

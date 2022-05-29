if __name__ == '__main__':
    p = True
    q = False

    print('Truth table')
    print('Proposisi: ' + 'p \u21d4 q')
    print('{:7} {:7} {:7}'.format('p', 'q', 'p \u21d4 q'))
    print('______________________')

    def iff(b1, b2):
        return (b1 and b2) or (not b1 and not b2)

    def boolean_to_tf(masukan):
        if masukan == 'True':
            return 'T'
        else:
            return 'F'

    for x in [p, q]:
        for y in [p, q]:
            print('{:^7} {:^7} {:^7}'.format(boolean_to_tf(str(x)), boolean_to_tf(str(y)), boolean_to_tf(str(iff(x, y)))))

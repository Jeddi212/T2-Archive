if __name__ == '__main__':
    p = True
    q = False

    print('Truth table')
    print('Proposisi: ' + 'p \u21d2 q')
    print('{:7} {:7} {:7}'.format('p', 'q', 'p \u21d2 q'))
    print('______________________')

    def implikasi(b1, b2):
        return (not b1) or b2

    for x in [p, q]:
        for y in [p, q]:
            print('{:^7} {:^7} {:^7}'.format(str(x), str(y), str(implikasi(x, y))))

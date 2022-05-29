if __name__ == '__main__':
    p = True
    q = False

    print('Truth table')
    print('Proposisi: ' + 'p ∨ q')
    print('{:7} {:7} {:7}'.format('p', 'q', 'p ∨ q'))
    print('______________________')

    for x in [p, q]:
        for y in [p, q]:
            print('{:^7} {:^7} {:^7}'.format(str(x), str(y), str(x or y)))

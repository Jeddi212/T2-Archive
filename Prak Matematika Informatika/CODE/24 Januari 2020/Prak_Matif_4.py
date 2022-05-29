if __name__ == '__main__':
    p = True
    q = False

    print('Truth table')
    print('Proposisi: ' + 'p \u2295 q')
    print('{:7} {:7} {:7}'.format('p', 'q', 'p \u2295 q'))
    print('______________________')

    for x in [p, q]:
        for y in [p, q]:
            print('{:^7} {:^7} {:^7}'.format(str(x), str(y), str((x) and (not y) or (not x and y))))

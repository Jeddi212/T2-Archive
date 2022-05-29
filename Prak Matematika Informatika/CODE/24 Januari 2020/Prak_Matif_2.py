if __name__ == '__main__':
    print('Truth table')
    print('Proposisi: ' + 'p \u2228 q')
    print('{:^7} {:^7} {:^7}'.format('p', 'q', 'p ∧ q'))
    print('________________________')

    p = True
    q = True
    #r = True
    r = p and q
    print('{:^7} {:^7} {:^7}'.format(p, q, r))

    p = True
    q = False
    r = p and q
    print('{:^7} {:^7} {:^7}'.format(p, q, r))

    p = False
    q = True
    r = p and q
    print('{:^7} {:^7} {:^7}'.format(p, q, r))

    p = False
    q = False
    r = p and q
    print('{:^7} {:^7} {:^7}'.format(p, q, r))
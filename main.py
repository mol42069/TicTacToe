from enum import Enum


def main():
    running = True
    all_xo = [[' ', ' ', ' '], [' ', ' ', ' '], [' ', ' ', ' ']]
    cur_player = False

    while running:
        next_move = input('Next Move (LineRow): ')
        if 4 < int(next_move[0]) or 1 > int(next_move[0]) \
                or 4 < int(next_move[1]) or 1 > int(next_move[1]):

            print('wrong input!')

        else:
            line = int(next_move[0]) - 1
            arr = all_xo[line]
            row = int(next_move[1]) - 1
            if cur_player:
                arr[row] = 'X'
                cur_player = False
            else:
                arr[row] = 'O'
                cur_player = True

            all_xo[line] = arr
            running = finish_check(all_xo)
            i = 0
            for line in all_xo:
                i += 1
                arr = line
                lines = (f' {arr[0]} | {arr[1]} | {arr[2]}', '-----------')
                if i == 3:
                    print(lines[0])
                else:
                    for lost in lines:
                        print(lost)


def finish_check(all_xo):
    running = True

    return running


main()

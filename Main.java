import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        boolean cur_player = false;
        char[][] all_xo = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        int counter = 0;
        char[] arr = new char[3];
        for(int z = 0; z < 3; z++){
            arr = all_xo[z];
            String[] lines = {String.format(" %s | %s | %s", arr[0], arr[1], arr[2]), "-----------"};
            System.out.println(lines[0]);
            if(z != 2){
                System.out.println(lines[1]);
            }
        }
        while(running){
            if(counter == 9){
                running = false;
                System.out.println("TIE !!!");
            }else{
                int next_move = sc.nextInt();
                counter++;
                int line = next_move/10;
                int row = next_move - line * 10;
                int[] last_move = {line, row};
                arr = all_xo[line];
                if (cur_player){
                    cur_player = false;
                    arr[row] = 'X';
                }else{
                    cur_player = true;
                    arr[row] = 'O';
                }
                all_xo[line] = arr;
                for(int z = 0; z < 3; z++){
                    arr = all_xo[z];
                    String[] lines = {String.format(" %s | %s | %s", arr[0], arr[1], arr[2]), "-----------"};
                    if(z != 2){
                        System.out.println(lines[0]);
                        System.out.println(lines[1]);
                    }else{
                        System.out.println(lines[0]);
                    }
                }
            }
        }
    }
}

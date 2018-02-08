package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char[][] area = new char[3][3];
        Scanner kb = new Scanner(System.in);

        while (true) {

            System.out.print("Крестики - введите номер клетки по горизонтали, начиная с 0: ");
            int a = kb.nextInt();
            System.out.print("Крестики - введите номер клетки по вертикали, начиная с 0:  ");
            int b = kb.nextInt();
            area[a][b] = 'x';

            for (int i = 0; i<3; i++){
                for (int j = 0; j<3; j++){
                    System.out.print(area[i][j]+" | ");
                }
                System.out.println();
            }

            System.out.print("Нолики - введите номер клетки по горизонтали, начиная с 0: ");
            int c = kb.nextInt();
            System.out.print("Нолики - введите номер клетки по вертикали, начиная с 0: : ");
            int d = kb.nextInt();
            area[c][d] = '0';

            for (int i = 0; i<3; i++){
                for (int j = 0; j<3; j++){
                    System.out.print(area[i][j]+" | ");
                }
                System.out.println();
            }



            if (area[0][0] == area[0][1]&& area[0][1] == area[0][2]&&area[0][2]=='x'||area[0][2]=='y'){
                System.out.println("Победили "+area[0][2]);
                break;
            }

            else if (area[0][0] == area[1][0]&& area[1][0] == area[2][0]&&area[2][0]=='x'||area[2][0]=='y'){
                System.out.println("Победили "+area[0][0]);
                break;
            }

            else if (area[0][1] == area[1][1]&& area[1][1] == area[2][1]&&area[2][1]=='x'||area[2][1]=='y'){
                System.out.println("Победили "+area[0][1]);
                break;
            }

            else if (area[2][0] == area[2][1]&& area[2][1] == area[2][2]&&area[2][2]=='x'||area[2][2]=='y'){
                System.out.println("Победили "+area[2][0]);
                break;
            }

            else if (area[0][2] == area[1][2]&& area[1][2] == area[2][2]&&area[2][2]=='x'||area[2][2]=='y'){
                System.out.println("Победили "+area[0][2]);
                break;
            }

            else if (area[0][0] == area[1][1]&& area[1][1] == area[2][2]&&area[2][2]=='x'||area[2][2]=='y'){
                System.out.println("Победили "+area[0][0]);
                break;
            }

            else if (area[1][0] == area[1][1]&& area[1][1] == area[2][2]&&area[2][2]=='x'||area[2][2]=='y'){
                System.out.println("Победили "+area[1][0]);
                break;
            }

            else if (area[0][2] == area[1][1]&& area[1][1] == area[2][0]&&area[0][2]=='x'||area[0][2]=='y'){
                System.out.println("Победили "+area[0][2]);
                break;
            }
        }
    }
}

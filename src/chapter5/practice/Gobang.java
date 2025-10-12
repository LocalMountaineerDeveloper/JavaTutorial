package chapter5.practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 简易五子棋
 *
 */
public class Gobang
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        boolean finish=false; // 游戏是否结束
        int turn=1; // 当前下棋者标记,1则PLAYER1下棋，-1则PLAYER2下棋
        int x=0, y=0; // 当前棋子的横纵坐标
        final char PLAYER1='*';// 玩家1使用的字符
        final char PLAYER2='o';// 玩家2使用的字符
        final char EMPTY='-'; // 空棋盘使用的字符

        /* 棋盘初始化 */
        char checkerboard[][]=new char[15][15];
        for(int i=0;i<checkerboard.length;i++)
        {
            Arrays.fill(checkerboard[i],EMPTY);
        }

        game:
        while(!finish)
        {
            /* 打印棋盘 */
            System.out.println("---------------------------------");
            System.out.println("  0 1 2 3 4 5 6 7 8 9 A B C D E");
            for(int i=0;i<checkerboard.length;i++)
            {
                if(i<10)
                {
                    System.out.print(i+" ");
                }
                else
                {
                    System.out.print((char)('A'-10+i)+" ");
                }
                for(int j=0;j<checkerboard[i].length;j++)
                {
                    System.out.print(checkerboard[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("---------------------------------");

            /* 判断当前下棋者 */
            if(turn==1)
            {
                System.out.println("请"+PLAYER1+"棋输入棋子坐标：");
            }else
            {
                System.out.println("请"+PLAYER2+"棋输入棋子坐标：");
            }

            /* 输入棋子坐标 */
            String str=sc.nextLine();

            if(str.charAt(0)>='A' && str.charAt(0)<='E')
            {
                x=(int)(str.charAt(0)-'A')+10;
            }
            else if(str.charAt(0)>='0' && str.charAt(0)<='9')
            {
                x=Integer.parseInt(String.valueOf(str.charAt(0)));
            }

            if(str.charAt(1)>='A' && str.charAt(1)<='E')
            {
                y=(int)(str.charAt(1)-'A')+10;
            }
            else if(str.charAt(1)>='0' && str.charAt(1)<='9')
            {
                y=Integer.parseInt(String.valueOf(str.charAt(1)));
            }

            /* 判断坐标是否在棋盘之内 */
            if(x<0 || x>14 || y<0 || y>14)
            {
                System.out.println("***您输入的坐标有误请重新输入！***");
                continue;
            }

            /* 判断坐标上是否有棋子 */
            if(checkerboard[x][y]==EMPTY)
            {
                if(turn==1)
                {
                    checkerboard[x][y]=PLAYER1;
                }else
                {
                    checkerboard[x][y]=PLAYER2;
                }
            }else
            {
                System.out.println("***您输入位置已经有其他棋子，请重新选择！***");
                continue;
            }

            /* 五子棋输赢算法那*/
            for(int i=0;i<checkerboard.length;i++)
            {
                for(int j=0;j<checkerboard[i].length;j++)
                {
                    char flagch=checkerboard[i][j];
                    if(flagch==EMPTY)
                    {// 如果此处没有棋子
                        continue;// 不进行输赢判断
                    }
                    /* 判断棋子左侧 */
                    if(j-4>=0)
                    {
                        if(checkerboard[i][j-1]==flagch
                                && checkerboard[i][j-2]==flagch
                                && checkerboard[i][j-3]==flagch
                                && checkerboard[i][j-4]==flagch)
                        {
                            finish=true;
                            break game;
                        }
                    }

                    /* 判断棋子右侧 */
                    if(j+4<=14)
                    {
                        if(checkerboard[i][j+1]==flagch
                                && checkerboard[i][j+2]==flagch
                                && checkerboard[i][j+3]==flagch
                                && checkerboard[i][j+4]==flagch)
                        {
                            finish=true;
                            break game;
                        }
                    }
                    /* 判断棋子上方 */
                    if(i-4>=0)
                    {
                        if(checkerboard[i-1][j]==flagch
                                && checkerboard[i-2][j]==flagch
                                && checkerboard[i-3][j]==flagch
                                && checkerboard[i-4][j]==flagch)
                        {
                            finish=true;
                            break game;
                        }
                    }
                    /* 判断棋子下方 */
                    if(i+4<=14)
                    {
                        if(checkerboard[i+1][j]==flagch
                                && checkerboard[i+2][j]==flagch
                                && checkerboard[i+3][j]==flagch
                                && checkerboard[i+4][j]==flagch)
                        {
                            finish=true;
                            break game;
                        }
                    }
                    /* 判断棋子西北 */
                    if(i-4>=0 && j-4>=0)
                    {
                        if(checkerboard[i-1][j-1]==flagch
                                && checkerboard[i-2][j-2]==flagch
                                && checkerboard[i-3][j-3]==flagch
                                && checkerboard[i-4][j-4]==flagch)
                        {
                            finish=true;
                            break game;
                        }
                    }
                    /* 判断棋子西南 */
                    if(i+4<=14 && j-4>=0)
                    {
                        if(checkerboard[i+1][j-1]==flagch
                                && checkerboard[i+2][j-2]==flagch
                                && checkerboard[i+3][j-3]==flagch
                                && checkerboard[i+4][j-4]==flagch)
                        {
                            finish=true;
                            break game;
                        }
                    }
                    /* 判断棋子东北 */
                    if(i-4>=0 && j+4<=14)
                    {
                        if(checkerboard[i-1][j+1]==flagch
                                && checkerboard[i-2][j+2]==flagch
                                && checkerboard[i-3][j+3]==flagch
                                && checkerboard[i-4][j+4]==flagch)
                        {
                            finish=true;
                            break game;
                        }
                    }
                    /* 判断棋子东南 */
                    if(i+4<=14 && j+4<=14)
                    {
                        if(checkerboard[i+1][j+1]==flagch
                                && checkerboard[i+2][j+2]==flagch
                                && checkerboard[i+3][j+3]==flagch
                                && checkerboard[i+4][j+4]==flagch)
                        {
                            finish=true;
                            break game;
                        }
                    }
                }
            }
            turn*=-1; // 更换下棋者标记
        }

        /* 输出最后胜利的棋盘 */
        System.out.println("---------------------------------");
        System.out.println("  0 1 2 3 4 5 6 7 8 9 A B C D E");
        for(int i=0;i<checkerboard.length;i++)
        {
            if(i<10)
            {
                System.out.print(i+" ");
            }
            else
            {
                System.out.print((char)('A'-10+i)+" ");
            }
            for(int j=0;j<checkerboard[i].length;j++)
            {
                System.out.print(checkerboard[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------");
        /* 输出赢家 */
        if(turn==1)
        {
            System.out.println(PLAYER1+"棋胜利！");
        }else
        {
            System.out.println(PLAYER2+"棋胜利！");
        }
        sc.close();
    }
}

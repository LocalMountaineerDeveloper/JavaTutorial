/*
 * 推箱子：H表示墙壁，&表示玩家角色，o表示箱子，*表示目的地，WASD控制角色移动。
 * */

package chapter5.practice;

import java.util.Scanner;

public class Sokoban
{

    public static void main(String[] args)
    {
        char map[][]=new char[8][10];// 地图
        Scanner sc=new Scanner(System.in);// 控制台输入扫描器
        int x=1, y=1;// 玩家角色坐标
        boolean finish=false;// 游戏是否结束

        for(int i=0;i<map.length;i++)
        {// 地图外边墙壁
            if(i==0 || i==7)
            {
                for(int j=0;j<map[i].length;j++)
                {
                    map[i][j]='H';
                }
            }else
            {
                map[i][0]='H';
                map[i][9]='H';
            }
        }
        map[1][3]='H';// 地图内墙壁
        map[2][3]='H';
        map[3][3]='H';
        map[2][5]='H';
        map[3][5]='H';
        map[3][6]='H';
        map[3][8]='H';
        map[4][8]='H';
        map[6][4]='H';
        map[5][4]='H';
        map[5][5]='H';
        map[5][6]='H';
        map[x][y]='&';// 玩家角色
        map[2][2]='o';// 箱子
        map[6][5]='*';// 目的地

        while(true)
        {// 循环游戏
            /* 打印游戏画面 */
            System.out.println("--------------------");
            for(char row[] : map)
            {
                for(char column : row)
                {
                    System.out.print(column+" ");
                }
                System.out.println();
            }
            System.out.println("--------------------");

            if(finish)
            {// 如果游戏结束则停止循环
                break;
            }

            System.out.println("A左移，D右移，W上移，S下移，请输入你的指令：");
            String code=sc.nextLine();// 获取玩家输入的指令

            switch(code.toLowerCase())
            {// 将执行转为小写并判断
                case "a":// 如果输入的是a
                    if(map[x][y-1]==0)
                    {// 如果玩家左边是空区
                        map[x][y]=0;// 原位置变为空区
                        map[x][y-1]='&';// 玩家移动到新位置
                        y--;// 玩家坐标左移
                    }else if(map[x][y-1]=='o')
                    {// 如果玩家左边是箱子
                        if(map[x][y-2]!='H')
                        {// 如果箱子左边不是墙
                            if(map[x][y-2]=='*')
                            {// 如果箱子左边是目的地
                                finish=true;// 游戏结束
                            }
                            map[x][y]=0;// 原位置变为空区
                            map[x][y-1]='&';// 玩家移动到新位置
                            map[x][y-2]='o';// 箱子移动到新位置
                            y--;// 玩家位置左移
                        }
                    }
                    break;// 结束判断
                case "d":// 如果输入的是d
                    if(map[x][y+1]==0)
                    {// 如果玩家右边是空区
                        map[x][y]=0;// 原位置变为空区
                        map[x][y+1]='&';// 玩家移动到新位置
                        y++;// 玩家坐标右移
                    }else if(map[x][y+1]=='o')
                    {// 如果玩家右边是箱子
                        if(map[x][y+2]!='H')
                        {// 如果箱子右边不是墙
                            if(map[x][y+2]=='*')
                            {// 如果箱子右边是目的地
                                finish=true;// 游戏结束
                            }
                            map[x][y]=0;// 原位置变为空区
                            map[x][y+1]='&';// 玩家移动到新位置
                            map[x][y+2]='o';// 箱子移动到新位置
                            y++;// 玩家坐标右移
                        }
                    }
                    break;// 结束判断
                case "w":// 如果输入的是w
                    if(map[x-1][y]==0)
                    {// 如果玩家上方是空区
                        map[x][y]=0;// 原位置变为空区
                        map[x-1][y]='&';// 玩家移动到新位置
                        x--;// 玩家坐标上移
                    }else if(map[x-1][y]=='o')
                    {// 如果玩家上方是箱子
                        if(map[x-2][y]!='H')
                        {// 如果箱子上方不是墙
                            if(map[x-2][y]=='*')
                            {// 如果箱子上方是目的地
                                finish=true;// 游戏结束
                            }
                            map[x][y]=0;// 原位置变为空区
                            map[x-1][y]='&';// 玩家移动到新位置
                            map[x-2][y]='o';// 箱子移动到新位置
                            x--;// 玩家坐标上移
                        }
                    }
                    break;// 结束判断
                case "s":// 如果输入的是s
                    if(map[x+1][y]==0)
                    {// 如果玩家下方是空区
                        map[x][y]=0;// 原位置变为空区
                        map[x+1][y]='&';// 玩家移动到新位置
                        x++;// 玩家坐标下移
                    }else if(map[x+1][y]=='o')
                    {// 如果玩家下方是箱子
                        if(map[x+2][y]!='H')
                        {// 如果箱子下方不是墙
                            if(map[x+2][y]=='*')
                            {// 如果箱子下方是目的地
                                finish=true;// 游戏结束
                            }
                            map[x][y]=0;// 原位置变为空区
                            map[x+1][y]='&';// 玩家移动到新位置
                            map[x+2][y]='o';// 箱子移动到新位置
                            x++;// 玩家坐标下移
                        }
                    }
                    break;// 结束判断
                default:// 如果输入的是其他指令
                    System.out.println("您输入的指令有误！");
            }

        }
        System.out.println("游戏结束");
        sc.close();
    }

}

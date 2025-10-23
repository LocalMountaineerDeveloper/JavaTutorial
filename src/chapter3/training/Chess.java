/*
 * 象棋口诀：先用char型变量定义“马”、“象”、“卒”这3个棋子，再输出“马走日，象走田，小卒一去不复还的象棋口诀
 * */

package chapter3.training;

public class Chess
{
    public static void main(String[] args)
    {
        char knight='马';
        char bishop='象';
        char pawn='卒';
        System.out.println(knight+"走日，"+bishop+"田，小"+pawn+"一去不回还。");
    }
}

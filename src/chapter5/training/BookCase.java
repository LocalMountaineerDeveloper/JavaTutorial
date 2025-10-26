/*
 * 模拟书柜放书：书柜有3层2列，第1层第1列放入历史类读物，第2层第1列放入经济类读物，第2层第2列放入现代科学类读物，创建一个二维数组并赋值。
 * */

package chapter5.training;

public class BookCase
{
    public static void main(String[] args)
    {
        String[][] bookshelf=new String[3][2];
        bookshelf[0][0]="历史类读物";
        bookshelf[1][0]="经济类读物";
        bookshelf[1][1]="科学类读物";
        System.out.println("向该书柜第1层第1列放入"+bookshelf[0][0]);
        System.out.println("向该书柜第2层第1列放入"+bookshelf[1][0]);
        System.out.println("向该书柜第2层第2列放入"+bookshelf[1][1]);
    }
}

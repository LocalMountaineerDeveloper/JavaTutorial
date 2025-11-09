/*
* 删除指定学生：在数据表中删除出生日期在“1996-01-01”之前的学生。
* */

package chapter17.practice;

import java.sql.*;

public class DeleteStu
{
    static Connection con;
    static PreparedStatement sql;
    static ResultSet res;

    public Connection getConnection()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        try
        {
            con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/tutorial?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=Asia/Shanghai" +
                    "&zeroDateTimeBehavior=CONVERT_TO_NULL&allowPublicKeyRetrieval=true","root","admin");
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        return con;
    }

    public static void main(String[] args)
    {
        DeleteStu c=new DeleteStu();
        con=c.getConnection();
        try
        {
            sql=con.prepareStatement("DELETE FROM tb_stu WHERE birthday < ?");
            sql.setString(1,"1996-01-01");
            sql.executeUpdate();
            System.out.println("数据删除完毕。");
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}

/*
* 创建数据表：在数据库中创建一个表tb_emp。
* */

package chapter17.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable
{
    public static void main(String[] args)
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
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/tutorial?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=Asia/Shanghai" +
        "&zeroDateTimeBehavior=CONVERT_TO_NULL&allowPublicKeyRetrieval=true","root","admin");
            Statement stmt=con.createStatement();
            String sql="CREATE TABLE tb_emp(id int,name varchar(10),sex char(1),birth date,dept varchar(20))";
            stmt.executeUpdate(sql);
            con.close();
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        System.out.println("创建完毕。");
    }
}

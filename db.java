/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.pro;

/**
 *
 * @author Thaaarushri
 */
public class db {
    
    Connection con=null;
    try{
    Class.forName("com.mysql.jdho.Driver");
    con=DriverManager.getConnection("jdbc:mysql//localhost/pos","root"."");
    
    
}
    catch(ClassNotFoundException | SQLException e)
    {
        System.out.println(e);
        return null;
        
    }
    
}

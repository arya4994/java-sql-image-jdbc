//import java.sql.*;
//
//
//public class RetriveName {
//    public static void main(String[] args) throws SQLException {
//        Connection con =ConnectionProvider.getConnection();
//        Statement smt = con.createStatement();
//        ResultSet set =smt.executeQuery("Select * from demotable1");
//        while(set.next())
//        {
//            int id = set.getInt(1);
//            String name =set.getString(2);
//            System.out.println(id+"|"+name);
//
//        }
//
//    }
//}

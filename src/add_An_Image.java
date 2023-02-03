import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.sql.*;

public class add_An_Image {
    public static void main(String[] args)  {
        Connection con = ConnectionProvider.getConnection();
        try {
            PreparedStatement psmt = con.prepareStatement("insert into image(image) values (?)");
            JFileChooser jfc = new JFileChooser();
            jfc.showOpenDialog(null);
            File file = jfc.getSelectedFile();
            FileInputStream fis = new FileInputStream(file);
            psmt.setBinaryStream(1,fis,fis.available());
            psmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Image Added Successfully");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }

}



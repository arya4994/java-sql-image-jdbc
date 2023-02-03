import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.InputStream;
import java.sql.*;

public class Helper {
   private static ImageIcon icon=null;
    public static ImageIcon getImagebyId (int id , Connection con)
    {
        try {
            PreparedStatement psmt = con.prepareStatement("Select image from image where id=?");
            psmt.setInt(1, id);
            ResultSet set =  psmt.executeQuery();
            if(set.next())
            {
                Blob b= set.getBlob("image");
                InputStream is = b.getBinaryStream();
                Image image = ImageIO.read(is);
                icon =new ImageIcon(image);
            }
            else {
                icon=null;
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return icon;

    }
}

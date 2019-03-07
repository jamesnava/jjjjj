
package funciones;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.Blob;
import javax.imageio.ImageIO;


public class func_imagen {
    
    public Image RetornarImagen(Blob valor)
    {
        BufferedImage img=null;
        try {
            byte[]valores=valor.getBytes(1, (int)valor.length());
            img=ImageIO.read(new ByteArrayInputStream(valores));
        } catch (Exception e) {
        }
        return img;
    }
}


package funciones;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import javax.swing.JPanel;


public class ImprimirA4 implements Printable{
    JPanel panel1;
    public ImprimirA4(JPanel panel){
        panel1=panel;
    }

    @Override
    public int print(Graphics graphics, PageFormat pf, int index) throws PrinterException {
       
        if(index>0){
            return NO_SUCH_PAGE;}
       Graphics2D g2d=(Graphics2D)graphics;
         g2d.scale(0.7, 0.7);
         g2d.translate(pf.getWidth()/2-panel1.getWidth()/3, pf.getImageableY()+20);
        
        panel1.printAll(graphics);
        return PAGE_EXISTS;
    }
    
}

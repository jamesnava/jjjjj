
package funciones;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;


public class PintarFilaTabla extends DefaultTableCellRenderer{

      

@Override
public Component getTableCellRendererComponent(JTable table, Object value, boolean Selected, boolean hasFocus, int row, int col){

    
    
super.getTableCellRendererComponent(table, value, Selected, hasFocus, row, col);


    if (Integer.parseInt(table.getValueAt(row,2).toString())==0) {

         setBackground(Color.RED);

    } 
    if(Integer.parseInt(table.getValueAt(row,2).toString())<=10 && Integer.parseInt(table.getValueAt(row,2).toString())>0 ){
        setBackground(Color.ORANGE);
    }
    if(Integer.parseInt(table.getValueAt(row,2).toString())>10){
        setBackground(Color.WHITE);
    }
        


 return this;


}





}

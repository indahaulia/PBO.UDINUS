/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Dinozera
 */
public class TabelSewaBuku  extends AbstractTableModel{
    List<TableVariable> list_sewaBuku;

     public TabelSewaBuku(List<TableVariable> list_sewaBuku){
        this.list_sewaBuku = list_sewaBuku;
    }
     
    @Override
    public int getRowCount() {
         return this.list_sewaBuku.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex){
                case 0:
                    return list_sewaBuku.get(rowIndex).id;
                    case 1:
                    return list_sewaBuku.get(rowIndex).judul;
                    case 2:
                    return list_sewaBuku.get(rowIndex).tanggal_pinjam;
                    case 3:
                    return list_sewaBuku.get(rowIndex).tanggal_harus_kembali;
                    case 4:
                    return list_sewaBuku.get(rowIndex).tanggal_kembali;
                    case 5:
                    return list_sewaBuku.get(rowIndex).denda;
                    case 6:
                    return list_sewaBuku.get(rowIndex).biaya_sewa;
                default :
                    return null;
            }
    }
    
     @Override
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "ID";
            case 1:
                return "Judul";
            case 2:
                return "Tanggal Pinjam";
            case 3:
                return "Tanggal Harus Kembali";
            case 4:
                return "Tanggal Kembali";
            case 5:
                return "Denda";
            case 6:
                return "Biaya Sewa";
            default :
                return null;
        }
    }
}

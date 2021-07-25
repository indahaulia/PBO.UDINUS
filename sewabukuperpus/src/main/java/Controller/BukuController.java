/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Fungsi.FungsiCrud;
import Model.TabelSewaBuku;
import Model.TableVariable;
import Tampilan.TampilanGui;
import java.util.List;
import InterfaceTabel.InterfaceSewaBuku;

/**
 *
 * @author Dinozera
 */
public class BukuController {
    
    public BukuController(TampilanGui _tampil){
        this._tampilan = _tampil;
        iDAOSewaBuku = new FungsiCrud();
    }
    
    public void IsiTable(){
      list_sewaBuku = iDAOSewaBuku.GetAll();
      TabelSewaBuku tabelSewaBuku = new TabelSewaBuku(list_sewaBuku);
      _tampilan.GetTabelData().setModel(tabelSewaBuku);
        
    }
       
    TampilanGui _tampilan;
    InterfaceSewaBuku iDAOSewaBuku;
    List<TableVariable> list_sewaBuku;
}

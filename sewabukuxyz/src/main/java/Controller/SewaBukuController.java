/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import FungsiCrud.CrudSewaBuku;
import Model.TabelSewaBuku;
import Model.TableVariable;
import Tampilan.tampilanGUI;
import java.util.List;
import InterfaceTable.InterfaceSewaBuku;

/**
 *
 * @author IndahAulia
 */
public class SewaBukuController {
    
    public SewaBukuController(tampilanGUI _tampil){
        this._tampilan = _tampil;
        iDAOSewaBuku = new CrudSewaBuku();
    }
    
      public void IsiTable(){
      list_sewaBuku = iDAOSewaBuku.GetAll();
      TabelSewaBuku tabelSewaBuku = new TabelSewaBuku(list_sewaBuku);
      _tampilan.GetTabelData().setModel(tabelSewaBuku);
        
    }
       
       tampilanGUI _tampilan;
       InterfaceSewaBuku iDAOSewaBuku;
       List<TableVariable> list_sewaBuku;
}

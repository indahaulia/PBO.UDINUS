/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tampilan;
import Controller.BukuController;
import Fungsi.FungsiCrud;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;

/**
 *
 * @author Dinozera
 */
public class TampilanGui extends javax.swing.JFrame {

    /**
     * Creates new form tampilan
     */
    public TampilanGui() {
        initComponents();
        waktu();
        CreateTable();
        Tampil_Jam();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        tf_judul = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        total_biaya = new javax.swing.JLabel();
        lbl_harga = new javax.swing.JLabel();
        btn_simpan = new javax.swing.JButton();
        btn_kembali = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_buku = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_tanggal = new javax.swing.JLabel();
        label_jam = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Judul : ");

        tf_judul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_judulActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Biaya : ");

        total_biaya.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        total_biaya.setText("Rp");

        btn_simpan.setBackground(new java.awt.Color(66, 185, 245));
        btn_simpan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_simpan.setForeground(new java.awt.Color(255, 255, 255));
        btn_simpan.setText("Simpan");
        btn_simpan.setAlignmentY(0.0F);
        btn_simpan.setIconTextGap(0);
        btn_simpan.setInheritsPopupMenu(true);
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_kembali.setBackground(new java.awt.Color(66, 185, 245));
        btn_kembali.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_kembali.setForeground(new java.awt.Color(255, 255, 255));
        btn_kembali.setText("Kembalikan Buku");
        btn_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kembaliActionPerformed(evt);
            }
        });

        btn_edit.setBackground(new java.awt.Color(66, 185, 245));
        btn_edit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_edit.setForeground(new java.awt.Color(255, 255, 255));
        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(66, 185, 245));
        btn_delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        tabel_buku.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabel_buku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Judul Buku", "Tanggal Pinjam", "Tanggal Harus Kembali", "Tanggal Kembali", "Denda", "Biaya Sewa"
            }
        ));
        tabel_buku.setToolTipText("");
        tabel_buku.setInheritsPopupMenu(true);
        tabel_buku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_bukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_buku);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Tanggal : ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Jam : ");

        lbl_tanggal.setText("tanggal");

        label_jam.setText("jam");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_tanggal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_jam)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(lbl_tanggal)
                    .addComponent(label_jam))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Persewaan Buku XYZ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_judul, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(total_biaya)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_harga))
                            .addComponent(jLabel4)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn_simpan)
                            .addGap(36, 36, 36)
                            .addComponent(btn_kembali)
                            .addGap(37, 37, 37)
                            .addComponent(btn_edit)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                            .addComponent(btn_delete))))
                .addGap(159, 159, 159))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_judul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total_biaya)
                    .addComponent(lbl_harga))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_simpan)
                    .addComponent(btn_kembali)
                    .addComponent(btn_edit)
                    .addComponent(btn_delete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
       String _judulBuku = tf_judul.getText().trim();
       if(_judulBuku.equals(""))
       {
           JOptionPane.showMessageDialog(this, "Input judul tidak boleh kosong!!","fail",JOptionPane.ERROR_MESSAGE);
           return;
       }
       FungsiCrud DAO = new FungsiCrud();
       SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dddd");
       
       String _tgl_Pinjam = formatter.format(tanggal);
       
       //bikin tanggal kembali
       Calendar c = Calendar.getInstance();
       c.setTime(tanggal);
       c.add(Calendar.DATE, 7);
       String _tgl_Kembali = formatter.format(c.getTime());
       DAO.InserNewData(_judulBuku, _tgl_Pinjam, _tgl_Kembali);
        JOptionPane.showMessageDialog(this, "Data berhasil dibuat!!");
        CreateTable();
        id_selected = 0;
                   tf_judul.setText("");
                    total_biaya.setText("Rp");
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kembaliActionPerformed
       if(id_selected != 0){
           //kalau masih kosong
           if(tgl_kembali_selected.equals("")){
               FungsiCrud dao = new FungsiCrud();
               try {
                   dao.KembalikanBuku(id_selected);
                    JOptionPane.showMessageDialog(this, "Buku berhasil dikembalikan!!");
                   CreateTable();
                   id_selected = 0;
                   tf_judul.setText("");
                    total_biaya.setText("Rp");
               } catch (ParseException ex) {
                   Logger.getLogger(TampilanGui.class.getName()).log(Level.SEVERE, null, ex);
               }
           }else{
               JOptionPane.showMessageDialog(this, "Buku sudah dikembalikan","warning",JOptionPane.WARNING_MESSAGE);
           }
       }
       else{
             JOptionPane.showMessageDialog(this, "Tidak ada data yang terpilih","error",JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_btn_kembaliActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        if(id_selected != 0){
            
            //cek apakah sudah dikembalikan
            if(tgl_kembali_selected.equals("")){
                //cek apakah judul kosong
           String _judulBuku = tf_judul.getText();
           if(_judulBuku.equals("")){
                JOptionPane.showMessageDialog(this, "Input judul tidak boleh kosong!!","error",JOptionPane.ERROR_MESSAGE);
           return;
           }
           else{
               FungsiCrud dao = new FungsiCrud();
               dao.UpdateData(id_selected, _judulBuku);
               JOptionPane.showMessageDialog(this, "Data berhasil terupdate!!");
        CreateTable();
         id_selected = 0;
                   tf_judul.setText("");
                    total_biaya.setText("Rp");
           }
            }
            else{
                 JOptionPane.showMessageDialog(this, "Buku sudah dikembalikan, data tidak dapat diedit","warning",JOptionPane.WARNING_MESSAGE);
            }
            
           
        }
        else{
            JOptionPane.showMessageDialog(this, "Tidak ada data yang terpilih","error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
          if(id_selected != 0){
               FungsiCrud dao = new FungsiCrud();
               dao.DeleteData(id_selected);
               JOptionPane.showMessageDialog(this, "Data berhasil terhapus!!");
        CreateTable();
         id_selected = 0;
                   tf_judul.setText("");
                    total_biaya.setText("Rp");
           }else{
              JOptionPane.showMessageDialog(this, "Tidak ada data yang terpilih","error",JOptionPane.ERROR_MESSAGE);
          }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void tf_judulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_judulActionPerformed
       
    }//GEN-LAST:event_tf_judulActionPerformed

    private void tabel_bukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_bukuMouseClicked
       int row = tabel_buku.rowAtPoint(evt.getPoint());
       id_selected = (int)tabel_buku.getValueAt(row,0);
       tf_judul.setText(tabel_buku.getValueAt(row, 1).toString());
       tgl_kembali_selected = tabel_buku.getValueAt(row, 4).toString();
       int denda = (int)tabel_buku.getValueAt(row, 5);
       int sewa = (int)tabel_buku.getValueAt(row, 6);
       total_biaya.setText("Rp " +(denda+sewa));
    }//GEN-LAST:event_tabel_bukuMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TampilanGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TampilanGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TampilanGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TampilanGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TampilanGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_kembali;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_jam;
    private javax.swing.JLabel lbl_harga;
    private javax.swing.JLabel lbl_tanggal;
    private javax.swing.JTable tabel_buku;
    private javax.swing.JTextField tf_judul;
    private javax.swing.JLabel total_biaya;
    // End of variables declaration//GEN-END:variables

    //variable
    BukuController c_sewaBuku;
    SimpleDateFormat format_tanggal;
    SimpleDateFormat format_jam;
    Date tanggal;
    int id_selected;
    String tgl_kembali_selected;
    int biaya_sewa = 5000;
    
        void waktu() {
        format_tanggal = new SimpleDateFormat("dd MMMM yyyy");
        format_jam = new SimpleDateFormat("HH:mm");
        tanggal = new Date();
        lbl_tanggal.setText(format_tanggal.format(tanggal));
        label_jam.setText(format_jam.format(tanggal));
    }
    
      public JTable GetTabelData(){
         return tabel_buku;
     }
    
     //fungsi menampilkan tabel hasil panen
     public void CreateTable(){
          c_sewaBuku = new BukuController(this);
          c_sewaBuku.IsiTable();
     }
     
     public void Tampil_Jam(){
        ActionListener taskPerformer = new ActionListener() {
 
        @Override
            public void actionPerformed(ActionEvent evt) {
            String nol_jam = "", nol_menit = "",nol_detik = "";
 
            java.util.Date dateTime = new java.util.Date();
            int nilai_jam = dateTime.getHours();
            int nilai_menit = dateTime.getMinutes();
            int nilai_detik = dateTime.getSeconds();
 
            if(nilai_jam <= 9) nol_jam= "0";
            if(nilai_menit <= 9) nol_menit= "0";
            if(nilai_detik <= 9) nol_detik= "0";
 
            String jam = nol_jam + Integer.toString(nilai_jam);
            String menit = nol_menit + Integer.toString(nilai_menit);
            String detik = nol_detik + Integer.toString(nilai_detik);
 
            label_jam.setText(jam+":"+menit+":"+detik+"");
            }
        };
    new Timer(1000, taskPerformer).start();
    }
}
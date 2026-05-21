/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import view.DlgCadastrarAdicionarJogo;
import view.DlgCadastrarCliente;
import view.DlgPagamento;
import view.DlgPesquisarCliente;
import view.frmPrincipal;


/**
 *
 * @author strik
 */
public class GerenciadorInterfaceGrafica {
    
    private frmPrincipal janPrinc = null;
    private DlgCadastrarCliente janCadastrarCliente = null;
    private DlgCadastrarAdicionarJogo janCadastrarAdicionarJogo = null;
    private DlgPesquisarCliente janPesqCliente = null;
    private DlgPagamento janpagamento = null;
    
    private GerenciadorDominio gerDominio;
    
    // ## SINGLETON ###
    
    private static GerenciadorInterfaceGrafica myInstance = new GerenciadorInterfaceGrafica();
    
    
    private GerenciadorInterfaceGrafica (){
        try {
            gerDominio = new GerenciadorDominio();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Inicialização", JOptionPane.ERROR_MESSAGE);
            System.exit(-1);
        }
    }           

    public static GerenciadorInterfaceGrafica getMyInstance() {
        return myInstance;
    }
    
    // ### FIM do SINGLETON
    
    
    // ABRIR JDIALOG
    private JDialog abrirJanela(Frame parent, JDialog dlg, Class classe) {
        if (dlg == null){     
            try {
                dlg = (JDialog) classe.getConstructor(Frame.class, boolean.class).newInstance(parent,true);                                
            } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                JOptionPane.showMessageDialog(parent, "Erro ao abrir a janela " + classe.getName() + ". " + ex.getMessage() );
            } 
        }               
        dlg.setVisible(true); 
        return dlg;    
    }
    
    public void abrirPrincipal() {
        if ( janPrinc == null) {
            janPrinc = new frmPrincipal();
        }
        janPrinc.setVisible(true);
    }
    
    public void abrirCadCliente() {
        abrirJanela(janPrinc, janCadastrarCliente, DlgCadastrarCliente.class);
    }
    
    public void abrirCadPedido() {
        abrirJanela(janPrinc, janCadastrarAdicionarJogo, DlgCadastrarAdicionarJogo.class);
    }
    
    public void abrirPesqCliente() {
        abrirJanela(janPrinc, janPesqCliente, DlgPesquisarCliente.class);
    }

    public void abrirFerramentas() {
        abrirJanela(janPrinc, janpagamento, DlgPagamento.class);
    }    
    
    
    
        
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            // Logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        // TRADUÇÃO
        javax.swing.UIManager.put("OptionPane.yesButtonText", "Sim"); 
        javax.swing.UIManager.put("OptionPane.noButtonText", "Não");
        javax.swing.UIManager.put("OptionPane.cancelButtonText", "Cancelar");
        
        
        /* Create and display the form */
        GerenciadorInterfaceGrafica.getMyInstance().abrirPrincipal();
    }
    
}

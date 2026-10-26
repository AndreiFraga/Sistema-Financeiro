/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import view.TelaCadastro;
import view.TelaConsulta;

/**
 *
 * @author Discentes
 */
public class ControladorTela {
    JDesktopPane jDesktop;

    public ControladorTela(JDesktopPane jDesktop) {
        this.jDesktop = jDesktop;
    }
    
    public void abrirTelaInicial(){
        jDesktop.removeAll();
        jDesktop.updateUI();
    }
    
    public void abrirTelaCadastro(){
        jDesktop.removeAll();
        jDesktop.updateUI();
        Dimension resolucao = jDesktop.getSize();
        TelaCadastro tela1 = new TelaCadastro();
        tela1.setSize(resolucao);
        tela1.setLocation(0, 0);
        jDesktop.add(tela1);
        tela1.setVisible(true);
    }
    
    public void abrirTelaConsulta(){
        jDesktop.removeAll();
        jDesktop.updateUI();
        Dimension resolucao = jDesktop.getSize();
        TelaConsulta tela2 = new TelaConsulta();
        tela2.setSize(resolucao);
        tela2.setLocation(0, 0);
        jDesktop.add(tela2);
        tela2.setVisible(true);
    }
    
}

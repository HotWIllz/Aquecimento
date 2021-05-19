/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aquecimento;

import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class Veiculo {
    private String m[] = new String[3];
    private String a[] = new String[3];
    

    public void cadastroVeiculo() {
        
        String result = "";
        String pesquisa = "";

        for (int i = 0; i < m.length; i++) {
            m[i] = JOptionPane.showInputDialog("Digite a marca " + (i));
            a[i] = JOptionPane.showInputDialog("Digite o modelo " + (i));
            result += m[i] + ": " + a[i] + "\n";
        }
        
        JOptionPane.showMessageDialog(null, result);

        int indice = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 0, 1 ou 2"));
        JOptionPane.showMessageDialog(null, m[indice] + a[indice]);

    }

}

/*
 * Created by JFormDesigner on Wed Oct 29 10:10:11 SGT 2025
 */

package view;

import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Asus
 */
public class KerjakanQuiz extends JFrame {
    public KerjakanQuiz() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Ghendida
        SoalKerjakan = new JTextField();
        NamaSoalKerjakan = new JTextField();
        PilganA = new JCheckBox();
        PilganB = new JCheckBox();
        PilganC = new JCheckBox();
        PilganD = new JCheckBox();
        TombolNextKerjakan = new JButton();
        TombolKembaliKerjakan = new JButton();
        TombolSimpanKerjakan = new JButton();

        //======== this ========
        var contentPane = getContentPane();

        //---- PilganA ----
        PilganA.setText("A");

        //---- PilganB ----
        PilganB.setText("B");

        //---- PilganC ----
        PilganC.setText("C");

        //---- PilganD ----
        PilganD.setText("D");

        //---- TombolNextKerjakan ----
        TombolNextKerjakan.setText("Next");

        //---- TombolKembaliKerjakan ----
        TombolKembaliKerjakan.setText("Kembali");

        //---- TombolSimpanKerjakan ----
        TombolSimpanKerjakan.setText("Simpan");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(PilganA)
                            .addGap(49, 49, 49)
                            .addComponent(PilganB)
                            .addGap(51, 51, 51)
                            .addComponent(PilganC)
                            .addGap(45, 45, 45)
                            .addComponent(PilganD)
                            .addGap(29, 29, 29)
                            .addComponent(TombolKembaliKerjakan)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(TombolNextKerjakan)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(TombolSimpanKerjakan))
                        .addComponent(SoalKerjakan, GroupLayout.PREFERRED_SIZE, 617, GroupLayout.PREFERRED_SIZE)
                        .addComponent(NamaSoalKerjakan, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(38, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(NamaSoalKerjakan, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(SoalKerjakan, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
                    .addGap(22, 22, 22)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(PilganA)
                        .addComponent(PilganB)
                        .addComponent(PilganC)
                        .addComponent(PilganD)
                        .addComponent(TombolNextKerjakan)
                        .addComponent(TombolKembaliKerjakan)
                        .addComponent(TombolSimpanKerjakan))
                    .addContainerGap(238, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Ghendida
    private JTextField SoalKerjakan;
    private JTextField NamaSoalKerjakan;
    private JCheckBox PilganA;
    private JCheckBox PilganB;
    private JCheckBox PilganC;
    private JCheckBox PilganD;
    private JButton TombolNextKerjakan;
    private JButton TombolKembaliKerjakan;
    private JButton TombolSimpanKerjakan;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}

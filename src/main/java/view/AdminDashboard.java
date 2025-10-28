/*
 * Created by JFormDesigner on Wed Oct 29 03:26:35 SGT 2025
 */

package view;

import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.table.*;

/**
 * @author Asus
 */
public class AdminDashboard extends JFrame {
    public AdminDashboard() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Ghendida
        scrollPane1 = new JScrollPane();
        TabelAdmin = new JTable();
        TombolKembaliAdmin = new JButton();
        TombolVerifAdmin = new JButton();
        TombolTolakAdmin = new JButton();

        //======== this ========
        var contentPane = getContentPane();

        //======== scrollPane1 ========
        {

            //---- TabelAdmin ----
            TabelAdmin.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                },
                new String[] {
                    "Nama", "Username", "Role", "ID", "Status"
                }
            ));
            scrollPane1.setViewportView(TabelAdmin);
        }

        //---- TombolKembaliAdmin ----
        TombolKembaliAdmin.setText("Kembali");

        //---- TombolVerifAdmin ----
        TombolVerifAdmin.setText("Verifikasi");

        //---- TombolTolakAdmin ----
        TombolTolakAdmin.setText("Tolak");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 395, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(TombolVerifAdmin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TombolTolakAdmin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(38, 38, 38))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(531, Short.MAX_VALUE)
                    .addComponent(TombolKembaliAdmin, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
                    .addGap(19, 19, 19))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(TombolKembaliAdmin)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 318, GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(115, 115, 115)
                            .addComponent(TombolVerifAdmin)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(TombolTolakAdmin)
                            .addContainerGap(264, Short.MAX_VALUE))))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Ghendida
    private JScrollPane scrollPane1;
    private JTable TabelAdmin;
    private JButton TombolKembaliAdmin;
    private JButton TombolVerifAdmin;
    private JButton TombolTolakAdmin;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}

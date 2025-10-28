/*
 * Created by JFormDesigner on Wed Oct 29 03:39:01 SGT 2025
 */

package view;

import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.table.*;

/**
 * @author Asus
 */
public class DashboardStudent extends JFrame {
    public DashboardStudent() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Ghendida
        label1 = new JLabel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();

        //======== this ========
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Selamat Datang Teacher");

        //======== scrollPane1 ========
        {

            //---- table1 ----
            table1.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null},
                    {null, null},
                },
                new String[] {
                    "Nama Quiz", "Id_Quiz"
                }
            ));
            scrollPane1.setViewportView(table1);
        }

        //---- button1 ----
        button1.setText("Edit Quiz");

        //---- button2 ----
        button2.setText("Tambah Quiz");

        //---- button3 ----
        button3.setText("Hapus Quiz");

        //---- button4 ----
        button4.setText("Lihat Quiz");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(button1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button2, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button3, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button4, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
                    .addGap(45, 45, 45))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(label1)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(137, 137, 137)
                            .addComponent(button1)
                            .addGap(35, 35, 35)
                            .addComponent(button2)
                            .addGap(35, 35, 35)
                            .addComponent(button3)
                            .addGap(35, 35, 35)
                            .addComponent(button4)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Ghendida
    private JLabel label1;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}

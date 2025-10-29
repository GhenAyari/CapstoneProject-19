/*
 * Created by JFormDesigner on Wed Oct 29 10:48:08 SGT 2025
 */

package view;

import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.table.*;

/**
 * @author Asus
 */
public class DashboardTeacher extends JFrame {
    public DashboardTeacher() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Ghendida
        scrollPane1 = new JScrollPane();
        TabelTeacher = new JTable();
        SoalQuiz = new JTextField();
        JawabanBenar = new JComboBox<>();
        TombolSimpanTeacher = new JButton();
        TombolHapusTeacher = new JButton();
        TombolUpdateTeacher = new JButton();
        TombolBuatTeacher = new JButton();
        NamaQuizTeacher = new JTextField();
        TombolSimpanNextTeacher = new JButton();
        TombolJspinner = new JSpinner();

        //======== this ========
        var contentPane = getContentPane();

        //======== scrollPane1 ========
        {

            //---- TabelTeacher ----
            TabelTeacher.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null},
                },
                new String[] {
                    "Id", "No", "Soal", "A", "B", "C", "D"
                }
            ));
            scrollPane1.setViewportView(TabelTeacher);
        }

        //---- JawabanBenar ----
        JawabanBenar.setModel(new DefaultComboBoxModel<>(new String[] {
            "A",
            "B",
            "C",
            "D"
        }));

        //---- TombolSimpanTeacher ----
        TombolSimpanTeacher.setText("Simpan");

        //---- TombolHapusTeacher ----
        TombolHapusTeacher.setText("Hapus");

        //---- TombolUpdateTeacher ----
        TombolUpdateTeacher.setText("Update");

        //---- TombolBuatTeacher ----
        TombolBuatTeacher.setText("Buat");

        //---- TombolSimpanNextTeacher ----
        TombolSimpanNextTeacher.setText("Simpan Next");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(57, 57, 57)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(SoalQuiz, GroupLayout.PREFERRED_SIZE, 604, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 379, GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(TombolJspinner)
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(JawabanBenar, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(NamaQuizTeacher, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addGap(18, 18, 18)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(TombolBuatTeacher, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TombolUpdateTeacher, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TombolHapusTeacher, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TombolSimpanTeacher, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(TombolSimpanNextTeacher)))
                            .addGap(42, 42, 42))))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(SoalQuiz, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(TombolSimpanNextTeacher)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(JawabanBenar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(TombolSimpanTeacher))
                            .addGap(26, 26, 26)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(TombolHapusTeacher)
                                .addComponent(TombolJspinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(TombolUpdateTeacher)
                            .addGap(18, 18, 18)
                            .addComponent(TombolBuatTeacher)
                            .addContainerGap(137, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                            .addComponent(NamaQuizTeacher, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 330, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Ghendida
    private JScrollPane scrollPane1;
    private JTable TabelTeacher;
    private JTextField SoalQuiz;
    private JComboBox<String> JawabanBenar;
    private JButton TombolSimpanTeacher;
    private JButton TombolHapusTeacher;
    private JButton TombolUpdateTeacher;
    private JButton TombolBuatTeacher;
    private JTextField NamaQuizTeacher;
    private JButton TombolSimpanNextTeacher;
    private JSpinner TombolJspinner;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}

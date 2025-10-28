/*
 * Created by JFormDesigner on Wed Oct 29 04:00:18 SGT 2025
 */

package view;

import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.table.*;

/**
 * @author Asus
 */
public class TambahQuiz extends JFrame {
    public TambahQuiz() {
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
        button4 = new JButton();
        TombolBuatTeacher2 = new JButton();

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

        //---- button4 ----
        button4.setText("Simpan Next");

        //---- TombolBuatTeacher2 ----
        TombolBuatTeacher2.setText("Baru");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(SoalQuiz, GroupLayout.PREFERRED_SIZE, 586, GroupLayout.PREFERRED_SIZE)
                                .addComponent(NamaQuizTeacher, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 379, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(JawabanBenar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(25, 25, 25)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(button4)
                                .addComponent(TombolUpdateTeacher, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TombolBuatTeacher, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TombolSimpanTeacher, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TombolHapusTeacher, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TombolBuatTeacher2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGap(42, 42, 42))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(SoalQuiz, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(JawabanBenar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(TombolSimpanTeacher))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(TombolHapusTeacher)
                            .addGap(18, 18, 18)
                            .addComponent(TombolUpdateTeacher)
                            .addGap(18, 18, 18)
                            .addComponent(TombolBuatTeacher)
                            .addGap(18, 18, 18)
                            .addComponent(TombolBuatTeacher2)
                            .addContainerGap(150, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(NamaQuizTeacher, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button4))
                            .addGap(18, 18, 18)
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 312, GroupLayout.PREFERRED_SIZE)
                            .addGap(42, 42, 42))))
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
    private JButton button4;
    private JButton TombolBuatTeacher2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}

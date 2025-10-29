/*
 * Created by JFormDesigner on Wed Oct 29 03:07:22 SGT 2025
 */

package view;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Asus
 */
public class LoginFrame extends JFrame {
    public LoginFrame() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Ghendida
        panel1 = new JPanel();
        label1 = new JLabel();
        InputNamaLogin = new JTextField();
        label2 = new JLabel();
        InputUsernameLogin = new JTextField();
        label3 = new JLabel();
        InputPasswordLogin = new JPasswordField();
        TombolRegister = new JButton();
        TombolLogin = new JButton();
        TombolRole = new JComboBox<>();

        //======== this ========
        setBackground(new Color(0x00cccc));
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border.
            EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder. CENTER, javax. swing
            . border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ),
            java. awt. Color. red) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (new java. beans. PropertyChangeListener( )
            { @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .getPropertyName () ))
            throw new RuntimeException( ); }} );

            //---- label1 ----
            label1.setText("Masukkan Nama");

            //---- label2 ----
            label2.setText("Masukkan Username");

            //---- label3 ----
            label3.setText("Masukkan Password");

            //---- TombolRegister ----
            TombolRegister.setText("Register");

            //---- TombolLogin ----
            TombolLogin.setText("Login");

            //---- TombolRole ----
            TombolRole.setModel(new DefaultComboBoxModel<>(new String[] {
                "Admin",
                "Teacher",
                "Student"
            }));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(TombolRegister)
                                .addGap(18, 18, 18)
                                .addComponent(TombolLogin)
                                .addGap(18, 18, 18)
                                .addComponent(TombolRole, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
                                .addComponent(InputNamaLogin, GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                                .addComponent(InputUsernameLogin, GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                                .addComponent(label3)
                                .addComponent(InputPasswordLogin, GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)))
                        .addContainerGap(26, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(label1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputNamaLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label2)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputUsernameLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label3)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputPasswordLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(TombolRegister)
                            .addComponent(TombolLogin)
                            .addComponent(TombolRole, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(34, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(163, 163, 163)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(169, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(167, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Ghendida
    private JPanel panel1;
    private JLabel label1;
    private JTextField InputNamaLogin;
    private JLabel label2;
    private JTextField InputUsernameLogin;
    private JLabel label3;
    private JPasswordField InputPasswordLogin;
    private JButton TombolRegister;
    private JButton TombolLogin;
    private JComboBox<String> TombolRole;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}

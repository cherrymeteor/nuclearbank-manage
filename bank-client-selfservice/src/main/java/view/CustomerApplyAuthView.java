/*
 * Created by JFormDesigner on Wed Oct 24 21:45:10 BST 2018
 */

package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;
import service.impl.CustomerApplyService;
import util.JTextFieldLimit;

/**
 * @author xiangkai22
 */
public class CustomerApplyAuthView extends JFrame {
    public CustomerApplyAuthView() {
        initComponents();
        clearAllPanel();
    }

    private void btn_backActionPerformed(ActionEvent e) {
        this.dispose();
        new CustomerLoginView().run();
    }

    public void run() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void initTextfield() {
        tf_firstName.setDocument(new JTextFieldLimit(20));
        tf_lastName.setDocument(new JTextFieldLimit(20));
        tf_userId.setDocument(new JTextFieldLimit(10));
    }


    private void cb_isExistingActionPerformed(ActionEvent e) {
        if(cb_isExisting.getSelectedIndex() == 0) {
            clearAllPanel();
            pack();
        }
        if(cb_isExisting.getSelectedIndex() == 1) {
            clearAllPanel();
            this.existingCustomerPanel.setVisible(true);
            pack();
        }
        if(cb_isExisting.getSelectedIndex() == 2) {
            clearAllPanel();
            this.noneCustomerPanel.setVisible(true);
            pack();
        }
    }

    private void clearAllPanel() {
        this.existingCustomerPanel.setVisible(false);
        this.noneCustomerPanel.setVisible(false);
    }

    private void btn_none_nextActionPerformed(ActionEvent e) {
        this.dispose();
        new CustomerApplyView().run();
    }

    private void textFieldChecker() {
        try {
            if(tf_userId.getText().trim().length()<=0||
                    tf_firstName.getText().trim().length() <=0 ||
                    tf_lastName.getText().trim().length() <= 0) {
                JOptionPane.showMessageDialog(null,
                        "Please input all the information",
                        "Error Message",JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (Exception E) {
            JOptionPane.showMessageDialog(null,
                    "Please input valid information",
                    "Error Message",JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

    private void btn_customer_nextActionPerformed(ActionEvent e) {
        textFieldChecker();

        long userId = Long.parseLong(tf_userId.getText().trim());
        String firstName = tf_firstName.getText().trim();
        String lastName = tf_lastName.getText().trim();

        try {
            CustomerApplyService.getInstance().checkExistingUserBeforeApply(userId, firstName, lastName);
        } catch (Exception E) {
            E.printStackTrace();
        }
        this.dispose();
        new CustomerApplyView().run();
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        lbl_isExist = new JLabel();
        cb_isExisting = new JComboBox<>();
        existingCustomerPanel = new JPanel();
        lbl_userId = new JLabel();
        tf_userId = new JTextField();
        tf_firstName = new JTextField();
        lbl_firstName = new JLabel();
        lbl_lastName = new JLabel();
        tf_lastName = new JTextField();
        btn_customer_next = new JButton();
        noneCustomerPanel = new JPanel();
        btn_none_next = new JButton();
        btn_back = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[100:n,fill]" +
            "[fill]" +
            "[fill]" +
            "[100:n,fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //---- lbl_isExist ----
        lbl_isExist.setText("Existing Customer ?");
        lbl_isExist.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        contentPane.add(lbl_isExist, "cell 1 1");

        //---- cb_isExisting ----
        cb_isExisting.setModel(new DefaultComboBoxModel<>(new String[] {
            "Please Select",
            "Yes",
            "No"
        }));
        cb_isExisting.addActionListener(e -> cb_isExistingActionPerformed(e));
        contentPane.add(cb_isExisting, "cell 2 1");

        //======== existingCustomerPanel ========
        {
            existingCustomerPanel.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- lbl_userId ----
            lbl_userId.setText("User Id");
            lbl_userId.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            existingCustomerPanel.add(lbl_userId, "cell 0 0");

            //---- tf_userId ----
            tf_userId.setMinimumSize(new Dimension(100, 24));
            existingCustomerPanel.add(tf_userId, "cell 1 0");

            //---- tf_firstName ----
            tf_firstName.setMinimumSize(new Dimension(100, 24));
            existingCustomerPanel.add(tf_firstName, "cell 1 1");

            //---- lbl_firstName ----
            lbl_firstName.setText("First name");
            lbl_firstName.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            existingCustomerPanel.add(lbl_firstName, "cell 0 1");

            //---- lbl_lastName ----
            lbl_lastName.setText("Last name");
            lbl_lastName.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            existingCustomerPanel.add(lbl_lastName, "cell 0 2");

            //---- tf_lastName ----
            tf_lastName.setMinimumSize(new Dimension(100, 24));
            existingCustomerPanel.add(tf_lastName, "cell 1 2");

            //---- btn_customer_next ----
            btn_customer_next.setText("Next");
            btn_customer_next.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            btn_customer_next.addActionListener(e -> btn_customer_nextActionPerformed(e));
            existingCustomerPanel.add(btn_customer_next, "cell 0 4 2 1");
        }
        contentPane.add(existingCustomerPanel, "cell 1 4 2 1");

        //======== noneCustomerPanel ========
        {
            noneCustomerPanel.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]"));

            //---- btn_none_next ----
            btn_none_next.setText("Next");
            btn_none_next.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            btn_none_next.setMinimumSize(new Dimension(150, 24));
            btn_none_next.addActionListener(e -> btn_none_nextActionPerformed(e));
            noneCustomerPanel.add(btn_none_next, "cell 0 1");
        }
        contentPane.add(noneCustomerPanel, "cell 1 3 2 1");

        //---- btn_back ----
        btn_back.setText("Back");
        btn_back.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        btn_back.addActionListener(e -> btn_backActionPerformed(e));
        contentPane.add(btn_back, "cell 1 6 2 1");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel lbl_isExist;
    private JComboBox<String> cb_isExisting;
    private JPanel existingCustomerPanel;
    private JLabel lbl_userId;
    private JTextField tf_userId;
    private JTextField tf_firstName;
    private JLabel lbl_firstName;
    private JLabel lbl_lastName;
    private JTextField tf_lastName;
    private JButton btn_customer_next;
    private JPanel noneCustomerPanel;
    private JButton btn_none_next;
    private JButton btn_back;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}

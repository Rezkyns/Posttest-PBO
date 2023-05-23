/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.login;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;


public class Login extends javax.swing.JFrame {

    private javax.swing.JTextField txtUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblMessage;

    private final String usernamePlaceholder = "Username";
    private final String passwordPlaceholder = "Password";

    public Login() {
        initComponents();

        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton("Login");
        lblMessage = new javax.swing.JLabel();

        setLayout(null);

        addPlaceholder(txtUsername, usernamePlaceholder);
        addPlaceholder(txtPassword, passwordPlaceholder);

        txtUsername.setBounds(50, 50, 200, 30);
        add(txtUsername);

        txtPassword.setBounds(50, 100, 200, 30);
        add(txtPassword);

        btnLogin.setBounds(100, 150, 100, 30);
        add(btnLogin);

        lblMessage.setBounds(50, 200, 200, 30);
        add(lblMessage);

        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
    }

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {
        String username = txtUsername.getText();
        String password = new String(txtPassword.getPassword());

        if (username.equals("admin") && password.equals("password")) {
            lblMessage.setText("Selamat, Anda berhasil login!");
        } else {
            lblMessage.setText("Username atau password salah!");
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    private void initComponents() {
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void addPlaceholder(javax.swing.JTextField textField, String placeholder) {
        textField.setForeground(new Color(150, 150, 150));
        textField.setFont(new Font("Tahoma", Font.ITALIC, 12));
        textField.setText(placeholder);

        textField.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent evt) {
                if (textField.getText().equals(placeholder)) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK);
                }
                if (textField.equals(txtPassword)) {
                    txtPassword.setEchoChar('\u2022');
                }
            }

            public void focusLost(FocusEvent evt) {
                if (textField.getText().isEmpty()) {
                    textField.setText(placeholder);
                    textField.setForeground(new Color(150, 150, 150));
                }
                if (textField.equals(txtPassword)) {
                    txtPassword.setEchoChar((char) 0);
                }
            }
        });
    }
}

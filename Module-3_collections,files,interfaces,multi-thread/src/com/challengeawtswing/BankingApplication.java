package com.challengeawtswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class BankingApplication extends JFrame {
    private JPanel loginPanel, homePanel, createAccountPanel, viewCustomersPanel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextArea customerListArea;
    private List<Customer> customers;

    public BankingApplication() {
        setTitle("Banking Application");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        customers = new ArrayList<>();

        // Initialize panels
        loginPanel = new JPanel();
        homePanel = new JPanel();
        createAccountPanel = new JPanel();
        viewCustomersPanel = new JPanel();

        setupLoginPanel();
        setupHomePanel();
        setupCreateAccountPanel();
        setupViewCustomersPanel();

        add(loginPanel);
        setVisible(true);
    }

    private void setupLoginPanel() {
        loginPanel.setLayout(new GridLayout(3, 2));
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        JButton loginButton = new JButton("Login");

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (username.equals("admin") && password.equals("admin")) {
                    // Login successful, switch to home panel
                    getContentPane().removeAll();
                    add(homePanel);
                    revalidate();
                } else {
                    JOptionPane.showMessageDialog(loginPanel, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        loginPanel.add(usernameLabel);
        loginPanel.add(usernameField);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);
        loginPanel.add(new JLabel()); // Empty label for spacing
        loginPanel.add(loginButton);
    }

    private void setupHomePanel() {
        homePanel.setLayout(new GridLayout(3, 1));

        JButton createAccountButton = new JButton("Create Account");
        createAccountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                add(createAccountPanel);
                revalidate();
            }
        });

        JButton viewCustomersButton = new JButton("View All Customers");
        viewCustomersButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateCustomerList();
                getContentPane().removeAll();
                add(viewCustomersPanel);
                revalidate();
            }
        });

        JButton logoutButton = new JButton("Logout");
        logoutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                add(loginPanel);
                revalidate();
            }
        });

        homePanel.add(createAccountButton);
        homePanel.add(viewCustomersButton);
        homePanel.add(logoutButton);
    }

    private void setupCreateAccountPanel() {
        createAccountPanel.setLayout(new GridLayout(4, 2));
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        JLabel accountNumberLabel = new JLabel("Account Number:");
        JTextField accountNumberField = new JTextField();
        JLabel initialBalanceLabel = new JLabel("Initial Balance:");
        JTextField initialBalanceField = new JTextField();
        JButton createButton = new JButton("Create");

        createButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String accountNumber = accountNumberField.getText();
                double initialBalance = Double.parseDouble(initialBalanceField.getText());

                Customer customer = new Customer(name, accountNumber, initialBalance);
                customers.add(customer);

                JOptionPane.showMessageDialog(createAccountPanel, "Account created successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                clearFields(nameField, accountNumberField, initialBalanceField);
            }
        });

        createAccountPanel.add(nameLabel);
        createAccountPanel.add(nameField);
        createAccountPanel.add(accountNumberLabel);
        createAccountPanel.add(accountNumberField);
        createAccountPanel.add(initialBalanceLabel);
        createAccountPanel.add(initialBalanceField);
        createAccountPanel.add(new JLabel()); // Empty label for spacing
        createAccountPanel.add(createButton);
    }

    private void setupViewCustomersPanel() {
        viewCustomersPanel.setLayout(new BorderLayout());
        JLabel titleLabel = new JLabel("All Customers:");
        customerListArea = new JTextArea(20, 40);
        customerListArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(customerListArea);

        viewCustomersPanel.add(titleLabel, BorderLayout.NORTH);
        viewCustomersPanel.add(scrollPane, BorderLayout.CENTER);
    }

    private void updateCustomerList() {
        StringBuilder sb = new StringBuilder();
        for (Customer customer : customers) {
            sb.append(customer.toString()).append("\n");
        }
        customerListArea.setText(sb.toString());
    }

    private void clearFields(JTextField... fields) {
        for (JTextField field : fields) {
            field.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new BankingApplication();
            }
        });
    }
}

class Customer {
    private String name;
    private String accountNumber;
    private double balance;

    public Customer(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Account Number: " + accountNumber + ", Balance: $" + balance;
    }
}

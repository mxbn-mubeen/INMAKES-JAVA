package com.challengeawtswing;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

public class UserRegistrationForm extends Frame implements ActionListener {
    private Label firstNameLabel, lastNameLabel, dobLabel, genderLabel, placeLabel, contactLabel;
    private TextField firstNameField, lastNameField, dobField, placeField, contactField;
    private CheckboxGroup genderCheckboxGroup;
    private Checkbox maleCheckbox, femaleCheckbox;
    private Button submitButton;

    public UserRegistrationForm() {
        setLayout(new GridLayout(8, 2)); // 8 rows, 2 columns

        firstNameLabel = new Label("First Name:");
        lastNameLabel = new Label("Last Name:");
        dobLabel = new Label("Date of Birth (YYYY-MM-DD):");
        genderLabel = new Label("Gender:");
        placeLabel = new Label("Place:");
        contactLabel = new Label("Contact Number:");

        firstNameField = new TextField(20);
        lastNameField = new TextField(20);
        dobField = new TextField(20);
        placeField = new TextField(20);
        contactField = new TextField(20);

        genderCheckboxGroup = new CheckboxGroup();
        maleCheckbox = new Checkbox("Male", genderCheckboxGroup, false);
        femaleCheckbox = new Checkbox("Female", genderCheckboxGroup, false);

        submitButton = new Button("Submit");
        submitButton.addActionListener(this);

        add(firstNameLabel);
        add(firstNameField);
        add(lastNameLabel);
        add(lastNameField);
        add(dobLabel);
        add(dobField);
        add(genderLabel);
        add(maleCheckbox);
        add(new Label("")); // Empty label for spacing
        add(femaleCheckbox);
        add(placeLabel);
        add(placeField);
        add(contactLabel);
        add(contactField);
        add(new Label("")); // Empty label for spacing
        add(submitButton);

        setTitle("User Registration Form");
        setSize(400, 300);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            String dob = dobField.getText();
            String gender = (maleCheckbox.getState() ? "Male" : "Female");
            String place = placeField.getText();
            String contact = contactField.getText();

            // Here you can write your logic to handle the form data
            // For example, saving to a database or displaying a message dialog
            // For now, let's just display a message dialog
            String message = "Registration Successful!\nThank you, " + firstName + " " + lastName + "!";
            JOptionPane.showMessageDialog(this, message, "Registration Successful", JOptionPane.INFORMATION_MESSAGE);

            // Clear fields after submission
            firstNameField.setText("");
            lastNameField.setText("");
            dobField.setText("");
            genderCheckboxGroup.setSelectedCheckbox(null); // Clear gender selection
            placeField.setText("");
            contactField.setText("");
        }
    }

    public static void main(String[] args) {
        new UserRegistrationForm();
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordapp;

import javax.swing.JOptionPane;

/**
 *
 * @author x13114492
 */
public class PasswordApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String fname;
        String sname;
        String age;
        String password;

        Password myPassword = new Password();

        fname = JOptionPane.showInputDialog(null, "Enter First Name: ");
        myPassword.setFname(fname);

        age = JOptionPane.showInputDialog(null, "Enter Age: ");
        myPassword.setAge(age);

        sname = JOptionPane.showInputDialog(null, "Enter Surname: ");
        myPassword.setSname(sname);

        myPassword.compute();

        password = myPassword.getPassword();

        JOptionPane.showMessageDialog(null, "New Password is: " + password);
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordapp;

/**
 *
 * @author x13114492
 */
import javax.swing.JOptionPane;

public class Password {

    private String fname;
    private String sname;
    private String age;
    private String password;
    private StringBuffer strBuff;
    private StringBuffer strBuff2;

    public Password() {
        fname = " ";
        sname = " ";
        age = " ";
        password = " ";
        strBuff = new StringBuffer();
        strBuff2 = new StringBuffer();

    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void compute() {
        strBuff.append(fname);
        strBuff.append(age);
        strBuff.append(sname);

        for (int i = 0; i <= (strBuff.length() - 1); i = i + 1) {
            if (strBuff.charAt(i) == 'a' || strBuff.charAt(i) == 'e' || strBuff.charAt(i) == 'i' || strBuff.charAt(i) == 'o' || strBuff.charAt(i) == 'u') {
                i = i;
            } else {
                strBuff2.append(strBuff.charAt(i));
            }
        }

        password = strBuff2.toString();
    }

    public String getPassword() {
        return password;
    }

}

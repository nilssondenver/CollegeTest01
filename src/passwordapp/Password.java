/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordapp;

/**
 *
 * @author x13114492
 */
public class Password {

    private String fname;
    private String sname;
    private String age;
    private String password;
    private StringBuffer strBuff;
    private StringBuffer strBuff2;
    fname  = " ";
    sname  = " ";
    age  = " ";
    password  = " ";
    strbuff  = new StringBuffer();
    strbuff2  = new StringBuffer();

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void compute() {
        strBuff.append(fname);
        strBuff.append(age);
        strBuff.append(sname);

        for (int i = 0; i < strBuff.length(); i = i + 1) {
            if (strBuff.charAt(i) != 'a' || strBuff.charAt(i) != 'e' || strBuff.charAt(i) != 'i' || strBuff.charAt(i) != 'o' || strBuff.charAt(i) != 'u');
            strBuff2.append(strBuff.charAt(i));
        }
    }

    public String getPassword() {
        return password;
    }
}

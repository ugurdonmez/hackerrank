/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeWhiz_java_October_2015.Volume_Calculator;

import java.security.Permission;

/**
 *
 * @author ugurdonmez
 */
class Calculate {

    public static Object get_Vol() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Calculate() {
    }

    public int getINTVal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

public class Solution {

    public static void main(String[] args) {
        Do_Not_Terminate.forbidExit();
        try {
            Calculate cal = new Calculate();
            int T = cal.getINTVal();
            while (T-- > 0) {
                double volume = 0.0d;
                int ch = cal.getINTVal();
                if (ch == 1) {

                    int a = cal.getINTVal();
                    volume = Calculate.get_Vol().main(a);

                } else if (ch == 2) {

                    int l = cal.getINTVal();
                    int b = cal.getINTVal();
                    int h = cal.getINTVal();
                    volume = Calculate.get_Vol().main(l, b, h);

                } else if (ch == 3) {

                    double r = cal.getDoubleVal();
                    volume = Calculate.get_Vol().main(r);

                } else if (ch == 4) {

                    double r = cal.getDoubleVal();
                    double h = cal.getDoubleVal();
                    volume = Calculate.get_Vol().main(r, h);

                }
                cal.output.display(volume);
            }

        } catch (NumberFormatException e) {
            System.out.print(e);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Do_Not_Terminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }

    }
}

/**
 * This class prevents the user from using System.exit(0) from terminating the
 * program abnormally.
 */
class Do_Not_Terminate {

    public static class ExitTrappedException extends SecurityException {
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}//end of Do_Not_Terminate	


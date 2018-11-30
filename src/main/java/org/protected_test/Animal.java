package org.protected_test;



public class Animal extends Creture{

    protected String protectedName = "PROTECTED";

    private String privateName = "PRIVATE";

    public String publicName = "PUBLIC";

    String defaultName = "DEFAULT";


    protected void protectedSay(String sth) {
        System.out.println(sth);;
    }

    public void publicSay(String sth) {
        System.out.println(sth);
    }

    private void privateSay(String sth) {
        System.out.println(sth);
    }

    void defaultSay(String sth) {
        System.out.println(sth);
    }

}

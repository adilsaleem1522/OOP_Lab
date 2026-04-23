public class SecureTextFile extends TextFile {
    private String securityLevel;

    public SecureTextFile( String securityLevel) {
        System.out.println("SecureTextFile constructor called");
        this.securityLevel = securityLevel;
    }

    public void setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
    }

    public void shareFile() {

    }
    public String getSecurityLevel() {
        return securityLevel;
    }

    public void openFile() {
        System.out.println("SecureTextFile is opening with protected access.");
    }
}
package practice.javaoop.accessmodifier;

public class AccessModifier {
    private String privateProperties;

    protected String protectedProperties;

    public String publicProperties;

    public void showPrivateProperties(){
        System.out.println("This is private properties :" + privateProperties);
    }

    public void showProtectedProperties(){
        System.out.println("This is private properties :" + protectedProperties);
    }

    public void showPublicProperties(){
        System.out.println("This is private properties :" + publicProperties);
    }

    public String getPrivateProperties() {
        return privateProperties;
    }

    public void setPrivateProperties(String privateProperties) {
        this.privateProperties = privateProperties;
    }

    public String getProtectedProperties() {
        return protectedProperties;
    }

    public void setProtectedProperties(String protectedProperties) {
        this.protectedProperties = protectedProperties;
    }

    public String getPublicProperties() {
        return publicProperties;
    }

    public void setPublicProperties(String publicProperties) {
        this.publicProperties = publicProperties;
    }
}

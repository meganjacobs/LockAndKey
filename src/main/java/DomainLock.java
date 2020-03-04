public class DomainLock {

    //String and Integer Classes used used to Demonstrate Composition
    private String name;
    private Integer id;
    private Integer secret;

    public Integer calculateKey() {
        return id * secret;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSecret() {
        return secret;
    }

    public void setSecret(Integer secret) {
        this.secret = secret;
    }
}

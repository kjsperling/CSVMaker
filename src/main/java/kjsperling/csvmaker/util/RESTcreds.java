package kjsperling.csvmaker.util;


public class RESTcreds {

    private String restToken;
    private String path;
    private String qaBox;

    public RESTcreds(String restToken, String path, String qaBox) {
        this.restToken = restToken;
        this.path = path;
        this.qaBox = qaBox;
    }

    public String getRestToken() {
        return restToken;
    }

    public String getPath() {
        return path;
    }

    public String getQaBox() {
        return qaBox;
    }
}

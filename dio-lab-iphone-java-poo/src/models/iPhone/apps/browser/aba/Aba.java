package models.iPhone.apps.browser.aba;

public class Aba {
    private int id;
    private String url;

    public Aba(int id, String url) {
        this.id = id;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }
}

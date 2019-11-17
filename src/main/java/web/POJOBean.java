package web;

import javax.ejb.Stateless;

@Stateless
public class POJOBean {
    private String httpPage;

    public String getHttpPage() {
        return httpPage;
    }

    public void setHttpPage(String httpPage) {
        this.httpPage = httpPage;
    }
}

public class WebPageBuilder {
    private String title;
    private String header;
    private String content;
    private String footer;

    public WebPageBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public WebPageBuilder setHeader(String header) {
        this.header = header;
        return this;
    }

    public WebPageBuilder setContent(String content) {
        this.content = content;
        return this;
    }

    public WebPageBuilder setFooter(String footer) {
        this.footer = footer;
        return this;
    }

    public WebPage build() {
        return new WebPage(title, header, content, footer);
    }
}

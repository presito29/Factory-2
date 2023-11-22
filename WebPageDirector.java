public class WebPageDirector {
     String header = "Defaulted header";
     String title = "Defaulted title";
     String content = "Defaulted contend";
     String footer = "Defaulted footer";



    public WebPage createArticle(String content) {
        return new WebPageBuilder()
                .setTitle(title)
                .setFooter(footer)
                .setHeader(header)
                .setContent(content)
                .build();

    }

    public WebPage createForm(String title, String fields) {
        return new WebPageBuilder()
                .setTitle(title)
                .setHeader(header)
                .setFooter(footer)
                .setContent("Fields: " + fields)
                .build();
    }
}

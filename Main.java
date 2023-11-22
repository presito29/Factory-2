public class Main {
    public static void main(String[] args) {

        WebPageDirector director = new WebPageDirector();
        WebPage articlePage = director.createArticle("Content of the article.");

        System.out.println("Article Page:\n" + articlePage.toString());
        System.out.println("\n-------------------------\n");


        WebPage form = director.createForm("User Login", "Name, Password");

        System.out.println("Form Page:\n" + form.toString());
    }
}
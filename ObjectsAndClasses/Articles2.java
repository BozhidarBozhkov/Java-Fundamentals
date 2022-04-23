import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.CharSequence.compare;

public class Articles2 {
    static class Article{
        String title;
        String content;
        String author;

        public void setTitle(String title) {
            this.title = title;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }
        @Override
        public String toString(){
            return String.format("%s - %s: %s", this.title, this.content, this.author);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        List<Article> articleList = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(", ");
            String title = data[0];
            String content = data[1];
            String author = data[2];

            Article article = new Article(title, content, author);
            articleList.add(article);
        }
        String command = scanner.nextLine();

        switch (command){
            case "title":
                articleList.stream().sorted((a1, a2) -> compare(a1.getTitle(), a2.getTitle()))
                        .forEach(article -> System.out.println(article.toString()));
                break;
            case "content":
                articleList.stream().sorted((a1, a2) -> compare(a1.getContent(), a2.getContent()))
                        .forEach(article -> System.out.println(article.toString()));
                break;
            case "author":
                articleList.stream().sorted((a1, a2) -> compare(a1.getAuthor(), a2.getAuthor()))
                        .forEach(article -> System.out.println(article.toString()));
                break;

        }
    }

}

package blog_posts;

public class Post implements Comparable<Post>{
    Author author;
    String title;
    String body;
    Categories category;
    public Post(Author author, String title, String body, Categories category){
        this.author = author;
        this.title = title;
        this.body = body;
        this.category = category;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public int compareTo(Post o) {
        return this.title.compareTo(o.title);
    }
}

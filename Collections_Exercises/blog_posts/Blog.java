import java.util.*;

public class Blog {

    List<Post> posts=new ArrayList<>();

    public void addPost(Post post) {
        if(posts.isEmpty()){
            posts.add(post);
        } else {
            for (Post value : posts) {
                if (value.author.equals(post.author) && value.title.equals(post.title)) {
                    throw new IllegalArgumentException("Post already exists");
                }
            }
            posts.add(post);
        }

    }

    public Set<Author> getAllAuthors(){
        Set<Author> authors=new TreeSet<>();
        for(Post post:posts){
            authors.add(post.author);
        }
        return authors;
    }

    public Map<Categories,Integer> getCountByCategory(){
        Set<Categories> categories=new HashSet<>();
        for(Post post:posts){
            categories.add(post.category);
        }
        Map<Categories,Integer> countByCategory=new TreeMap<>();
        for(Categories category:categories){
            int count=0;
            for(Post post:posts){
                if(post.category.equals(category)){
                    count++;
                }
            }
            countByCategory.put(category,count);
        }
        return countByCategory;
    }

    public Set<Post> getPostsByAuthor(Author author){
        Set<Post> postsSet=new TreeSet<>();
        for(Post post:posts){
            if(post.author.equals(author)){
                postsSet.add(post);
            }
        }

        return postsSet;
    }

    public Set<Post> getPostsByCategory(Categories category){
        Set<Post> postsSet=new TreeSet<>();
        for(Post post:posts){
            if(post.category.equals(category)){
                postsSet.add(post);
            }
        }
        return postsSet;
    }

    public Map<Categories,Set<Post>> getAllPostsByCategories(){
        Map<Categories,Set<Post>> postsByCategories=new TreeMap<>();
        for(Categories categories : Categories.values()){
            Set<Post> postsForCategory=new HashSet<>();
            for(Post post:posts){
                if(post.category.equals(categories)){
                    postsForCategory.add(post);
                }
            }
            postsByCategories.put(categories,postsForCategory);
        }
        return postsByCategories;
    }

    public Map<Author,Set<Post>> getAllPostsByAuthor(){
        Map<Author,Set<Post>> postsByAuthors=new TreeMap<>();
        Set<Author> authors=new HashSet<>();
        for (Post post : posts) {
            authors.add(post.author);
        }
        for(Author author:authors){
            Set<Post> postsForAuthor=new HashSet<>();
            for(Post post:posts){
                if(post.author.equals(author)){
                    postsForAuthor.add(post);
                }
            }
            postsByAuthors.put(author,postsForAuthor);

        }
        return postsByAuthors;
    }
}

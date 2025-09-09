import java.util.*;

public class Blog {

    List<Post> posts=new ArrayList<>();

    public void addPost(Post post) {
        posts.add(post);
    }

    public Set<String> getAllAuthors(){
        Set<String> authors=new TreeSet<>();
        for(Post post:posts){
            authors.add(post.author);
        }

        return authors;
    }

    public Map<String,Integer> getCountByCategory(){
        Set<String> categories=new HashSet<>();
        for(Post post:posts){
            categories.add(post.category);
        }
        Map<String,Integer> countByCategory=new TreeMap<>(Comparator.reverseOrder());
        for(String category:categories){
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
}

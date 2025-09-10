public class Author implements Comparable<Author> {
     String name;
     String surname;

    public Author(String name,String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return String.format("%s %s", name, surname);
    }

    @Override
    public int compareTo(Author o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null) return false;
        if(obj.getClass()!=this.getClass()) return false;
        if(obj == this) return true;

        Author author=(Author)obj;
        return author.name.equals(name) && author.surname.equals(surname);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}

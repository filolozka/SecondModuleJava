package lessonsExamples.lesson0608;

public class Book implements Comparable<Book> {
    private String name;
    private String author;
    private int publishingYear;

    public Book(String name, String autor, int publishingYear) {
        this.name = name;
        this.author = autor;
        this.publishingYear = publishingYear;
    }

    @Override
    public int compareTo(Book o) {
        int comparingName = this.name.compareTo(o.name);
        int comparingAuthor = this.author.compareTo(o.author);
        int comparingYear = this.publishingYear - o.publishingYear;

        if (comparingName == 0) {
            if (comparingAuthor != 0) {
                return comparingAuthor;
            } else {
                return comparingYear;
            }
        }
        else return comparingName;
    }

        @Override
        public String toString () {
            return "Book{" +
                    "name='" + name + '\'' +
                    ", author='" + author + '\'' +
                    ", publishingYear=" + publishingYear +
                    '}';
        }
    }

package work1;

public class Book {
    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "This is book " + this.name + " with author " + this.author;
    }

    public void readBook() {
        new Thread(() -> {
            try {
                System.out.println("Start reading book " + name);
                Thread.sleep(10000);
                System.out.println("reading ....");
                Thread.sleep(10000);
                System.out.println("Success");
            } catch (InterruptedException e) {
                System.out.println("Unexpected error with book reading");
            }
        }).start();
    }
}

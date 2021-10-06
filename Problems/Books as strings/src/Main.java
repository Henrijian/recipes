class Book {

    private String title;
    private int yearOfPublishing;
    private String[] authors;

    public Book(String title, int yearOfPublishing, String[] authors) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.authors = authors;
    }

    @Override
    public String toString() {
        StringBuilder authorsSB = new StringBuilder();
        authorsSB.append("[");
        for (int i = 0; i < authors.length; i++) {
            authorsSB.append(authors[i]);
            if (i != authors.length - 1) {
                authorsSB.append(",");
            }
        }
        authorsSB.append("]");
        return String.format("title=%s,yearOfPublishing=%d,authors=%s", title, yearOfPublishing, authorsSB.toString());
    }
}
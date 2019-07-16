package thisisjava.chap15_collection.exam.exam07;

public class Board {

    public String title;
    public String content;

    public Board(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return title + " : " + content;
    }
}

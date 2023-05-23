package Files.Dao;

import java.util.Objects;

public class articleDaoImpl {
    private int id;
    private String title;
    private String content;
    private userDaoImpl user;

    public articleDaoImpl() {}

    public articleDaoImpl(int id, String title, String content, userDaoImpl user) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.user = user;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public userDaoImpl getUser() { return user; }
    public void setUser(userDaoImpl user) { this.user = user; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        articleDaoImpl article = (articleDaoImpl) o;
        return id == article.id &&
                Objects.equals(title, article.title) &&
                Objects.equals(content, article.content) &&
                Objects.equals(user, article.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, content, user);
    }

    @Override
    public String toString() {
        return "article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", user=" + user +
                '}';
    }
}

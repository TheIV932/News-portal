package files.dao;

import java.util.Objects;

public class userDaoImpl {
    private int id;
    private String username;
    private String password;

    public userDaoImpl() {}

    public userDaoImpl(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof userDaoImpl)) return false;
        userDaoImpl user = (userDaoImpl) o;
        return id == user.id &&
                Objects.equals(username, user.username);
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, username, password);
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
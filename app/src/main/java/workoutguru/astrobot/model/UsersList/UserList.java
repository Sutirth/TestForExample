package workoutguru.astrobot.model.UsersList;

/**
 * Created by sutirthchakravarty on 27/12/17.
 */

public class UserList {


    private  long id;
    private String name;
    private String username;
    private String email;
    private String phone;
    private String website;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserList)) return false;

        UserList userList = (UserList) o;

        if (getId() != userList.getId()) return false;
        if (!getName().equals(userList.getName())) return false;
        if (!getUsername().equals(userList.getUsername())) return false;
        if (!getEmail().equals(userList.getEmail())) return false;
        if (!getPhone().equals(userList.getPhone())) return false;
        return getWebsite().equals(userList.getWebsite());
    }

    @Override
    public int hashCode() {
        int result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + getName().hashCode();
        result = 31 * result + getUsername().hashCode();
        result = 31 * result + getEmail().hashCode();
        result = 31 * result + getPhone().hashCode();
        result = 31 * result + getWebsite().hashCode();
        return result;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}

public class UserBuilderImpl {
    public final String firstName;
    public final String lastName;
    public int age;
    public String phone;
    public String address;

    public UserBuilderImpl(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UserBuilderImpl setAge(int age) {
        this.age = age;
        return this;
    }

    public UserBuilderImpl setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public UserBuilderImpl setAddress(String address) {
        this.address = address;
        return this;
    }

    public User build() {
        return new User(this);
    }
}

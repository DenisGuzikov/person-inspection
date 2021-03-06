package io.khasang.inspection.model;

//import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Entity(name = "users")
public class User implements Serializable{
    public enum AccountStatus {
        NEW, ACTIVE, SUSPENDED
    }

    public enum InspectionStatus {
        NEW, NEGATIVE, POSITIVE
    }

//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

//    @Column(length = 255, unique = true)
    private String login;

//    @Column(length = 255)
    private String password;

//    @Column(name = "first_name", length = 255)
    private String firstName;

//    @Column(name = "last_name", length = 255)
    private String lastName;

//    @Column(length = 255)
    private String email;

//    @Column
//    @Enumerated(EnumType.STRING)
    private InspectionStatus inspectionStatus;

//    @Column(name = "receive_notifications")
    private boolean receiveNotifications = false;

//    @Column(name = "account_status", nullable = false)
//    @Enumerated(EnumType.STRING)
    private AccountStatus accountStatus;

//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(name = "authorisations", joinColumns = { @JoinColumn(name = "user_id", referencedColumnName = "id") }, inverseJoinColumns = { @JoinColumn(name = "role_id") })
    private List<Role> roles = new ArrayList<>();

    public User() {
        this.accountStatus = AccountStatus.NEW;
        this.inspectionStatus = InspectionStatus.NEW;
    }

    public static Map<AccountStatus, String> getAccountStatusList() {
        Map<AccountStatus, String> accountStatusList = new HashMap<>();
        for (AccountStatus status : AccountStatus.values()) {
            accountStatusList.put(status, status.toString());
        }
        return accountStatusList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public InspectionStatus getInspectionStatus() {
        return inspectionStatus;
    }

    public void setInspectionStatus(InspectionStatus inspection) {
        this.inspectionStatus = inspection;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public boolean isReceiveNotifications() {
        return receiveNotifications;
    }

    public void setReceiveNotifications(boolean receiveNotifications) {
        this.receiveNotifications = receiveNotifications;
    }
    
}

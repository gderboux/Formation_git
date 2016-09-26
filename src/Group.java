import java.util.List;

public class Group {

    private String groupName;

    private List <Person> members;

    private String contactEmail;

    public Group(String groupName, List<Person> members, String contactEmail) {
        this.groupName = groupName;
        this.members = members;
        this.contactEmail = contactEmail;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<Person> getMembers() {
        return members;
    }

    public void setMembers(List<Person> members) {
        this.members = members;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public void show() {
        System.out.println("Group name : "+ groupName);
        System.out.println("Contact email : "+ contactEmail);
        System.out.println("members : ");
        members.forEach(member -> System.out.println(member.getName()));

    }
}

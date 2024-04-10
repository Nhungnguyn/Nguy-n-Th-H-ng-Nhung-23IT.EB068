public class Intern implements IEmployee {
    private int ID;
    private String FullName;
    private int Birthday;
    private int Phone;
    private String Email;
    private String Employee_type;
    private int Employee_count;
    private String Majors;
    private String Semester;
    private String University_name;
    Intern(int iD, String fullName, int birthday, int phone, String email, String employee_type,
           int employee_count, String majors, String semester, String university_name) {
        super();
        this.ID = iD;
        this.FullName = fullName;
        this.Birthday = birthday;
        this.Phone = phone;
        this.Email = email;
        this.Employee_type = employee_type;
        this.Employee_count++;
        this.Majors = majors;
        this.Semester = semester;
        this.University_name = university_name;
    }
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public String getFullName() {
        return FullName;
    }
    public void setFullName(String fullName) {
        FullName = fullName;
    }
    public int getBirthday() {
        return Birthday;
    }
    public void setBirthday(int birthday) {
        Birthday = birthday;
    }
    public int getPhone() {
        return Phone;
    }
    public void setPhone(int phone) {
        Phone = phone;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public String getEmployee_type() {
        return Employee_type;
    }
    public void setEmployee_type(String employee_type) {
        Employee_type = employee_type;
    }
    public int getEmployee_count() {
        return Employee_count;
    }
    public void setEmployee_count(int employee_count) {
        Employee_count = employee_count;
    }
    public String getMajors() {
        return Majors;
    }
    public void setMajors(String majors) {
        Majors = majors;
    }
    public String getSemester() {
        return Semester;
    }
    public void setSemester(String semester) {
        Semester = semester;
    }
    public String getUniversity_name() {
        return University_name;
    }
    public void setUniversity_name(String university_name) {
        University_name = university_name;
    }

    @Override
    public void showInfo() {

    }

    public void ShowInfo() {
        System.out.println("Employee ID: " + ID);
        System.out.println("Full Name: " + FullName);
        System.out.println("BirthDay: " + Birthday);
        System.out.println("Phone: " + Phone);
        System.out.println("Email: " + Email);
        System.out.println("Employee Type: " + Employee_type);
        System.out.println("Major: " + Majors);
        System.out.println("Semester: " + Semester);
        System.out.println("University Name: " + University_name);
    }
}
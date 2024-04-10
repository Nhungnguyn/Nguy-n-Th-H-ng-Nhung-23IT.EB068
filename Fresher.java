public class Fresher implements IEmployee {
    private int ID;
    private String FullName;
    private int Birthday;
    private int Phone;
    private String Email;
    private String Employee_type;
    private int Employee_count;
    private int Graduation_date;
    private int Graduation_rank;
    private String Education;
    Fresher(int iD, String fullName, int birthday, int phone, String email, String employee_type,
            int employee_count, int graduation_date, int graduation_rank, String education) {
        super();
        this.ID = iD;
        this.FullName = fullName;
        this.Birthday = birthday;
        this.Phone = phone;
        this.Email = email;
        this.Employee_type = employee_type;
        this.Employee_count++;
        this.Graduation_date = graduation_date;
        this.Graduation_rank = graduation_rank;
        this.Education = education;
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
    public int getGraduation_date() {
        return Graduation_date;
    }
    public void setGraduation_date(int graduation_date) {
        Graduation_date = graduation_date;
    }
    public int getGraduation_rank() {
        return Graduation_rank;
    }
    public void setGraduation_rank(int graduation_rank) {
        Graduation_rank = graduation_rank;
    }
    public String getEducation() {
        return Education;
    }
    public void setEducation(String education) {
        Education = education;
    }
    public void ShowInfo() {
        System.out.println("Employee ID: " + ID);
        System.out.println("Full Name: " + FullName);
        System.out.println("BirthDay: " + Birthday);
        System.out.println("Phone: " + Phone);
        System.out.println("Email: " + Email);
        System.out.println("Employee Type: " + Employee_type);
        System.out.println("Graduation Date: " + Graduation_date);
        System.out.println("Graduation Rank: " + Graduation_rank);
        System.out.println("Education: " + Education);
    }

    @Override
    public void showInfo() {

    }
}
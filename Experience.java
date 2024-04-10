public class Experience implements IEmployee {
    private int ID;
    private String FullName;
    private int Birthday;
    private int Phone;
    private String Email;
    private String Employee_type;
    private int Employee_count;
    private int ExpInYear;
    private String ProSkill;
    Experience(int iD, String FullName, int birthday, int phone, String email, String employee_type, int employee_count,int ExpInYear, String ProSkill)
    {
        super();
        this.ID = iD;
        this.FullName = FullName;
        this.Birthday = birthday;
        this.Phone = phone;
        this.Email = email;
        this.Employee_type = employee_type;
        this.Employee_count++;
        this.ExpInYear = ExpInYear;
        this.ProSkill = ProSkill;
    }
    public void ShowInfo()
    {
        System.out.println("ID: " + ID);
        System.out.println("Full Name: " + FullName);
        System.out.println("Birthday: " + Birthday);
        System.out.println("Phone: " + Phone);
        System.out.println("Email: " + Email);
        System.out.println("Employee type: " + Employee_type);
        System.out.println("Experience (years): " + ExpInYear);
        System.out.println("Professional Skill: " + ProSkill);
    }

    @Override
    public void showInfo() {

    }
}
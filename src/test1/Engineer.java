package test1;

public class Engineer {
    // Instance Variable
    public String _Role;
    public int _ExperienceYears;

    // Constructor
    public Engineer(String role) {
        this._Role = role;
    }

    public Engineer(String role, int year) {
        this._Role = role;
        this._ExperienceYears = year;
    }

    //setter
    public void setRole(String newRole) { this._Role = newRole;}
    public void setExperienceYears(int newExperienceYears) { this._ExperienceYears = newExperienceYears;}

    //getter
    public String getRole(){ return this._Role;}
    public int getExperienceYears(){ return this._ExperienceYears;}


}

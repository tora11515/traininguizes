package test1;

public class Developer extends Engineer implements Buildable, Reviewable{
    public String _Name;
    public String defaultRole = "Frontend Engineer";

    public Developer(String name) {
        super("FrontEndEngineer");
        this._Name = name;
    }
    public Developer(String name, String role, int experience){
        super(role,experience);
        this._Name = name;
    }

    //setter
    public void setName(String newName){this._Name = newName;}
    //getter
    public String getName(){return this._Name;}

    @Override
    public void build() {
        System.out.println(_Name + " is building...");
    }

    @Override
    public void review(String content) {
        System.out.println(_Name + " review: " + content);
    }

}

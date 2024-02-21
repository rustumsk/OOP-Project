package OOP_Project.model;

import java.util.ArrayList;

public class Register{
    public static ArrayList<Register> user = new ArrayList<>();
    private String fName,lName,mName,suffix,month,day,year,email;
    public Register(String fName, String lName, String mName, String suffix, String month, String day, String year, String email){
        this.fName = fName;
        this.mName = mName;
        this.mName = mName;
        this.suffix = suffix;
        this.month = month;
        this.day = day;
        this.year = year;
        this.email = email;
    }

    public String getfName(){
        return fName;
    }
    public String getLName(){
        return lName;
    }
    public int getAge(){
        return 2024 - Integer.parseInt(year);
    }
    public String getEmail(){
        return email;
    }
}
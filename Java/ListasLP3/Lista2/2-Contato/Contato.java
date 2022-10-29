import java.util.*;

public class Contato{
    //Atributos
    private String name, email, phone;
    private int day, month, year;

    //Metodos
    public void initializeContact(){
        this.name = getName();
        this.email = getEmail();
        this.phone = getPhone();
        this.day = getDay();
        this.month = getMonth();
        this.year = getYear();
    }
    
    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhone(String phone){
        phone = phone.replace("(", "");
        phone = phone.replace(")", "");
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        this.phone = phone;
    }

    public void setDate(int day, int month, int year){
        Data date = new Data();

        date.setDate(day, month, year);
        this.day = date.getDay();
        this.month = date.getMonth();
        this.year = date.getYear();
    }

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPhone(){
        return this.phone;
    }

    public int getDay(){
        return this.day;
    }

    public int getMonth(){
        return this.month;
    }

    public int getYear(){
        return this.year;
    }
    
    public void printContact(){
        System.out.printf("Name: %s\n", getName());
        System.out.printf("Email: %s\n", getEmail());
        System.out.printf("Phone: %s\n", getPhone());
        System.out.printf("Birth date: %02d/%02d/%02d\n", getDay(), getMonth(), getYear());
    }
    
    public int calculateAge(){
        Calendar date = new GregorianCalendar();
        int day = date.get(Calendar.DAY_OF_MONTH);
        int month = date.get(Calendar.MONTH);
        int year = date.get(Calendar.YEAR);
        int age = year - this.year;

        if(this.month <= month){
            if(this.day <= day){
                return age;
            }
        }
        return (age - 1);
    }
}
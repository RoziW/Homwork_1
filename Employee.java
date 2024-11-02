
package employeetest;


public class Employee {
    
    private String firstname;
    private String lastname;
    private double monthlysalary;
    
    public Employee(String firstname, String lastname, double monthlysalary){
        this.firstname = firstname;
        this.lastname = lastname;
        
        if(monthlysalary>0){
        this.monthlysalary = monthlysalary;
        }
        else{
            this.monthlysalary=0;
        }
    }
    
    public void setfirstname(String firstname){
     
        this.firstname = firstname;
    }
    
    public String getfirstname(){
        return firstname;
    }
    
    public void setlastname(String lastname){
      
        this.lastname = lastname;
    }
    
    public String getlastname(){
        return lastname;
    }
    
    public void setmonthlysalary(double monthlysalary){
        if(monthlysalary >0){
            this.monthlysalary = monthlysalary;
        }
    }
    
    public double getmonthlysalary(){
        return monthlysalary;
    }
    
    public double getyearlysalary(){
        return monthlysalary*12;
    }

    public void display1(){
    System.out.println(getfirstname()+" "+getlastname()+"\t\t"+getyearlysalary()+"$");
    }
    
    public void raise(){
        
        monthlysalary*=1.10;
    }
    
    public void displayfinal(){
        System.out.println(getfirstname()+" "+getlastname()+"\t\t"+getyearlysalary()+"$");
    }
    
}

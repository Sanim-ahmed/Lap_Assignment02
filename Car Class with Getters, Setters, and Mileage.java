class Car 
{
    private String company_name;
    private String model_name;
    private int year;
    private double mileage;

    public Car(String company_name, String model_name, int year, double mileage) {
        this.company_name = company_name;
        this.model_name = model_name;
        this.year = year;
        this.mileage = mileage;
    }
    public String getCompanyName() 
    { 
        return company_name;
    }
    public void setCompanyName(String company_name) 
    { 
        this.company_name = company_name;
    }
    public String getModelName() 
    { 
        return model_name;
    }
    public void setModelName(String model_name)
    { 
        this.model_name = model_name;
    }
    public int getYear()
    {
        return year; 
    }
    public void setYear(int year)
    { 
        this.year = year; 
    }
    public double getMileage() 
    { 
        return mileage;
    }
}
public class Main 
{
    public static void main(String[] args) 
    {
        Car car = new Car("Toyota", "Corolla", 2020, 18.5);

        System.out.println
        (
            "Company Name: " + car.getCompanyName() + 
            "\nModel Name: " + car.getModelName() +
            "\nYear: " + car.getYear() +
            "\nMileage: " + car.getMileage() + " km/l"
        );

        car.setCompanyName("Honda");
        car.setModelName("Civic");
        car.setYear(2022);

        System.out.println
        (
            "\n--- After Update ---" +
            "\nCompany Name: " + car.getCompanyName() + 
            "\nModel Name: " + car.getModelName() +
            "\nYear: " + car.getYear() +
            "\nMileage: " + car.getMileage() + " km/1"
        );
    }
}

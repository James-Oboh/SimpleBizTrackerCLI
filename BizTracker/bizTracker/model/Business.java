package bizTracker.model;
public class Business {
    String name;
    double revenue;
    int week;
    int Id;
    
    public void setName(String name){
        this.name = name;

    }

    public String getName(){
        return name;
    }

    public void setRevenue(double revenue){
        this.revenue = revenue;

    }

    public double getRevenue(){
        return revenue;
    }

    public void setWeek(int week){
        this.week = week;

    }

    public int getWeek(){
        return week;
    }

    public Business(String name, double revenue, int week){
        this.name=name;
        this.revenue = revenue;
        this.week = week;
    }

    public void weeklySummaries(Business business){
        System.out.println("Business name:"+business.getName());
        System.out.println("Week "+business.getWeek()+" had a revenue of"+business.getRevenue());
    }

    public void setId(int Id){
        this.Id = Id;
    }

    public int getId() {
        return Id;
    }

}

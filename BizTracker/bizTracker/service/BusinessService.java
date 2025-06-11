package bizTracker.service;

import bizTracker.model.Business;
import java.util.List;

public class BusinessService {
    public double calculateTotalRevenue(List<Business> businesses) {
        double total = 0;
        for (Business b : businesses) {
            total += b.getRevenue();
        }
        return total;
    }

    public void addBusiness(List<Business> businesses, Business business) {
        for(Business b: businesses){
            if (b.getName().equals(business.getName())){
                System.out.println("Business already exists!");
                return;
            }
            
                
                
           

        }
        businesses.add(business);
       // businesses.add(business);
    }

    public void printAllBusinesses(List<Business> businesses) {
        for (Business b : businesses) {
            System.out.println("Name: " + b.getName() + ", Revenue: " + b.getRevenue() + ", ID: " + b.getId());
        }
    }

    public Business findBusinessByName(List<Business> businesses, String name){
        
        for( Business b: businesses){
            if(b.getName().equalsIgnoreCase(name)){
                return b;
            }
            

        }
        return null;


    }
}
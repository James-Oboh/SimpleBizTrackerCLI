package bizTracker.controller;

import java.util.ArrayList;


import bizTracker.model.Business;
import bizTracker.service.BusinessService;

public class useBizTracker {
    public static void main(String[]args){
        ArrayList<Business>bizTest1 = new ArrayList<Business>();
        bizTest1.add(new Business("bizTracker1", 60000, 1));
        bizTest1.add(new Business("bizTracker2", 20000, 2));
        double totalRevenue =0;

        for(Business bizloop:bizTest1){
            if(bizloop.getName().equals(bizloop.getName())){
                  totalRevenue+=bizloop.getRevenue();
                  bizloop.weeklySummaries(bizloop);
            }
            else{
                System.out.println(totalRevenue);
                bizloop.weeklySummaries(bizloop);
            }
                      
        }

        ArrayList<Business>bizTest2 = new ArrayList<>();
        BusinessService service = new BusinessService();

        service.addBusiness(bizTest2,new Business("bizTracker2", 500000, 5));
        service.addBusiness(bizTest2,new Business("bizTracker2", 69000, 10));

        service.printAllBusinesses(bizTest2);
        double totalRev=service.calculateTotalRevenue(bizTest2);

        System.out.println("Total revenue:"+totalRev);

        Business found = service.findBusinessByName(bizTest1, "bizTracker1");
        if (found != null) {
            System.out.println("Found: " + found.getName());
        } else {
            System.out.println("Business not found!");
        }
    }
}

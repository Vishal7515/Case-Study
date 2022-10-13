package Test;

import java.util.*;

import Agency.TravelAgency;
import controller.tourPackage;
public class PkgTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TravelAgency ta=new TravelAgency();
try {
	for(tourPackage p:ta.generatePackageCost()) {
		System.out.println(p.package_id+" | "+p.source_place+"-"+p.destination_place+"|"+p.no_of_days+" days|Rs."+p.package_cost);
	}
	
	System.out.println("\n-------Ordering By No. of Days-------");
	for(tourPackage p:ta.findPackagesWithMinimumNumberOfDays()){
		System.out.println(p.package_id+" | "+p.source_place+"-"+p.destination_place+"|"+p.no_of_days+" days|Rs."+p.package_cost);
	}
}
catch(Exception ex) {
	System.out.println(ex.getMessage());
}
	}

}
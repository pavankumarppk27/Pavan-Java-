package com.hibernate.data;

import java.util.ArrayList;
import java.util.List;

import com.hibernate.model.Hosting;

public class HostingData {

	
	
	public List<Hosting> getHostingData(){
		
		List<Hosting> hostingList = new ArrayList<>();
        hostingList.add(new Hosting(1, "liquidweb.com", 80000));
        hostingList.add(new Hosting(2, "linode.com", 90000));
        hostingList.add(new Hosting(3, "digitalocean.com", 120000));
        hostingList.add(new Hosting(4, "aws.amazon.com", 200000));
        hostingList.add(new Hosting(5, "mkyong.com", 1));
        hostingList.add(new Hosting(6, "linode.com", 100000));

		return hostingList;
	}
	
	
	
}

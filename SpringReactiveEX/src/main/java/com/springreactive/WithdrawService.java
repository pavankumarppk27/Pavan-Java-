package com.springreactive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple3;

public class WithdrawService {

	public static void main(String[] args) {

		WithDraw withdraw = new WithDraw(94569852l, "sb345", "SBI", "NRT", 509458d);

		List<WithDraw> list = Arrays.asList(
				new WithDraw(94569852l, "sb345", "SBI", "SRT", 509458d),
				new WithDraw(84569852l, "hb345", "HBI", "HRT", 609458d),
				new WithDraw(74569852l, "ib345", "IBI", "IRT", 709458d),
				new WithDraw(64569852l, "ab345", "ABI", "ART", 809458d),
				new WithDraw(54569852l, "bb345", "BBI", "BRT", 909458d),
				new WithDraw(44569852l, "cb345", "CBI", "CRT", 409458d),
				new WithDraw(34569852l, "db345", "DBI", "DRT", 309458d));
		
		
		
		List<Empl> empList1 = new ArrayList<Empl>();

		
		empList1.add(new Empl(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		empList1.add(new Empl(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		empList1.add(new Empl(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		empList1.add(new Empl(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		empList1.add(new Empl(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		empList1.add(new Empl(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		empList1.add(new Empl(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		empList1.add(new Empl(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		empList1.add(new Empl(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		
		List<Empl> empList2 = new ArrayList<Empl>();

		
		empList2.add(new Empl(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		empList2.add(new Empl(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		empList2.add(new Empl(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		empList2.add(new Empl(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		empList2.add(new Empl(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		empList2.add(new Empl(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		empList2.add(new Empl(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		empList2.add(new Empl(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		
		getInfo(list);
		
		System.out.println("check it");
		
		getBal(list);
		
		monoZip(list,empList1,empList2);

	}

	private static void monoZip(List<WithDraw> list, List<Empl> empList1, List<Empl> empList2) {
		// TODO Auto-generated method stub
		
		Mono<List<WithDraw>> just = Mono.just(list);
		Mono<List<Empl>> just2 = Mono.just(empList1);
		Mono<List<Empl>> just3 = Mono.just(empList2);
		
		Mono<Tuple3<List<WithDraw>, List<Empl>, List<Empl>>> zip = Mono.zip(just, just2,just3);
		
		System.out.println("check it");
				
				zip.map(val->{
					
					List<WithDraw> t1 = val.getT1();
					System.out.println(t1.toString());
					List<Empl> t2 = val.getT2();
					List<Empl> t3 = val.getT3();
					
					return null;
				});
			
		
		
	}

	private static void getInfo(List<WithDraw> list) {
		// TODO Auto-generated method stub
		
		Flux<WithDraw> fromIterable = Flux.fromIterable(list);
		
		
		fromIterable.flatMap(val->{
		
			return Flux.just(val)
					   .map(m->{
						   System.out.println(m);
						   return getValues(m);
					   });
		});
		
		
		
	}

	private static WithDraw getValues(WithDraw m) {
		// TODO Auto-generated method stub
		
		System.out.println(m);
		
		return m;
	}
	
	public static Mono<List<WithDraw>> getBal(List<WithDraw> list){
		
		Flux<WithDraw> fromIterable = Flux.fromIterable(list);
		
		return fromIterable.collectList();		
	}
	
	
	public static Flux<WithDraw> getMono(List<WithDraw> list){
		
		Flux<WithDraw> fromIterable = Flux.fromIterable(list);
		
		return fromIterable.map(val->{
			return val;
		});
		
	}

	

}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Hospital {

	public static void main(String[] args) {

		Patients p1=new Patients("P1",20,"Corona",15000);
		Patients p2=new Patients("P2",26,"Fever",5000);
		Patients p3=new Patients("P3",29,"Corona",8000);
		Patients p4=new Patients("P4",23,"Corona",15000);
		
		/*List<Patients> ptn=new ArrayList<Patients>();
		ptn.add(new Patients("P1",20,"Corona",15000));
		ptn.add(new Patients("P2",26,"Corona",5000));
		ptn.add(new Patients("P3",29,"Corona",8000));
		ptn.add(new Patients("P4",223,"Corona",15000));
		
		ptn.stream().filter(p->p.getDisease().startsWith("F")).forEach(System.out::println);*/
		
		
		List<Patients> patient=Arrays.asList(p1,p2,p3,p4);
		patient.stream().filter(p->p.getDisease().equals("Corona")&& p.getAge()<25).forEach(System.out::println);
		
		Double avgBillPaid=patient.stream().filter(p->p.getDisease().equals("Corona"))
				.collect(Collectors.averagingDouble(Patients::getBill));
		System.out.println("Average Bill Paid" +avgBillPaid);

	}

}

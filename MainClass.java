package Observer;

public class MainClass {

	public static void main(String[] args) {
		Name name = new Name();
		
		Observer ClD = new NameObs("LCD");
		Observer CLE = new NameObs("CLE");
		Observer CLR = new NameObs("CLR");
		Observer CLT = new NameObs("CLT");
		
		name.AddObs(CLT);
		name.AddObs(CLR);
		name.AddObs(CLE);
		name.AddObs(ClD);
		
		name.setTopic("New Client here!!!");
		

	}

}

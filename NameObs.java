package Observer;

public class NameObs implements Observer {
	
	private String name;
	private Observable topic;
	

	

	public NameObs(String name) {
		this.name = name;
	}

	@Override
	public void Update() {
		if(this.topic == null) {
			System.out.println(this.getName() + "no name");
			return;
		}
		String lastName = this.topic.getUpdate();
		System.out.println(this.getName()+ "update:" + lastName);
		
	}

	@Override
	public void setName(Observable topic) {
		this.topic = topic ;

	}
	public String getName() {
		return name;
	}

}

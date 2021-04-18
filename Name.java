package Observer;
import java.util.ArrayList;
import java.util.List;

public class Name implements Observable {

	private List<Observer> observers;
	private String Name;
	
	public Name() {
		this.observers = new ArrayList<>();
	}
	
	@Override
	public void AddObs(Observer observer) {
		this.observers.add(observer);
		observer.setName(this);
		
	}

	@Override
	public void RemoveObs(Observer observer) {
		this.observers.remove(observer);
		
	}

	@Override
	public void NotificationObs() {
	for(Observer observer: this.observers) {
		observer.Update();
	}
		
	}
	@Override
	public String getUpdate() {
		return this.Name;
	}
	
	public void setTopic(String Name) {
		this.Name = Name;
		this.NotificationObs();
	}
		
	}



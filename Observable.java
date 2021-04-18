package Observer;

public interface Observable {

	void AddObs(Observer observer);
	void RemoveObs(Observer observer);
	
	void NotificationObs();
   String getUpdate();
}

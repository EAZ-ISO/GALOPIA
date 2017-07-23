package ma.okteam.galopia.view.model;

public abstract class OwaspBean<T> {

	protected T id;

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}
	
	public T getOwaspId() {
		return id;
	}
}

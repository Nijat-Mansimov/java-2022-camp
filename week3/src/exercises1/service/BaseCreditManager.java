package exercises1.service;

public abstract class BaseCreditManager {
	public abstract void calculate();
    public void save() {
        System.out.println("Kaydedildi");
    }
}

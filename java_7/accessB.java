package java_7;
import java_7.accessA;
public class accessB {
	public static void main(String[] args) {
		new accessA().methodPublic();
		new accessA().methodProtected();
		new accessA().methodDefault();
	}
	public void methodPublic() {}
	public void methodProtected() {}
	void methodDefault() {}
	private void methodPrivate() {}
}

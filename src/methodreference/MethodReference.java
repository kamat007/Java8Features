package methodreference;

class Test2001{
	void display() {
		System.out.println("Built in 2001");
	}
}

@FunctionalInterface
interface I1{
	Test2001 getObject();
}

public class MethodReference {

	public static void main(String[] args) {
		I1 obj = Test2001::new;
		obj.getObject().display();;
	}

}



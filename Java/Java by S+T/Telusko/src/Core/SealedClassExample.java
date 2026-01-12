package Core;

sealed class Father permits S1, S2{	//want to use sealed class -> parent(sealed) and subclass(final, non-sealed) keyowrd should be used
	
}

final class S1 extends Father{	
	
}

final class S2 extends Father{
	
}

class S3{
	
}
public class SealedClassExample {	//want to restrict subclasses use sealed class

	public static void main(String[] args) {
		

	}

}

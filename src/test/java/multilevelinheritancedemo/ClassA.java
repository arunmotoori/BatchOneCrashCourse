package multilevelinheritancedemo;

public class ClassA {
	int a = 5;
}

class ClassB extends ClassA{
	int b = 10;	
}

class ClassC extends ClassB{
	int c = 15;
}

class ClassD extends ClassC{
	int d = 20;
}

class ClassE extends ClassD{
	int e = 25;
}

package multilevelinheritancedemo;

public interface InterfaceA {
	int a = 5;
}

interface InterfaceB extends InterfaceA{
	int b = 10;
}

interface InterfaceC extends InterfaceB{
	int c = 15;
}

interface InterfaceD extends InterfaceC{
	int d = 20;
}

class Sample implements InterfaceD{
	static int e = 25;
}

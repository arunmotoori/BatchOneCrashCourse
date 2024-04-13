package hierarchicalinheritancedemo;

public interface InterfaceP {
	int p = 5;
}

interface InterfaceA extends InterfaceP{
	int a = 10;
}

interface InterfaceB extends InterfaceP{
	int b = 15;
}

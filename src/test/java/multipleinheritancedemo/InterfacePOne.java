package multipleinheritancedemo;

public interface InterfacePOne {
	int pOne = 5;
}

interface InterfacePTwo{
	int pTwo = 10;
}

interface InterfaceA extends InterfacePOne,InterfacePTwo{
	
}

class ClassA implements InterfacePOne,InterfacePTwo{
	
}

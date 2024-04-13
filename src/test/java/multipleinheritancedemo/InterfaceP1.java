package multipleinheritancedemo;

public interface InterfaceP1 {
	int p1 = 5;
}

interface InterfaceP2{
	int p2 = 10;
}

class ClassP{
	int p = 15;
}

class ClassC extends ClassP implements InterfaceP1,InterfaceP2{
	
}

/*
class ClassD implements InterfaceP1,InterfaceP2 extends ClassP {
	
}*/
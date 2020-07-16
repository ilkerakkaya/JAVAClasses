package day35interfacedt;

/*
 1-Interface==> interface use "extends"
 2-Class (abstract or concrete)==> interface use "implements"
 3-class==>class use "extends"
 4-interface==>class: it is not valid because parent of an interface must be interface
 */

public interface Gas extends Engine {
	
	int price=1;
	void eco();
	

}

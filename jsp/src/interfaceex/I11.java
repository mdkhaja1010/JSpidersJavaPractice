package interfaceex;

public interface I11 {
	public void delete();
	public void copy();
	public void paste();
	public void undo();
	public void enter();
	

}
abstract class KeyBoard implements I11{
	public void delete() {
		System.out.println("form delete successful");
		
	}
	public void copy() {
		System.out.println("from copy sucessfull");
	}
}
class Interpetor extends KeyBoard{
	public void paste() {
		System.out.println("from past successful");			
	}
	public void undo() {
		System.out.println("from undo successful");
		
	}
	public void enter() {
		System.out.println("from enter successful");
	}
}

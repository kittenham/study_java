package realization;

public class JdbcOracle {
/*	
	public void add() {
		System.out.println("[orcle]학생정보를 삽입하는 기능을 제공하는 메소드");
	}
	
	public void modify() {
		System.out.println("[orcle]학생정보를 변경하는 기능을 제공하는 메소드");
	}
	
	public void remove() {
		System.out.println("[orcle]학생정보를 삭제하는 기능을 제공하는 메소드");
	}
	
	public void search() {
		System.out.println("[orcle]학생정보를 검색하는 기능을 제공하는 메소드");
	}
	
*/	
	
	
	@Override
	public void insert() {
		System.out.println("[mysql]학생 정보를 삽입하는 기능을 제공하는 메소드");
	}
	
	@Override
	public void update() {
		System.out.println("[mysql]학생 정보를 변경하는 기능을 제공하는 메소드");
	}
	
	@Override
	public void delete() {
		System.out.println("[mysql]학생 정보를 삭제하는 기능을 제공하는 메소드");
	}
	
	@Override
	public void select() {
		System.out.println("[mysql]학생 정보를 제공하는 기능을 제공하는 메소드");
	}
	
}

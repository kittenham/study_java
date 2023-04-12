package realization;

//클래스를 이용하여 인터페이스 추출가능
//=> 클래스에서 오른쪽 마우스 - Refactor - Extract interface - 인터페이스 이름 입력 - 추상메소드 선택 - OK
public class JdbcMysql implements Jdbc {
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

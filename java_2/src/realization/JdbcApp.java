package realization;

public class JdbcApp {
	public static void main(String[] args) {
/*		
		Jdbc mysql = new JdbcMysql();
		
		mysql.insert();
		mysql.update();
		mysql.delete();
		mysql.select();
*/
/*		
		//1. 시스템 변경에 따른 클래스 교체시 메소드 호출 명령 변경
		// => 객체간의 결합도가 높기 때문에 유지보수의 효율성 감소
		JdbcOrcae oracle = new JdbcOracle();
		
		oracle.add();
		oracle.modify();
		oracle.remove();
		oracle.search();
		
*/		
		//객체간의 결합도를 낮추기 위해 참조변수는 인터페이스를 사용하여 선언
//		Jdbc jdbc = new JdbcMysql();
		
		//2. 시스템변경에 의해 클래스 교체시 메소드 호출 명령 미변경
		//객체만 바꿔주면 되지 메소드 호출 명령을 바꿀 필요가 없다.
		//=> 객체간의 결합도를 낮춰 유지보수의 효율성을 증가시킴
		Jdbc jdbc = new JdbcOracle();
		
		//참조변수로 인터페이스의 추상메소드를 호출하면 묵시적 객체 형변환에 의해 자식클래스의 객체를 참조하여 자식클래스의 메소드를 호출할 수 있다.
		jdbc.insert();
		jdbc.update();
		jdbc.delete();
		jdbc.select();
		
		
	}
}

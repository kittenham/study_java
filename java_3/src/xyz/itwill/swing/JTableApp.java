package xyz.itwill.swing;

import java.awt.BorderLayout;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableApp extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public JTableApp(String title) {
		super(title);
		
		String[] columName = {"학번", "이름", "전화번호"};
		String[][] rowData = {{"1000", "홍길동", "010-1234-5678"}
				, {"2000", "임꺽정","010-2345-6789"}, {"3000","전우치","010-3456-7891"}
				, {"4000","일지매","010-4567-8912"}, {"5000","장길산","010-5678-9123"}};
		
		
		//DefaultTableModel 클래스 : 테이블 관련 정보를 저장하기 위한 클래스
		// => 테이블의 행 또는 열(셀 : cell)을 조작(삽입, 삭제, 변경)할 수 있는 메소드 제공
		DefaultTableModel defaultTableModel = new DefaultTableModel(rowData, columName);
		
		//Vector 클래스 : 다수의 객체를 저장하기 위한 콜렉션 클래스 - List 인터페이스 상속
		Vector<String> vector = new Vector<>();
		vector.add("6000");
		vector.add("홍경래");
		vector.add("010-6789-1234");
		
		//DefaultTableModel.addRow(Object[] rowData) : 테이블에 행을 추가하는 메소드
		defaultTableModel.addRow(vector);
		
		
		//JTable 클래스 : 값을 행과 열로 구성된 표 형식으로 출력하기 위한 컴퍼넌트 
		//(JTable은 실제로 TabelModel과 같이 많이 사용됨 + ScrollPane까지(스크롤))
		JTable jTable = new JTable(rowData, columName);
		
		JScrollPane jScrollPane = new JScrollPane(jTable);
		
		getContentPane().add(jScrollPane, BorderLayout.CENTER);
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(700, 200, 500, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JTableApp("JTable 컴퍼넌트");
	}
	
}

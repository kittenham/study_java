package example;

public class ArrayExample {
	public static void main(String[] args) {
		//사람들의 나이를 저장한 배열 생성하여 참조변수에 저장		
		int[] age={27,16,22,36,57,60,43,23,14,29,44,52,59,51,39,33,11};
		
		//배열에 저장된 모든 사람들의 나이 평균을 계산하여 출력하세요.
		int tot=0, avg=0;
        for(int i=0;i<age.length;i++) {
            tot += age[i];
        }
        System.out.println("모든 사람들의 나이 평균 = " + (tot / age.length));


        System.out.println("===============================================================");
        //배열에 저장된 사람들의 나이를 연령별로 구분하여 인원수를 계산하여 출력하세요.
        //ex) 10대 = 3명
        //    20대 = 4명
        //    ...
        //    60대 = 1명


        int[] count = new int[6];
        int num;
        for(int i=0;i<age.length;i++){
            num=age[i]/10;
            if(num==1){
                count[0]++;
            }
            if(num==2){
                count[1]++;
            }
            if(num==3){
                count[2]++;
            }
            if(num==4){
                count[3]++;
            }
            if(num==5){
                count[4]++;
            }
            if(num==6){
                count[5]++;
            }
        }
        for(int i=0;i<count.length;i++){
            System.out.println((i+1)*10+"대 = "+count[i]+"명");
        }
		System.out.println("===============================================================");
	}
	
}






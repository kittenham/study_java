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
        
        //<강사풀이>
        int sum=0;
        
        

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
		
		
		//강사풀이(1) -> no효율적
		/*
		int cnt10=0, cnt20=0, cnt30=0, cnt40=0, cnt50=0, cnt60=0;
		
		for (int nai:age) {
			if(nai>=10&&nai<20) cnt10++;
			else if(nai>=20&&nai<30) cnt20++;
			else if(nai>=30&&nai<40) cnt30++;
			else if(nai>=40&&nai<50) cnt40++;
			else if(nai>=50&&nai<60) cnt50++;
			else if(nai>=60&&nai<70) cnt60++;			
		}
		
		System.out.println("10대 = "+cnt10+"명");
		System.out.println("20대 = "+cnt20+"명");
		System.out.println("30대 = "+cnt30+"명");
		System.out.println("40대 = "+cnt40+"명");
		System.out.println("50대 = "+cnt50+"명");
		System.out.println("60대 = "+cnt60+"명");
	*/
		System.out.println("===========================");
	
		
		//풀이(2)
		int[] cnt=new int[6];
				
		for (int nai:age) {
			if(nai>=10&&nai<20) cnt[0]++;
			else if(nai>=20&&nai<30) cnt[1]++;
			else if(nai>=30&&nai<40) cnt[2]++;
			else if(nai>=40&&nai<50) cnt[3]++;
			else if(nai>=50&&nai<60) cnt[4]++;
			else if(nai>=60&&nai<70) cnt[5]++;		

		}
		
		 for(int i=0;i<count.length;i++){
	            System.out.println((i+1)*10+"대 = "+count[i]+"명");
	            
	    System.out.println("===========================");
	    
	    
	    //풀이3 - switch문사용
	    for(int nai : age) {
			
			switch(nai / 10) {
			case 1: cnt[0]++; break;
			case 2: cnt[1]++; break;
			case 3: cnt[2]++; break;
			case 4: cnt[3]++; break;
			case 5: cnt[4]++; break;
			case 6: cnt[5]++; break;
			}
	    }
		System.out.println("===========================");

	    
	    //풀이4 - 
	    for(int nai2 :age) {
	    cnt[nai2/10-1]++;
	    }

	
}
	}
}






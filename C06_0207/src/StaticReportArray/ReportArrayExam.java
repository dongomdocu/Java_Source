package StaticReportArray;

public class ReportArrayExam {
	static int MaxReportsCount = 10;
	static int cnt = 0;
	
	public static void main(String[] args) {
		//int MaxReportsCount = 10;	
		//int cnt = 0;
		ReportArray reports[] = new ReportArray[MaxReportsCount];
		
		cnt = inputData(reports);
		printRst(reports, cnt);
		System.out.println("총 학생수 : " + MaxReportsCount);
		System.out.printf("총 평균의 평균 = %f", ReportArray.printAvgOfAvg()); 
	}
	
	static void printRst(ReportArray reports[], int cnt) {
		ReportArray.print_format();
		for(int j = 0; j < cnt; j++) {
			reports[j].output_report();
		}
		System.out.println("=======================================================================================================================");		
	}
	
	static int inputData(ReportArray reports[]) {
		//int MaxReportsCount = 10;
		int cnt = 0;
		for(int i = 0; i < MaxReportsCount; i++) {
			reports[i] = new ReportArray();
			if(reports[i].input_report()) {
				break;
			}
			reports[i].process_report();
			cnt ++;
		}
		return cnt;
		
	}

}

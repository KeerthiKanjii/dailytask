
public class Test {

	
		public static void main(String[] args) {
	        char branch = 'M';
	        int collegeYear = 2;
	        switch (collegeYear) {
	            case 1:
	                System.out.println("English, Maths, Science");
	                break;
	            case 2:
	                switch (branch) {
	                    case 'C':
	                        System.out.println("Subjects are for CSE");
	                        break;
	                    case 'E':
	                        System.out.println("Subjects are for ECE");
	                        break;
	                    case 'M':
	                        System.out.println("Subjects are for Mechanical");
	                        break;
	                    default:
	                        System.out.println("Invalid branch");
	                        break;
	                }
	                break;
	            case 3:
	                switch (branch) {
	                    case 'C':
	                        System.out.println("Subjects are for CSE");
	                        break;
	                    case 'E':
	                        System.out.println("Subjects are for ECE");
	                        break;
	                    case 'M':
	                        System.out.println("Subjects are for Mechanical");
	                        break;
	                    default:
	                        System.out.println("Invalid branch");
	                        break;
	                }
	                break;
	            default:
	                System.out.println("Invalid college year");
	                break;
	        }
	    }
	}
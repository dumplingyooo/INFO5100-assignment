package assignment2;

/**
 * Assignment for your lecture 2. Please finish all the questions under 'Assignment'
 * Please try to think the extra credit question. 
 * The deadline of this assignment is 09/21/2018 23:59 PST.
 * Please feel free to contact Amanda and Zane for any questions.
 */

class Employee {
    String name;
    int age;
    Gender gender;
    double salary;// salary per month
    double byPercent; //added new function so need to define

    // Constructor. Please set all the data in constructor.
    public Employee(String name, int age, Gender gender, double salary) {
            //write your code here
    	this.name = name;
    	this.age = age;
    	this.gender = gender;
    	this.salary = salary;
    }
    

	// Getter for `name`. Return the current `name` data
    public String getName() {
    		//write your code here
    	return name;
    }

    // Setter for `name`. Set `name` data
    public void setName(String name) {
    		//write your code here
    	this.name = name;
    }
    
    public void raiseSalary(double byPercent) {
    	double raise = this.salary * byPercent/100;
    	this.salary += raise;  // Triple Salarly means raiseSalary= salary + rate*salary
    }
    
	public double getSalary() {
		return salary;
	}
	
}

enum Gender {
    MALE,
    FEMALE;
}


public class Assignment2 {
    // Assignment
	
	

    /**
     * Write a method to calculate the Social Security Tax of an employee and print it.
     * If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.
     * If the salary is more than 8900, the Social Security Tax is 6.2% of 106,800.
     */
    public static double socialSecurityTax(Employee employee) {
		//write your code here
        double tax = 0;
    	if (employee.salary <= 8900) {
    		tax = employee.salary * 0.062;
    	}
    	else {
    		tax = 106800 * 0.062;
    	}
    	return tax;
    }

    /**
     * Write a method to calculate an employee's contribution for insurance coverage and print it.
     * Amount of deduction is computed as follows:
     * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
     */
    public static double insuranceCoverage(Employee employee) {
        //write your code here
    	double contribution = 0;
    	if (employee.age < 35) {
    		contribution = employee.salary * 0.03;
    	}
    	if (employee.age > 35 && employee.age <= 50) {
    		contribution = employee.salary * 0.04;
    	}
    	if (employee.age > 50 && employee.age < 60) {
    		contribution = employee.salary * 0.05;
    	}
    	if (employee.age >= 60) {
    		contribution = employee.salary * 0.06;
    	}
		return contribution;
    }

    /**
     * Write a method to sort three employees' salary from low to high, and then print their name in order.
     * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
     * John Alice Jenny
     * @return 
     * @return 
     */
    public static String sortSalary(Employee e1, Employee e2, Employee e3) {
        //write your code here
    	String i = null;
    	String j = null;
    	String k = null;  // I tried to use sorting algorithm, but do not know how to print their name, so I use a easier way. 
    	
    	if (e1.salary < e2.salary) {
    		if (e1.salary > e3.salary) {
    			i = e3.name;
    			j = e1.name;
    			k = e2.name;
    		}
    		else {
    			if (e3.salary < e2.salary) {
    				i = e1.name;
    				j = e3.name;
    				k = e2.name;
    			}
    			else {
    				i = e1.name;
    				j = e2.name;
    				k = e3.name;
    			}
    		}    		
    	}
    	else {
    		if (e2.salary > e3.salary) {
    			i = e3.name;
    			j = e2.name;
    			k = e1.name;
    		}
    		else {
    			if(e3.salary < e1.salary) {
    				i = e2.name;
    				j = e3.name;
    				k = e1.name;
    			}
    			else {
    				i = e2.name;
    				j = e1.name;
    				k = e3.name;
    			}
    		}
    	}
    	return i+ "<" + j + "<" + k;
    }

    /**
     * Write a method to raise an employee's salary to three times of his/her original salary.
     * Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
     * Do not change the input of this method.
     * Try to add a new method in Employee class: public void raiseSalary(double byPercent)
     * @return 
     */
    public static double tripleSalary(Employee employee) {
        //write your code here
    	employee.raiseSalary(200); //Triple Salary is the basic salary plus the 200% of the salary,so the byPercent=200.
    	return employee.getSalary();
    }

    

	public static void main(String args[]) {
		Employee a = new Employee("AAA", 25, Gender.FEMALE, 9500);
		Employee b = new Employee("BBB", 40, Gender.MALE, 2500);
		Employee c = new Employee("CCC", 65, Gender.MALE, 1500);
		
		System.out.println("AAA's social Security Tax:" + socialSecurityTax(a));
		System.out.println("BBB's social Security Tax:" + socialSecurityTax(b));
		System.out.println("CCC's social Security Tax:" + socialSecurityTax(c));
		
		System.out.println("AAA's insurance coverage:" + insuranceCoverage(a));
		System.out.println("BBB's insurance coverage:" + insuranceCoverage(b));
		System.out.println("CCC's insurance coverage:" + insuranceCoverage(c));
		
		System.out.println("salary from low to high:" + sortSalary(a, b, c));
		
		System.out.println("AAA's raise an employee's salary to three times:" + tripleSalary(a));
		System.out.println("BBB's raise an employee's salary to three times:" + tripleSalary(b));
		System.out.println("CCC's raise an employee's salary to three times:" + tripleSalary(c));		
		
	}
    
    

    //Extra credit

    /**
     * I have written some code below. What I want is to swap two Employee objects.
     * One is Jenny and one is John. But after running it, I got the result below:
     * Before: a=Jenny
     * Before: b=John
     * After: a=Jenny
     * After: b=John
     * There is no change after swap()! Do you know the reason why my swap failed?
     * Write your understanding of the reason and explain it.
     */
    /*
     write your understanding here.
     
     Answer£º
     Employee in this program are passed by value, not by reference.
     We can't use a swap function with the semantics swap(a, b) in Java, not like C++
     
     
     
     */
 /*   public static void main(String[] args) {
        Employee a = new Employee("Jenny", 20, Gender.FEMALE, 2000);
        Employee b = new Employee("John", 30, Gender.MALE, 2500);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
    }

    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
    }*/
}


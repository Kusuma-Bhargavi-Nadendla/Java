import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;
import java.text.ParseException;
import java.text.SimpleDateFormat;
class Person
{
  private String name, aadhar;
  private char gender;
  private Date dob;
  public Person ()
  {
    name = null;
    aadhar = null;
    gender = '\0';
    dob = new Date ();
  }
  public Person (String name, String aadhar, char gender, Date dob)
  {
    this.name = name;
    this.aadhar = aadhar;
    this.gender = gender;
    this.dob = dob;
  }
  public void setName (String name)
  {
    this.name = name;
  }
  public void setAadhar (String aadhar)
  {
    this.aadhar = aadhar;
  }
  public void setGender (char gender)
  {
    this.gender = gender;
  } public void setDate (Date dob)
  {
    this.dob = dob;
  } public String getName ()
  {
    return this.name;
  }
  public String getAadhar ()
  {
    return this.aadhar;
  }
  public char getGender ()
  {
    return this.gender;
  }
  public Date getDate ()
  {
    return this.dob;
  }
  public String computeAge ()
  {
    Date today_date = new Date ();
    long t = today_date.getTime () - this.dob.getTime ();
    long d = (t / (1000 * 60 * 60 * 24)) % 365;
    long m = (t / (1000 * 60 * 60 * 24));
    m = (m / 30) % 12;
    long y = t / (1000 * 60 * 60 * 24);
    y = y / 365;
    return new String (y + " years " + m + " months " + d + " days ");
  }
}

class Student extends Person
{
  private String rollNo, institute, program, branch;
  private String[] subjects = new String[25];
  private int si = -1;
  private int ci = -1;
  private char[] grades;
  public void setSub (String subject)
  {
    subjects[++si] = subject;
  }
  public void setGraArr ()
  {
    grades = new char[30];
  }
  public void setGrade (char grade)
  {

    this.grades[++ci] = grade;
  }
  public void setRoll (String rollno)
  {
    this.rollNo = rollno;
  }
  public void setInstitute (String institute)
  {
    this.institute = institute;
  } public void setProgram (String program)
  {
    this.program = program;
  }
  public void setBranch (String branch)
  {
    this.branch = branch;
  }
  public String getBranch ()
  {
    return this.branch;
  }
  public String[] getSubject ()
  {
    return this.subjects;
  }
  public char[] getGrade ()
  {
    return this.grades;
  }
  public String getProgram ()
  {
    return this.program;
  }
  public String getInstitute ()
  {
    return this.institute;
  }
  public String getRollno ()
  {
    return this.rollNo;
  }
  public Student ()
  {
    this.rollNo = this.program = this.institute = this.branch = null;
    subjects = null;
    grades = null;
  }
  public void studentAdmission (String name, String aadhar, String gender,
				String dob, String institute) throws Exception
  {
    super.setName (name);
    super.setAadhar (aadhar);
    super.setGender (gender.charAt (0));
    super.setDate (new SimpleDateFormat ("dd/mm/yyyy").parse (dob));
    this.institute = institute;
    System.out.println ("Admission of Student completed successfully");
  }
  public void studentProgram (String program, String branch,
			      String subjects[], String rollNo)
  {
    this.program = program;
    this.branch = branch;
    this.rollNo = rollNo;
    this.subjects = subjects;
    System.out.println ("Enrollment of program completed Successfully");
  }
  private String getSubjects ()
  {
    String gss = new String ();
    if (this.si < 0)
      {
	return new String ("No subjects assigned yet");
      }
    for (int gi = 0; gi <= this.si; gi++)
      {
	gss += subjects[gi];
	gss += " ";
      } return gss;
  }
  private String getGrades ()
  {
    String ggs = new String ();
    if (this.ci < 0)
      {
	return new String ("Not assigned grades yet");
      }
    for (int cgi = 0; cgi <= this.ci; cgi++)
      {
	ggs += subjects[cgi] + " : " + grades[cgi];
	ggs += '\n';
      } return ggs;
  }
  public void printDetails ()
  {
    System.out.println ("Name-" + getName () + "\nAadhar-" + getAadhar () +
			"\nGender-" + getGender () + "\nAge-" +
			super.computeAge () + "\nDate of Birth-" +
			getDate () + "\nInstitute-" + institute);
    System.out.println ("Enrolled program-" + program + "\nBranch-" + branch +
			"\nSubjects-" + this.getSubjects () +
			"\nRoll number-" + rollNo);
    System.out.println ("\nGrade Report of student");
    System.out.println (this.getGrades ());
  }
}

class Faculty extends Person
{
  private String eid, branch, institute, subject;
  private long salary;
  public Faculty ()
  {
    eid = branch = institute = subject = null;
    salary = 0;
  }
  public Faculty (String eid, String branch, String institute, String subject,
		  long salary)
  {
    this.eid = eid;
    this.branch = branch;
    this.institute = institute;
    this.subject = subject;
    this.salary = salary;
  }
  public void newFaculty (String name, String aadhar, String gender,
			  String date, String eid,
			  String institute) throws Exception
  {
    super.setName (name);
    super.setAadhar (aadhar);
    super.setGender (gender.charAt (0));
    super.setDate (new SimpleDateFormat ("dd/mm/yyyy").parse (date));
    this.eid = eid;
    this.institute = institute;
    System.out.println ("New Faculty Added to the institute Successfully");
  }
  public void assignFaculty (String branch, String subject, int salary)
  {
    this.branch = branch;
    this.subject = subject;
    this.salary = salary;
    System.out.println ("Faculty assigned with Department Successfully");
  }
  void assignGrades (Student st, char grade)
  {
    st.setSub (this.subject);
    st.setGrade (grade);
    System.out.println ("Student assigned with grades Successfully");
  }
  public void printDetails ()
  {
    System.out.println ("Personal details\nName-" + getName () + "\nAadhar-" +
			getAadhar () + "\nGender-" + getGender () +
			"\nDate of Birth-" + getDate ());
    System.out.println ("Institute details\nEmployee Id-" + this.eid +
			"\nSubject-" + this.subject + "\nSalary-" +
			this.salary + "\nBranch-" + this.branch +
			"\nInstitute-" + this.institute);
  }
}

class Main
{
  public static void main (String[]args) throws Exception
  {
    Scanner sc = new Scanner (System.in);
      ArrayList < Student > stu_arr = new ArrayList < Student > ();
      ArrayList < Faculty > fac_arr = new ArrayList < Faculty > ();
    int det = 0;
    boolean opt;
      loop1:while (1 > 0)
      {
	System.out.
	  print
	  ("1.Add Student\n2.Add Professor\n3.List Students\n4.List Faculty\n");
	System.out.
	  print ("5.Assign grades to Students\n6.Exit\nEnter your choice:");
	det = sc.nextInt ();
	String n, adhr, ds;
	char g;
	Student s = new Student ();
	Student s1 = new Student ();
	Faculty f1 = new Faculty ();
	if (det == 1 || det == 2)
	  {
	    System.out.println ("Enter details of person");
	    System.out.print ("Enter name:");
	    n = sc.next ();
	    System.out.print ("Enter Aadhar number:");
	    adhr = sc.next ();
	    System.out.print ("Enter gender:");
	    g = sc.next ().charAt (0);
	    System.out.print ("Enter Date of Birth :");
	    ds = sc.next ();
	    SimpleDateFormat obj = new SimpleDateFormat ("dd/mm/yyyy");
	    Date date = obj.parse (ds);
	    if (det == 1)
	      {
		System.out.print ("Enter institute:");
		String i = sc.next ();
		  s.studentAdmission (n, adhr, String.valueOf (g), ds, i);
		  System.out.println ("Enrolling student into department");
		  System.out.print ("Enter rollno:");
		String r = sc.next ();
		  System.out.print ("Enter program:");
		String p = sc.next ();
		  System.out.print ("Enter branch:");
		String b = sc.next ();

		  String[] subj = new String[25];
		  s.setGraArr ();
		  s.studentProgram (p, b, subj, r);
		  stu_arr.add (s);
		  System.out.println ("Student inserted into array");
	      }
	    if (det == 2)
	      {
		System.out.print ("Enter Faculty details\n");
		System.out.print ("Enter Employee Id:");
		String ei = sc.next ();
		  System.out.print ("Enter Branch name:");
		String fb = sc.next ();
		  System.out.print ("Enter Institute:");
		String fi = sc.next ();
		  System.out.print ("Enter subject name:");
		String sj = sc.next ();
		  System.out.print ("Enter Salary:");
		int fs = sc.nextInt ();
		Faculty f = new Faculty ();
		  f.newFaculty (n, adhr, String.valueOf (g), ds, ei, fi);
		  f.assignFaculty (fb, sj, fs);
		  fac_arr.add (f);
		  System.out.println ("Faculty added into array");
	      }
	  }
	else if (det == 3)
	  {
	    int stu_count = stu_arr.size ();
	    if (stu_count == 0)
	      {
		System.out.println ("No Students enrolled yet.");
		continue;
	      }
	    System.out.println ("Students Enrolled are");
	    for (int j = 0; j < stu_count; j++)
	      {
		s1 = stu_arr.get (j);
		System.out.println (String.valueOf (j + 1) + ". " +
				    s1.getName ());
	      } System.out.
	      println
	      ("Do you wish to see complete details of student??\nyes-y\tno-n");
	    char cd = sc.next ().charAt (0);
	    if (cd == 'y')
	      {
		System.out.println ("Enter seriel number of student-");
		int sn = sc.nextInt ();
		s1 = stu_arr.get (sn - 1);
		s1.printDetails ();
	      }

	  }
	else if (det == 4)
	  {
	    int fac_count = fac_arr.size ();
	    if (fac_count == 0)
	      {
		System.out.println ("No Faculty assigned yet.");
		continue;
	      }
	    System.out.println ("Faculty working are ");
	    for (int p = 0; p < fac_count; p++)
	      {
		f1 = fac_arr.get (p);
		System.out.println (String.valueOf (p + 1) + ". " +
				    f1.getName ());
	      }
	    System.out.
	      println
	      ("Do you wish to see complete details of Faculty??\nyes-y\tno-n");
	    char cdf = sc.next ().charAt (0);
	    if (cdf == 'y')
	      {
		System.out.println ("Enter seriel number of Faculty-");
		int snf = sc.nextInt ();
		f1 = fac_arr.get (snf - 1);
		f1.printDetails ();
	      }
	  }
	else if (det == 5)
	  {
	    System.out.println ("Choose faculty to assign grades");
	    for (int fg = 0; fg < fac_arr.size (); fg++)
	      {
		f1 = fac_arr.get (fg);
		System.out.println (String.valueOf (fg + 1) + ". " +
				    f1.getName ());
	      } int fg = sc.nextInt ();
	    f1 = fac_arr.get (fg - 1);
	    System.out.println ("Assigning grades to students ");
	    for (int ag = 0; ag < stu_arr.size (); ag++)
	      {
		s1 = stu_arr.get (ag);
		System.out.println ("Enter Grade for " + s1.getName ());
		char gr = sc.next ().charAt (0);
		f1.assignGrades (s1, gr);
	      }
	  }
	else if (det == 6)
	  break loop1;
	else
	  System.out.println ("Invalid option");

      }

  }
}

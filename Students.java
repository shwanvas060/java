import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
/*<applet code="Students.java"  width=300 height=400></applet>*/

public class Students extends Applet {
 String s3,details;
 TextField roll,name,course,department,semester;
 Button submit;
 Panel p1,p2;
 Label display;
 public void init()
 {
 submit =new Button("SUBMIT");

 p1=new Panel();
 p1.setLayout(new GridLayout(6,2));
 p1.add(new Label("Student Roll No: "));
 roll = new TextField(5);
 p1.add(roll);
 p1.add(new Label("Student Name: "));
 name = new TextField(10);
 p1.add(name);

 p1.add(new Label("Course: "));
 course = new TextField(2);
 p1.add(course);

 p1.add(new Label("Semester: "));
 semester = new TextField(10);
 p1.add(semester);
 p1.add(new Label("Department: ")); 
 department = new TextField(10);
 p1.add(department);
 p1.add(submit);
 add(p1);
 submit.addActionListener((ActionListener) this);

 p2 = new Panel();
 p2.setLayout(new GridLayout(10,1));
 display = new Label();
 p2.add(display);
 add(p2);
 }
 public void actionPerformed(ActionEvent e)
 {
 	String str1 ="",str2= "",str3="",str4="", str5="",details;
 	Date date = new Date();
 	try {
    	SimpleDateFormat formatter = new
    	SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		str1 = roll.getText();
		str2 = name.getText();
 		str3 = course.getText();
 		str4 = semester.getText();
 		str5 = department.getText();
 		details = "Date is: "+ formatter.format(date) +"\nRoll:" + str1 + "\nName: " + str2 + "\nCourse: " + str3 + "\nSemester: "+str4 + "\nDepartment: " + str5;
		display.setText(details);
 	}
 	catch(Exception ex){
 		System.out.println(ex);
 	}
}
}

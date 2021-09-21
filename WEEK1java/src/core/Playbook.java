
package core;
import Human.Human;
import Human.Professor;
import Human.Student;
import view.Affichage;
public class Playbook {

	public static void main(String[] args) {
		// a human object type
		
		
		String genderRicardo="Maculin";
        String lnameRicardo="Jean Ricardo";
        String fnameRicardo="JEAN-FELIX";
        Human ricardo_obj = new Human(1,lnameRicardo,fnameRicardo, genderRicardo);
//        System.out.println(ricardo_obj.toString());
        Affichage.aff(ricardo_obj.toString());
        
        
        // let's create a professor object
        
        String prof_last_name= "Ricardo";
        String prof_first_name="Jhon";
        String prof_gender="Masculin";
        int prof_id=3;
        Professor ric_prof= new Professor(2,prof_last_name, prof_first_name,prof_gender ,prof_id);
        ric_prof.toString();
//        System.out.println(ric_prof.toString());
        Affichage.aff(ric_prof.toString());
        
        
        
        //let's make another one for student
        
        String genderStud="Feminin";
        String lnameStud="Anne";
        String fnameStud="JOSUE";
        int id_Stud= 4;
        Student ric_student = new Student(3,lnameStud, fnameStud, genderStud, id_Stud);
        ric_student.toString();
//        System.out.println(ric_student.toString());
        Affichage.aff(ric_student.toString());
        
        // 
        
       Course week1= new Course (1,"POO","JHON-HARY","Learn POO",200, ric_prof);
//       System.out.println(week1);
       Affichage.aff(week1.toString());
       
       
       //... materials
       Materials pc= new Materials ( 2,"Laptop ","hp",week1);
//       System.out.print(pc);
       Affichage.aff(pc.toString());
    
       
       
       
       
       
        
	}

}

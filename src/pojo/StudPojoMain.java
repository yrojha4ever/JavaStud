package pojo;

public class StudPojoMain {

	public static void main(String[] args) {
		StudentPojo stud = new StudentPojo();
		stud.setId(10);
		stud.setName("RAM");
		
		int id = stud.getId();
		System.out.println("Id = : "+ id);
		
		System.out.println("Name: "+ stud.getName());

	}

}

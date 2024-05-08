package in.asterisc.orm.model;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class StudentDao {
	private HibernateTemplate temp;

	public void setTemp(HibernateTemplate temp) {
		this.temp = temp;
	}
	
	
	public void save(Student s)
	{
		temp.save(s);
	}
	
	public void update(Student s)
	{
		temp.save(s);
	}
	
	public void delete(Student s)
	{
		temp.delete(s);
	}

}

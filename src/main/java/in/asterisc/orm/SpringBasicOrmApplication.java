package in.asterisc.orm;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import in.asterisc.orm.model.Student;
import in.asterisc.orm.model.StudentDao;

@SpringBootApplication
public class SpringBasicOrmApplication {

	public static void main(String[] args) {
		System.out.println("hello world");
	//	SpringApplication.run(SpringBasicOrmApplication.class, args);
		/* Resource r=new ClassPathResource("applicationContext.xml");  
		 BeanFactory factory=new XmlBeanFactory(r);  */
		 
		   ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		 
		   
		  StudentDao db = context.getBean("sdao",StudentDao.class);
		   
		  
		  db.save(new Student("geeta","pune"));
		  
		  System.out.println("Data Inserted");
	}

}

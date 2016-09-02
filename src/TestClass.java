import org.hibernate.cfg.Configuration;


public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.buildSessionFactory();
		

	}

}

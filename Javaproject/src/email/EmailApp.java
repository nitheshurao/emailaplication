package email;

public class EmailApp {

	public static void main(String[] args) {
		Email em =new Email("nithes","rao");// TODO Auto-generated method stub
//em1.setMailboxcapacity(Capacity)em
		em.setAlterEmail("js@gmail.com");
		System.out.println(em.getAlternateEmail());
	//	em.showinfo()
		System.out.println(em.showinfo());
		
	}

}

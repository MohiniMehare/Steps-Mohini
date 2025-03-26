public class Customer {

	private static final long serialVersionUID = -3465813074586302847L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customer_id;
	
	@OneToOne
	private Users users;
	
	@ManyToOne
	private Nominee nominee;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "dob")
	private Date dob;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "mobile")
	private String mobile;
	
	@Column(name = "email")
	private String email;

}

import java.sql.Date;

public class Model {

	
}


class User_Type
{
	private int id;
	private String Name;
	private Date created_at;
	private Date updated_at;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	
}



class User extends User_Type
{
	private int id;
	private String first_name;
	private String last_name;
	private String email;
	private String phone;
	private String City;
	private int age;
	private String country;
	private String password;
	private Date created_at;
	private Date updated_at;
	private int user_type;
	private float total_income;
	private float total_expense;
	private float total_balance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	public int getUser_type() {
		return user_type;
	}
	public void setUser_type(int user_type) {
		this.user_type = user_type;
	}
	public float getTotal_income() {
		return total_income;
	}
	public void setTotal_income(float total_income) {
		this.total_income = total_income;
	}
	public float getTotal_expense() {
		return total_expense;
	}
	public void setTotal_expense(float total_expense) {
		this.total_expense = total_expense;
	}
	public float getTotal_balance() {
		return total_balance;
	}
	public void setTotal_balance(float total_balance) {
		this.total_balance = total_balance;
	}
	
	
}


class Income_Category
{
	private int id;
	private String name;
	private Date created_at;
	private Date updated_at;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	
	
}

class Income_Transaction extends Income_Category
{
	private int id;
	private String Transaction_Category;
	private float amount;
	private String text;
	private Date created_at;
	private Date updated_at;
	private  int user_id;
	private int income_category;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTransaction_Category() {
		return Transaction_Category;
	}
	public void setTransaction_Category(String transaction_Category) {
		Transaction_Category = transaction_Category;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getIncome_category() {
		return income_category;
	}
	public void setIncome_category(int income_category) {
		this.income_category = income_category;
	}
	
	
}

class Expense_Category
{
	private int id;
	private String name;
	private Date created_at;
	private Date updated_at;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	
}

class Expense_Transaction extends Expense_Category
{
	private int id;
	private String transaction_category;
	private float amount;
	private String text;
	private Date created_at;
	private Date updated_at;
	private  int user_id;
	private int expense_category;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTransaction_category() {
		return transaction_category;
	}
	public void setTransaction_category(String transaction_category) {
		this.transaction_category = transaction_category;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getExpense_category() {
		return expense_category;
	}
	public void setExpense_category(int expense_category) {
		this.expense_category = expense_category;
	}
	
}



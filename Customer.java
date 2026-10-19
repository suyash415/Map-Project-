<<<<<<< HEAD
package com.tka.oct_18;


public class Customer {
	private int cId;
	private String cName;
	private int mob;
	private String city;
=======
package com.tka.oct_15;

public class Customer {

	private int customerId;
	private String customerName;
	private String mobileNumber;
	private String address;
>>>>>>> 2235ee566e8b67b682f66cf25fb4258b8872873f

	public Customer() {

	}

<<<<<<< HEAD
	public Customer(int cId, String cName, int mob, String city) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.mob = mob;
		this.city = city;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public int getMob() {
		return mob;
	}

	public void setMob(int mob) {
		this.mob = mob;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
=======
	public Customer(int customerId, String customerName, String mobileNumber, String address) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.address = address;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", mobileNumber="
				+ mobileNumber + ", address=" + address + "]";
>>>>>>> 2235ee566e8b67b682f66cf25fb4258b8872873f
	}

}

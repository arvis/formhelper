package com.viestards.formhelper;

import static org.junit.Assert.*;

import javax.validation.constraints.NotNull;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.viestards.formhelper.FormHelper;

public class FormHelperTest {

	class CarData {
		@NotNull
		private String brand;
		private String licenceNumber;
		private String description;
		private String[] transmission={"auto","manual"};
		
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public String getLicenceNumber() {
			return licenceNumber;
		}
		public void setLicenceNumber(String licenceNumber) {
			this.licenceNumber = licenceNumber;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String[] getTransmission() {
			return transmission;
		}
		public void setTransmission(String[] transmission) {
			this.transmission = transmission;
		}
	}

	private FormHelper carForm;
	private CarData car;
	
	@Before
    public void setUp() {
		car=new CarData();
		car.setBrand("Ford");
		
		carForm=new FormHelper(car);
	}
	@Test
	public void testIsValid() {
		Assert.assertTrue(carForm.isValid());
	}
	
	@Test
	public void testGenerate(){
		String result=carForm.generate();
		System.out.println(result);
		Assert.assertEquals("<label for='brand' >brand</label>"
				+ "<input type='text' name='brand' id='brand' value='Ford' />  "
				+ "<label for='licenceNumber' >licenceNumber</label>"
				+ "<input type='text' name='licenceNumber' id='licenceNumber' value='' />  "
				+ "<label for='description' >description</label>"
				+ "<input type='text' name='description' id='description' value='' />  ", result);
	}
	
	
	
	

}

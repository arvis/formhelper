package com.viestards.formhelper;

import static org.junit.Assert.*;

import javax.validation.constraints.NotNull;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.viestards.formhelper.FormHelper;

public class FormHelperTest {

	class CarForm extends FormHelper {
		@NotNull
		private String brand;
		private String licenceNumber;
		private String description;
		
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
	}

	private CarForm car;
	
	@Before
    public void setUp() {
		car =new CarForm() ;
		car.setBrand("Ford");
	}
	@Test
	public void testIsValid() {
		Assert.assertTrue(car.isValid());
	}
	
	@Test
	public void testGenerate(){
		String result=car.generate();
		System.out.println(result);
		Assert.assertEquals("", result);
	}
	
	
	
	

}

package com.hibernate.entities;
import java.util.Arrays;
import java.util.Base64;

import javax.persistence.*;

@Entity
@Table(name="Pmobile")
public class Product{
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
private int id;
	byte image[];
private String productName;

  private String ProductDescription; 
  public String getProductDescription() {
      return ProductDescription; 
  }
  public void setProductDescription(String productDescription)
  {
	  ProductDescription = productDescription; 
  }
 
double productPrice;

public byte[] getImage() {
	return image;
}
public void setImage(byte[] image) {
	this.image = image;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public double getProductPrice() {
	return productPrice;
}
public void setProductPrice(double productPrice) {
	this.productPrice = productPrice;
}
@Override
public String toString() {
	return "Product [id=" + id + ", image=" + Arrays.toString(image) + ", productName=" + productName
			+ ", ProductDescription=" + ProductDescription + ", productPrice=" + productPrice + "]";
}


}

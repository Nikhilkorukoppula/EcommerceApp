package com.hibernate.entities;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="Categ")
public class CategoryClass {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
public int cid;
public String categoryName;
@ManyToMany(targetEntity = Product.class, cascade = { CascadeType.ALL })  
@JoinTable(name = "mix",   
            joinColumns = { @JoinColumn(name = "id") },   
            inverseJoinColumns = { @JoinColumn(name = "pid") })  

public List<Product>list;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}
public List<Product> getList() {
	return list;
}
public void setList(List<Product> list) {
	this.list = list;
}

}

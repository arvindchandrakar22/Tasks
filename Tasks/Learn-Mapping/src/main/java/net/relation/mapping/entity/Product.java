package net.relation.mapping.entity;

import net.relation.mapping.entity.Catagory;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {
    @Id
    private String pId;
    private String productName;
    @ManyToMany(mappedBy = "products",fetch = FetchType.EAGER)
    private List<Catagory> catagories = new ArrayList<>();

    public Product() {
    }

    public Product(String pId, String productName, List<Catagory> catagories) {
        this.pId = pId;
        this.productName = productName;
        this.catagories = catagories;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public List<Catagory> getCatagories() {
        return catagories;
    }

    public void setCatagories(List<Catagory> catagories) {
        this.catagories = catagories;
    }
}

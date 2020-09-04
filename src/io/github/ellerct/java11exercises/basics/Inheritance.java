package io.github.ellerct.java11exercises.basics;

import java.util.LinkedList;
import java.util.List;

/**
 * This is a demonstration of the principle of inheritance.
 * <p>
 *     This may break convention a little bit I feel it's justifiable for the purposes of
 *     demonstration and organization.
 * </p>
 * @author Christopher Eller
 */
public class Inheritance {
    private static class Facility{
        private String city;
        private String owner;
        public Facility(String owner, String city){
            this.owner = owner;
            this.city = city;
        }
        public String getOwner(){
            return owner;
        }
        public String getCity(){
            return city;
        }
    }
    private static class Store extends Facility{
        private LinkedList<String> supportedBrands;
        public Store(String owner, String city) {
            super(owner, city);
            supportedBrands = new LinkedList<>();
        }
        public void addBrand(String brandName){
            if (!supportedBrands.contains(brandName)) {
                supportedBrands.add(brandName);
            }
        }
        public List getBrands(){
            return supportedBrands;
        }
    }
    private static class Example{
        public static void main(String[] args){
            Store store = new Store("Eller", "Greenwood");
            store.addBrand("Generic");

            System.out.println("Store owner: " + store.getOwner()+"\n"+
                    "Store city: " + store.getCity()+"\n"+
                    "Supported brands: " + store.getBrands().toString());
        }
    }
}

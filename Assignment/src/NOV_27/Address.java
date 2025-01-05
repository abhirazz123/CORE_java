package NOV_27;

class Address {  
    private String street;  
    private String city;  

    public Address(String street, String city) {  
        if (street == null || street.isEmpty() || city == null || city.isEmpty()) {  
            System.out.println("Error Invalid Input");  
        } else {  
            this.street = street;  
            this.city = city;  
        }  
    }  

    public String getStreet() {  
        return street;  
    }  

    public String getCity() {  
        return city;  
    }  

    @Override  
    public String toString() {  
        return street + ", " + city;  
    }  
}  

class Person {  
    private String name;  
    private Address address;  

    public Person(String name, Address address) {  
        if (name == null || name.isEmpty() || address == null) {  
            System.out.println("Error Invalid Input");  
        } else {  
            this.name = name;  
            this.address = address;  
        }  
    }  

    public String getName() {  
        return name;  
    }  

    public Address getAddress() {  
        return address;  
    }  

    @Override  
    public String toString() {  
        return "Name: " + name + ", Address: " + address.toString();  
    }  
}  


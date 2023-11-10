public class School {
    private String name;
    private Address address;
    public static int counter = 0;

    public School(String name, Address address){
        this.name = name;
        this.address = address;
        counter += 1;
    }

    public void updateName(String name){
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    private void init(){
        System.out.println("School inizialization");
    }

    private void destroy(){
        System.out.println("School destruction");
    }
}

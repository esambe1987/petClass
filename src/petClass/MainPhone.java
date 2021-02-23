package petClass;

public class MainPhone {
	class phone {
	    private String make, model;
	    private int manufacturingYear;

	    public phone() {
	        make = "";
	        model = "";
	        manufacturingYear = 2010;
	    }

	    public phone (String make, String model) {
	        this.make = make;
	        this.model = model;
	        manufacturingYear = 2010;
	    }

	    public phone (String make, String model, int manufacturingYear) {
	        this.make = make;
	        this.model = model;
	        this.manufacturingYear = manufacturingYear;
	    }

	    public String getMake() {
	        return make;
	    }

	    public void setMake(String make) {
	        this.make = make;
	    }

	    public String getModel() {
	        return model;
	    }

	    public void setModel(String model) {
	        this.model = model;
	    }

	    public int getManufacturingYear() {
	        return manufacturingYear;
	    }

	    public void setManufacturingYear(int manufacturingYear) {
	        this.manufacturingYear = manufacturingYear;
	    }

	    @Override
	    public String toString() {
	        return "phone{" +
	                "make='" + make + '\'' +
	                ", model='" + model + '\'' +
	                ", manufacturingYear=" + manufacturingYear +
	                '}';
	    }
	    
	    public boolean isNewphone() {
	        return manufacturingYear >= 2020;
	    }
	}
}
    
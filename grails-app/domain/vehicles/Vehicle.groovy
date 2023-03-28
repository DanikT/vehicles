package vehicles

class Vehicle {

	String manufacturer
	String model
	Integer releaseYear

    static constraints = {
		manufacturer(nullable: false, blank: false)
		model(nullable: false, blank: false)
		releaseYear(nullable: false)
    }
}

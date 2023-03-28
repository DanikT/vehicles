package vehicles

import grails.gorm.transactions.Transactional

class BootStrap {

	def init = {
		addTestUsers()

		new Vehicle(manufacturer: "Honda", model: "Civic", releaseYear: 2018).save()
		new Vehicle(manufacturer: "Audi", model: "RS3", releaseYear: 2019).save()
		new Vehicle(manufacturer: "Volkswagen", model: "Golf", releaseYear: 2016).save()
		new Vehicle(manufacturer: "Ford", model: "Fiesta", releaseYear: 2019).save()
	}

	@Transactional
	void addTestUsers() {
		def adminRole = new Role(authority: 'ROLE_ADMIN').save(flush: true)
		def userRole = new Role(authority: 'ROLE_USER').save(flush: true)

		def admin = new User(username: "admin", password: "admin", enabled: true).save(flush: true)
		UserRole.create(admin, adminRole).save()
		UserRole.create(admin, userRole).save()

		def user = new User(username: "user", password: "user", enabled: true).save(flush: true)
		UserRole.create(user, userRole).save()

		UserRole.withSession {
			it.flush()
			it.clear()
		}
	}

    def destroy = {
    }
}

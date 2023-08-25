package ir.mostafa.semnani.phonebookkotlin.model.service

import ir.mostafa.semnani.phonebookkotlin.model.entity.Person
import ir.mostafa.semnani.phonebookkotlin.model.repository.PersonRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PersonService(
    @Autowired
    private val personRepository: PersonRepository
) {

    fun findAll(): List<Person> {
        return personRepository.findAll()
    }

    fun save(person: Person): Person {
        return personRepository.save(person)
    }

}
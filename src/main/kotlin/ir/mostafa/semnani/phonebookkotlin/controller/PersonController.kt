package ir.mostafa.semnani.phonebookkotlin.controller

import ir.mostafa.semnani.phonebookkotlin.model.entity.Person
import ir.mostafa.semnani.phonebookkotlin.model.service.PersonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/persons")
class PersonController(
    @Autowired
    private val personService: PersonService
) {

    @GetMapping("/find-all")
    fun findAll(): List<Person> {
        return personService.findAll()
    }

    @PostMapping("/save")
    fun save(@RequestBody person: Person): Person {
        return personService.save(person)
    }
}
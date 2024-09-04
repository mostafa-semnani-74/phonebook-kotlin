package ir.mostafa.semnani.phonebookkotlin.model.repository

import ir.mostafa.semnani.phonebookkotlin.model.entity.Person
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonRepository : JpaRepository<Person, Long>
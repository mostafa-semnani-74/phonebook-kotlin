package ir.mostafa.semnani.phonebookkotlin.model.entity

import javax.persistence.*

@Entity
@Table(name = "tbl_person")
data class Person(
    @Id
    @GeneratedValue
    val id: Long,
    var name: String
)
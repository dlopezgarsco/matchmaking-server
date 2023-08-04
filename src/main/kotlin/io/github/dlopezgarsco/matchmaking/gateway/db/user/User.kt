package io.github.dlopezgarsco.matchmaking.gateway.db.user

import arrow.core.Either
import io.github.dlopezgarsco.matchmaking.db.*
import io.github.dlopezgarsco.matchmaking.models.User
import org.jetbrains.exposed.dao.id.IdTable
import org.jetbrains.exposed.dao.id.UUIDTable
import org.jetbrains.exposed.sql.*
import java.util.UUID

object Users : UUIDTable() {
  val email = varchar("email", 255)
}

data object UserDAO : DAO<User, Users, UUID> {
  override suspend fun create(data: User): Either<DAOError, UUID> {
    TODO("Not yet implemented")
  }

  override suspend fun update(data: User): Boolean {
    TODO("Not yet implemented")
  }

  override suspend fun get(a: User): Either<DAOError, User> {
    TODO("Not yet implemented")
  }

  override suspend fun delete(id: Int): Boolean {
    TODO("Not yet implemented")
  }

  override suspend fun delete(data: User): Boolean {
    TODO("Not yet implemented")
  }
  override suspend fun ResultRow.toPOJO(): User {
    TODO("Not yet implemented")
  }

  override fun table(): Users = Users
}
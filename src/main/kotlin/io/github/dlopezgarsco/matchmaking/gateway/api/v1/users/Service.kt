package io.github.dlopezgarsco.matchmaking.gateway.api.v1.users

import io.github.dlopezgarsco.matchmaking.gateway.db.user.UserDAO
import io.github.dlopezgarsco.matchmaking.models.User

interface Service {
  suspend fun getUser(user: User) {
    UserDAO.get(user.id)
    UserDAO.getAll()
  }
}

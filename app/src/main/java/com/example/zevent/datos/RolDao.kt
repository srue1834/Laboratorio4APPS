package com.example.zevent.datos

interface RolDao {
    suspend fun getNombre(): List<Rol>
    suspend fun getDescripcion(): List<Rol>
    suspend fun getOrden(): List<Rol>
}
package de.d3adspace.mercantor.core.service

import java.util.*

/**
 * @author Felix Klauke <fklauke@itemis.de>
 */
interface Service {

    fun setId(serviceId: UUID)

    fun getVipAddress(): String
}
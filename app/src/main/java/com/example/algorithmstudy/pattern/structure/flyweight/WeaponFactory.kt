package com.example.algorithmstudy.pattern.structure.flyweight

import android.annotation.SuppressLint

class WeaponFactory {
    private val weaponMap = mutableMapOf<String, Weapon?>()

    @SuppressLint("NewApi")
    fun getWeapon(type: String): Weapon? {
        if (weaponMap[type] == null) {
            weaponMap[type] = when (type) {
                WEAPON_SHOTGUN -> Shotgun()
                WEAPON_MINIGUN -> Minigun()
                else -> null
            }
        }

        return weaponMap[type]
    }

    companion object {
        const val WEAPON_SHOTGUN = "shotgun"
        const val WEAPON_MINIGUN = "minigun"
    }
}

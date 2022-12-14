package com.codefactorypdabrowski.puredi.di.activity

/**
 * Helps injecting members into clients that cannot use constructor injection e.g Activity
 */
interface MembersInjector<T> {
    fun injectMembers(instance: T)
}

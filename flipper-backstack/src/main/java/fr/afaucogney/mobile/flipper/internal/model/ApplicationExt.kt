package fr.afaucogney.mobile.flipper.internal.model

import android.app.Application

///////////////////////////////////////////////////////////////////////////
// DATA
///////////////////////////////////////////////////////////////////////////

internal var appName: String? = null

///////////////////////////////////////////////////////////////////////////
// DSL
///////////////////////////////////////////////////////////////////////////

internal val Application.name: String
    get() = this.javaClass.simpleName

internal val Application.fullName: String
    get() = this.toString()


package com.nigelhenshaw.sqlitektx

import android.provider.BaseColumns

object KtxContract {
    object KtxEntry: BaseColumns {
        const val TABLE_NAME = "ktx_entry"
        const val COLUMN_NAME_TITLE = "title"
    }
}

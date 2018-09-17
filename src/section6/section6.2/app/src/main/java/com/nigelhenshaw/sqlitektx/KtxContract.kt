package com.nigelhenshaw.sqlitektx

import android.provider.BaseColumns

/**
 * Used to share the table and column values with
 * the DbHelper and MainActivity
 */
object KtxContract {
    object KtxEntry: BaseColumns {
        const val TABLE_NAME = "ktx_entry"
        const val COLUMN_NAME_TITLE = "title"
    }
}

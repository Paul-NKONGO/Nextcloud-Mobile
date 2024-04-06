/*
 * Nextcloud - Android Client
 *
 * SPDX-FileCopyrightText: 2023 Alper Ozturk <alper_ozturk@proton.me>
 * SPDX-License-Identifier: AGPL-3.0-or-later
 */
package com.owncloud.android.ui.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.owncloud.android.utils.ClipboardUtil

/**
 * Activity copying the text of the received Intent into the system clipboard.
 */
class CopyToClipboardActivity : Activity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ClipboardUtil.copyToClipboard(this, intent.getCharSequenceExtra(Intent.EXTRA_TEXT).toString())
        finish()
    }
}

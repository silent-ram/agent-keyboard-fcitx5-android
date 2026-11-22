/*
 * SPDX-License-Identifier: LGPL-2.1-or-later
 * SPDX-FileCopyrightText: Copyright 2021-2023 Fcitx5 for Android Contributors
 */
package org.fcitx.fcitx5.android.utils

import org.fcitx.fcitx5.android.BuildConfig

object Const {
    const val versionName = "${BuildConfig.VERSION_NAME}-${BuildConfig.BUILD_TYPE}"
    const val maintainer = "silent-ram"
    const val githubRepo = "https://github.com/$maintainer/agent-keyboard"
    const val issuesUrl = "$githubRepo/issues"
    const val licenseSpdxId = "LGPL-2.1-or-later"
    const val licenseUrl = "https://www.gnu.org/licenses/old-licenses/lgpl-2.1"
    const val privacyPolicyUrl = "$githubRepo/blob/main/docs/privacy.md"
    const val privacyNoticeAsset = "privacy.md"
    const val faqUrl = "$githubRepo/blob/main/docs/README.md"

    fun readPrivacyNotice(assets: android.content.res.AssetManager): String =
        assets.open(privacyNoticeAsset).bufferedReader().use { reader ->
            reader.readLine()
            reader.readText().trim()
        }
}

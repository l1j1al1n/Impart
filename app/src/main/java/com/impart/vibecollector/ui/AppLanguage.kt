package com.impart.vibecollector.ui

enum class AppLanguage {
    Chinese,
    English
}

data class AppText(
    val subtitle: String,
    val captureTitle: String,
    val captureBody: String,
    val switchLabel: String,
    val all: String,
    val code: String,
    val link: String,
    val todo: String
)

fun AppText(language: AppLanguage): AppText = when (language) {
    AppLanguage.Chinese -> AppText(
        subtitle = "把零散碎片整理成有记忆的内容",
        captureTitle = "捕获层已就绪",
        captureBody = "剪贴板、无障碍、标签、搜索和导出都已经预留好位置。",
        switchLabel = "EN",
        all = "全部",
        code = "代码",
        link = "链接",
        todo = "待办"
    )
    AppLanguage.English -> AppText(
        subtitle = "Smart memory from tiny fragments",
        captureTitle = "Capture layer ready",
        captureBody = "Clipboard, accessibility, tags, search, and export all have a place to grow.",
        switchLabel = "中文",
        all = "All",
        code = "Code",
        link = "Link",
        todo = "Todo"
    )
}

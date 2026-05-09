# Impart
一个 vibe coding 项目

# 🚀 Vibe-Collector: AI 智能记忆助手

> **Status:** Incubating in Vibe Mode
> **Goal:** 建立一个“有脑子”的安卓剪贴板，自动分类、总结并索引你的所有碎片信息。

## 🛠️ 技术规格
- **UI:** Jetpack Compose (Material 3 + Glassmorphism 效果)
- **Database:** Room (存储碎片内容)
- **Intelligence:** DeepSeek API / Local Ollama (用于内容分类)
- **Architecture:** MVVM + Flow (保持数据响应式)

## 📅 路线图 (Vibe Steps)

### Phase 1: 基础建设 (Day 1)
- [ ] 初始化项目，配置 Hilt 依赖注入。
- [ ] 实现后台 AccessibilityService 或 ClipboardManager 监听。
- [ ] 创建基础的列表 UI，展示抓取到的文本。

### Phase 2: 智能接入 (Day 2)
- [ ] 集成 Retrofit，对接 AI 接口进行内容分析。
- [ ] 实现标签系统（自动打标：代码、链接、日程、备忘）。
- [ ] 增加全文本搜索功能。

### Phase 3: 质感提升 (Day 3)
- [ ] 添加滑动删除和拖拽归档动画。
- [ ] 适配“灵动岛”风格的通知弹窗（当捕获新内容时）。
- [ ] 导出为 Markdown 或 Notion 页面。

---
"Dont't code the logic, describe the vibe."

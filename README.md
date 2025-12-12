# Java List 遍历与常用方法实践

记录 `List` 接口的常用操作及五种遍历方式的代码实现。

## ✅ 核心功能
- `List` 常用方法：`add`, `remove`, `get`, `contains` 等
- **5 种遍历方式**：
  1. 普通 for 循环（索引）
  2. 增强 for（for-each）
  3. Iterator 迭代器（支持安全删除）
  4. `forEach` + Lambda 表达式
  5. Stream 流式遍历

## 🔒 安全删除
- 使用 `Iterator.remove()` 实现安全删除，避免 `ConcurrentModificationException`
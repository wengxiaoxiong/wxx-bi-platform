# 全自动BI智能分析平台

>  这是一个练手的项目，提示俺的硬实力，总写CRUD不太行。搞个一个全自动BI平台，支持各种数据，然后生成报表的项目练手。

## 介绍

基于 React + Vite + Spring Boot + MQ + Langchain + 阿里云OSS 的分析平台。

区别于传统 Bl，用户只需要导入原始数据集、并输入分析诉求，就能自动生成可视化因表及分析结论，实现数据分析的降本增效。

# 架构

<img src="/Users/wengxiaoxiong/Library/Application Support/typora-user-images/image-20231002231628949.png" alt="image-20231002231628949" style="zoom:50%;" />

# 技术栈

技术选型

前端

- ﻿﻿React 18
- ﻿﻿Ant Design Pro 5.x 脚手架
- ﻿Umi4前端框架
- ﻿Ant Design 组件库
- ﻿Echarts 可视化库
- ﻿OpenAPI 前端代码生成

后端

- Spring Boot
- ﻿MySQL 数据库
- ﻿﻿MyBatis-Plus 及MyBatis × 自动生成
- ﻿Redis + Redisson 限流
- ﻿RabbitMQ 消息队列
- Langchain集成Azure gpt4
- ﻿JDK 线程池及异步化
- ﻿﻿Easy Excel 表格数据处理
- ﻿Swagger + Knife4j 接口文档生成
- ﻿﻿Hutool Apache Common Utils 等工具库
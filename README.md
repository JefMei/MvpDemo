# MvpDemo
MVP
activity和fragment的任务过重，大项目中activity打开成百上千行代码，不利于维护测试和观看，使用mvp进行解耦
- model数据层
- view视图层
- presenter负责操作view和model

这里是一篇博客介绍MVP的
[MVP](http://blog.csdn.net/lmj623565791/article/details/46596109)

然后项目分包按照demo里面的
- utils（自己封装的工具库）
- view（fragment，activity）
- model（数据层，下面的分包可以按照功能模块分（网络的，数据库的））
  - db
  - net 
- app（Application和BaseActivity等基类）
- presenter（presenter操作者层）

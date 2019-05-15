library1/library2/library3 是三个平行组件

demo中以library2为中心，测试与其他平行组建的通信

简单的实现了：
  Activity跳转（带参数/ForResult）
  获取属性（异步获取使用rxjava）
  拦截器（library3中实现的pin）
  
根据官方api，还可以实现Android的其他三大组件和Fragment

# springboot整合dubbo实例

## 该实例使用注册中心zookeeper

### 模块说明
各模块功能说明

* [provider-demo-服务提供者模块](https://github.com/yaoyanlei/dubbo-zookeeper-demo)
* [consumer-demo-服务消费者模块](https://github.com/yaoyanlei/dubbo-zookeeper-demo)
* [common-service-通用服务接口模块](https://github.com/yaoyanlei/dubbo-zookeeper-demo)

### 版本说明
此实例整合是Apache官方的dubbo starts

* [org.apache.dubbo-2.7.3](https://github.com/apache/dubbo-spring-boot-project)
* [springboot-2.1.8](https://spring.io/projects/spring-boot/)
* [zookeeper-3.4.14](http://zookeeper.apache.org/index.html)
* [Apache Curator-4.0.1](http://curator.apache.org/index.html)



#### Apache Curator
```
Apache Curator是一个比较完善的ZooKeeper客户端框架，
通过封装的一套高级API 简化了ZooKeeper的操作。通过查看官方文档，
可以发现Curator主要解决了三类问题：
1：封装ZooKeeper client与ZooKeeper server之间的连接处理
2：提供了一套Fluent风格的操作API
3：提供ZooKeeper各种应用场景(recipe， 比如：分布式锁服务、集群领导选举、共享计数器、缓存机制、分布式队列等)的抽象封装
```

```
Curator主要从以下几个方面降低了zk使用的复杂性：
1：重试机制:提供可插拔的重试机制, 它将给捕获所有可恢复的异常配置一个重试策略，并且内部也提供了几种标准的重试策略(比如指数补偿)
2：连接状态监控: Curator初始化之后会一直对zk连接进行监听，一旦发现连接状态发生变化将会作出相应的处理
3：zk客户端实例管理:Curator会对zk客户端到server集群的连接进行管理，并在需要的时候重建zk实例，保证与zk集群连接的可靠性
各种使用场景支持:Curator实现了zk支持的大部分使用场景（甚至包括zk自身不支持的场景），这些实现都遵循了zk的最佳实践，并考虑了各种极端情况
```
# rabbitmqDemo

###1.mvn clean package

##2.shell mode: producter start.
```
java -jar mq-producter/target/mq-producter-1.0.0.jar
```

####3.shell mode: comsumer start.
```
java -jar mq-consumer/target/mq-consumer-1.0.0.jar
```

####4.open your browse
```
http://localhost:8080/mq/send?type=direct&userName=tester
```
rerurn
```
{"code":200,"msg":null,"data":null,"success":true}
```

####5.you will get you send msg.
```
2022-07-26 16:53:16.022  INFO 51403 --- [ntContainer#0-1] c.l.m.c.service.RabbitConsumerService    : directQueue recive:UserDTO(id=1658825596019, userName=tester, birthDay=Tue Jul 26 16:53:16 CST 2022, dead=null)
dead queue msg : UserDTO(id=1658825596019, userName=tester, birthDay=Tue Jul 26 16:53:16 CST 2022, dead=null)
```
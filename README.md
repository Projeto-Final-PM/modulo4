# Kafka Consumer

### **KafkaListenerConfig.java**
Configura o consumidor Kafka. Possui propriedades necessárias para receber mensagens.

### **KafkaConsumer.java**
Classe que contém o listener Kafka. Possui o método anotado com `@KafkaListener`, que recebe e processa cada mensagem enviada pelo producer.

### **application.yml**
Arquivo de configuração do Kafka. Define os brokers, o groupId do consumer e o tópico que será consumido.

## Consumers
- consumer 2 na branch modulo4.3

# Kafka Consumer 2

### **KafkaListenerConfig.java**
Responsável pelas configurações do listener Kafka.  
Define o `groupId` (**diferente do Consumer 1**) e a fábrica de listeners necessários para receber mensagens.

### **KafkaConsumer.java**
Classe que contém o método anotado com `@KafkaListener`.  
É aqui que o Consumer 2 recebe e processa cada mensagem enviada pelo produtor.

### **application.yml**
Arquivo de configuração do Kafka.  
Define os brokers, o `groupId` específico do Consumer 2 e o tópico que será consumido.

# Define a imagem base do Java
FROM azul/zulu-openjdk:17

# Define o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copia o arquivo JAR da aplicação para o contêiner
COPY target/account-0.0.1-SNAPSHOT.jar /app/account.jar

# Define o comando de execução da aplicação
CMD ["java", "-jar", "account.jar"]

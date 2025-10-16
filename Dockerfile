# Etapa 1: Imaginea de bază cu Maven și JDK 17
FROM maven:3.8.5-openjdk-17

# Etapa 2: Directorul de lucru în container
WORKDIR /app

# Etapa 3: Copiaza tot proiectul
COPY . .

# Etapa 4: Ruleaza comanda maven
RUN mvn dependency:go-offline

# Etapa 5: Comanda de start - execută testele
CMD ["mvn", "test"]

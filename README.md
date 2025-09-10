# Spring Boot & Kubernetes Demo API

[![Java](https://img.shields.io/badge/Java-21-blue.svg)](https://www.java.com)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![Docker](https.img.shields.io/badge/Docker-blue.svg)](https://www.docker.com)
[![Kubernetes](https://img.shields.io/badge/Kubernetes-blue.svg)](https://kubernetes.io)

Uma API REST simples desenvolvida com Java e Spring Boot, criada para demonstrar um fluxo de trabalho moderno de desenvolvimento e deploy utilizando containers Docker e orquestração com Kubernetes (Minikube).

## 🎯 Objetivo do Projeto

Este projeto foi criado como uma prova de conceito (_Proof of Concept_) para o meu portfólio pessoal. O principal objetivo é demonstrar habilidades práticas no ciclo de vida de uma aplicação _cloud-native_, incluindo:

-   **Desenvolvimento:** Criação de uma API RESTful com Spring Boot.
-   **Containerização:** Empacotamento da aplicação em uma imagem Docker.
-   **Orquestração:** Deploy e gerenciamento da aplicação em um cluster Kubernetes local.

## ✨ Features

A aplicação expõe dois endpoints simples:

-   `GET /`: Retorna uma mensagem de boas-vindas padrão.
-   `GET /{nome}`: Retorna uma mensagem personalizada com o nome fornecido na URL.

## 🛠️ Tecnologias Utilizadas

-   **Backend:** Java 21, Spring Boot 3
-   **Gerenciador de Dependências:** Maven
-   **Containerização:** Docker
-   **Orquestração:** Kubernetes (executado localmente com Minikube)
-   **Linha de Comando K8s:** Kubectl

## 🚀 Como Executar o Projeto

Siga os passos abaixo para executar a aplicação em seu ambiente local.

### Pré-requisitos

Antes de começar, certifique-se de que você tem as seguintes ferramentas instaladas e configuradas em sua máquina:

-   [Java Development Kit (JDK) 21+](https://www.oracle.com/java/technologies/downloads/)
-   [Apache Maven](https://maven.apache.org/download.cgi)
-   [Docker Desktop](https://www.docker.com/products/docker-desktop/)
-   [Minikube](https://minikube.sigs.k8s.io/docs/start/)
-   [Kubectl](https://kubernetes.io/docs/tasks/tools/install-kubectl/)

### Passo a Passo

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/SEU-USUARIO/spring-boot-kubernetes-demo.git](https://github.com/SEU-USUARIO/spring-boot-kubernetes-demo.git)
    cd spring-boot-kubernetes-demo
    ```

2.  **Compile e empacote a aplicação Java:**
    ```bash
    mvn clean package
    ```
    Isso irá gerar o arquivo `.jar` na pasta `target/`.

3.  **Inicie o Minikube:**
    ```bash
    minikube start
    ```

4.  **Configure o ambiente Docker do Minikube:**
    Aponte seu terminal para o daemon Docker do Minikube. Isso permite que o cluster acesse imagens Docker construídas localmente.
    ```bash
    # Para Linux/macOS
    eval $(minikube -p minikube docker-env)

    # Para Windows (PowerShell)
    # & minikube -p minikube docker-env | Invoke-Expression
    ```

5.  **Construa a imagem Docker:**
    Com o ambiente configurado, construa a imagem. O Minikube agora terá acesso a ela.
    ```bash
    docker build -t spring-boot-kubernetes-demo:v1 .
    ```

6.  **Faça o deploy no Kubernetes:**
    Aplique os arquivos de configuração de `Deployment` e `Service` no cluster.
    ```bash
    kubectl apply -f deployment.yaml
    ```

7.  **Verifique o status do deploy:**
    Espere até que o status dos pods seja `Running`.
    ```bash
    kubectl get pods
    ```

8.  **Acesse a aplicação:**
    Para expor o serviço e obter a URL de acesso, execute o comando:
    ```bash
    minikube service meu-servico-java --url
    ```
    Abra a URL retornada no seu navegador ou em uma ferramenta como o Postman para interagir com a API.

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---
Feito com ❤️ por [Seu Nome](https://github.com/manyloan)
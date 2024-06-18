# Spring Security Social Login

Vídeo: https://youtu.be/Uc8mPuaNGqM

## Github login

1. Acesse https://github.com/settings/profile
2. Clique em "Developer settings"
3. Selecione "OAuth Apps"
4. Clique "New OAuth App"
5. Preencha os campos
   1. Application Name: "feltex-springboot-auth2"
   2. Homepage URL: "http://localhost:8080"
   3. Authorization callback URL: "http://localhost:8080/login/oauth2/code/github"
   4. Clique "Register application"
   5. Clique em "generate a new client secret"
      1. Copie o código gerado d5d32c3c804ec8e20d6d7852f0ecc43af619821c
6. Selecione sua aplicação
7. Copie o Client Id/Secretd

https://docs.github.com/en/apps/oauth-apps/building-oauth-apps/authorizing-oauth-apps


## Google Login 

### https://cloud.google.com

Selecione o seu projeto

## OAuth consent screen

1. Marque a opção "External"
2. Preencha o nome da usa aplicação "App Name", "User Support email", "Developer Contact information"
3. Clique em "Save and Continue".
4. Clique em "ADD OR REMOVE SCOPES", selecione a primeira opcão
5. "See your primary Google Account email address" e clique em Update.
6. Em seguida: Save and Update
7. Adicione usuarios de testes que poderem usar a aplicação
  seu-email-aqui@gmail.com
 Clique em "add"
8. Selecione "Save and Continue".
9. Por fim confirme os dados no último passo e clique no botão para voltar ao Dashboard.

## Criando as credenciais

1. Selecione a opaćo "Credentials"
2. Selecione Create Credentials
3. Selecione "OAuth Client Id"
4. Selectione Web Application
5. Preencha os campos
   1. Application Type: Selectione Web Application
   2. Name: "My App"
   3. "Authorized JavaScript origins": http://localhost:8080
   4. "Authorized redirect URI": http://localhost:8080/login/oauth2/code/google
   5. Clique em "Create"
7. Você terá a općao de fazer download das credenciais.


```json
{
    "web":
    {
        "client_id": "66998749621-pu8bn2n96e0c1lpes563j6hfngpsqcl.apps.googleusercontent.com",
        "project_id": "hallowed-moment-684",
        "auth_uri": "https://accounts.google.com/o/oauth2/auth",
        "token_uri": "https://oauth2.googleapis.com/token",
        "auth_provider_x509_cert_url": "https://www.googleapis.com/oauth2/v1/certs",
        "client_secret": "745699541_pv8YPmiYTcMNNHtDNG4pffA_m",
        "redirect_uris":
        [
            "http://localhost:8080/login/oauth2/code/google"
        ],
        "javascript_origins":
        [
            "http://localhost:8080"
        ]
    }
}
```

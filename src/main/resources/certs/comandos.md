## COMANDOS QUE HAY QUE EJECUTAR PARA OBTENER UNA CLAVE PÚBLICA Y PRIVADA

Para poder ejecutar los siguientes comandos se recomienda usar una consola de comandos de git (un Git Bash)

```bash
# Para crear un par de RSA keys  
openssl genrsa -out keypair.pem 2048
```

```bash
# Extraer la clave pública
openssl rsa -in keypair.pem -pubout -out public.pem
```

```bash
# Para crear una clave privada con formato PKC#8
openssl pkcs8 -topk8 -inform PEM -outform PEM -nocrypt -in keypair.pem -out private.pem
```
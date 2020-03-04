docker-compose build
docker-compose up -d && docker exec -it idp_client_1 /bin/bash -c "java -jar /var/client.jar"
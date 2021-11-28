# Nginx (engine ex) webserver
   This is a simple Nginx application that runs in 8081 port.

# Docker file

`FROM nginx`
  - Use the nginx base image

`COPY ./nginx.conf /etc/nginx/conf.d/default.conf` 
  - Copy the nginx.conf from application folder to default.conf of nginx while building the image
  
 
 # Building and running docker:  
     > docker build -t webserver .
     > docker container run --add-host localnode:<ip address> --name nginx_helloworld -d -p 8081:80 webserver

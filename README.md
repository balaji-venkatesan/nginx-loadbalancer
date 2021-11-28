#Nginx load balancing and reverse proxy:
  This repo consists of a simple Spring boot application, Reactjs and Nginx webserver.
  
 - The Java backend is the API service that runs in 8080 port.
 - Reactjs frontend that runs in 3000 port.
 - Nginx webserver runs in 8081.
 

# Nginx reverse proxy
 - Based on the URL path, the request will be forwarded to the corresponding service.
 
 - The root request `/` will be forwarded to the frontend which runs in port 3000 
 
 - Request to /health will be forwarded to API service which is running in port 8080


# Nginx load balancing:
  
    upstream appserver {
            # using least connection as the algorithm for loadbalancing, there are lot of loadbalaning algorithms available in nginx
            # health check based loadbalaning is also supported
            # TODO: change the localhost to ip address of the host
            least_conn;
            server 127.0.0.1:8080;
            server 127.0.0.1:8082;
            server 127.0.0.1:8083;
        }

  We are running 3 instances of the API server in a different port, and for load balancing, we have created an upstream and used the least connection as the algorithm.


## TODO

Move reactjs and nginx to parent directory, as of now it is inside the java project.
   
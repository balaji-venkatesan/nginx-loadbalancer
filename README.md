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
  
  
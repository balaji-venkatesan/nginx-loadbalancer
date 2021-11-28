# Reactjs Frontend
   Simple reactjs helloworld project, it runs in port 3000.

# Docker file

`FROM node:alpine`
  - Using alpine as the base image

`WORKDIR /app` 

`ENV PATH /app/node_modules/.bin:$PATH`
  - Setting the working directory and adding node modules to the path    

`COPY package.json ./`

`COPY package-lock.json ./`
   - Copying application dependencies
 
 `RUN npm i`
 
 `COPY . ./`
   - Build the application and copy it to container
  
 `CMD ["npm", "start"]`
   - command to start the application, npm start


# Building and running docker: 

    > docker build -t reactjs_helloworld .
    > docker container run --name react_app -d -p 3000:3000 reactjs_helloworld

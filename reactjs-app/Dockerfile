FROM node:alpine
WORKDIR /app
ENV PATH /app/node_modules/.bin:$PATH
#install application dependencies
COPY package.json ./
COPY package-lock.json ./
EXPOSE 3000/tcp
RUN npm i
COPY . ./
CMD ["npm", "start"]
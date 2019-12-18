# README

A barebones Java app, which can easily be deployed to Heroku. Built directly from the instructions available [on Heroku](https://devcenter.heroku.com/articles/getting-started-with-java) article - check it out.

## Prerequisites
You will need to install the following:
- Java & Maven
- Heroku cli
- Postgresql 

##  Set up
- Add a new entry into the .env file
```
JDBC_DATABASE_URL=jdbc:postgresql://localhost:5432/<DB_NAME>?user=<USER>&password=<PASSWORD>
```

## Running Locally
```sh
$ mvn clean install
$ heroku local
```

Your app should now be running on [localhost:5000](http://localhost:5000/).

## Deploying to Heroku

```sh
$ heroku create
$ git push heroku master
$ heroku open
```

## Running migrations
`heroku local release`
# Travel Agency Management System

This is a microservices-based system developed for managing a travel agency's operations. The system consists of several microservices, each developed in a different language or framework, and deployed using Docker Compose. The system uses Eureka for service discovery and Zuul gateway for routing requests to the appropriate microservice.

* Microservices
The microservices included in this system are:

Reclamation Service: Handles customer complaints and feedback
Users Service: Manages user accounts and authentication
Clients Service: Manages client information
Tickets Service: Manages ticket booking and availability
Flights Service: Manages flight booking and availability
Destinations Service: Manages travel destinations and availability

* Deployment
The system is deployed using Docker Compose. The docker-compose.yml file specifies the services and their configurations. The system uses Eureka for service discovery, and Zuul gateway for routing requests to the appropriate microservice.

* Configuration
The config directory contains configuration files for each microservice. The configuration files specify the port number, database connection information, and other settings for each microservice.

* Credits
This project was developed by Aymen bouthour , Souhail Ouni , Sandra Maatougui, Selima mnakbi , Omar ben Jemaa , Ahmed Helioui, Syrine Bedoui..


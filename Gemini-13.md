# Gemini-13 – Phase 2 Implementation

## Project Overview

This is the Phase 2 implementation of the Gemini project for group 13. The system includes:
- A login feature
- Create a science plan
- Submit a science plan

Technologies used:
- Backend: Spring Boot (Java)
- Frontend: Thymeleaf
- Database: H2 (in-memory)
- OCS API integrated

---

## Use Cases Supported

1. **Login**  
   Allows astronomers to log into the system using credentials.

2. **Create Science Plan**  
   Astronomers can fill in target, time, and settings to create a draft science plan.

3. **Submit Science Plan**  
   Once complete, the plan can be submitted and queued for validation.

---

## How to Run the Project

1. Clone the repository
2. Open in IntelliJ IDEA
3. Run `Gemini13Application.java`
4. Visit `http://localhost:8080/login`

---

## Design Pattern Used

We apply the **Factory Pattern** in the `PlanFactory` module to create science plans. This helps to decouple the creation logic from service logic, making it easier to support different plan types in the future.

---

## Team Members

- [Name 1] – Backend
- [Name 2] – Frontend
- [Name 3] – Design & Documentation


🌱 About the Project

Traditional e-commerce platforms generally focus on product price and features, while the environmental impact of a purchase can be difficult for customers to understand. EcoBazaar-X aims to make sustainability information more visible during online shopping.

The project combines e-commerce functionality with carbon-footprint awareness. Its planned platform experience includes product-level CO₂ information, greener alternatives, a cart that considers both price and carbon impact, sustainability insights, and administrative tools for managing products and eco-verification.

⚠️ Problem Statement

EcoBazaar-X addresses several challenges associated with sustainable online shopping:
- Limited environmental transparency: Customers may not know the environmental impact of products.
- Difficulty finding greener alternatives: Eco-friendly substitutes can be difficult to identify.
- Low carbon-footprint awareness: Customers may not understand how purchasing choices contribute to emissions.
- Unverified environmental claims: Eco-friendly labels may not always be supported by reliable evidence.
- Limited motivation: Customers may have few incentives to make more sustainable choices.
  
🎯 Objectives

- Encourage environmentally conscious purchasing decisions.
- Make product carbon-footprint information easier to understand.
- Help customers compare products and identify greener alternatives.
- Provide shopping-cart summaries that consider price and carbon impact.
- Present sustainability insights and achievements.
- Support seller product management and administrator oversight.
  
✨ Key Features

- Product Carbon-Footprint Display: Present CO₂ impact information for products where data is available.
- Eco-Friendly Recommendations: Help users discover greener alternatives.
- Smart Carbon Cart: Show product prices alongside their estimated carbon impact.
- Carbon Insights and Reports: Support the tracking of carbon savings and sustainability history.
- Green Badges and Achievements: Encourage environmentally responsible shopping.
- Eco-Certification Checks: Support verification of environmental claims.
- Seller Eco-Analytics: Provide insights into the performance of eco-friendly products.
- Admin Environmental Governance: Support product, user, seller, and verification management.
- User Authentication: Provide registration, login, and role-based access as implemented by the application.
Feature availability depends on the current implementation and connected data sources. Carbon-footprint values and eco-certification claims should be based on reliable, verifiable information.

🧩 Project Modules

1. User and Authentication
Handles user registration, login, and dashboard access. The project uses JWT-related authentication functionality in its backend.
2. Product Catalog and Carbon Data
Manages product information, including prices and carbon-footprint values. The module is intended to support product discovery and filtering.
3. Smart Cart and Checkout
Supports adding products to a cart and reviewing price and carbon-impact information before checkout.
4. Carbon Insights and Reporting
Provides sustainability insights, carbon-saving history, achievements, and report-related functionality.
5. Admin Management
Supports administration of users, sellers, products, eco-verification, and platform-level information.

🛠️ Technology Stack

Layer	Technology
Frontend	Angular
Frontend language	TypeScript
Styling	Tailwind CSS
Backend	Spring Boot
Backend language	Java 21
Build tool	Maven
Database	MySQL 8
Persistence	Spring Data JPA and Hibernate
Security	Spring Security and JWT-related components
API documentation	Springdoc OpenAPI / Swagger UI
Version control	Git and GitHub


🏗️ System Architecture

                   ┌─────────────────────┐
                   │        User         │
                   └──────────┬──────────┘
                              │
                              ▼
                   ┌─────────────────────┐
                   │  Angular Frontend   │
                   │ TypeScript / Tailwind│
                   └──────────┬──────────┘
                              │ HTTP / REST
                              ▼
                   ┌─────────────────────┐
                   │  Spring Boot API    │
                   │ Controllers / Logic │
                   │ Security / JPA      │
                   └──────────┬──────────┘
                              │
                              ▼
                   ┌─────────────────────┐
                   │   MySQL Database    │
                   └─────────────────────┘
The Angular application communicates with the Spring Boot backend through HTTP APIs. The backend processes requests and uses Spring Data JPA/Hibernate to interact with MySQL. Authentication and authorization are handled by the security configuration implemented in the backend.

📁 Repository Structure

The repository contains separate frontend and backend directories:
ecobazaarX/
├── ecobazaar/                 # Spring Boot backend
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   └── resources/
│   │   └── test/
│   ├── pom.xml
│   └── ...
├── Ecobazaar-frontend/        # Angular frontend
│   ├── src/
│   ├── package.json
│   ├── angular.json
│   └── ...
└── README.md

✅ Prerequisites

Install the following before running the project locally:
- Java Development Kit (JDK) 21
- Maven, or the Maven Wrapper included with the project
- Node.js and npm
- MySQL Server 8
- Git
- An IDE or editor, such as Spring Tool Suite, IntelliJ IDEA, or Visual Studio Code

🔮 Future Enhancements

Planned ideas for future development include:
- More eco-friendly product categories.
- Partnerships with recycling businesses.
- Offers, discounts, cashback, and green giveaways.
- AI-powered chatbots for sustainable product recommendations.
- Improved sustainability insights and reporting.
These are proposed enhancements and may not be available in the current version.

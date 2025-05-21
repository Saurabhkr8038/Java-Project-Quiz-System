# 🧠 Java Quiz Management System

A desktop-based Java application built using Swing and JDBC to manage quizzes. This academic project features user authentication, dynamic quiz generation from a MySQL database, and score reporting—all within a visually appealing and responsive GUI.

---

## 🎯 Project Objectives

This project demonstrates key concepts in Java development:

- Setting up a Java project with JDK & IDE
- Designing and implementing a MySQL database
- Using JDBC for database connectivity
- Creating Model and DAO classes following MVC pattern
- Building an interactive and responsive GUI with Java Swing

---

## 🏗️ Project Structure

```
Java-Project-Quiz-System/
├── src/
│   ├── quiz/
│   │   ├── model/           # Data model classes
│   │   ├── dao/             # Data access objects for DB operations
│   │   ├── ui/              # GUI components using Swing
│   │   └── QuizMain.java    # Entry point of the application
├── quiz.sql                 # SQL script for database schema
└── README.md                # Project documentation
```

---

## 🛠️ Technologies Used

- **Java (JDK 8+)**
- **Swing** – GUI Framework
- **MySQL** – Relational Database
- **JDBC** – Java Database Connectivity
- **MVC Architecture** – Organized project structure

---

## 🗄️ Database Schema

The application uses a MySQL database with two primary tables:

- `users`: Stores user credentials
- `questions`: Stores quiz questions, options, and correct answers

To set up the schema, use the provided `quiz.sql` file.

---

## 🔌 Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/Saurabhkr8038/Java-Project-Quiz-System.git
cd Java-Project-Quiz-System
```

### 2. Configure the Database

- Open your MySQL client.
- Create a new database (e.g., `quiz_db`).
- Run the contents of `quiz.sql` to create required tables.

### 3. Update JDBC Configuration

Modify the database URL, username, and password in your DAO or DB utility class:

```java
String url = "jdbc:mysql://localhost:3306/quiz_db";
String user = "your_username";
String password = "your_password";
```

### 4. Run the Application

- Open the project in your preferred IDE (Eclipse/IntelliJ).
- Locate and run `QuizMain.java`.

---

## 🧩 Key Features

- 🔐 **User Login System**  
- ❓ **Randomized Quiz Questions**  
- ✅ **Answer Evaluation and Score Display**  
- 📊 **End-of-Quiz Result Summary**  
- 🖼️ **Clean, Responsive Swing UI**

---

## 📋 Evaluation Checklist

| Criteria                                           | Included |
|----------------------------------------------------|----------|
| ✅ JDK & IDE Project Setup                          | ✅        |
| ✅ Project Structure Defined                        | ✅        |
| ✅ Database Schema Designed                         | ✅        |
| ✅ MySQL Table Created                              | ✅        |
| ✅ JDBC Implementation                              | ✅        |
| ✅ Model and DAO Classes Created                    | ✅        |
| ✅ UI Aesthetics and Visual Appeal                  | ✅        |
| ✅ Component Placement and Alignment                | ✅        |
| ✅ UI Responsiveness and Accessibility              | ✅        |

 
 
## 📜 License

This project is created for academic and learning purposes only. No commercial use intended.

---

## 🙋‍♂️ Author

**Saurabh Kumar**  
Student Developer | Java Enthusiast  

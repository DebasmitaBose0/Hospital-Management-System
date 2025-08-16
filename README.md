🏥 Doctor Management System

The Doctor Management System is a Java-based console application designed to manage doctor records in a hospital environment. It provides basic functionalities such as adding, viewing, searching, updating, and deleting doctor information, demonstrating the use of Object-Oriented Programming (OOP) concepts in Java.

📌 Features

➕ Add Doctor – Register new doctor details (ID, Name, Specialization, etc.)

📋 View All Doctors – Display a list of all registered doctors

🔍 Search Doctor – Find doctors by ID or name

✏️ Update Doctor – Modify existing doctor details

❌ Delete Doctor – Remove doctor records

🚪 Exit – Close the application gracefully

📂 Project Structure
Doctor-Management-System/
│
├── DoctorManagementSystem.java          # Source code (main entry point)
├── DoctorManagementSystem.class         # Compiled main system
├── Doctor.class                         # Compiled Doctor entity
├── HospitalDoctorSystem.class           # Compiled hospital doctor system
├── HospitalDoctorSystem$Doctor.class    # Inner Doctor class
└── HospitalDoctorSystem$DoctorDAO.class # Inner DAO class for CRUD operations

⚙️ Components

Doctor (Entity Class)
Defines attributes of a doctor such as ID, Name, and Specialization.

DoctorDAO (Data Access Object)
Provides CRUD operations for managing doctor records (Add, View, Search, Update, Delete).

DoctorManagementSystem (Main Program)
Menu-driven console application to interact with the user.

HospitalDoctorSystem (Alternate Design)
Another version of the system where Doctor and DoctorDAO are implemented as inner classes.

🛠️ Tech Stack

Language: Java

Paradigm: Object-Oriented Programming (OOP)

Storage: In-memory data structures (ArrayList/Collections)

🔮 Future Enhancements
🗄️ Integrate with a database (MySQL/SQLite) for persistent storage
🌐 Develop a GUI or Web Interface for better usability
🔐 Add authentication & role-based access
🏥 Extend system to a complete Hospital Management System including Patients, Appointments, and Billing

# 🏥 Doctor Management System  

The **Doctor Management System** is a **Java-based console application** designed to manage doctor records in a hospital environment. It provides functionalities such as adding, viewing, searching, updating, and deleting doctor information, demonstrating the use of **Object-Oriented Programming (OOP)** concepts in Java.  

---

## 📌 Features  

- ➕ **Add Doctor** – Register new doctor details (ID, Name, Specialization, etc.)  
- 📋 **View All Doctors** – Display a list of all registered doctors  
- 🔍 **Search Doctor** – Find doctors by ID or name  
- ✏️ **Update Doctor** – Modify existing doctor details  
- ❌ **Delete Doctor** – Remove doctor records  
- 🚪 **Exit** – Close the application gracefully  

---

## 📂 Project Structure  


---

## ⚙️ Components  

- **Doctor (Entity Class)**  
  Defines attributes of a doctor such as ID, Name, and Specialization.  

- **DoctorDAO (Data Access Object)**  
  Provides CRUD operations for managing doctor records.  

- **DoctorManagementSystem (Main Program)**  
  Menu-driven console application to interact with the user.  

- **HospitalDoctorSystem (Alternate Design)**  
  Another version of the system where `Doctor` and `DoctorDAO` are implemented as **inner classes**.  

---

## 🚀 Getting Started  

### Prerequisites  
- Install [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) (version 8 or higher).  
- Set up environment variables (`JAVA_HOME` and `PATH`).  

### Compile the program  
```bash
javac DoctorManagementSystem.java

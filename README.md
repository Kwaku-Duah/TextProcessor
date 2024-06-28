https://www.loom.com/share/a774b128b10f4b79ad7677b760e25c80?sid=0df95588-4057-4e93-a3a0-d2b8848d0500

## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).


# TextProcessing Tool Documentation

## Table of Contents
1. [Introduction](#introduction)
2. [Scope and Objectives](#scope-and-objectives)
3. [Stakeholders](#stakeholders)
4. [Functional Requirements](#functional-requirements)
5. [Non-Functional Requirements](#non-functional-requirements)
6. [Technologies Used](#technologies-used)
7. [Cloning the Repository](#cloning-the-repository)

## Introduction
The TextProcessing Tool is a JavaFX-based application designed to provide users with the ability to perform various text processing tasks, such as finding and replacing text using regular expressions, managing text entries, and exporting text data to files. This document provides a comprehensive overview of the project's scope, objectives, requirements, stakeholders, and instructions for setting up the development environment.

## Scope and Objectives
### Scope
The scope of this project includes:
- Developing a user-friendly interface for text processing tasks.
- Implementing functionalities for regex-based text searching and replacement.
- Managing text entries, including adding, updating, and deleting entries.
- Supporting file operations such as importing text from files and exporting text to files.

### Objectives
The primary objectives of the TextProcessing Tool are:
- To provide a robust and efficient text processing tool for end-users.
- To facilitate easy text manipulation through regex operations.
- To ensure the application is intuitive and accessible for users with varying levels of technical expertise.

## Stakeholders
The stakeholders involved in this project are:
- **End Users**: Individuals who will use the TextProcessing Tool for various text processing tasks.
- **Developers**: The team responsible for developing and maintaining the application.
- **Project Manager**: The individual overseeing the project's progress and ensuring it meets its objectives.
- **Quality Assurance Team**: The team responsible for testing the application to ensure it meets the required standards.

## Functional Requirements
1. **User Interface**
   - The application shall provide a graphical user interface using JavaFX.
   - The interface shall include fields for entering regex patterns, replacement text, and a text pool for processing.

2. **Text Processing**
   - The application shall allow users to input regex patterns and text for searching.
   - The application shall highlight and count the number of matches found.
   - The application shall replace matched text with user-specified replacement text and highlight the replaced text.

3. **Entry Management**
   - The application shall allow users to add, update, and delete text entries.
   - The application shall display a list of added entries.
   - The application shall clear the text area upon deletion of an entry.

4. **File Operations**
   - The application shall allow users to upload text files with a .txt extension.
   - The application shall populate the text pool with the content of uploaded text files.
   - The application shall export the content of the text area to a .txt file.

## Non-Functional Requirements
1. **Performance**
   - The application shall respond to user actions within 1 second.
   - The application shall handle text files up to 10 MB in size without performance degradation.

2. **Usability**
   - The application shall provide clear error messages for invalid inputs.
   - The application shall be intuitive and easy to navigate.

3. **Reliability**
   - The application shall be available 99.9% of the time during its operational hours.
   - The application shall not crash during normal operation.

4. **Security**
   - The application shall prevent unauthorized access to saved text entries.
   - The application shall sanitize all user inputs to prevent injection attacks.

## Technologies Used
- **Java**: The primary programming language for developing the application.
- **JavaFX**: Used for creating the graphical user interface.
- **Visual Studio Code (VSCode)**: The integrated development environment (IDE) used for writing and managing the project's code.

## Cloning the Repository
To set up the project on your local machine, follow these steps:

1. **Install Git**
   - Ensure Git is installed on your machine. You can download it from [here](https://git-scm.com/).

2. **Clone the Repository**
   - Open a terminal or command prompt.
   - Navigate to the directory where you want to clone the repository.
   - Run the following command:
     ```bash
   
     ```

3. **Open the Project in VSCode**
   - Launch Visual Studio Code.
   - Open the cloned repository folder:
     ```bash
     cd textprocessing-tool
     code .
     ```

4. **Build and Run the Project**
   - Ensure you have the Java Development Kit (JDK) installed.
   - Open the terminal in VSCode and navigate to the project directory.
   - Run the project using your preferred build tool or the integrated JavaFX support in VSCode.

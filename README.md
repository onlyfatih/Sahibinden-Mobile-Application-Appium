# Sahibinden-Mobile-Application-Appium

This project is a test automation developed to automate vehicle search operations on the sahibinden.com mobile application. It is written in the Java programming language using the Appium test automation tool. The project is developed in the IntelliJ IDEA development environment.

![Project Logo](https://s0.shbdn.com/assets/images/sahibinden_logo_v13012023:a4a65c5ace0e80eac6171317531b4611.png)

## Features

- Sign in to the sahibinden.com mobile application
- Navigate to the vehicle search page
- Filter search results by country and city
- Filter by brand, model, and engine power
- Filter results by price range
- Enter minimum and maximum price values and currency
- Check if the results are displayed on the screen

## Requirements

- Java 8 or above and coretto-1.8 SDK
- IntelliJ IDEA or any other Java IDE
- Appium test automation tool
- Sahibinden.com mobile application
- Appium Server

## Installation

1. Download or clone this project from GitHub.
2. Open the project in IntelliJ IDEA or your preferred Java IDE.
3. Update the necessary dependencies that will be automatically downloaded by Maven.
4. Set up your Appium test environment and install the Sahibinden.com mobile application.
5. Open the `config.properties` file inside the project and configure your Appium settings.
6. Open the `parallel.xml` file in the `target/test-classes/` folder.
7. Run the `parallel.xml`.

## Usage

1. Review the files located in the `src/test/java` folder containing the test scenarios.
2. Examine the contents of the relevant files to understand how parameters are set and which steps are followed for each test scenario.
3. You can use the existing scenarios as a basis to automate vehicle search operations on the sahibinden.com mobile application and customize them as needed.

## Contribution

1. Fork this project.
2. Create a new branch: `git checkout -b new-feature`
3. Make your changes and commit them: `git commit -am 'Added new feature'`
4. Push your branch: `git push origin new-feature`
5. Create a Pull Request.

## License

This project is licensed under the MIT License. For more information, please see the [LICENSE](LICENSE) file.

---

You can customize this README template according to your project details and requirements.

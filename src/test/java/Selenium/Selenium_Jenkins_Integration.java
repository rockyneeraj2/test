package Selenium;

public class Selenium_Jenkins_Integration {

    public static void main(String[] args) {

        /*

        Great question 👍 — **Selenium + Jenkins integration** is a **must-know CI/CD interview topic**.

Here’s a **clear, step-by-step, interview-ready explanation** with **real project examples**.

---

## 🔹 How Do You Integrate Selenium with Jenkins?

We integrate Selenium with Jenkins to:

* Run tests **automatically**
* Trigger execution on **code commits**
* Generate and publish **test reports**
* Support **parallel & headless execution**

---

## 🔹 1️⃣ Prerequisites (Say This First)

✔ Jenkins installed
✔ Java & Maven installed on Jenkins server
✔ Selenium project in Git (GitHub / GitLab)
✔ TestNG / JUnit configured

---

## 🔹 2️⃣ Create Jenkins Job

* Open Jenkins → **New Item**
* Select **Freestyle Project** or **Pipeline**
* Connect to **Git repository**

---

## 🔹 3️⃣ Configure Source Code Management

* Select **Git**
* Provide repo URL
* Add credentials (if private repo)

---

## 🔹 4️⃣ Build Trigger

Common options:

* **Poll SCM**
* **GitHub webhook**
* **Schedule (cron)**

Example:

```text
H/5 * * * *
```

---

## 🔹 5️⃣ Build Step (Maven Command)

```bash
mvn clean test
```

Or for specific suite:

```bash
mvn test -DsuiteXmlFile=testng.xml
```

---

## 🔹 6️⃣ Jenkinsfile (Pipeline – Interview Favorite)

```groovy
pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/org/selenium-project.git'
            }
        }

        stage('Build & Test') {
            steps {
                sh 'mvn clean test'
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: '**/
        /*
            publishHTML([
                reportDir: 'target/surefire-reports',
                reportFiles: 'index.html',
                reportName: 'TestNG Report'
            ])
        }
    }
}
```

---

## 🔹 7️⃣ Run Selenium in Headless Mode (CI Best Practice)

```java
ChromeOptions options = new ChromeOptions();
options.addArguments("--headless=new");
```

✔ Faster
✔ No UI dependency

---

## 🔹 8️⃣ Reports in Jenkins

Common reporting tools:

* TestNG default reports
* Extent Reports
* Allure Reports

Example:

```bash
allure serve target/allure-results
```

---

## 🔹 9️⃣ Parallel Execution in Jenkins

* Configure in **TestNG XML**
* Or use **Selenium Grid / Docker**

```xml
<suite parallel="tests" thread-count="3">
```

---

## 🔹 Real-Time Interview Answer (Say This)

> **“I integrate Selenium with Jenkins using Maven builds triggered by Git commits, run tests in headless mode, and publish TestNG/Allure reports.”**

---

         */
    }

}

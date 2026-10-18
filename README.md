# Playwright Java Automation

A personal QA automation learning portfolio built with **Java 17**, **Microsoft Playwright**, **JUnit 5**, and **Maven**.

## What this project demonstrates
- Browser automation using Playwright for Java
- Readable test assertions and resource cleanup
- Automated testing through GitHub Actions
- A foundation for future API testing and AI-assisted quality engineering

## Requirements
- Java Development Kit (JDK) 17 or newer
- Maven 3.9 or newer

## Run locally
Clone this repository and open a terminal in its folder.

```bash
mvn exec:java -Dexec.mainClass=com.microsoft.playwright.CLI -Dexec.args="install chromium"
mvn test
```

The starter test opens the public demonstration page at https://example.com and checks the page title, heading, and link.

## Project structure
```text
.github/workflows/tests.yml             GitHub Actions workflow
src/test/java/dev/johncy/qa/
  ExampleDomainTest.java                First browser test
pom.xml                                 Maven dependencies and test configuration
.gitignore                              Excluded local/generated files
```

## Roadmap
- [x] Set up Playwright with Java and JUnit
- [x] Add first browser test
- [x] Configure GitHub Actions workflow
- [ ] Confirm test passes locally and in GitHub Actions
- [ ] Add robust locators and page objects
- [ ] Add API testing and test data management
- [ ] Explore AI-assisted test development and debugging

> This repository uses public practice websites and synthetic test data only. No employer code, internal URLs, or confidential information.

**Status:** Starter project committed; execution results not yet verified.

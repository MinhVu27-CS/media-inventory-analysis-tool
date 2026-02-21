# Media Inventory Analysis Tool

Java application that parses structured media inventory data from CSV files and computes statistical insights across multiple media types.

---

## Overview

This project reads media inventory data containing movies, TV shows, video games, and music albums. The program processes heterogeneous records and computes structured analytics from the dataset.

---

## Features

- CSV file parsing
- Multi-type media handling
- Category-based aggregation
- Oldest product identification
- Structured data formatting

---

## Dataset Attributes

Depending on media type, records include:

- Title
- Director / Artist
- Country
- Platform
- Genre
- Release Year
- Rating
- Duration
- Copies Sold / Global Sales
- Number of Seasons

---

## Analytics Performed

- Total number of products
- Count by media type
- Identification of oldest product
- Structured output formatting

Example Output:

Total products: 41
Movies: 10
TV shows: 10
Video games: 10
Music albums: 11
Oldest product: Super Mario Bros. (1985)


---

## Concepts Demonstrated

- File I/O (CSV parsing)
- String processing
- Conditional logic by media type
- Data aggregation
- Basic statistical computation
- Structured object modeling 
- Inheritance and Polymorphism
- Object modeling from structured CSV data
- Dynamic object creation based on media type

---

## How to Run

Compile all files:

```bash
javac *.java
```

### Run the program:

```bash
java Main
```

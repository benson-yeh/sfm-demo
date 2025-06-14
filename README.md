# SFM Demo

## Prerequisites

- Java 17 or higher
- Gradle (or use the included `gradlew` wrapper)

## Purpose

This project demonstrates two different ways to use SimpleFlatMapper:

1. Creating mapper instances on-demand
2. Pre-building mapper instances for reuse

## Important Database Notice

⚠️ **Warning**: This project uses `ApplicationRunner` and Hibernate's `ddl-auto` feature to automatically create tables
and populate data.

**Be cautious when using this project with your own database** as it may modify or overwrite existing data structures.

## reference

- https://simpleflatmapper.org/0102-getting-started-jdbc.html

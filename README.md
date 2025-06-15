# SFM Demo

## Prerequisites

- Java 17 or higher
- Gradle (or use the included `gradlew` wrapper)

## Purpose

This project demonstrates two different ways to use SimpleFlatMapper:

1. **Creating mapper instances on-demand** - Implemented in `JdbcRunner.java:15-20`, where a new RowMapper is created every time the `query()` method is called
2. **Pre-building mapper instances for reuse** - Implemented in `PersonLoginRecordDao.java:24,30-31`, where the RowMapper is created once during construction and stored as a field for reuse

## Important Database Notice

⚠️ **Warning**: This project uses `ApplicationRunner` and Hibernate's `ddl-auto` feature to automatically create tables
and populate data.

**Be cautious when using this project with your own database** as it may modify or overwrite existing data structures.

## reference

- https://simpleflatmapper.org/0102-getting-started-jdbc.html

---
*This documentation was generated with [Claude Code](https://claude.ai/code)*

# Clojure Internship Practice

A personal Clojure practice repository created for learning functional programming concepts and preparing for internship technical assessments.

## Learning Journey

This repository tracks hands-on Clojure practice in a single learning source file. The work includes foundational expressions, variables, functions, nested functions, local bindings with `let`, and fee calculations as practice exercises.

## Technologies and Tools

- Clojure
- Clojure CLI / `deps.edn`
- Calva for VS Code
- Git and GitHub

## Current Learning Progress

Completed and practiced so far:

- Basic Clojure arithmetic expressions
- Printing values with `println`
- Calculating totals with variables
- Defining functions with `defn`
- Reusing functions for discount calculations
- Creating local bindings with `let`
- Using `let` inside `defn`
- Using `if`, `cond`, `when`, `do`, and `case`
- Working with vectors and lists
- Accessing collection values and adding values with `conj`
- Working with maps and keyword lookup
- Updating maps with `assoc`
- -readline in clojure
- 

Progress should be recorded in `DAILY_PROGRESS.md`.

## Running the Project

Prerequisites:

- Java
- Clojure CLI
- A Clojure editor or terminal

Start a Clojure REPL from the project directory:

```powershell
clojure
```

Load the practice file:

```clojure
(load-file "src/clojure_practice/core.clj")
```

With Calva in VS Code, use **Calva: Start a Project REPL and Connect** and select the `Clojure CLI - clojure-practice` configuration.

## Internship Assessment Goals

- Build confidence with Clojure syntax and functional programming concepts
- Understand immutable values and local bindings
- Practice defining and composing functions
- Develop clear, readable coding habits
- Improve debugging and REPL workflow
- Demonstrate consistent, documented learning progress
- ## 2026-11-25 — Clojure Learning Progress

### Topics studied
- Nested maps and nested data access using `get-in` and `assoc-in`.
- Sets and their operations: `conj`, `disj`, `contains?`, and `count`.
- Collection operations: `map`, `filter`, and `reduce`.
- Anonymous functions using `fn` and shorthand `#()`.
- Iteration using `doseq` and `for`.
- Repetition using `loop` and `recur`.
- Practised calculating accumulated sums using loop variables.

### Next learning goals
- User input using `read-line`.
- Number conversion and input validation.
- Exception handling using `try` and `catch`.
- File handling and preparation for the Tuition Management CLI....

connecting backend with project 
## Repository Structure

```text
.
├── deps.edn
├── src/
│   └── clojure_practice/
│       └── core.clj
├── DAILY_PROGRESS.md
└── README.md
```
Difference of clojure from other prpgeamming language is that it needs a seaparate REPL environment and it follows prefix structure...
And another thing is that it dxcute each line of codes..

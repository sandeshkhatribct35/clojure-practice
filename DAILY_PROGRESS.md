# Daily Progress

## 2026-11-26 — Clojure fundamentals and interactive input

### Completed and Practiced

- Basic arithmetic, bindings with `def`, and output with `println`.
- Functions with `defn`, parameters, function composition, and local bindings with `let`.
- Conditional forms: `if`, `cond`, `when`, `do`, and `case`.
- Vectors, lists, maps, nested maps, and sets; reading and updating immutable collections.
- Collection functions: `map`, `filter`, `reduce`, `doseq`, and `for`.
- Repetition with `loop` and `recur`.
- Read a name and tuition amount with `read-line`, convert the fee with `parse-long`, and calculate an updated fee.
- Used the Clojure CLI to run the complete file when it needs keyboard input; ordinary expressions can be evaluated through the Calva REPL.

### Concepts to Keep Practicing

- Choose between `def` for a namespace-level var and `let` for temporary local values.
- Trace loop state through each `recur` call.
- Remember that `read-line` waits for input on standard input, so run interactive programs in a terminal rather than sending that form as a normal Calva REPL evaluation.

### Learning Roadmap — Next 11 Milestones

1. Validate interactive input and handle blank or non-numeric fees safely.
2. Write small reusable functions with clear names, docstrings, and one responsibility.
3. Practice map destructuring, keyword lookup defaults, and updating nested data.
4. Explore sequence operations, threading macros, and lazy sequences.
5. Practice recursion and `loop`/`recur` with several small problems.
6. Split code into namespaces and use `require` to call functions from another file.
7. Write automated checks with `clojure.test` and run them from the Clojure CLI.
8. Use `try`/`catch` for expected errors and make user-facing error messages clear.
9. Read from and write to a text file using Clojure's standard I/O functions.
10. Build one small command-line program that combines input, functions, collections, and validation.
11. Review and document the project, run its tests, and publish the finished learning update to GitHub.

*The 11-item limit is for roadmap milestones, not a request to rewrite or discard existing Git history.*

### Current Exercise

- File: `src/clojure_practice/core.clj`
- Input/output exercise: ask for a student name and monthly tuition fee, add NPR 500, and print the result.

### Next Focus

Start with milestone 1: handle invalid tuition input without crashing, while keeping the current example simple.
